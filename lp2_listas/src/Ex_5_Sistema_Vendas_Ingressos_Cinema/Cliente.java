public class Cliente {
    private String nome;
    private String sobrenome;
    private int cpf;
    private String email;
    private boolean temCadastro;

    public Cliente(){
    }

    public Cliente(String nome, String sobrenome, int cpf, String email, boolean temCadastro) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.email = email;
        this.temCadastro = temCadastro;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public boolean isTemCadastro() {
        return temCadastro;
    }
    public void setTemCadastro(boolean temCadastro) {
        this.temCadastro = temCadastro;
    }
    
}