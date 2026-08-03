package Ex_2_Sistema_Reservas_Hotel;

public class Hotel {
    private String nome;
    private String endereco;
    private String cidade;
    private Quarto quarto;
    
    public Hotel(){
    }

    public Hotel(String nome, String endereco, String cidade) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Hotel\n nome = " + nome + "\n endereco = " + endereco + "\n cidade = " + cidade;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }
    
}