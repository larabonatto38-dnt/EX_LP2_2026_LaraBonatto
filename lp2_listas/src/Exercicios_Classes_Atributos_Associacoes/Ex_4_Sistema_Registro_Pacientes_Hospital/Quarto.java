public class Quarto {
    private int numeroQuarto;
    private int andar;
    private String tipo;
    private String status; //ocupado, livre
    private Paciente pacienteInternado;

    public Quarto(){
    }
    
    public Quarto(int numeroQuarto, int andar, String tipo, String status) {
        this.numeroQuarto = numeroQuarto;
        this.andar = andar;
        this.tipo = tipo;
        this.status = status;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }
    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }
    public int getAndar() {
        return andar;
    }
    public void setAndar(int andar) {
        this.andar = andar;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public Paciente getPacienteInternado() {
        return pacienteInternado;
    }

    public void setPacienteInternado(Paciente pacienteInternado) {
        this.pacienteInternado = pacienteInternado;
    }

    public void setCapacidadeHospedes(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setCapacidadeHospedes'");
    }

    public void setPrecoDiaria(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setPrecoDiaria'");
    }

    public void setReserva(Reserva reserva02) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setReserva'");
    }

    
}