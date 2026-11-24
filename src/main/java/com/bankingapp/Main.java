package com.bankingapp;

import com.bankingapp.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try (Connection conn = ConnectionUtil.getConnection_prop()) {
            System.out.println("Connected");
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
    }
}
