package Ex_1_Sistema_Gerenciamento_Cursos;

public class Aluno {
    private String ra; //Registro Acadêmico (RA) é o seu número de matrícula oficial ou conjunto de dados que documenta toda a trajetória escolar ou universitária.
    private String nome;
    private String sobrenome;
    private int cpf;
    private String email;
    private int dataNascimento;

    //Construtores

    public Aluno(){
    }

    public Aluno(String ra, String nome, String sobrenome, int cpf, String email, int dataNascimento) {
        this.ra = ra;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    //Metodos de acesso

    public String getRa() {
        return ra;
    }
    public void setRa(String ra) {
        this.ra = ra;
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
    public int getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    
}