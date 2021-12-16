package Pojo;

public class Main {
    public static void main(String[] args) {
        Country countryGreece = new Country("Greece");
        countryGreece.setCountryPopulation(10364074);
        countryGreece.setCountryArea(131957);
        countryGreece.setCountryCapital("Athens");
        countryGreece.setEnterToTheSea("Egey sea");
        System.out.println("Название страны: " + countryGreece.getCountryName());
        System.out.println("Площадь страны: " + countryGreece.getCountryArea() + " м^2");
        System.out.println("Столица страны: " + countryGreece.getCountryCapital());
        System.out.println("Выход к морю: " + countryGreece.getEnterToTheSea());

        System.out.println("\n==================================================================\n");

        Japan countryJapan = new Japan("Japan", 126368572);
        System.out.println("Название страны: " + countryJapan.getCountryName());
        System.out.println("Площадь страны: " + countryJapan.getCountryArea() + " м^2");
        System.out.println("Столица страны: " + countryJapan.getCountryCapital());
        System.out.println("Выход к морю: " + countryJapan.getEnterToTheSea());
    }
}
