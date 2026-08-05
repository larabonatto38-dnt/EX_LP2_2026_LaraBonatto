public class Cadeira {
    private String letraCadeira;
    private int numeroCadeira;
    private String status; // livre, ocupada, em manuntecao

    public Cadeira(){
    }

    public Cadeira(String letraCadeira, int numeroCadeira, String status) {
        this.letraCadeira = letraCadeira;
        this.numeroCadeira = numeroCadeira;
        this.status = status;
    }
    public String getLetraCadeira() {
        return letraCadeira;
    }
    public void setLetraCadeira(String letraCadeira) {
        this.letraCadeira = letraCadeira;
    }
    public int getNumeroCadeira() {
        return numeroCadeira;
    }
    public void setNumeroCadeira(int numeroCadeira) {
        this.numeroCadeira = numeroCadeira;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Cadeira\n letraCadeira = " + letraCadeira + "\n numeroCadeira = " + numeroCadeira + "\n status = " + status;
    }
    
}