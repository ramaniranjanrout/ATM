package src.java.com.bankingmanagementsystem;
import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    public Conn() {
        try{
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Buna@rb7537");
            s = c.createStatement();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
    }
}

