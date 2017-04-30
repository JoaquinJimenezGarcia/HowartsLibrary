package me.jojigarcia.controller;

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
                break;
            case 2:
                break;
            default:
                break;
        }

        
    }
}
