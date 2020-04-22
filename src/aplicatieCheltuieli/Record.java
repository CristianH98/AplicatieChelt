package aplicatieCheltuieli;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Record {

    private List<Categorie> categorii;
    private List<Cheltuiala> cheltuieli;


    public Record(List<Categorie> categorii, List<Cheltuiala> cheltuieli) {
        this.categorii = categorii;
        this.cheltuieli = cheltuieli;
    }


    public Record(){
        super();
    }




    public List<Categorie> getCategorii() {
        return categorii;
    }

    public void setCategorii(List<Categorie> categorii) {
        this.categorii = categorii;
    }

    public List<Cheltuiala> getCheltuieli() {
        return cheltuieli;
    }

    public void setCheltuieli(List<Cheltuiala> cheltuieli) {
        this.cheltuieli = cheltuieli;
    }

    public void addCheltuiala(Cheltuiala cheltuiala) {
        if (cheltuieli == null) {
            cheltuieli = new ArrayList<>();

        }
        this.cheltuieli.add(cheltuiala);
    }

    public void removeCheltuiala(String name)
    {
        if (cheltuieli == null) {
            return;
        }
        cheltuieli.removeIf(cheltuiala -> cheltuiala.getName().equalsIgnoreCase(name));
    }

    public Cheltuiala cautaCheltuiala(String name){

        if(cheltuieli == null || cheltuieli.isEmpty())
        {
            return null;

        }
        return cheltuieli.stream().filter(cheltuiala->cheltuiala.getName().equalsIgnoreCase(name)).findFirst().get();
    }



    public void addCategorie(Categorie categorie)
    {
        if(categorii == null)
        {
            categorii=new ArrayList<>();
        }
        this.categorii.add(categorie);
    }

public void removeCategorie(String nume) {
    if (categorii == null)
    {
        return;
    }
    categorii.removeIf(categorie -> categorie.getName().equalsIgnoreCase(nume));
}

public void printCategorii() {
    if (categorii != null) {
        categorii.forEach(categorie -> System.out.println(categorie.toString()));
    } else
        System.out.println("Lista de categorii este goala!");

}

    @Override
    public String toString() {
        return "Record{" +
                "categorii=" + categorii +
                ", cheltuieli=" + cheltuieli +
                '}';
    }

    public void printCheltuieli()
{
    if(cheltuieli != null)
    {
        cheltuieli.forEach(cheltuiala -> System.out.println(cheltuiala.toString()));
    }
    else {
        System.out.println("lista de cheltuieli e goala!");
            }

    }

}
