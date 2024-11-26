package classes.childrenPrice;

import classes.movie.Movie;
import classes.price.Price;

public class ChildrenPrice extends Price {
  public int getPriceCode() {
    return Movie.CHILDRENS;
  }

  public double getCharge(int daysRented) {
    double result = 1.5;
    if (daysRented > 3)
      result += (daysRented - 3) * 1.5;
    return result;
  }
}
