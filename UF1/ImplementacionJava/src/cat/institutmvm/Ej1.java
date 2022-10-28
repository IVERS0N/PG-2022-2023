/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

/**
 *
 * @author alumne_2n
 */
public class Ej1 {

    public static void main(String[] args) {
        //Imprimeix el teu nom:
        System.out.println("Allen");
        //Imprimeix el teu nom i cognoms en la mateixa línia:
        System.out.println("Allen Matira");
        //Imprimeix el teu nom en una línia i el teu cognom en la següent:
        System.out.println("Allen \n" + "Matira");

        //Imprimeix una quadrat de 10 per 10 amb asteriscs *
        int len = 10; // tamaño cuadrado
        int x = 0;

        // print primera linea
        while (x++ < len) {
            System.out.print("* ");
        }
        System.out.println(); // nueva linea
        x = 0;
        while (x++ < len - 2) {
            System.out.print('*'); // inicio linea
            int y = 0;
            while (y++ < len - 2) {
                System.out.print("  "); // espacios
            }
            System.out.println(" *"); // final linea
        }
        x = 0;
        // print ultima linea
        while (x++ < len) {
            System.out.print("* ");
        }

        System.out.println("\n");
        
        // Imprimeix un triangle de base 10 amb asteriscs.
        int sizeOfPyramid = 10;

        for (int i = 1; i <= sizeOfPyramid; i++) {
            // imprime un número reducido de espacios para cada nueva fila
            for (int j = i; j <= sizeOfPyramid - 1; j++) {
                System.out.print(" ");
            }

            // el número de asteriscos para cada fila es 2*numero de fila -1
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
