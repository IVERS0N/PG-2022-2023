/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package institutmvmdaw.pg2;

/**
 *
 * @author daw
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import java.util.Scanner;

public class Act7 {

    private final static String MSG_1 = "Introduce el nombre del archivo:";
    private final static String MSG_2 = "El archivo no existe.";
    private final static String MSG_3 = "Introduce el texto a agregar:";

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Opcións disponibles:");
            System.out.println("1. Llegir fitxer");
            System.out.println("2. Guardar text en fitxer");
            System.out.println("3. Afegir text en fitxer");
            System.out.println("4. Comptar longitud del document");
            System.out.println("5. Sortir");
            System.out.print("Seleccione una opción: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    readFile();
                    break;
                case 2:
                    saveFile();
                    break;
                case 3:
                    addFile();
                    break;
                case 4:
                    countLength();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        }
        sc.close();
    }

    private static void readFile() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print(MSG_1);
        String fileName = sc.nextLine();
        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println(MSG_2);
            return;
        }

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
        sc.close();
    }

    private static void saveFile() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print(MSG_1);
        String fileName = sc.nextLine();
        File file = new File(fileName);

        if (!file.exists()) {
            file.createNewFile();
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        System.out.println(MSG_3);
        String text = sc.nextLine();
        bw.write(text);
        bw.close();
        sc.close();
    }

    private static void addFile() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print(MSG_1);
        String fileName = sc.nextLine();
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println(MSG_2);
            return;
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
        System.out.println(MSG_3);
        String text = sc.nextLine();
        bw.write("\n" + text);
        bw.close();
        sc.close();
    }

    private static void countLength() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print(MSG_1);
        String fileName = sc.nextLine();
        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println(MSG_2);
            return;
        }

        BufferedReader reader = new BufferedReader(new FileReader(file));
        int length = 0;
        String line;
        while ((line = reader.readLine()) != null) {
            length += line.length();
        }
        System.out.println("La longitud del documento es: " + length);
        reader.close();
        sc.close();
    }
}
