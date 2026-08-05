public class Fornecedor {
    private int idFornecedor;
    private String nomeEmpresa;
    private int cnpj;
    private int telefone;
    private Produto produtoFornecido;

    public Fornecedor(){
    }

    public Fornecedor(int idFornecedor, String nomeEmpresa, int cnpj, int telefone) {
        this.idFornecedor = idFornecedor;
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
        this.telefone = telefone;
    }
    
    public int getIdFornecedor() {
        return idFornecedor;
    }
    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }
    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }
    public int getCnpj() {
        return cnpj;
    }
    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public Produto getProdutoFornecido() {
        return produtoFornecido;
    }

    public void setProdutoFornecido(Produto produtoFornecido) {
        this.produtoFornecido = produtoFornecido;
    }

    @Override
    public String toString() {
        return "Fornecedor\n idFornecedor = " + idFornecedor + "\n nomeEmpresa = " + nomeEmpresa + "\n cnpj = " + cnpj
                + "\n telefone = " + telefone;
    }
}