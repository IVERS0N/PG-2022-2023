/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package institutmvmdaw.pg2;

/**
 *
 * @author daw
 */

import java.io.*;
import java.util.Scanner;

public class Act6 {
    private final static String MSG_1 = "Introduce el texto: ";
    private final static String MSG_2 = "El texto se ha agregado al archivo text.txt";
    private final static String MSG_3 = "Error al agregar el texto al archivo";
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

            FileWriter fw = new FileWriter(file, true);
            fw.write(text + "\n");
            fw.close();

            System.out.println(MSG_2);
        } catch (IOException ex) {
            System.out.println(MSG_3);
            ex.printStackTrace();
        }
    }
}

