package br.natal.view;

import java.util.Scanner;

public class CommandLineInterface {

    private String menu;

    public void exec() {

        boolean exit = false;
        do {
            printMenu();
            exit = !checkExiting();
        } while (exit);
    }

    private void buildMenu() {
        menu = "Welcome to Coffee Overflow 00100001!";
    }

    private void printMenu() {
        buildMenu();
        System.out.println(menu);
    }

    private boolean checkExiting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to exit? [Y/N]\n");
        String input = scanner.nextLine();
        scanner.close();

        return input.equalsIgnoreCase("Y");
    }

}
