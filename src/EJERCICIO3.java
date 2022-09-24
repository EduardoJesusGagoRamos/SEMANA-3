/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class EJERCICIO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] num = new int[3][3];
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingrese los números:");
        for (int i = 0; i < num.length; i++) {//Dimensión uno.
            for (int j = 0; j < num.length; j++) {//Dimensión dos.
                num[i][j] = numero.nextInt();
            }
        }
        System.out.println("Imprimiendo Tabla");
        for (int i = 0; i < num.length; i++) {
            System.out.println();
            for (int j = 0; j < num.length; j++) {
                System.out.println(num[i][j] + "");
            }
        }
        System.out.println("\nSuma Fila.");
        int suma = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                suma += num[i][j];
            }
            System.out.println("Fila" + i + "=" + suma);
            suma = 0;
        }
        System.out.println("\nSuma Columna");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                suma += num[j][i];
            }
            System.out.println("Columna" + i + "=" + suma);
            suma = 0;
        }
    }
}
