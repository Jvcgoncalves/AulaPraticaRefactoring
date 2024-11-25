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
    Main._rental = new Rental(Main._movie, 7);
    System.out
        .println("Movie: " + Main._rental.getMovie().getTitle() + " - Days rented: " + Main._rental.getDaysRented());
  }

  private static void testCustomer() {
    Movie movie = new Movie("Filminho", 0);
    Rental rental = new Rental(movie, 10);

    System.out
        .println("Movie: " + rental.getMovie().getTitle() + " - Days rented: " + rental.getDaysRented());

    Main._customer = new Customer("Jão");

    Main._customer.addRental(Main._rental);
    Main._customer.addRental(rental);

    System.out.println(Main._customer.statement());
  }
}