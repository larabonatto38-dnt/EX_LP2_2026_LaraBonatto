//package Ex_1_Sistema_Gerenciamento_Cursos;

public class Disciplina {
    private int codigo;
    private String nome;
    private int cargaHoraria;
    private String ementa;
    private Professor professor;

    //Contrutores

    public Disciplina(){
    }

    public Disciplina(int codigo, String nome, int cargaHoraria, String ementa) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.ementa = ementa;
    }

    //Metodos de acesso

    public int getCodigo() {
        return codigo;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }


    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


    public String getEmenta() {
        return ementa;
    }


    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

     public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Disciplina\n codigo = " + codigo + "\n nome = " + nome + "\n cargaHoraria = " + cargaHoraria + "\n ementa = "
                + ementa + "\n professor = " + professor;
    }
}