package ConexaoBandoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conexao {
    private static String url = "jdbc:postgresql://200.18.128.54/aula";
    private static String usuario = "aula";
    private static String senha = "aula";
   
    private static Connection conexaojbdc = null;
    
    public static Connection getConexao(){
         try {
        if(conexao.conexaojbdc == null){
           conexao.conexaojbdc = DriverManager.getConnection(url, usuario, senha);
            } 
        return conexaojbdc;
    }
    catch (SQLException ex) {
                Logger.getLogger(conexao.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Erro ao tentar conectar com o Banco de Dados. Tente novamente mais tarde.");
                System.out.println("Erro: " + ex.getMessage());
        }
        return null;
 }
}
