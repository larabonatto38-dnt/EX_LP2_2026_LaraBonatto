//package Ex_1_Sistema_Gerenciamento_Cursos;

public class Turma {
    private int codigoTurma;
    private int ano;
    private int semestre; // 1 ou 2 né
    private String turno;
    private Aluno aluno;

    //Construtores

    public Turma(){
    }
    
    public Turma(int codigoTurma, int ano, int semestre, String turno) {
        this.codigoTurma = codigoTurma;
        this.ano = ano;
        this.semestre = semestre;
        this.turno = turno;
    }

    //Metodos de acesso

    public int getCodigoTurma() {
        return codigoTurma;
    }
    public void setCodigoTurma(int codigoTurma) {
        this.codigoTurma = codigoTurma;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getSemestre() {
        return semestre;
    }
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    @Override
    public String toString() {
        return "Turma\n codigoTurma = " + codigoTurma + "\n ano = " + ano + "\n semestre = " + semestre + "\n turno = " + turno
                + "\n aluno = " + aluno;
    }
}