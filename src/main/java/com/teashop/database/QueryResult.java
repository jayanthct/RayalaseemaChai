package main.java.com.teashop.database;


import java.sql.ResultSet;
import java.sql.Statement;

public class QueryResult {
    public final Statement stmt;
    public final ResultSet rs;

    public QueryResult(Statement stmt, ResultSet rs) {
        this.stmt = stmt;
        this.rs = rs;
    }
}
