/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pg3;

/**
 *
 * @author daw
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Act11 {
    private final static String MSG_1 = "Introdueix el codi: ";
    private final static String MSG_2 = "Introdueix el nom del projecte: ";
    private final static String MSG_3 = "Introdueix la descripció: ";
    private final static String MSG_4 = "Introdueix el codi del client: ";
    private final static String MSG_5 = "Introdueix l'import: ";
    private final static String MSG_6 = "Introdueix la data d'inici (format DD/MM/YYYY): ";
    private final static String MSG_7 = "Introdueix la data de fi (format DD/MM/YYYY): ";
    private final static String MSG_8 = "Les dades s'han escrit correctament en el fitxer.";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("pg.txt"));

            bw.write("Codi, Nom Projecte, Descripció, Codi Client, Import, Data Inici, Data Fi\n");

            System.out.print(MSG_1);
            bw.write(scanner.nextLine() + ",");

            System.out.print(MSG_2);
            bw.write(scanner.nextLine() + ",");

            System.out.print(MSG_3);
            bw.write(scanner.nextLine() + ",");

            System.out.print(MSG_4);
            bw.write(scanner.nextLine() + ",");

            System.out.print(MSG_5);
            bw.write(scanner.nextLine() + ",");

            System.out.print(MSG_6);
            bw.write(scanner.nextLine() + ",");

            System.out.print(MSG_7);
            bw.write(scanner.nextLine() + "\n");

            bw.close();
            System.out.println(MSG_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

