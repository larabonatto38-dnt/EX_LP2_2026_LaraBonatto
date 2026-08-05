public class Sala {
    private int numero;
    private int capacidadeTotal;

    public Sala(){
    }

    public Sala(int numero, int capacidadeTotal) {
        this.numero = numero;
        this.capacidadeTotal = capacidadeTotal;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }
    public void setCapacidadeTotal(int capacidadeTotal) {
        this.capacidadeTotal = capacidadeTotal;
    }
    
}