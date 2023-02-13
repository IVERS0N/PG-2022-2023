/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package institutmvmdaw.pg2;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author daw
 */
public class Act5 {
    private final static String MSG_1 = "Introduce el texto: ";
    private final static String MSG_2 = "El texto se ha guardado en el archivo: ";
    private final static String MSG_3 = "Error al guardar el texto en el archivo";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(MSG_1);
        String text = sc.nextLine();
        sc.close();

        try {
            File file = new File("files/text.txt");
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            fw.write(text);
            fw.close();

            System.out.println(MSG_2);
        } catch (IOException ex) {
            System.out.println(MSG_3);
            ex.printStackTrace();
        }
    }
}