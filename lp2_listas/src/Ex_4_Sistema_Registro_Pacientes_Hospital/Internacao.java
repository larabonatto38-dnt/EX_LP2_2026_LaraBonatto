// para registrar o periodo e vincular o medico responsavel pelo paciente no quarto
public class Internacao {
    private int idInternacao;
    private int dataEntrada;
    private int dataSaida;
    private String diagnosticoGeral;

    public Internacao(){
    }
    
    public Internacao(int idInternacao, int dataEntrada, int dataSaida, String diagnosticoGeral) {
        this.idInternacao = idInternacao;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.diagnosticoGeral = diagnosticoGeral;
    }
    public int getIdInternacao() {
        return idInternacao;
    }
    public void setIdInternacao(int idInternacao) {
        this.idInternacao = idInternacao;
    }
    public int getDataEntrada() {
        return dataEntrada;
    }
    public void setDataEntrada(int dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
    public int getDataSaida() {
        return dataSaida;
    }
    public void setDataSaida(int dataSaida) {
        this.dataSaida = dataSaida;
    }
    public String getDiagnosticoGeral() {
        return diagnosticoGeral;
    }
    public void setDiagnosticoGeral(String diagnosticoGeral) {
        this.diagnosticoGeral = diagnosticoGeral;
    }

    
}