package trabalho_biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Leitor extends Usuario {
    private List<Emprestimo> emprestimos;

    public Leitor(String nome, String email, String senha) {
        super(nome, email, senha);
        this.emprestimos = new ArrayList<>();
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public boolean podeReceberEmprestimo() {
        return emprestimos.size() < 3;
    }

    public void adicionarEmprestimo(Emprestimo emprestimo) {
        if (podeReceberEmprestimo()) {
            emprestimos.add(emprestimo);
        } else {
            System.out.println("Leitor já atingiu o limite de empréstimos (3).");
        }
    }

    @Override
    public String getTipoUsuario() {
        return "Leitor";
    }
}
