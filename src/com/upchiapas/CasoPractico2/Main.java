package com.upchiapas.CasoPractico2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        ingresarValores();
    }

    public static void ingresarValores(){
        int folio;
        String nombre;
        String lugarRepresenta;
        ArrayList<Participante> listaParticipante = new ArrayList<Participante>();

        System.out.println("Ingrese su numero de Folio: ");
        folio=entrada.nextInt();
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.next();
        System.out.println("Ingrese el lugar que representa: ");
        lugarRepresenta = entrada.next();
        Participante participante = new Participante(folio, nombre, lugarRepresenta);
        listaParticipante.add(participante);

         for (int i = 0; i < 4; i++){
            System.out.println("Ingrese su numero de Folio: ");
            folio=entrada.nextInt();
            System.out.println("Ingrese su nombre: ");
            nombre = entrada.next();
            System.out.println("Ingrese el lugar que representa: ");
            lugarRepresenta = entrada.next();
             participante = new Participante(folio, nombre, lugarRepresenta);
            listaParticipante.add(participante);
        }

        for (int i=0; i < listaParticipante.size(); i++){
            System.out.println(listaParticipante.get(i).toString());
        }

    }
}
