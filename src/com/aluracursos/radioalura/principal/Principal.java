package com.aluracursos.radioalura.principal;

import com.aluracursos.radioalura.modelos.Cancion;
import com.aluracursos.radioalura.modelos.MisFavoritos;
import com.aluracursos.radioalura.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kiss");

        Podcast miPodcats = new Podcast();
        miPodcats.setPresentador("Gabriela Aguilar");
        miPodcats.setTitulo("Cafe.tech");

        //Canción

        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }

        for (int i = 0; i < 2000; i++) {
            miCancion.reproduce();
        }

        //Podcast

        for (int i = 0; i < 100; i++) {
            miPodcats.meGusta();
        }

        for (int i = 0; i < 8000; i++) {
            miPodcats.reproduce();
        }

        System.out.println("Total de reproducciones: " + miCancion.getTotalDeReproducciones());
        System.out.println("Total de me gusta: " + miCancion.getTotalMeGusta());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.agrega(miPodcats);
        favoritos.agrega(miCancion);


    }
}
