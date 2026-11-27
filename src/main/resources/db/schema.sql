/*----------- Drop tables if they exist ---------------*/
DROP TABLE IF EXISTS transactions CASCADE;
DROP TABLE IF EXISTS accounts CASCADE;
DROP TABLE IF EXISTS customers CASCADE;
DROP TABLE IF EXISTS employees CASCADE;

/*----------- Customers ---------------*/
CREATE TABLE customers (
    customer_id            BIGSERIAL PRIMARY KEY,
    first_name             VARCHAR(100) NOT NULL,
    last_name              VARCHAR(100) NOT NULL,
    date_of_birth          DATE,
    username               VARCHAR(100) NOT NULL UNIQUE,
    password_hash          VARCHAR(255) NOT NULL,
    ssn                    VARCHAR(11) UNIQUE,
    account_creation_date  DATE DEFAULT CURRENT_DATE
);

/*----------- Employees ---------------*/
CREATE TABLE employees (
    employee_id    BIGSERIAL PRIMARY KEY,
    first_name     VARCHAR(100) NOT NULL,
    last_name      VARCHAR(100) NOT NULL,
    date_of_birth  DATE,
    username       VARCHAR(100) NOT NULL UNIQUE,
    password_hash  VARCHAR(255) NOT NULL,
    created_at     TIMESTAMP NOT NULL DEFAULT NOW()
);

/*----------- Bank accounts ---------------*/
CREATE TABLE accounts (
    account_num    BIGINT PRIMARY KEY,
    routing_num    VARCHAR(20) NOT NULL,
    customer_id    BIGINT NOT NULL,
    account_type   VARCHAR(20) NOT NULL
                       CHECK (account_type IN ('CHECKING', 'SAVINGS')),
    status         VARCHAR(20) NOT NULL DEFAULT 'ACTIVE'
                       CHECK (status IN ('ACTIVE', 'FROZEN', 'CLOSED')),
    balance        NUMERIC(19, 2) NOT NULL DEFAULT 0
                       CHECK (balance >= 0),
    closed_at      TIMESTAMP,
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);


/*----------- Transactions ---------------*/
CREATE TABLE transactions (
    transaction_id             BIGSERIAL PRIMARY KEY,
    transaction_date           TIMESTAMP NOT NULL DEFAULT NOW(),
    transaction_type           VARCHAR(20) NOT NULL
                                   CHECK (transaction_type IN (
                                       'DEPOSIT', 'WITHDRAWAL',
                                       'TRANSFER_IN', 'TRANSFER_OUT', 'WIRE'
                                   )),
    amount                     NUMERIC(19, 2) NOT NULL CHECK (amount > 0),
    resulting_balance          NUMERIC(19, 2) NOT NULL,
    sender_account_num         BIGINT NOT NULL,
    sender_routing             VARCHAR(20),
    receiver_routing           VARCHAR(20),
    receiver_account_num       BIGINT,
    initiated_by_employee_id   BIGINT,
    FOREIGN KEY (sender_account_num) REFERENCES accounts(account_num),
    FOREIGN KEY (receiver_account_num) REFERENCES accounts(account_num),
    FOREIGN KEY (initiated_by_employee_id) REFERENCES employees(employee_id)
);