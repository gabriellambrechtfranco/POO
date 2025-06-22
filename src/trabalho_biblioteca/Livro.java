package trabalho_biblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean emprestado;

    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.emprestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void marcarComoEmprestado() {
        this.emprestado = true;
    }

    public void marcarComoDisponivel() {
        this.emprestado = false;
    }

    @Override
    public String toString() {
        return titulo + " - " + autor + " (ISBN: " + isbn + ")";
    }
}
