/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ubosque.mvcnomina;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author angar
 */
public class Vista {

    static Scanner sc = new Scanner(System.in);
    Controlador persona = new Controlador();
    static ArrayList<Controlador> personas = new ArrayList<Controlador>();

    public static void main(String[] args) {

        int opcion = 0;
        do {
            System.out.println("1. Crear usuario");
            System.out.println("2. Leer usuario");
            System.out.println("3. Actualizar usuario");
            System.out.println("4. Eliminar usuario");
            System.out.println("4. Ver directorio");
            System.out.println("5. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    crearUsu();
                    break;
                case 2:
                    consultarUsu();
                    break;
                case 3:
                    actualizarUsu();
                    break;
                case 4:
                    eliminarUsu();
                    break;
                case 5:
                    salir();
                    break;
            }
        } while (opcion != 5);

    }

    public static void crearUsu() {

        System.out.println("Ingrese nombre: ");
        String nombre = sc.next();
        System.out.println("Ingrese apellido: ");
        String apellido = sc.next();
        System.out.println("Ingrese direccion: ");
        String direccion = sc.next();
        System.out.println("Ingrese telefono: ");
        int telefono = sc.nextInt();

        Controlador persona = new Controlador();
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setDireccion(direccion);
        persona.setTelefono(telefono);

        personas.add(persona);
        System.out.println("Usuario creado.\n");

    }

    public static void consultarUsu() {
        System.out.println("Ingrese nombre a buscar: ");
        String nombre = sc.next();
        boolean existe = false;
        for (Controlador persona : personas) {
            if (persona.getNombre().equals(nombre)) {
                //personas.remove(personas);
                System.out.println("\nEl usuario existe.\n\n");
                existe = true;
                break;
            } 
        }
        if(!existe){
            System.out.println("\nEl usuario NO existe.\n\n");
        }
    }

    public static void actualizarUsu() {

    }

    public static void eliminarUsu() {
System.out.println("Ingrese nombre a eliminar: ");
        String nombre = sc.next();
        boolean existe = false;
        for (Controlador persona : personas) {
            if (persona.getNombre().equals(nombre)) {
                personas.remove(persona);
                System.out.println("\nEl usuario ha sido eliminado.\n\n");
                existe = true;
                break;
            } 
        }
        if(!existe){
            System.out.println("\nEl usuario NO existe.\n\n");
        }
    }

    public static void salir() {

    }

}
