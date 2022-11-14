/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectouf1;

import java.util.Scanner;

/**
 *
 * @author alumne_2n
 */
public class ProyectoUF1 {

    private final static String MSG_1 = "Id?: ";
    private final static String MSG_2 = "Edat?: ";
    private final static String MSG_3 = "Tipus de venda?: ";
    private final static String MSG_4 = "Import de la compra?: ";
    private final static String MSG_5 = "Telèfon de contacte?: ";
    private final static String MSG_6 = "ERROR en la dada introduïda ";
    private final static String MSG_7 = "Programa finalitzat per error en dades ";
    private static int intentos = 0;

    public static void main(String[] args) {
        int id, edat, tipus_venda, import_compra, tel_contacte;
        Scanner sc = new Scanner(System.in);

        System.out.println(MSG_1);
        id = sc.nextInt();
        if (id >= 1000 || id <= 110) {
            System.out.println("\n" + MSG_6 + "\n");
        }
        while (id >= 1000 || id <= 110) {
            if (intentos < 2) {
                System.out.println(MSG_1);
                id = sc.nextInt();
                if (id >= 1000 || id <= 110) {
                    System.out.println("\n" + MSG_6 + "\n");
                    intentos++;
                }

            } else if (intentos == 2) {
                System.out.println(MSG_7);
                return;
            }
        }

        System.out.println("\n" + MSG_2);
        edat = sc.nextInt();
        if (edat >= 121 || edat <= 13) {
            System.out.println("\n" + MSG_6 + "\n");
        }
        while (edat >= 121 || edat <= 13) {
            if (intentos < 2) {
                System.out.println(MSG_2);
                edat = sc.nextInt();
                if (edat >= 121 || edat <= 13) {
                    System.out.println("\n" + MSG_6 + "\n");
                    intentos++;
                }

            } else if (intentos == 2) {
                System.out.println(MSG_7);
                return;
            }
        }

        System.out.println("\n" + MSG_3 + "\n\nvenda lliure (0)\npensionista (1)\ncarnet jove (2)\nsoci (3)\n");
        tipus_venda = sc.nextInt();
        if (tipus_venda >= 4 || tipus_venda <= -1) {
            System.out.println("\n" + MSG_6 + "\n");
        }
        while (tipus_venda >= 4 || tipus_venda <= -1) {
            if (intentos < 2) {
                System.out.println("\n" + MSG_3 + "\n\nvenda lliure (0)\npensionista (1)\ncarnet jove (2)\nsoci (3)\n");
                tipus_venda = sc.nextInt();
                if (tipus_venda >= 4 || tipus_venda <= -1) {
                    System.out.println("\n" + MSG_6 + "\n");
                    intentos++;
                }
                switch (tipus_venda) {
                    case 0:
                        System.out.println("venda lliure");
                        break;
                    case 1:
                        System.out.println("pensionista");
                        break;
                    case 2:
                        System.out.println("carnet jove");
                        break;
                    case 3:
                        System.out.println("soci");
                        break;
                }

            } else if (intentos == 2) {
                System.out.println(MSG_7);
                return;
            }
        }

        System.out.println("\n" + MSG_4);
        import_compra = sc.nextInt();
        if (import_compra >= 1001 || import_compra <= -1) {
            System.out.println("\n" + MSG_6 + "\n");
        }
        while (import_compra >= 1001 || import_compra <= -1) {
            if (intentos < 2) {
                System.out.println("\n" + MSG_4);
                import_compra = sc.nextInt();
                if (import_compra >= 1001 || import_compra <= -1) {
                    System.out.println("\n" + MSG_6 + "\n");
                    intentos++;
                }
            } else if (intentos == 2) {
                System.out.println(MSG_7);
                return;
            }
        }

        System.out.println("\n" + MSG_5);
        tel_contacte = sc.nextInt();
        if (tel_contacte >= 1000000000 || tel_contacte <= 111111110) {
            System.out.println("\n" + MSG_6 + "\n");
        }
        while (tel_contacte >= 1000000000 || tel_contacte <= 111111110) {
            if (intentos < 2) {
                System.out.println("\n" + MSG_5);
                tel_contacte = sc.nextInt();
                if (tel_contacte >= 1000000000 || tel_contacte <= 111111110) {
                    System.out.println("\n" + MSG_6 + "\n");
                    intentos++;
                }
                return;
            } else if (intentos == 2) {
                System.out.println(MSG_7);
                return;
            }
        }
        
        
        System.out.println("\n" + "Id " + " Edat " + " Tipus " + " Import " + " Telèfon ");
        System.out.println(id + "  " + edat + "    " + tipus_venda + "      " + import_compra + "      " + tel_contacte);
    }

}
