package com.upchiapas.CasoPractico2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Scanner entrada = new Scanner(System.in);

    static ArrayList<Participante> listaParticipante = new ArrayList<Participante>(7);

    public static void main(String[] args) {
        leerOpcion();
    }

    public static void leerOpcion() {
        int opcion = 0;
        int posArray = 1;
        int posArrat = 0;
        int baja = 0;
        do {
            System.out.println("Seleccione la opcion deseada: ");
            System.out.println("[1] Agregar participantes ");
            System.out.println("[2] Mostrar participantes");
            System.out.println("[3] Salir\n");
            System.out.println("Ingrese la opcion del (1-3)");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    ingresarValores(posArray, baja);
                    baja++;
                    posArray++;
                    break;
                case 2:
                    visualisarP(posArrat);
                    posArrat++;
                    break;
            }
        } while (opcion != 3);
    }

    public static void ingresarValores(int posArray, int baja) {
        if (listaParticipante.size()<8){
            if (listaParticipante.size()< 5){
                int folio = 0;
                Random r = new Random();
                folio = (int) ((Math.random() * (999 - 100)) + 100);
                String nombre;
                String lugarRepresenta;
                System.out.println("Su numero de folio es: ");
                System.out.println(folio);
                System.out.println("Ingrese su nombre: ");
                nombre = entrada.next();
                System.out.println("Ingrese el lugar que representa: ");
                lugarRepresenta = entrada.next();
                System.out.println("La posicion que ocupara es: Planta alta ["+posArray+"]");
                System.out.println("Datos guardados exitosamente");
                Participante participante = new Participante(folio, nombre, lugarRepresenta);
                listaParticipante.add(participante);
            } else{
                int folio = 0;
                baja = baja -4;
                Random r = new Random();
                folio = (int) ((Math.random() * (999 - 100)) + 100);
                String nombre;
                String lugarRepresenta;
                System.out.println("Su numero de folio es: ");
                System.out.println(folio);
                System.out.println("Ingrese su nombre: ");
                nombre = entrada.next();
                System.out.println("Ingrese el lugar que representa: ");
                lugarRepresenta = entrada.next();
                System.out.println("La posicion que ocupara es: Planta baja ["+baja+"]");
                System.out.println("Datos guardados exitosamente");
                Participante participante = new Participante(folio, nombre, lugarRepresenta);
                listaParticipante.add(participante);

            }
        }else {
            System.out.println("No hay cupos disponibles");
        }
    }

    public static void visualisarP(int posArrat) {
        int plantaBaja = 0;
        for (int i = 0; i < listaParticipante.size(); i++) {

            posArrat++;
            if (posArrat < 6) {
                System.out.println(listaParticipante.get(i).toString() + " su posicion es: Planta alta [" + posArrat + "]");
            } else if (posArrat > 5 && posArrat <9) {
                plantaBaja++;
                System.out.println(listaParticipante.get(i).toString() + " su posicion es: Planta baja [" + plantaBaja + "]");
            }
        }
        }


    }

