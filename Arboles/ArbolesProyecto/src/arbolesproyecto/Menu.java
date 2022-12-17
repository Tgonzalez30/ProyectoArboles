/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesproyecto;

import java.util.Scanner;

/**
 *
 * @author tamar
 */
public class Menu {
    
     private ArbolCadena arbolCadenas;
    private NodoCadena nodoCadena;

    public void MostrarMenu() {

        this.arbolCadenas = new ArbolCadena();
        this.nodoCadena = new NodoCadena();

        arbolCadenas.insertar("Carlos", "M");
        arbolCadenas.insertar("Maria", "F");
        arbolCadenas.insertar("Ana", "F");
        arbolCadenas.insertar("Jorge", "M");
        arbolCadenas.insertar("Luis", "M");
        arbolCadenas.insertar("Alicia", "F");
        arbolCadenas.insertar("Andres", "M");

        /*
        System.out.println(arbolCadenas.existe("Luis")); // true
        System.out.println(arbolCadenas.existe("Claire")); // false
        System.out.println(arbolCadenas.existe("Zelda")); // true
         */
        Scanner entrada = new Scanner(System.in);
        Scanner genero = new Scanner(System.in);
        Scanner dato = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("Elige una opcion");
            System.out.println("1-RECORRER INORDEN");
            System.out.println("2-RECORRER POSTORDEN");
            System.out.println("3-RECORRER PREORDEN");
            System.out.println("4-AGREGAR AL ARBOL GENEALOGICO");
            System.out.println("5-IMPRIMIR PROGENITORES FEMENINOS");
            System.out.println("6-SALIR.");
            opcion = entrada.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Recorriendo inorden:");
                    arbolCadenas.inorden();
                    break;
                case 2:
                    System.out.println("Recorriendo postorden:");
                    arbolCadenas.postorden();
                    break;
                case 3:
                    System.out.println("Recorriendo preorden:");
                    arbolCadenas.preorden();
                    break;
                case 4:
                    System.out.println("Agregando al arbol genealogico:");
                    this.arbolCadenas.AgregandoNodo(dato, genero);
                    break;
                case 5:
                    System.out.println("Progenitores femeninos:");
                    this.arbolCadenas.ImprimirFemenino();
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (opcion != 6);
    }
    
}
