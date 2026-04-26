public class SerieTV extends ConteudoTV {

    private int temporadas;
    private int episodios;

    public SerieTV(String titulo, String tipo, int temporadas, int episodios) {
        super(titulo, tipo);
        this.temporadas = temporadas;
        this.episodios = episodios;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String toString() {
        return super.toString() +
               "Temporadas: " + temporadas + "\n" +
               "Episódios: " + episodios + "\n";
    }
}