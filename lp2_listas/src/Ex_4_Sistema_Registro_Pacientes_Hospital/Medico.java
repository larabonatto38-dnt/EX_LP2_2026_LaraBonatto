public class Medico {
    private int idMedico;
    private String nome;
    private String especialidade;
    private prescricaoMedica prescricaoFeita;

    public Medico(){
    }
    
    public Medico(int idMedico, String nome, String especialidade) {
        this.idMedico = idMedico;
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public int getIdMedico() {
        return idMedico;
    }
    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public prescricaoMedica getPrescricaoFeita() {
        return prescricaoFeita;
    }

    public void setPrescricaoFeita(prescricaoMedica prescricaoFeita) {
        this.prescricaoFeita = prescricaoFeita;
    }
}