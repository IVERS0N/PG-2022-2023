
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author daw
 */
public class Ej9 {
    private static final String MSG_1 = "Introdueix un nombre enter: ";
    public static void main(String args[]) {
        int num, sum = 0, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sc.nextInt();
        while(num != 0){
            sum = sum + num;
            count++;
            num = sc.nextInt();
        }
        System.out.println("La mitjana es " + sum/count);
    }
}
