package classes.regularPrice;

import classes.movie.Movie;
import classes.price.Price;

public class RegularPrice extends Price {
  public int getPriceCode() {
    return Movie.REGULAR;
  }
}
