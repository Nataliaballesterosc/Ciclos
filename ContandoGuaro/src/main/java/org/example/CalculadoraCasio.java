package org.example;

import java.util.Random;
import java.util.Scanner;

public class CalculadoraCasio {
    public static void main(String[] args) {

        Scanner digita = new Scanner(System.in);
        Random aleatorio = new Random();
        Integer numeroUno = aleatorio.nextInt(10);
        Integer numeroDos = aleatorio.nextInt(10);
        Integer opcion ;


        System.out.println("Casio fx90");
        System.out.println(" 1 SUMA");
        System.out.println(" 2 RESTA");
        System.out.println(" 3 MULTIPLICACION");
        System.out.println(" 4 DIVISION");
        System.out.println(" 5 RAIZ");
        System.out.println(" 6 POTENCIACION");
        System.out.println(" 7 SENO");
        System.out.println(" 8 COSENO");
        System.out.println(" 9 SALIR");

        System.out.println("----------------------------");

        do {
            System.out.print("Que operación quiere realizar:");
            opcion = digita.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Eligio sumar");
                    Integer suma = numeroUno + numeroDos;
                    System.out.println("la suma de: "+numeroUno+ " + "+numeroDos+ " = "+ suma);
                    break;

                case 2:
                    System.out.println("Eligio restar");
                    Integer resta = numeroUno - numeroDos;
                    System.out.println("la resta de: "+numeroUno+ " - "+numeroDos+ " = "+ resta);
                    break;

                case 3:
                    System.out.println("Eligio multiplicar");
                    Integer multiplicacion = numeroUno * numeroDos;
                    System.out.println("la multiplicacion de: "+numeroUno+ " * "+numeroDos+ " = "+ multiplicacion);
                    break;

                case 4:
                    System.out.println("Eligio dividir");
                    Integer division = numeroUno + numeroDos;
                    System.out.println("la division de: "+numeroUno+ " / "+numeroDos+ " = "+ division);
                    break;

                case 5:
                    System.out.println("Eligio raiz");
                    Double raiz = Math.sqrt(numeroDos);
                    System.out.println("la raiz de: "+numeroUno+ raiz);
                    break;

                case 6:
                    System.out.println("Eligio potencia");

                    Double potencia = Math.pow(numeroUno,numeroDos);
                    System.out.println("la potencia de: "+numeroUno+ potencia);
                    break;

                case 7:
                    System.out.println("Eligio seno");
                    Double seno = Math.sin(numeroDos);
                    System.out.println("la seno de: "+numeroUno+ " seno "+ seno);
                    break;
                case 8:
                    System.out.println("Eligio coseno");
                    Double coseno = Math.cos(numeroDos);
                    System.out.println("la coseno de: "+numeroUno+ " coseno "+ coseno);
                    break;


                default:
                    System.out.println("Opcion invalida");
            }
        }while (opcion!=9);


























    }
}
