package aplicatieCheltuieli;

public class CategorieM {

        public static Categorie handleCategorie1 () {
        displayCategorieMenu();
        String option;
        System.out.println("Introduceti denumirea categoriei ");
        String name = MeniuPrincipal.geUserOption();

        Categorie categorie = new Categorie(name);

        MeniuPrincipal.record.addCategorie(categorie);
        return categorie;
    }

        public static void handleAddCategorie ()
        {
            handleCategorie1();
            MeniuPrincipal.ReturnHome();
        }

        private static void handleRemoveCategorie ()
        {
            System.out.println("Introduceti numele categoriei ");
            String name = MeniuPrincipal.geUserOption();
            MeniuPrincipal.record.removeCategorie(name);
            MeniuPrincipal.ReturnHome();
        }

        public static void handleCategorie ()
        {
            String option;
            displayCategorieMenu();
            option = MeniuPrincipal.geUserOption();
            if (option.equalsIgnoreCase("1")) {
                handleAddCategorie();
            }

            if (option.equalsIgnoreCase("2")) {
                handleRemoveCategorie();
            }
            if (option.equalsIgnoreCase("3")) {
                System.exit(0);
            }

        }
        private static void displayCategorieMenu () {
        System.out.println("Optiunea ");
        System.out.println("1) Adaugati categoria ");
        System.out.println("2) Stergeti o categorie ");
        System.out.println("3) Exit");
        System.out.println("Scrieti optiunea aici ");
    }

    }
