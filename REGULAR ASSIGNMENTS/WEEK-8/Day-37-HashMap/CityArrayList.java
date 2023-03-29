//Create a class called "City" with attributes "name" and "population". Create an ArrayList of City objects and add 3 cities to it. Print the name and population of each city. Increase the population of one city by 100,000 and print the updated information.
import java.util.*;

class City{
  private String name;
  private int population;

  City(String name, int population) {
    this.name = name;
    this.population = population;

  }

  String getName() {
    return name;
  }

  int getPopulation() {
    return population;
  }

  void setPopulation(int population) {
    this.population = population;
  }
}

public class CityArrayList {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<City> cities = new ArrayList<>();
    for (i = 0; i < 3; i++) {
      cities.add(new City(sc.next(), sc.next(), sc.next()));
    }

    for (City city : cities) {
      System.out.println("Name: " + city.getName());
      System.out.println("Population: " + city.getPopulation());
      System.out.println();
    }

    cities.get(1).setPopulation(cities.get(1).getPopulation() + 100000);

    System.out.println("Updated information for " + cities.get(1).getName());
    System.out.println("Population: " + cities.get(1).getPopulation());
  }
}