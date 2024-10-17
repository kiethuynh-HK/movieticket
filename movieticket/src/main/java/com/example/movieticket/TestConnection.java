package com.example.movieticket;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args){
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser("sa");
        ds.setPassword("123");
        ds.setServerName("DESKTOP-VU8S7EI\\MSSQLSERVER01");
        ds.setPortNumber(1433);
        ds.setDatabaseName("TICKETONLINE");

        try(Connection conn = ds.getConnection()) {
            System.out.println("Connection success!");
            System.out.println(conn.getCatalog());
        } catch (SQLServerException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
