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
    String banco;
    String usuario;
    String senha;
    String url;

    public Conexao() {
        banco="locadora";
        usuario="vilmar";
        senha="123456";
        url="jdbc:mysql://localhost/"+banco+"?useSSL=false";
    }

    public Conexao(String banco, String usuario, String senha, String url) {
        this.banco = banco;
        this.usuario = usuario;
        this.senha = senha;
        this.url = url;
    }
    
    
    
	public static Connection open() throws SQLException
	{
		   try{
			Class.forName("com.mysql.jdbc.Driver");
                        System.out.println("Conectado");
			return DriverManager.getConnection("url", "usuario", "senha");
                       
		   }
		   catch(ClassNotFoundException e)
		   {
			  throw new SQLException(e.getMessage()); 
		   }
	}
        
      
}