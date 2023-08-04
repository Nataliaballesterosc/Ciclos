package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner digita= new Scanner(System.in);
        Integer opcionMenu;
        Integer cantidadProducto = 0;
        Integer costoUnitario = null;
        Integer valorCompra = 0;

        System.out.println("************************");
        System.out.println("FONDA ANTIOQUEÑA");
        System.out.println("************************");
        System.out.println("CONOCE NUESTRO MENU");
        System.out.println(" 1 Chorizo------------ $ 4000");
        System.out.println(" 2 Chicharon---------  $ 15000");
        System.out.println(" 3 Morcilla----------- $ 10000");
        System.out.println(" 4 Chuzo-----------    $ 20000");
        System.out.println(" 5 1/2 Aguardiente---- $ 25000");
        System.out.println(" 6 1/2 Ron-----------  $ 30000");

        System.out.println("********************************");
        System.out.print("Digita el producto deseado: ");
        opcionMenu = digita.nextInt();

        switch (opcionMenu){

            case 1:
                costoUnitario = 4000;
                System.out.print("Digite la cantidad de chorizos: ");
                cantidadProducto = digita.nextInt();
                break;

            case 2:
                costoUnitario = 15000;
                System.out.print("Digite la cantidad de chicharon: ");
                cantidadProducto = digita.nextInt();
                break;

            case 3:
                costoUnitario = 10000;
                System.out.print("Digite la cantidad de morcilla: ");
                cantidadProducto = digita.nextInt();
                break;

            case 4:
                costoUnitario = 20000;
                System.out.print("Digite la cantidad de chuzo: ");
                cantidadProducto = digita.nextInt();
                break;

            case 5:
                costoUnitario = 25000;
                System.out.print("Digite la cantidad de aguardiente: ");
                cantidadProducto = digita.nextInt();
                break;

            case 6:
                costoUnitario = 30000;
                System.out.print("Digite la cantidad de ron: ");
                cantidadProducto = digita.nextInt();
                break;

            default:
                System.out.println("nanai");
        }


        valorCompra = costoUnitario*cantidadProducto;
        System.out.print("Total a pagar es : "+valorCompra);







    }
}