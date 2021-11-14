/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system.library;
import java.sql.*;
/**
 *
 * @author lapet
 */
public class ConnectSQL {
    public Connection conn; 
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/librarysystem";
    static final String USER = "root";
    static final String PASS = "123456";

    public static Connection ConnecrDb(){
          try{  
            Class.forName(JDBC_DRIVER);  
            Connection conn=DriverManager.getConnection(DB_URL,USER,PASS);
             return conn;  
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
            return null;
        }
    }
    
}
