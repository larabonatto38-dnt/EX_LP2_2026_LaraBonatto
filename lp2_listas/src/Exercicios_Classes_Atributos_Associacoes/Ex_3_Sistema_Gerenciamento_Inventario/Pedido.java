public class Pedido {
    private int idPedido;
    private int dataPedido;
    private boolean status; //entregue?
    private int valorTotal;
    private Cliente clientePidao;
    private Produto produtoPedidoCliente;
    
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

    public Cliente getClientePidao() {
        return clientePidao;
    }

    public void setClientePidao(Cliente clientePidao) {
        this.clientePidao = clientePidao;
    }

    public Produto getProdutoPedidoCliente() {
        return produtoPedidoCliente;
    }

    public void setProdutoPedidoCliente(Produto produtoPedidoCliente) {
        this.produtoPedidoCliente = produtoPedidoCliente;
    }

    @Override
    public String toString() {
        return "Pedido\n idPedido = " + idPedido + "\n dataPedido = " + dataPedido + "\n status = " + status + "\n valorTotal = "
                + valorTotal;
    }

    
}