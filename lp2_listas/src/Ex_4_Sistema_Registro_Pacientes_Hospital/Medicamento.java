public class Medicamento {
    private int idMedicamento;
    private String nomeMedicamento;
    private int dosagem;
    private String instrucoes;
    

    public Medicamento(){
    }
    
    public Medicamento(int idMedicamento, String nomeMedicamento, int dosagem, String instrucoes) {
        this.idMedicamento = idMedicamento;
        this.nomeMedicamento = nomeMedicamento;
        this.dosagem = dosagem;
        this.instrucoes = instrucoes;
    }
    public int getIdMedicamento() {
        return idMedicamento;
    }
    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }
    public String getNomeMedicamento() {
        return nomeMedicamento;
    }
    public void setNomeMedicamento(String nomeMedicamento) {
        this.nomeMedicamento = nomeMedicamento;
    }
    public int getDosagem() {
        return dosagem;
    }
    public void setDosagem(int dosagem) {
        this.dosagem = dosagem;
    }
    public String getInstrucoes() {
        return instrucoes;
    }
    public void setInstrucoes(String instrucoes) {
        this.instrucoes = instrucoes;
    }

    
}