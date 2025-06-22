package trabalho_biblioteca;

public abstract class Usuario {
    protected String nome;
    protected String email;
    protected String senha;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public boolean autenticar(String senhaInformada) {
        return this.senha.equals(senhaInformada);
    }

    public abstract String getTipoUsuario();
    
    public String getNome() {
    	return this.nome;
    }
}
