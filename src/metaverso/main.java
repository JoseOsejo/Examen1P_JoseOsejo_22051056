/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metaverso;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jcoq2
 */
public class main {

    //opciones universo
    //opciones escuadrones
    //opciones personas
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Universo> universos = new ArrayList();
    public static ArrayList<Persona> personas = new ArrayList();
    public static ArrayList<Escuadron> escuadrones = new ArrayList();
    ////////////////////////////////////////////////////////////////////////////    
    public static Universo universo = new Universo("Plantufum");
    public static Escuadron villanos = new Escuadron("EscuadronSuicida", "Tegucigalpa", "Villanos");
    public static Escuadron superHeroes = new Escuadron("EscuadronAvengers", "Tegucigalpa", "SuperHeroes");
    public static Persona spiderMan = new PorAccidenteRadioactivo(17, "Mordido por arania", "Peter Parker", "HombreArania", "Venom", "Heroe", 50, 50, 20);
    public static Persona batMan = new SuperHumano("millonario","BruceWayne", "Batman", "losExtraterrestres", "Heroe",60, 20, 10);
    public static Persona elGuason = new SuperHumano("Inteligente","Guason", "Guason", "Batman", "Villano",61, 18, 9);
    public static Persona drOctopus = new PorAccidenteRadioactivo(57, "Por el sol", "De", "HombreArania", "Venom", "Heroe", 50, 50, 20);
    public static void main(String[] args) {
       universos.add(universo);
       personas.add(batMan);
       personas.add(spiderMan);
       personas.add(elGuason);
       personas.add(drOctopus);
        do {
            opciones(menu());
        } while (true);
    }

    public static int menu() {
        System.out.println("");
        System.out.println("");
        System.out.println("0. Salir");
        System.out.println("1. Opciones Universo\n"
                + "2. Opciones Escuadron\n"
                + "3. Opciones Persona\n"
                + "Ingrese la opcion: ");
        return sc.nextInt();
    }

    public static void opciones(int opcion) {
        if (opcion == 0) {
            System.exit(0);
        } else if (opcion == 1) {
            opcionesUniverso(menuOpcionesUniverso());
        } else if (opcion == 2) {
            opcionesEscuadron(menuOpcionesEscuadron());
        } else if (opcion == 3) {
            opcionesPersona(menuOpcionesPersona());
        }

    }

    public static int menuOpcionesUniverso() {
        System.out.println("1.Crear\n2.Modificar\n3.Eliminar\n4.Listar\nIngrese\nIngrese una opcion: ");
        return sc.nextInt();
    }

    public static int menuOpcionesEscuadron() {
        System.out.println("1.Crear\n2.Modificar\n3.Eliminar\n4.Listar\n5.Simular Batalla\nIngrese una opcion: ");
        return sc.nextInt();
    }

    public static int menuOpcionesPersona() {
        System.out.println("1.Crear\n2.Modificar\n3.Eliminar\n4.Listar\nIngrese una opcion: ");
        return sc.nextInt();
    }

    public static void opcionesUniverso(int opcion) {
        if (opcion == 1) {
            crearUniverso();
        } else if (opcion == 2) {
            modificarUniverso();
        } else if (opcion == 3) {
            eliminarUniverso();
        } else if (opcion == 4) {
            listarUniverso();
        }
    }

    public static void opcionesEscuadron(int opcion) {
        if (opcion == 1) {
            crearEscuadron();
        } else if (opcion == 2) {
            modificarEscuadron();
        } else if (opcion == 3) {
            eliminarEscuadron();
        } else if (opcion == 4) {
            listarEscuadron();
        } else if (opcion == 5) {
            simularBatalla();
        }
    }

    public static void opcionesPersona(int opcion) {
        if (opcion == 1) {
            crearPersona();
        } else if (opcion == 2) {
            modificarPersona();
        } else if (opcion == 3) {
            eliminarPersona();
        } else if (opcion == 4) {
            listarPersona();
        }
    }

    private static boolean universoRepetido(String nombre) {

    }

    public static void crearUniverso() {
        System.out.println("Ingrese el Nombre del Universo");
        String nombre = sc.next();

    }

    public static void modificarUniverso() {

    }

    public static void eliminarUniverso() {

    }

    public static void listarUniverso() {

    }
}
