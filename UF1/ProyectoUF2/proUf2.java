/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author ivers
 */
import java.util.Scanner;

public class JavaApplication1 {

    private final static String MSG_1 = "Id?: ";
    private final static String MSG_2 = "Edat?: ";
    private final static String MSG_3 = "Tipus de venda?: ";
    private final static String MSG_4 = "Import de la compra?: ";
    private final static String MSG_5 = "Telèfon de contacte?: ";
    private final static String MSG_6 = "ERROR en la dada introduïda ";
    private final static String MSG_7 = "Programa finalitzat per error en dades ";
    private static final int MAX_ENTRIES = 2; // número máximo de entradas permitidas
    private static int intentos = 0;

    public static void main(String[] args) {
        int id, edat, tipus_venda, import_compra, tel_contacte;
        String tipo_venta = "";
        Scanner sc = new Scanner(System.in);

        // crea un array de objetos para almacenar todas las entradas de los usuarios
        Entrada[] entradas = new Entrada[MAX_ENTRIES];

        for (int i = 0; i < MAX_ENTRIES; i++) {
            System.out.print(MSG_1);
            id = sc.nextInt();
            if (id >= 1000 || id <= 110) {
                System.out.print("\n" + MSG_6 + "\n");
                i--; // reduce el contador para volver a solicitar el id
            } else {
                System.out.print("\n" + MSG_2);
                edat = sc.nextInt();
                if (edat >= 121 || edat <= 13) {
                    System.out.println("\n" + MSG_6 + "\n");
                    i--; // reduce el contador para volver a solicitar la edad
                } else {
                    do {
                        System.out.println("\n" + MSG_3 + "\n\nvenda lliure (0)\npensionista (1)\ncarnet jove (2)\nsoci (3)\n");
                        tipus_venda = sc.nextInt();

                        switch (tipus_venda) {
                            case 0:
                                tipo_venta = "lliure";
                                break;
                            case 1:
                                tipo_venta = "pensionista";
                                break;
                            case 2:
                                tipo_venta = "jove";
                                break;
                            case 3:
                                tipo_venta = "soci";
                                break;
                            default:
                                System.out.println(MSG_6);
                                break;
                        }
                        intentos++;
                        if (intentos == 3) {
                            System.out.println(MSG_7);
                            return;
                        }
                    } while (tipus_venda >= 4 || tipus_venda <= -1);

                    System.out.print("\n" + MSG_4);
                    import_compra = sc.nextInt();
                    if (import_compra >= 1001 || import_compra <= -1) {
                        System.out.println("\n" + MSG_6 + "\n");
                        i--; // reduce el contador para volver a solicitar el importe de la compra
                    } else {
                        System.out.print("\n" + MSG_5);
                        tel_contacte = sc.nextInt();
                        if (tel_contacte >= 1000000000 || tel_contacte <= 600000000) {
                            System.out.println("\n" + MSG_6 + "\n");
                            i--; // reduce el contador para volver a solicitar el teléfono de contacto
                        }else{
                            entradas[i] = new Entrada(id, edat, tipo_venta, import_compra, tel_contacte);
                        }
                    }
                }
            }
        }
            // muestra todas las entradas almacenadas en el array
            System.out.println("Listado de entradas:");
            for (Object obj : entradas) {
                if (obj != null) {
                    Entrada entrada = (Entrada) obj;
                    System.out.println(entrada.toString());
                }
            }
        }
    }
    
    class Entrada {

        private int id;
        private int edat;
        private String tipus_venta;
        private int import_compra;
        private int tel_contacte;

        public Entrada(int id, int edat, String tipus_venta, int import_compra, int tel_contacte) {
            this.id = id;
            this.edat = edat;
            this.tipus_venta = tipus_venta;
            this.import_compra = import_compra;
            this.tel_contacte = tel_contacte;
        }

        @Override
        public String toString() {
            return "Id: " + this.id
                    + ", Edat: " + this.edat
                    + ", Tipus de venda: " + this.tipus_venta
                    + ", Import de la compra: " + this.import_compra
                    + ", Telèfon de contacte: " + this.tel_contacte;
        }
       
    }


