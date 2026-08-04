public class Pedido {
    private int idPedido;
    private int dataPedido;
    private boolean status; //entregue?
    private int valorTotal;
    private itemPedido itemPedido;
    
    public Pedido(){ 
    }

    public Pedido(int idPedido, int dataPedido, boolean status, int valorTotal) {
        this.idPedido = idPedido;
        this.dataPedido = dataPedido;
        this.status = status;
        this.valorTotal = valorTotal;
    }

    public int getIdPedido() {
        return idPedido;
    }
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }
    public int getDataPedido() {
        return dataPedido;
    }
    public void setDataPedido(int dataPedido) {
        this.dataPedido = dataPedido;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public int getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    public itemPedido getItemPedido() {
        return itemPedido;
    }

    public void setItemPedido(itemPedido itemPedido) {
        this.itemPedido = itemPedido;
    }

    
}