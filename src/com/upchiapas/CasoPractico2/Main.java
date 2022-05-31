package com.upchiapas.CasoPractico2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner entrada = new Scanner(System.in);

    static ArrayList<Participante> listaParticipante = new ArrayList<Participante>();
    public static void main(String[] args) {
        Main listaP = new Main();
        listaP.listaParticipante = new ArrayList();
        leerOpcion();
    }
    public static void leerOpcion(){
        int opcion = 0;
        do {
            System.out.println("Seleccione la opcion deseada: ");
            System.out.println("[1] Agregar participantes ");
            System.out.println("[2] Mostrar participantes");
            System.out.println("[3] Salir\n");
            System.out.println("Ingrese la opcion del (1-3)");
            opcion = entrada.nextInt();
            switch (opcion){
                case 1:
                    ingresarValores();
                    break;
                case 2:
                    visualisarP();
                    break;
            }
        }while (opcion !=3);
    }
    public static void ingresarValores(){
        int folio;
        String nombre;
        String lugarRepresenta;
        System.out.println("Ingrese su numero de Folio: ");
        folio=entrada.nextInt();
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.next();
        System.out.println("Ingrese el lugar que representa: ");
        lugarRepresenta = entrada.next();
        System.out.println("Datos guardados exitosamente");
        Participante participante = new Participante(folio, nombre, lugarRepresenta);
        listaParticipante.add(participante);

        /* for (int i = 0; i < listaParticipante.size(); i++){
            System.out.println("Ingrese su numero de Folio: ");
            folio=entrada.nextInt();
            System.out.println("Ingrese su nombre: ");
            nombre = entrada.next();
            System.out.println("Ingrese el lugar que representa: ");
            lugarRepresenta = entrada.next();
             participante = new Participante(folio, nombre, lugarRepresenta);
            listaParticipante.add(participante);
        }*/
    }

    public static void visualisarP(){
        for (int i=0; i < listaParticipante.size(); i++){
            System.out.println(listaParticipante.get(i).toString());
        }
    }
}
