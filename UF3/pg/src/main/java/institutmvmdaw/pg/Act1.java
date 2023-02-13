/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package institutmvmdaw.pg;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author daw
 */
public class Act1 {
  public static void main(String[] args) {
    File file = new File("/home/daw/NetBeansProjects/pg/src/main/java/institutmvmdaw/pg/textfile.txt");
    try (Scanner sc = new Scanner(file)) {
      while (sc.hasNextLine()) {
        System.out.println(sc.nextLine());
      }
    } catch (FileNotFoundException e) {
      System.out.println("El archivo no se ha encontrado");
    }
  }
}
