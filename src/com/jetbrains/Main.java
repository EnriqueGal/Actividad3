package com.jetbrains;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        Deck deck = new Deck();

        while (true){
            String menu;

            System.out.println("");
            System.out.println("========================");
            System.out.println(" Menu Cartas");
            System.out.println("========================");
            System.out.println(" 1- Shuffle");
            System.out.println(" 2- Head");
            System.out.println(" 3- Pick");
            System.out.println(" 4- Hand");
            System.out.println(" 5- Salir");

            menu = scaner.nextLine();

            if (menu.equals("5")){
                System.out.println("========================");
                System.out.println("Gracias por Jugar!!");
                System.out.println("========================");
                break;
            }switch (menu){
                case "1":
                    System.out.println("========================");
                    deck.Shuffle();
                    System.out.println("========================");
                    break;
                case "2":
                    System.out.println("========================");
                    deck.Head();
                    System.out.println("========================");
                    break;
                case "3":
                    System.out.println("========================");
                    deck.Pick();
                    System.out.println("========================");
                    break;
                case "4":
                    System.out.println("========================");
                    deck.Hand();
                    System.out.println("========================");
                    break;
                default:
                    System.out.println("========================");
                    System.out.println("Opcion Erronea");
                    System.out.println("========================");
                    break;
            }

            System.out.println("Precione Enter para continuar");
            scaner.nextLine();
        }
    }
}
