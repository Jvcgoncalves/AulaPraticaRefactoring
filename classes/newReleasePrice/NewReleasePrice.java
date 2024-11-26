package classes.newReleasePrice;

import classes.movie.Movie;
import classes.price.Price;

public class NewReleasePrice extends Price {
  public int getPriceCode() {
    return Movie.NEW_RELEASE;
  }
}