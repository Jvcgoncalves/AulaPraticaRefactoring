import classes.customer.Customer;
import classes.movie.Movie;
import classes.rental.Rental;

public class Main {

  private static Movie _movie;
  private static Rental _rental;
  private static Customer _customer;

  public static void main(String[] args) {
    Main.testMovie();
    Main.testRental();
    Main.testCustomer();
  }

  private static void testMovie() {
    Main._movie = new Movie("Filmão", 1);
    System.out.println("Movie title: "
        .concat(Main._movie.getTitle())
        .concat(" - Code for get value: ")
        + Main._movie.getPriceCode());
    // Main._movie.setPriceCode(2);
  }

  private static void testRental() {
    Main._rental = new Rental(Main._movie, 25);
    System.out
        .println("Movie: " + Main._rental.getMovie().getTitle() + " - Days rented: " + Main._rental.getDaysRented());
  }

  private static void testCustomer() {
    Main._customer = new Customer("Jão");

    Main._customer.addRental(Main._rental);

    System.out.println(Main._customer.statement());
  }
}