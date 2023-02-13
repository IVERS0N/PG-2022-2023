/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package institutmvmdaw.pg;

/**
 *
 * @author daw
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Act2 {
    private final static String MSG_1 = "Introduce el nombre del archivo: ";
    private final static String MSG_2 = "El archivo no se ha encontrado";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(MSG_1);
        String fileName = sc.nextLine();
        if (!fileName.endsWith(".txt")) {
            fileName = fileName + ".txt";
        }
        File file = new File(fileName);
        try ( Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(MSG_2);
        }
    }
}
