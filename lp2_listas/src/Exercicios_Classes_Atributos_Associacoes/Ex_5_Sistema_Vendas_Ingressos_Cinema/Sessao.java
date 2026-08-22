public class Sessao {
    private int data;
    private int horarioInicio;
    private Filme filmeSessao;
    private Ingresso ingressoSessao;

    public Sessao(){
    }

    public Sessao(int data, int horarioInicio) {
        this.data = data;
        this.horarioInicio = horarioInicio;
    }
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public int getHorarioInicio() {
        return horarioInicio;
    }
    public void setHorarioInicio(int horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public Filme getFilmeSessao() {
        return filmeSessao;
    }

    public void setFilmeSessao(Filme filmeSessao) {
        this.filmeSessao = filmeSessao;
    }

    public Ingresso getIngressoSessao() {
        return ingressoSessao;
    }

    public void setIngressoSessao(Ingresso ingressoSessao) {
        this.ingressoSessao = ingressoSessao;
    }

    @Override
    public String toString() {
        return "Sessao\n data = " + data + "\n horarioInicio = " + horarioInicio + "\n filmeSessao = " + filmeSessao
                + "\n ingressoSessao = " + ingressoSessao;
    }

}