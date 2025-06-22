package trabalho_biblioteca;

public class Funcionario extends Usuario {

    public Funcionario(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    public void realizarEmprestimo(Livro livro, Leitor leitor) {
        if (!livro.isEmprestado() && leitor.podeReceberEmprestimo()) {
            Emprestimo emprestimo = new Emprestimo(livro, leitor);
            leitor.adicionarEmprestimo(emprestimo);
            livro.marcarComoEmprestado();
            System.out.println("Empréstimo realizado com sucesso!");
        } else {
            if (livro.isEmprestado()) {
                System.out.println("Livro já está emprestado.");
            } else {
                System.out.println("Leitor atingiu o limite de empréstimos.");
            }
        }
    }

    @Override
    public String getTipoUsuario() {
        return "Funcionário";
    }
}
