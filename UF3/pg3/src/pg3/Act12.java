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

public class Act12 {
    private final static String MSG_1 = "No s'han trobat dades en el fitxer.";
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("pg.txt"));
            String line;
            String[] header = null;
            String[][] data = new String[1][7];
            int row = 0;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (header == null) {
                    header = parts;
                    data = new String[0][header.length];
                } else {
                    String[][] newData = new String[data.length + 1][header.length];
                    for (int i = 0; i < data.length; i++) {
                        for (int j = 0; j < header.length; j++) {
                            newData[i][j] = data[i][j];
                        }
                    }
                    data = newData;
                    for (int i = 0; i < parts.length; i++) {
                        data[row][i] = parts[i];
                    }
                    row++;
                }
            }
            br.close();

            if (header != null && data.length > 0) {
                for (int i = 0; i < header.length; i++) {
                    System.out.printf("%-15s", header[i]);
                }
                System.out.println();
                for (int i = 0; i < data.length; i++) {
                    for (int j = 0; j < data[i].length; j++) {
                        System.out.printf("%-15s", data[i][j]);
                    }
                    System.out.println();
                }
            } else {
                System.out.println(MSG_1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

