package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.exceptions.ErrorDuracionNoEstablecidaException;
import com.aluracursos.screenmatch.models.Pelicula;
import com.aluracursos.screenmatch.models.Titulo;
import com.aluracursos.screenmatch.models.TituloOMDB;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (true) {
            System.out.println("Escribe el nombre de la pelicula");
            String pelicula = scanner.nextLine()
                    .replace(" ", "+");

            if (pelicula.equalsIgnoreCase("Salir")){
                break;
            }

            String url = "http://www.omdbapi.com/?apikey=d290bca4&t=" + pelicula;

            try {

                HttpClient httpClient = HttpClient.newHttpClient();
                HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(url)).build();

                HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
                String json = response.body();
                System.out.println(json);

                TituloOMDB tituloOMDB = gson.fromJson(json, TituloOMDB.class);
//        System.out.println(tituloOMDB);

                Titulo titulo = new Titulo(tituloOMDB);
                System.out.println(titulo);
                titulos.add(titulo);

            } catch (ErrorDuracionNoEstablecidaException e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
            }


        }

        System.out.println(titulos);

        FileWriter fileWriter = new FileWriter("Titulos.json");
        fileWriter.write(gson.toJson(titulos));
        fileWriter.close();
        System.out.println("Termino la ejecucion del programa");

    }
}
