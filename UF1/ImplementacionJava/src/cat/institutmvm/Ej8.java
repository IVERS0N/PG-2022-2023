/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

import java.util.Scanner;

/**
 *
 * @author alumne_2n
 */
public class Ej8 {
    private static final String MSG_1 = "Introdueix un nombre enter: ";
    private static final String MSG_2 = "Introdueix el nombre de vegades que vols demanar: ";
    public static void main(String args[]) {
        int num, num2;
        Scanner sc = new Scanner(System.in);
        /*System.out.print(MSG_1);
        num = sc.nextInt();
        while(num != 0){
        num++;
        System.out.print(MSG_1);
        num = sc.nextInt();
        } */
        
        System.out.println(MSG_2);
        num2 = sc.nextInt();
        num = 1;
        while(num <= num2){
        num++;
        System.out.print(MSG_1);
        num = sc.nextInt();
        }
    }
}
