package me.jojigarcia.controller;

import me.jojigarcia.model.*;

import java.util.Scanner;

/**
 * Created by garci on 30/04/2017.
 */
public class AppInterface {
    public static void run(){
        Scanner input = new Scanner(System.in);
        int menuOption;

        do {
            Menu.printMenu();

            System.out.println("Inserte opción: ");
            menuOption = input.nextInt();
        }while (menuOption != 1 && menuOption != 2);

        switch (menuOption){
            case 1:
                toLoan();
                break;
            case 2:
                toRevision();
                break;
            default:
                break;
        }
    }

    private static Available toLoan(){
        Scanner input = new Scanner (System.in);
        Available available;
        int code;
        String title;
        int year;
        int option = selectLoan();

        System.out.println("Inserte el título: ");
        title = input.next();

        System.out.println("Inserte el código: ");
        code = input.nextInt();

        System.out.println("Inserte el año: ");
        year = input.nextInt();

        switch (option){
            case 1:
                available = new Book(code,title,year);
                break;
            case 2:
                available = new Daily(code,title,year);
                break;
            default:
                available = new Book(code,title,year);
                break;
        }

        System.out.println(available);

        return available;
    }

    private static int selectLoan(){
        Scanner input = new Scanner (System.in);
        int option;

        do {
            System.out.println("1. Libros");
            System.out.println("2. Diarios");
            System.out.println("Qué desea alquilar? ");
            option = input.nextInt();
        }while (option != 1 && option != 2);

        return option;
    }

    private static Available toRevision(){
        Scanner input = new Scanner (System.in);
        Available available;
        int code;
        String title;
        int year;
        int option = selectRevision();

        System.out.println("Inserte el título: ");
        title = input.next();

        System.out.println("Inserte el código: ");
        code = input.nextInt();

        System.out.println("Inserte el año: ");
        year = input.nextInt();

        switch (option){
            case 1:
                available = new Map(code,title,year);
                break;
            case 2:
                available = new Parchment(code,title,year);
                break;
            default:
                available = new Map(code,title,year);
                break;
        }

        System.out.println(available);

        return available;
    }

    private static int selectRevision(){
        Scanner input = new Scanner (System.in);
        int option;

        do {
            System.out.println("1. Pergaminos");
            System.out.println("2. Mapas");
            System.out.println("Qué desea alquilar? ");
            option = input.nextInt();
        }while (option != 1 && option != 2);

        return option;
    }
}
