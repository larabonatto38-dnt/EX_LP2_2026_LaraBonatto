public class Sala {
    private int numero;
    private int capacidadeTotal;
    private Cadeira cadeirasSala;
    private Sessao sessaoSala;

    public Sala(){
    }

    public Sala(int numero, int capacidadeTotal) {
        this.numero = numero;
        this.capacidadeTotal = capacidadeTotal;
    }

    public Sala(Cadeira cadeirasSala) {
        this.cadeirasSala = cadeirasSala;
    }

    public Sala(Sessao sessaoSala) {
        this.sessaoSala = sessaoSala;
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

    @Override
    public String toString() {
        return "Sala\n numero = " + numero + "\n capacidadeTotal = " + capacidadeTotal + "\n cadeirasSala = " + cadeirasSala
                + "\n sessaoSala = " + sessaoSala;
    }

    public Cadeira getCadeirasSala() {
        return cadeirasSala;
    }

    public void setCadeirasSala(Cadeira cadeirasSala) {
        this.cadeirasSala = cadeirasSala;
    }

    public Sessao getSessaoSala() {
        return sessaoSala;
    }

    public void setSessaoSala(Sessao sessaoSala) {
        this.sessaoSala = sessaoSala;
    }
    
}