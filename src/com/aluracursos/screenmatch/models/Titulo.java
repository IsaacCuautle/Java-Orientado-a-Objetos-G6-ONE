package com.aluracursos.screenmatch.models;

import com.aluracursos.screenmatch.exceptions.ErrorDuracionNoEstablecidaException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{
//    @SerializedName("Title")
    private String nombre = "";
//    @SerializedName("Year")
    private int fechaLanzamiento = 0;
    protected int duracionMinutros = 0;
    private boolean incluidaPlan;
    private double sumaEvaluaciones = 0;
    private int totalEvaluacion = 0;
    protected String informacion = "";

    public Titulo(String nombre, int fechaLanzamiento){
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public Titulo(TituloOMDB tituloOMDB)
    {
        this.nombre = tituloOMDB.title();
//        this.fechaLanzamiento = Integer.parseInt(tituloOMDB.year());
        this.fechaLanzamiento = Integer.valueOf(tituloOMDB.year());
        if (tituloOMDB.runtime().contains("N/A")){
            throw new ErrorDuracionNoEstablecidaException("Duracion de la pelicula no establecida");
        }else{
            this.duracionMinutros = Integer.parseInt(tituloOMDB.runtime().substring(0,3).replace(" ",""));
        }

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaLanzamiento(int fechaLanzamiento){
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public void setDuracionMinutros(int duracionMinutros) {
        this.duracionMinutros = duracionMinutros;
    }

    public void setIncluidaPlan(boolean incluidaPlan){
        this.incluidaPlan = incluidaPlan;
    }

    public String getInformacion()
    {
        this.informacion =
                """
                La pelicula es: %s
                Fue lanzada en el año: %d
                Tiene una duracion en minutos de: %d
                Incliuida en el plan:""".formatted(this.getNombre(),this.getFechaLanzamiento(),this.getDuracionMinutros());

        this.informacion += " "+String.valueOf(incluidaPlan);

        return this.informacion;
    }

    public  double calcularMedia()
    {
        return this.sumaEvaluaciones / this.totalEvaluacion;
    }

    public double peliculaEvaluar(double nota)
    {
        ++this.totalEvaluacion;
        return(this.sumaEvaluaciones += nota);
    }

    public String getEvaluaciones(){
        return "La suma de las evaluaciones es: "+this.totalEvaluacion;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean getIncluidaPlan() {
        return incluidaPlan;
    }

    public int getDuracionMinutros() {
        return duracionMinutros;
    }

    public int getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public double getSumaEvaluaciones() {
        return sumaEvaluaciones;
    }

    @Override
    public int compareTo(Titulo titulo) {
        return this.getNombre().compareTo(titulo.getNombre());
    }

    @Override
    public String toString() {
        return "\nTitulo{" +
                "nombre='" + nombre +
                ", fechaLanzamiento=" + fechaLanzamiento +
                ", duracionMinutros=" + duracionMinutros +
                "}"+"\n";
    }
}
