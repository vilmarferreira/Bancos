/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

/**
 *
 * @author VILMAR
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public class Conexao {
    
    
    
	public static Connection open() throws SQLException// metodo open retornando um connection 
	{
		   try{
			Class.forName("com.mysql.jdbc.Driver");
                        System.out.println("Conectado");
			return DriverManager.getConnection("jdbc:mysql://localhost/locadora?useSSL=false", "root", "123456");
                       
		   }
		   catch(ClassNotFoundException e)
		   {
			  throw new SQLException(e.getMessage()); 
		   }
	}
        
      
}
