package me.jojigarcia.controller;

import me.jojigarcia.model.Available;
import me.jojigarcia.model.Book;
import me.jojigarcia.model.Daily;

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
                selectLoan();
                break;
            case 2:
                break;
            default:
                break;
        }
    }

    private static void toLoan(){

    }

    private static Available selectLoan(){
        java.util.Date date = new java.util.Date();
        Scanner input = new Scanner (System.in);
        int option;
        Available available;
        int code;
        String title;
        int year;

        do {
            System.out.println("1. Libros");
            System.out.println("2. Diarios");
            System.out.println("Qué desea alquilar? ");
            option = input.nextInt();
        }while (option != 1 && option != 2);

        System.out.println("Inserte el título: ");
        title = input.nextLine();

        System.out.println("Inserte el código: ");
        code = input.nextInt();

        System.out.println("Inserte el año: ");
        year = input.nextInt();

        switch (option){
            case 1:
                available = new Book(code,title,year,date);
                break;
            case 2:
                available = new Daily(code,title,year);
                break;
            default:
                available = new Book(code,title,year,date);
                break;
        }

        System.out.println(available);

        return available;
    }
}
