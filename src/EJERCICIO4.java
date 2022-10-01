// Crear un array bidimensional de tamaño 7x7 y rellénalo de forma que los elementos de la diagonal principal sean 1 y el resto 0. Muestra el array por pantalla en forma cuadrado
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class EJERCICIO4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] matriz = new int[7][7];
        int f;
        //Relleno la diagonal principal con 1
        //Solo tengo que recorrer las casillas en las que el numero de filas es
        //igual que el numero de columna : matriz[0][0]=matriz[1][1]...=matriz[6][6]=1
        for(f=0;f <matriz.length;f++){
            matriz[f][f] = 1;
        }
        
        //muestro las filas de la matriz haciendo uso de la libreria "Arrays"
        for(f=0; f < matriz.length;f++){
            System.out.println(Arrays.toString(matriz[f]));
        }       
    }
    
}
    

