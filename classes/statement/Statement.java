package classes.statement;

import java.util.Enumeration;
import classes.customer.Customer;
import classes.rental.Rental;

public abstract class Statement {

  public String value(Customer aCustomer) {
    StringBuilder result = new StringBuilder(header(aCustomer));
    Enumeration rentals = aCustomer.getRentals();
    while (rentals.hasMoreElements()) {
      Rental each = (Rental) rentals.nextElement();
      result.append(eachRentalString(each));
    }
    result.append(footer(aCustomer));
    return result.toString();
  }

  protected abstract String header(Customer aCustomer);

  protected abstract String eachRentalString(Rental aRental);

  protected abstract String footer(Customer aCustomer);
}
