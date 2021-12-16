package Pojo;

public class Country {
    private String countryName = "";
    private int countryPopulation = 0;
    private int countryArea = 0;
    private String countryCapital = "";
    private String enterToTheSea = "";

    public Country(String countryName) {
        this.countryName = countryName;
    }

    public Country(String countryName, int countryPopulation) {
        this.countryName = countryName;
        this.countryPopulation = countryPopulation;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() { return countryName; }

    public void setCountryPopulation(int countryPopulation) {
        this.countryPopulation = countryPopulation;
    }

    public int getCountryPopulation() { return countryPopulation; }

    public void setCountryArea(int countryArea) {
        this.countryArea = countryArea;
    }

    public int getCountryArea() { return  countryArea; }

    public void setCountryCapital(String countryCapital) {
        this.countryCapital = countryCapital;
    }

    public String getCountryCapital() { return countryCapital; }

    public void setEnterToTheSea(String enterToTheSea) {
        this.enterToTheSea = enterToTheSea;
    }

    public String getEnterToTheSea() { return enterToTheSea; }
}
