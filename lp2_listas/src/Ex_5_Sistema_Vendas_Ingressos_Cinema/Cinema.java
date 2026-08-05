public class Cinema {
    private String nome;
    private int cnpj;
    private String endereco;
    private int telefone;

    public Cinema(){
    }
    
    public Cinema(String nome, int cnpj, String endereco, int telefone) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCnpj() {
        return cnpj;
    }
    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

}