package Ex_2_Sistema_Reservas_Hotel;

public class RedeHoteis {
    private String nome;
    private int cnpj;
    private Hotel hotel;
    
    public RedeHoteis(){
    }

    public RedeHoteis(String nome, int cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
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

    @Override
    public String toString() {
        return "RedeHoteis\n nome = " + nome + "\n cnpj = " + cnpj;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
    
}