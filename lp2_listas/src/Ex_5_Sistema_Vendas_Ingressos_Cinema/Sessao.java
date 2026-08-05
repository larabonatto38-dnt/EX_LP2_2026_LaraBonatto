public class Sessao {
    private int data;
    private int horarioInicio;
    private int precoIngresso;

    public Sessao(){
    }

    public Sessao(int data, int horarioInicio, int precoIngresso) {
        this.data = data;
        this.horarioInicio = horarioInicio;
        this.precoIngresso = precoIngresso;
    }
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public int getHorarioInicio() {
        return horarioInicio;
    }
    public void setHorarioInicio(int horarioInicio) {
        this.horarioInicio = horarioInicio;
    }
    public int getPrecoIngresso() {
        return precoIngresso;
    }
    public void setPrecoIngresso(int precoIngresso) {
        this.precoIngresso = precoIngresso;
    }
    
}