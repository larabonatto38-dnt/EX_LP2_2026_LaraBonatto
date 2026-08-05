public class Produto {
    private int idProduto;
    private String nome;
    private int preco;
    private int quantidadeEstoque;
    private Categoria categoriaProduto;


    public Produto(){
    }

    public Produto(int idProduto, String nome, int preco, int quantidadeEstoque) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }
    
    public int getIdProduto() {
        return idProduto;
    }
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getPreco() {
        return preco;
    }
    public void setPreco(int preco) {
        this.preco = preco;
    }
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Categoria getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(Categoria categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    @Override
    public String toString() {
        return "Produto\n idProduto = " + idProduto + "\n nome = " + nome + "\n preco = " + preco + "\n quantidadeEstoque = "
                + quantidadeEstoque;
    }
    
}