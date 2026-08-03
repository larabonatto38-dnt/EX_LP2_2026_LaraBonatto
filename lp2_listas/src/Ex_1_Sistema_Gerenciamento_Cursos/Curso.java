package Ex_1_Sistema_Gerenciamento_Cursos;

public class Curso {
    private int codigo;
    private String nome;
    private int cargaHorariaTotal;
    private int quantidadeSemestres;
    private Disciplina disciplina;
    private Turma turma;

    //Construtores

    public Curso(){
    }

    public Curso(int codigo, String nome, int cargaHorariaTotal, int quantidadeSemestres) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHorariaTotal = cargaHorariaTotal;
        this.quantidadeSemestres = quantidadeSemestres;
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

    public int getCargaHorariaTotal() {
        return cargaHorariaTotal;
    }

    public void setCargaHorariaTotal(int cargaHorariaTotal) {
        this.cargaHorariaTotal = cargaHorariaTotal;
    }

    public int getQuantidadeSemestres() {
        return quantidadeSemestres;
    }

    public void setQuantidadeSemestres(int quantidadeSemestres) {
        this.quantidadeSemestres = quantidadeSemestres;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Curso\n codigo = " + codigo + "\n nome = " + nome + "\n cargaHorariaTotal = " + cargaHorariaTotal
                + "\n quantidadeSemestres = " + quantidadeSemestres + "\n disciplina = " + disciplina + "\n turma = " + turma;
    }
}