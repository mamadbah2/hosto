package com.sheet.core.database;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface Database {
    void getConnection() throws SQLException;
    void closeConnection() throws SQLException;
    ResultSet executeSelect(String req) throws SQLException;
    void initPreparedStatement(String req) throws SQLException;
    int executeUpdate() throws SQLException;
}
