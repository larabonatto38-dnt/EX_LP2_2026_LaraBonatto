package Model;

import java.util.List;

/**
 * MODEL: Guarda apenas os dados do Personagem.
 * Não possui nenhuma dependência da interface gráfica (Swing).
 */
/*
Contém apenas os atributos do personagem, seus getters, setters e construtor.
*/
public class Personagem {

    private String nome;
    private String classe;
    private String dificuldade;
    private List<String> habilidades;
    private int nivelInicial;

    // Constructor
    public Personagem(String nome, String classe, String dificuldade, List<String> habilidades, int nivelInicial) {
        this.nome = nome;
        this.classe = classe;
        this.dificuldade = dificuldade;
        this.habilidades = habilidades;
        this.nivelInicial = nivelInicial;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }

    public int getNivelInicial() {
        return nivelInicial;
    }

    public void setNivelInicial(int nivelInicial) {
        this.nivelInicial = nivelInicial;
    }

}