//package Ex_2_Sistema_Reservas_Hotel;

public class Quarto {
    private int numeroQuarto;
    private String tipo; //Standart ou Luxo
    private int precoDiaria;
    private int capacidadeHospedes;
    private Reserva reserva;
    
    public Quarto(){
    }

    public Quarto(int numeroQuarto, String tipo, int precoDiaria, int capacidadeHospedes) {
        this.numeroQuarto = numeroQuarto;
        this.tipo = tipo;
        this.precoDiaria = precoDiaria;
        this.capacidadeHospedes = capacidadeHospedes;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }
    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getPrecoDiaria() {
        return precoDiaria;
    }
    public void setPrecoDiaria(int precoDiaria) {
        this.precoDiaria = precoDiaria;
    }
    public int getCapacidadeHospedes() {
        return capacidadeHospedes;
    }
    public void setCapacidadeHospedes(int capacidadeHospedes) {
        this.capacidadeHospedes = capacidadeHospedes;
    }

    @Override
    public String toString() {
        return "Quarto\n numeroQuarto = " + numeroQuarto + "\n tipo = " + tipo + "\n precoDiaria = " + precoDiaria
                + "\n capacidadeHospedes = " + capacidadeHospedes;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
    
}