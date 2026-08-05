public class Ingresso {
    private int codigo;
    private int precoPago;
    private int dataEmissao;
    private int horaEmissao;

    public Ingresso(){
    }

    public Ingresso(int codigo, int precoPago, int dataEmissao, int horaEmissao) {
        this.codigo = codigo;
        this.precoPago = precoPago;
        this.dataEmissao = dataEmissao;
        this.horaEmissao = horaEmissao;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getPrecoPago() {
        return precoPago;
    }
    public void setPrecoPago(int precoPago) {
        this.precoPago = precoPago;
    }
    public int getDataEmissao() {
        return dataEmissao;
    }
    public void setDataEmissao(int dataEmissao) {
        this.dataEmissao = dataEmissao;
    }
    public int getHoraEmissao() {
        return horaEmissao;
    }
    public void setHoraEmissao(int horaEmissao) {
        this.horaEmissao = horaEmissao;
    }
    
}