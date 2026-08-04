public class Cliente {
    private int idCliente;
    private String nome;
    private String email;
    private int telefone;
    private String endereco;

    public Cliente(){
    }

    public Cliente(int idCliente, String nome, String email, int telefone, String endereco) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    
    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente\n idCliente = " + idCliente + "\n nome = " + nome + "\n email = " + email + "\n telefone = " + telefone
                + "\n endereco = " + endereco;
    }

    
}