package com.upchiapas.CasoPractico2;

import java.util.ArrayList;
import java.util.Random;
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
        int posArray = 0;
        do {
            System.out.println("Seleccione la opcion deseada: ");
            System.out.println("[1] Agregar participantes ");
            System.out.println("[2] Mostrar participantes");
            System.out.println("[3] Salir\n");
            System.out.println("Ingrese la opcion del (1-3)");
            opcion = entrada.nextInt();
            switch (opcion){
                case 1:
                    ingresarValores(posArray);
                    posArray++;
                    break;
                case 2:
                    visualisarP();
                    break;
            }
        }while (opcion !=3);
    }
    public static void ingresarValores(int posArray){
        int folio = 0;
        Random r= new Random();
        folio=(int)((Math.random() * (999 - 100)) + 100); //poner esto dentro de un metodo para luego poderlo compararlo con un if para ver que no se repitan
        String nombre;
        String lugarRepresenta;
        System.out.println("Su numero de folio es: ");
        System.out.println(folio);
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.next();
        System.out.println("Ingrese el lugar que representa: ");
        lugarRepresenta = entrada.next();
        System.out.println("La posicion que ocupara es:");
        System.out.println(posArray);
        System.out.println("Datos guardados exitosamente");
        Participante participante = new Participante(folio, nombre, lugarRepresenta);
        listaParticipante.add(participante);
    }

    public static void visualisarP(){
        for (int i=0; i < listaParticipante.size(); i++){
            System.out.println(listaParticipante.get(i).toString());
        }
    }
    public int generarNumero(){
        int folio = 0;
        Random r= new Random();
        folio=(int)((Math.random() * (999 - 100)) + 100); //poner esto dentro de un metodo para luego poderlo compararlo con un if para ver que no se repitan
        return folio;
    }


}
