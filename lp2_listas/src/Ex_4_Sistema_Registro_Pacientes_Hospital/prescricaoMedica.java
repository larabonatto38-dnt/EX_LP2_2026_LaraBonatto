// ver que receita o medico deu
public class prescricaoMedica {
    private int idPrescricao;
    private int dataPrescricao;
    private int horaPrescricao;
    private Medicamento medicamentoPrescrito;
    private Enfermeira enfermeiraQueAdministra;

    public prescricaoMedica(){
    }
    
    public prescricaoMedica(int idPrescricao, int dataPrescricao, int horaPrescricao) {
        this.idPrescricao = idPrescricao;
        this.dataPrescricao = dataPrescricao;
        this.horaPrescricao = horaPrescricao;
    }
    public int getIdPrescricao() {
        return idPrescricao;
    }
    public void setIdPrescricao(int idPrescricao) {
        this.idPrescricao = idPrescricao;
    }
    public int getDataPrescricao() {
        return dataPrescricao;
    }
    public void setDataPrescricao(int dataPrescricao) {
        this.dataPrescricao = dataPrescricao;
    }
    public int getHoraPrescricao() {
        return horaPrescricao;
    }
    public void setHoraPrescricao(int horaPrescricao) {
        this.horaPrescricao = horaPrescricao;
    }
    
}