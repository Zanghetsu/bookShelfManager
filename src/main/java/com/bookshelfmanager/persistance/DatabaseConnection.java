package com.bookshelfmanager.persistance;

import org.postgresql.ds.PGSimpleDataSource;
import javax.sql.DataSource;
import java.sql.SQLException;


public class DatabaseConnection {

    public DataSource connect() throws SQLException{
        PGSimpleDataSource dataSource = new PGSimpleDataSource();
        dataSource.setDatabaseName("___________");
        dataSource.setUser("______________");        //TODO : FILL IN YOUR PRIVATE INFORMATIONS AS INSTRUCTED IN THE README !
        dataSource.setPassword("____________");

        System.out.println("Connecting to database...");
        dataSource.getConnection().close();
        System.out.println("Connection OK!");
        return dataSource;
    }
}
