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
public class Ej3 {
    //Nom: Allen
    //Cognoms: Matira
    //INS Manuel Vázquez Montalbán
    //Data d’edició: 28/10/22
    //Nom del cicle formatiu: DAW
    //Nom del mòdul: Programación
    //Commentaire exercice_A
    private static final String MSG_1 = "Introdueix un nombre :";
    private static final String MSG_2 = "El nombre es negatiu  ";
    private static final String MSG_3 = "El nombre es positiu  ";

    //Commentaire exercice_B
    private static final String MSG_4 = "Introdueix un nombre :";
    private static final String MSG_5 = "El nombre es mes gran que 35  ";
    private static final String MSG_6 = "El nombre es mes petit que 35  ";
    private static final String MSG_7 = "El nombre es mes es igualque 35  ";

    ////Commentaire exercice_C
    private static final String MSG_11 = "Introdueix un nombre :";
    private static final String MSG_12 = "El nombre es positiu i mes petit que 100 ";
    private static final String MSG_13 = "Error";

    //Commentaire exercice_D
    private static final String MSG_8 = "Introdueix un nombre :";
    private static final String MSG_9 = "El nombre esta en el interval -3 i 27  ";
    private static final String MSG_10 = "El nombre no esta en el interval -3 i 27  ";

    ////Commentaire exercice_E
    private static final String MSG_14 = "Introdueix un nombre :";
    private static final String MSG_15 = "El nombra esta fora del rang 25 i 50  ";
    private static final String MSG_16 = "Error";
   
    ////Commentaire exercice_E
    private static final String MSG_17 = "Introdueix dos nombres :";
    private static final String MSG_18 = "El nombra esta fora del rang 25 i 50  ";
    private static final String MSG_19 = "Error";
    
    public static void main(String[] args) {
        //A
        /*
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sc.nextInt();
        if (num >= 0) {
            System.out.println(MSG_3);
        } else {
            System.out.println(MSG_2);
        }
         */
        //B
        /*
        int num;
         Scanner sc = new Scanner(System.in);
        System.out.println(MSG_4);
        num = sc.nextInt();
        if(num>35){
              System.out.println(MSG_5);
        } else if (num== 35){
             System.out.println(MSG_7);
        }
        else {
            System.out.println(MSG_6);
        }
         */
        //C
        /*
        int num;
         Scanner sc = new Scanner(System.in);
        System.out.println(MSG_11);
        num = sc.nextInt();
        if(num<100 && num>=0){
            System.out.println(MSG_12);
        }else{
            System.out.println(MSG_13);
        }
         */
        //D
        /*
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_8);
        num = sc.nextInt();
        if(num>= -3 && num<=27){
        System.out.println(MSG_9);
    }
        else {
            System.out.println(MSG_10);
            }
         */
        /*
        //E
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_14);
        num = sc.nextInt();
        if (num >= 25 && num <= 50) {
            System.out.println(MSG_16);
        } else {
            System.out.println(MSG_15);
        }
        */
        //F
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_17);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
       
    }

}

