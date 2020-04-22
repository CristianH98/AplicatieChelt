package aplicatieCheltuieli;
import java.time.LocalDate;

public class Cheltuiala extends Name {

    private LocalDate birthDate;
    private String suma;
    private Categorie  categorie;

    public Cheltuiala(String name, LocalDate birthDate, String suma, Categorie categorie) {
        super(name);
        this.birthDate = birthDate;
        this.suma = suma;
        this.categorie = categorie;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getSuma() {
        return suma;
    }

    public void setSuma(String suma) {
        this.suma = suma;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    @Override
    public String toString() {
        return "Cheltuiala{" +
                "birthDate=" + birthDate +
                ", suma='" + suma + '\'' +
                ", categorie='" + categorie + '\'' +
                '}';
    }
}

