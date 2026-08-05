public class Cinema {
    private String nome;
    private int cnpj;
    private String endereco;
    private int telefone;
    private Sala sala01;

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

    public Sala getSala01() {
        return sala01;
    }

    public void setSala01(Sala sala01) {
        this.sala01 = sala01;
    }

    @Override
    public String toString() {
        return "Cinema\n nome = " + nome + "\n cnpj = " + cnpj + "\n endereco = " + endereco + "\n telefone = " + telefone
                + "\n sala01 = " + sala01;
    }

}