/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.gk.room;
import java.sql.*;
import java.sql.PreparedStatement;
/**
 *
 * @author Georgios Kostopoulos
 */
public class DBUTIL {
    private static Connection conn;
    private DBUTIL(){}
    
    public static Connection connection() throws SQLException{
       String url1=("jdbc:sqlite:C:\\Users\\Giorgos\\Documents\\PRPGRAMS\\Hotels\\hotel.db");
      conn= DriverManager.getConnection(url1);  
       return conn;
    }
    
    public static void closeConnection() throws SQLException {
     if(conn!=null)conn.close();
    }
    
    public static void closeRS(ResultSet rs) throws SQLException {
	
        if (rs != null) rs.close();
	
	}
    

public static void closeStmt(PreparedStatement stmt) throws SQLException {
    
	if (stmt != null) stmt.close();

		
	}


}


