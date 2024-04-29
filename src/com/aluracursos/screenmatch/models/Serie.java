package com.aluracursos.screenmatch.models;

public class Serie extends Titulo{

    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    public Serie(String nombre, int fechaLanzamiento) {
        super(nombre, fechaLanzamiento);
    }

    @Override
    public int getDuracionMinutros() {
        return super.duracionMinutros = (minutosPorEpisodio * episodiosPorTemporada) * temporadas;
    }



    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public String getInformacion() {
        super.informacion = super.getInformacion();
        super.informacion +=
                """
                Cuenta con %d temporada
                Cada temporada tiene %d episodios
                Cada episodio dura %d minutos
                """.formatted(
                        this.getTemporadas(),
                        this.getEpisodiosPorTemporada(),
                        this.getMinutosPorEpisodio()
                );

        return  super.informacion;
    }

    @Override
    public String toString() {
        return "serie: "+ this.getNombre()+" ("+this.getFechaLanzamiento()+") ";
    }
}
