package classes.childrenPrice;

import classes.movie.Movie;
import classes.price.Price;

public class ChildrenPrice extends Price {
  public int getPriceCode() {
    return Movie.CHILDRENS;
  }
}
