package Ex_1_Sistema_Gerenciamento_Cursos;

public class Professor {
    private int idProf;
    private String nome;
    private String sobrenome;
    private int cpf;
    private String email;
    private String especializacao;

    //Contrutores

    public Professor(){
    }

    public Professor(int idProf, String nome, String sobrenome, int cpf, String email, String especializacao) {
        this.idProf = idProf;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.email = email;
        this.especializacao = especializacao;
    }

    //Metodos de acesso

    public int getIdProf() {
        return idProf;
    }

    public void setIdProf(int idProf) {
        this.idProf = idProf;
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

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }
}