package Pojo;

public class Japan {
    private String countryName = "Japan";
    private int countryPopulation = 126368572;
    private int countryArea = 337975;
    private String countryCapital = "Tokyo";
    private String enterToTheSea = "Japan sea";

    public Japan(String countryName) {
        this.countryName = countryName;
    }

    public Japan(String countryName, int countryPopulation) {
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
