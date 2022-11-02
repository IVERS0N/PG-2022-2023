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
public class Ej6 {
    public static void main(String[] args) {
        //Nom: Allen
        //Cognoms: Matira
        //INS Manuel Vázquez Montalbán
        //Data d’edició: 28/10/22
        //Nom del cicle formatiu: DAW
        //Nom del mòdul: Programación
        
        int mes, anyo, numDias = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el mes: ");
        mes = sc.nextInt();
        System.out.print("Introduce el año: ");
        anyo = sc.nextInt();
 
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                numDias = 31;
                break;
            case 4: case 6: case 9: case 11:
                numDias = 30;
                break;
            case 2:
                if((anyo%4==0 && anyo%100!=0) || anyo%400==0){
                    numDias = 29;
                }
                else{
                    numDias = 28;
                }
                break;
            default:
                System.out.println("\nEl mes " + mes + " es incorrecto.");
                break;
        }
 
        if(numDias!=0){
            System.out.println("\nEl mes " + mes + " del año " + anyo + " tiene " + numDias + " días.");
        }
    }
}
