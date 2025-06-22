package trabalho_biblioteca;

import java.time.LocalDate;

public class Emprestimo {
    private Livro livro;
    private Leitor leitor;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucaoPrevista;

    public Emprestimo(Livro livro, Leitor leitor) {
        this.livro = livro;
        this.leitor = leitor;
        this.dataEmprestimo = LocalDate.now();
        this.dataDevolucaoPrevista = dataEmprestimo.plusDays(14); // regra de negócio
    }

    public Livro getLivro() {
        return livro;
    }

    public Leitor getLeitor() {
        return leitor;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }

    @Override
    public String toString() {
        return "Livro: " + livro.getTitulo() + ", Leitor: " + leitor.nome +
               ", Devolver até: " + dataDevolucaoPrevista;
    }
}
