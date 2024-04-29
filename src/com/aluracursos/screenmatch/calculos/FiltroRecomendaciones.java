package com.aluracursos.screenmatch.calculos;

public class FiltroRecomendaciones {
    public void filtro(Clasificacion clasificacion)
    {
        if (clasificacion.getClasificacion() >= 4 ){
            System.out.println("Alavados por la critica");
        }
    }
}
