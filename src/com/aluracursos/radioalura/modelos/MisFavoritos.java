package com.aluracursos.radioalura.modelos;

public class MisFavoritos {
    public void agrega(Audio audio){
        if (audio.getClasificacion() >=9){
            System.out.println(audio.getTitulo() + " es de mis favoritos");
        } else {
            System.out.println(audio.getTitulo() + " es de mi biblioteca: ");
        }
    }
}
