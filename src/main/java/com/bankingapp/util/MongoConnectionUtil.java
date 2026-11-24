package com.bankingapp.util;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MongoConnectionUtil {
    // Caller owns the returned client and must close it (e.g. try-with-resources).
    public static MongoClient getClient() throws IOException {
        try (FileInputStream file = new FileInputStream("src/main/resources/mongodb.properties")) {
            Properties props = new Properties();
            props.load(file);
            String uri = props.getProperty("CONNECTION_URL");
            if (uri == null || uri.isBlank()) {
                throw new IOException("CONNECTION_URL missing from mongodb.properties");
            }
            return MongoClients.create(uri);
        }
    }
}
