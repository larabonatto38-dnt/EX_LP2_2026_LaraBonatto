public class Filme {
    private String titulo;
    private int duracao;
    private String genero;
    private String faixaEtaria;
    private String sinopse;

    public Filme(){
    }

    public Filme(String titulo, int duracao, String genero, String faixaEtaria, String sinopse) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.genero = genero;
        this.faixaEtaria = faixaEtaria;
        this.sinopse = sinopse;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getFaixaEtaria() {
        return faixaEtaria;
    }
    public void setFaixaEtaria(String faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }
    public String getSinopse() {
        return sinopse;
    }
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    @Override
    public String toString() {
        return "Filme\n titulo = " + titulo + "\n duracao = " + duracao + "\n genero = " + genero + "\n faixaEtaria = "
                + faixaEtaria + "\n sinopse = " + sinopse;
    }
    
}