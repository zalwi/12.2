package data;

public class Country {
    private String countryCode;
    private String description;
    private int population;

    public Country(String countryCode, String description, int population) {
        this.countryCode = countryCode;
        this.description = description;
        this.population = population;
    }

    @Override
    public String toString() {
        return  description + " (" + countryCode + ") ma " + population + " ludności";
    }
}
