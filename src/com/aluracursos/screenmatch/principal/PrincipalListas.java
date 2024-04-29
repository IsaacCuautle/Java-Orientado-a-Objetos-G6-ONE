package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.models.Pelicula;
import com.aluracursos.screenmatch.models.Serie;
import com.aluracursos.screenmatch.models.Titulo;

import java.util.*;

public class PrincipalListas {
    public static void main(String[] args) {
        var matrix = new Pelicula("Matrix", 2001);
//        matrix.setNombre("Matrix");
//        matrix.setFechaLanzamiento(2001);
        matrix.setDuracionMinutros(120);
        matrix.setIncluidaPlan(true);
        matrix.peliculaEvaluar(9);
//        System.out.println("\n" + matrix.getInformacion());

        var interStellar = new Pelicula("Intersetellar", 2001);
//        interStellar.setNombre("Intersetellar");
        interStellar.setDuracionMinutros(120);
//        interStellar.setFechaLanzamiento(2001);
        interStellar.peliculaEvaluar(9);

        var tragonesYMazmorras = new Serie("Tragones y mazmorras",2024);
        tragonesYMazmorras.peliculaEvaluar(9);

//        ArrayList<Titulo> list = new ArrayList<>();
        List<Titulo> list = new LinkedList<>();
        list.add(matrix);
        list.add(interStellar);
        list.add(tragonesYMazmorras);

//        System.out.println("Tamaño de la lista: "+ list.size());
//        System.out.println("La primera pelicula es: "+ list.get(0).getNombre());
//        System.out.println(list);

        // foreach
        for (Titulo item: list) {

            System.out.println(item.getNombre());

            if (item instanceof Pelicula pelicula){
                // Casteo
                System.out.println(pelicula.getClasificacion());
            }
        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penelope cruz");
        listaDeArtistas.add("Antinio Banderas");
        listaDeArtistas.add("Ricardo Dario");

        // Lista desordenada
        System.out.println(listaDeArtistas);

        // Lista ordenada
        Collections.sort(listaDeArtistas);
        System.out.println("Lista de artistas ordenada alfabeticamente:"+ listaDeArtistas);

        Collections.sort(list);
        System.out.println(list);

        // Lista ordenada por fechas
        list.sort(Comparator.comparing(Titulo::getFechaLanzamiento));
        System.out.println("Lista ordenada por año: "+list);
    }
}
