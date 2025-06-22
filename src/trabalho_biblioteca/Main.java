package trabalho_biblioteca;

public class Main {
    public static void main(String[] args) {
        Usuario leitor = new Leitor("Ana", "ana@email.com", "1234");
        Usuario funcionario = new Funcionario("Carlos", "carlos@email.com", "abcd");

        autenticarUsuario(leitor, "1234");
        System.out.println();

        autenticarUsuario(funcionario, "abcd");

        // Após autenticar o funcionário, vamos criar livros e fazer os empréstimos
        if (funcionario.autenticar("abcd")) {
            // Criar livros
            Livro livro1 = new Livro("Clean Code", "Robert C. Martin", "9780132350884");
            Livro livro2 = new Livro("Java: Como Programar", "Deitel", "9788576058636");

            // Realizar empréstimos para o leitor
            if (funcionario instanceof Funcionario func && leitor instanceof Leitor l) {
                func.realizarEmprestimo(livro1, l);
                func.realizarEmprestimo(livro2, l);
            }

            // Exibir os livros emprestados para o leitor
            System.out.println("\nLivros emprestados para " + leitor.getNome() + ":");
            for (Emprestimo e : ((Leitor) leitor).getEmprestimos()) {
                System.out.println(e);
            }
        }
    }

    public static void autenticarUsuario(Usuario usuario, String senha) {
        if (usuario.autenticar(senha)) {
            System.out.println("Login bem-sucedido para: " + usuario.getTipoUsuario());
        } else {
            System.out.println("Falha na autenticação para: " + usuario.getTipoUsuario());
        }
    }
}

