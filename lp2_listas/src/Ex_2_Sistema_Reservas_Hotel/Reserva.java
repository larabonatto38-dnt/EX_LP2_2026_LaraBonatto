package Ex_2_Sistema_Reservas_Hotel;

import java.util.Date;

public class Reserva {
    private int codigoReserva;
    private int dataCheckIn;
    private int dataCheckOut;
    private int qtdPessoas;
    private int qtdQuartos;
    private Hospede hospede;

    public Reserva(){
    }
    
    public Reserva(int codigoReserva, int dataCheckIn, int dataCheckOut, int qtdPessoas, int qtdQuartos) {
        this.codigoReserva = codigoReserva;
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
        this.qtdPessoas = qtdPessoas;
        this.qtdQuartos = qtdQuartos;
    }

    public int getCodigoReserva() {
        return codigoReserva;
    }
    public void setCodigoReserva(int codigoReserva) {
        this.codigoReserva = codigoReserva;
    }
    public int getDataCheckIn() {
        return dataCheckIn;
    }
    public void setDataCheckIn(int dataCheckIn) {
        this.dataCheckIn = dataCheckIn;
    }
    public int getDataCheckOut() {
        return dataCheckOut;
    }
    public void setDataCheckOut(int dataCheckOut) {
        this.dataCheckOut = dataCheckOut;
    }
    public int getQtdPessoas() {
        return qtdPessoas;
    }
    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }
    public int getQtdQuartos() {
        return qtdQuartos;
    }
    public void setQtdQuartos(int qtdQuartos) {
        this.qtdQuartos = qtdQuartos;
    }

    @Override
    public String toString() {
        return "Reserva\n codigoReserva = " + codigoReserva + "\n dataCheckIn = " + dataCheckIn + "\n dataCheckOut = "
                + dataCheckOut + "\n qtdPessoas = " + qtdPessoas + "\n qtdQuartos = " + qtdQuartos;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

}