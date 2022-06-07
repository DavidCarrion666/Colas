package ejerciciocolas;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Usuario iTC
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Colas colaNueva = new Colas();
        
        
        System.out.println("Ingrese el tamanio de la cola");
        int entrada = sc.nextInt();
        
        colaNueva = insertarDatos(entrada);
        colaNueva.contar();
        System.out.println(colaNueva.toString());
        eliminarCola(colaNueva, entrada);

    }

    public static Colas insertarDatos(int entrada) {
        Scanner sc = new Scanner(System.in);
        Colas colaNueva = new Colas();

        for (int i = 0; i < entrada; i++) {
            System.out.printf("Ingrese el valor %d para la cola:\n", i + 1);
            int valor = sc.nextInt();
            colaNueva.insertar(valor);
        }
        return colaNueva;
    }

    public static void eliminarCola(Colas colaNueva, int entrada) {
        System.out.println("***************************************");
        System.out.println("Se van a empezar a borrar los datos ingresados");

        for (int i = 0; i < entrada; i++) {
            colaNueva.extraer();
            colaNueva.contar();
            System.out.println(colaNueva.toString());
        }
        
    }
}
