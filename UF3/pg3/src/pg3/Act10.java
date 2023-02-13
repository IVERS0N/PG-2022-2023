/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pg3;

/**
 *
 * @author daw
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Act10 {

    public static void main(String[] args) {
        String fitxer = "dades.csv";
        String linea = "";
        String separador = ",";
        
        try (BufferedReader br = new BufferedReader(new FileReader(fitxer))) {
            while ((linea = br.readLine()) != null) {
                String[] dades = linea.split(separador);
                System.out.printf("%-15s%-15s%-15s%-15s%-15s%n", dades[0], dades[1], dades[2], dades[3], dades[4]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

