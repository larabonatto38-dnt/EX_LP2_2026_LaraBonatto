public class Enfermeira {
    private int idEnfermeira;
    private String nome;

    public Enfermeira(){
    }
    
    public Enfermeira(int idEnfermeira, String nome) {
        this.idEnfermeira = idEnfermeira;
        this.nome = nome;
    }
    public int getIdEnfermeira() {
        return idEnfermeira;
    }
    public void setIdEnfermeira(int idEnfermeira) {
        this.idEnfermeira = idEnfermeira;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}