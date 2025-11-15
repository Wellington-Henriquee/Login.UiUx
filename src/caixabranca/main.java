package caixabranca;

public class main {
    public static void main(String[] args) {
        teste t = new teste();

        
        boolean resultado = t.verificarUsuario("", "123");
        if (resultado) {
        	System.out.println("Conexão bem-sucedida com o banco de dados!");
            System.out.println("Usuário encontrado: " + t.nome);
            System.out.print("Login realizado");
        } else {
        	System.out.println("Usuário não encontrado.");
            System.out.println("Usuário ou senha incorretos");
            System.out.print("Login Inválido!");
        }
    }
}
