package image.color.git.lab22and3;

import java.util.ArrayList;

public class ExerciseModel {

    private ArrayList<String> countries = new ArrayList();

//    final String[] COUNTRIES = new String[] {
//            "Afghanistan", "Albania", "Algeria", "American Samoa", "Andorra", "Angola", "Anguilla", "Antarctica",
//            "Antigua and Barbuda", "Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan"
//    };
    public void addElements() {
        countries.add("Afghanistan");
        countries.add("Albania");
        countries.add("Algeria");
        countries.add("American Samoa");
        countries.add("Andorra");
        countries.add("Angola");
        countries.add("Anguilla");
        countries.add("Antarctica");
        countries.add("Antigua and Barbuda");
        countries.add("Argentina");
        countries.add("Armenia");
        countries.add("Aruba");
        countries.add("Australia");
        countries.add("Austria");
        countries.add("Azerbaijan");
    }

    public ArrayList<String> getCountries() {
        return countries;
    }

    public void addCountries(String newCountry) {
//        this.countries = countries;
        this.countries.add(newCountry);
    }

    public void removeCountries() {
        this.countries.remove(this.countries.size() - 1);
    }

}
