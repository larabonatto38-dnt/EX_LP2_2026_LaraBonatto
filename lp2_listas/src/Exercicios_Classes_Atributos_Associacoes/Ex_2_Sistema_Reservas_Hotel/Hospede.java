//package Ex_2_Sistema_Reservas_Hotel;

public class Hospede {
    private String nome;
    private String sobrenome;
    private int cpf;
    private String email;
    private int telefone;
    
    public Hospede(){
    }

    public Hospede(String nome, String sobrenome, int cpf, String email, int telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
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
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Hospede\n nome = " + nome + "\n sobrenome = " + sobrenome + "\n cpf = " + cpf + "\n email = " + email
                + "\n telefone = " + telefone;
    }
}