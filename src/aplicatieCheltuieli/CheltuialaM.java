package aplicatieCheltuieli;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;


public class CheltuialaM {

    public static Cheltuiala handleAddCheltuiala1()
    {

        String option;
        System.out.println("Introduceti denumirea cheltuielii: ");
       String name = MeniuPrincipal.geUserOption();

        System.out.println("Inserati data sub forma:2015-07-10");
        String birthDateString=MeniuPrincipal.geUserOption();
        LocalDate birthDate=null;
        try {
            birthDate=LocalDate.parse(birthDateString) ;
        }

        catch(DateTimeParseException e)
        {
            System.out.println("Format gresit!");
        }

        double suma1;
        System.out.println("Inserati suma: ");
        String suma = MeniuPrincipal.geUserOption();
        suma1=Double.parseDouble( suma);



        System.out.println("Inserati categoria ");
    Categorie categorie = MeniuPrincipal.geUserOption();


        Cheltuiala cheltuiala = new Cheltuiala(name,birthDate,suma,categorie);

        MeniuPrincipal.record.addCheltuiala(cheltuiala);
        return cheltuiala;
        }
        public static void handleAddCheltuiala()
        {
            handleAddCheltuiala1();
            MeniuPrincipal.ReturnHome();
    }

private static void handleRemoveCheltuiala()
{
    System.out.println("Introduceti numele cheltuielii ");
    String name = MeniuPrincipal.geUserOption();
    MeniuPrincipal.record.removeCheltuiala(name);
    MeniuPrincipal.ReturnHome();

}

public static void handleCheltuiala()
{
    String option;
    displayCheltuieliMenu();
    option=MeniuPrincipal.geUserOption();
    if(option.equalsIgnoreCase("1")){
        handleAddCheltuiala();
    }

    if(option.equalsIgnoreCase("2")){
        handleRemoveCheltuiala();
    }
    if(option.equalsIgnoreCase("3")){
        System.exit(0);
    }

}
private static void  displayCheltuieliMenu(){
    System.out.println("Optiunea ");
    System.out.println("1) Adaugati cheltuiala ");
    System.out.println("2) Stergeti o cheltuiala ");
    System.out.println("3) Exit");
    System.out.println("Scrieti optiunea aici ");
    }
}
