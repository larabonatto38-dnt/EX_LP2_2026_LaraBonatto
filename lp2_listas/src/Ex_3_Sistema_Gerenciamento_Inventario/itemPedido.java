public class itemPedido {
    private int quantidade;
    private int precoUnidade;

    public itemPedido(){
    }

    public itemPedido(int quantidade, int precoUnidade) {
        this.quantidade = quantidade;
        this.precoUnidade = precoUnidade;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public int getPrecoUnidade() {
        return precoUnidade;
    }
    public void setPrecoUnidade(int precoUnidade) {
        this.precoUnidade = precoUnidade;
    }

    @Override
    public String toString() {
        return "itemPedido\n quantidade = " + quantidade + "\n precoUnidade = " + precoUnidade;
    }
    
}