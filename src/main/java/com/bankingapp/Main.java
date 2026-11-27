package com.bankingapp;

import com.bankingapp.util.ConnectionUtil;
import com.bankingapp.util.MongoConnectionUtil;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import org.bson.Document;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try (Connection conn = ConnectionUtil.getConnection_prop()) {
            System.out.println("Connected to PostgresSQL");
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }

        try (MongoClient mongoClient = MongoConnectionUtil.getClient()) {
            // MongoClients.create() is lazy; ping forces a real round trip to the server.
            mongoClient.getDatabase("admin").runCommand(new Document("ping", 1));
            System.out.println("Connected to MongoDB");
        } catch (IOException | MongoException e) {
            System.out.println("MongoDB connection failed: " + e.getMessage());
        }
    }
}
