package com.amit;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class DBTest {

    @Autowired
    private DataSource dataSource;

    @PostConstruct
    public void testConnection() throws Exception {
        Connection con = dataSource.getConnection();
        System.out.println("✅ Database Connected Successfully!");
        con.close();
    }
}
