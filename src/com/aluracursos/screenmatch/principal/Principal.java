package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.models.Pelicula;

import java.util.ArrayList;
import java.util.Collections;

public class Principal
{
    public static void main(String[] args)
    {
        var pelicula = new Pelicula("Matrix",2001);
//        pelicula.setNombre("Matrix");
//        pelicula.setFechaLanzamiento(2001);
        pelicula.setDuracionMinutros(120);
        pelicula.setIncluidaPlan(true);
//        System.out.println("\n"+pelicula.getInformacion());
//
//        pelicula.peliculaEvaluar(10);
//        pelicula.peliculaEvaluar(10);
//        System.out.println("\n"+pelicula.getEvaluaciones());
//
//        System.out.println("\nLa media fue de: "+pelicula.calcularMedia());
//        System.out.println("\n");
//
//        Serie casaDragon = new Serie();
//        casaDragon.setNombre("La casa del dragon");
//        casaDragon.setFechaLanzamiento(2022);
//        casaDragon.setTemporadas(1);
//        casaDragon.setMinutosPorEpisodio(30);
//        casaDragon.setEpisodiosPorTemporada(10);
//        casaDragon.setIncluidaPlan(true);
//        System.out.println(casaDragon.getInformacion());
//
//
//        CalculadoraDeTiempo calculadoraTiempoCasaDragon = new CalculadoraDeTiempo();
//        calculadoraTiempoCasaDragon.incluye(casaDragon);
//        System.out.println(calculadoraTiempoCasaDragon.getTiempoTotal());
//
//        CalculadoraDeTiempo calculadoraDeTiempoMatrix = new CalculadoraDeTiempo();
//        calculadoraDeTiempoMatrix.incluye(pelicula);
////        System.out.println(calculadoraDeTiempoMatrix.getTiempoTotal());
//
//        FiltroRecomendaciones filtroRecomendaciones = new FiltroRecomendaciones();
//        filtroRecomendaciones.filtro(pelicula);
//
//        Episodio episodio = new Episodio();
//        episodio.setSerie(casaDragon);
//        episodio.setNombre("La casa Darkerion");
//        episodio.setNumero(1);
//        episodio.setVisualizaciones(50);
//
//        FiltroRecomendaciones filtroRecomendaciones1 = new FiltroRecomendaciones();
//        filtroRecomendaciones1.filtro(episodio);

        var nuevaPelicula = new Pelicula("Intersetellar",2001);
//        nuevaPelicula.setNombre("Intersetellar");
        nuevaPelicula.setDuracionMinutros(120);
//        nuevaPelicula.setFechaLanzamiento(2001);

        ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
        listaPeliculas.add(nuevaPelicula);
        listaPeliculas.add(pelicula);

//        System.out.println("Tamaño de la lista: "+listaPeliculas.size());
//        System.out.println("La primera pelicula es: "+listaPeliculas.get(0).getNombre());
//        System.out.println(listaPeliculas);


    }
}