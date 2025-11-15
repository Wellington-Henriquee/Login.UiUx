package caixabranca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class teste {

    // Método somente para conectar no banco
    public Connection conectarBD() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // CONFIGURAÇÃO CORRETA PARA PHPMyAdmin
            String url = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC";
            String user = "root";
            String password = ""; 



            conn = DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }

        return conn; 
    }

    public String nome = "";
    public boolean result = false;

 
    public boolean verificarUsuario(String login, String senha) {

        String sql = "SELECT nome FROM usuarios WHERE login = '" 
                + login + "' AND senha = '" + senha + "';";

        Connection conn = conectarBD();
        Statement st = null;
        ResultSet rs = null;

        if (conn == null) {
            System.out.println("Conexão inválida.");
            return false;
        }

        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);

            if (rs.next()) {
                result = true;
                nome = rs.getString("nome");
            }

        } catch (Exception e) {
            System.out.println("Erro ao verificar usuário: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (st != null) st.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                System.out.println("Erro ao fechar recursos: " + e.getMessage());
            }
        }

        return result;
    }
}
