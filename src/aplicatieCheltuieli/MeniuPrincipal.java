package aplicatieCheltuieli;

import java.util.Scanner;

public class MeniuPrincipal {



   public  static String geUserOption() {
        Scanner ce = new Scanner(System.in);
        return ce.nextLine();
    }
    public static void ReturnHome() {
            String option;
        System.out.println("Doriti sa reveniti la meniul principal ? D/N");
        option = geUserOption();
        if (option.equalsIgnoreCase("Y")) {
            displayMenu();
        } else {
            System.out.println(" ;)  ");
        }
    }

static Record record = new Record();
    public static void main(String[] args) {
        displayMenu();
    }

private static void displayMenu() {
    displayMainMenu();

    String option = geUserOption();

    switch (option) {
        case "1":
            record.printCheltuieli();
            CheltuialaM.handleCheltuiala();
            ReturnHome();
            break;

        case "2":
            record.printCategorii();
            CategorieM.handleCategorie();
            ReturnHome();
            break;

        case "3":
            System.exit(0);

        default:
            System.out.println("Introduceti un numar de la 1 la 3");
            break;
    }
}

    private static void displayMainMenu() {
        System.out.println("1) Cheltuieli");
        System.out.println("2) Categorii");
        System.out.println("3) Exit");
        System.out.println("4) Obtiunea dorita: ");

           }

      }
