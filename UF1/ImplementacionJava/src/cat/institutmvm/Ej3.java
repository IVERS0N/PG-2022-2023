
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author daw
 */
public class Ej3 {
    //Nom: Allen
    //Cognoms: Matira
    //INS Manuel Vázquez Montalbán
    //Data d’edició: 28/10/22
    //Nom del cicle formatiu: DAW
    //Nom del mòdul: Programación
    //A
    private static final String MSG_1 = "Introdueix un nombre :";
    private static final String MSG_2 = "El nombre es negatiu  ";
    private static final String MSG_3 = "El nombre es positiu  ";

    //B
    private static final String MSG_4 = "Introdueix un nombre :";
    private static final String MSG_5 = "El nombre es mes gran que 35  ";
    private static final String MSG_6 = "El nombre es mes petit que 35  ";
    private static final String MSG_7 = "El nombre es mes es igualque 35  ";

    //C
    private static final String MSG_11 = "Introdueix un nombre :";
    private static final String MSG_12 = "El nombre es positiu i mes petit que 100 ";
    private static final String MSG_13 = "Error";

    //D
    private static final String MSG_8 = "Introdueix un nombre :";
    private static final String MSG_9 = "El nombre esta en el interval -3 i 27  ";
    private static final String MSG_10 = "El nombre no esta en el interval -3 i 27  ";

    //E
    private static final String MSG_14 = "Introdueix un nombre :";
    private static final String MSG_15 = "El nombra esta fora del rang 25 i 50  ";
    private static final String MSG_16 = "Error";
   
    //F
    private static final String MSG_20 = "Introdueix un nombre :";
    private static final String MSG_21 = "Introdueix el segon nombre :";
    private static final String MSG_22 = "El resultat es mes petit que 15";
    private static final String MSG_23 = "El resultat es mes gran que 15";

    //G i H
    private static final String MSG_24 = "Introdueix un nombre :";
    private static final String MSG_25 = "El nombre es parell";
    private static final String MSG_26 = "El nombrees senar";
    
    //I
      private static final String MSG_27 = "Introdueix un nombre :";
    private static final String MSG_28 = "Introdueix el segon nombre :";
   
    //J
   private static final String MSG_29 = "Introdueix un nombre :";
    private static final String MSG_30 = "Introdueix el segon nombre :";
    private static final String MSG_31 = "Introdueix el tercer nombre :";
    
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
        
        //F
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_20);
        num1 = sc.nextInt();
        System.out.println(MSG_21);
        num2 = sc.nextInt();
        if (num1 / num2 < 15) {
            System.out.println(MSG_22);
        } else {
            System.out.println(MSG_23);
        }
        //G
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_24);
        num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println(MSG_25);
        }else 
            System.out.println(MSG_26);
        //H
        int i = num >> 1;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_24);
        num = sc.nextInt();
        if ((num & 1) == 1) {
            System.out.println(MSG_26);
        } // si num est pair
        else {
            System.out.println(MSG_25);

        }
        //I
           int num1, num2;
           Scanner sc = new Scanner(System.in);
        System.out.println(MSG_27);
        num1 = sc.nextInt();
         System.out.println(MSG_28);
        num2 = sc.nextInt();
      if( num1 >= num2 ){
           System.out.println("Le plus grand nombre est: "+num1);
      }
      else  (num2 >= num1 ){
        System.out.println("Le plus grand nombre est: "+num2);
    } */
     //J
          int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_29);
        num1 = sc.nextInt();
        System.out.println(MSG_30);
        num2 = sc.nextInt();
        System.out.println(MSG_31);
        num3 = sc.nextInt();
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("The maximum number is : " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
           
            System.out.println("The maximum number is: " + num2);
        } else {
            System.out.println("The maximum number is: " + num3);
        }
    }

}
