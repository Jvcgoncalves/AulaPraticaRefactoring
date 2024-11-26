package classes.statement;

import classes.customer.Customer;
import classes.rental.Rental;

public abstract class Statement {
  public abstract String value(Customer aCustomer);

  protected abstract String header(Customer aCustomer);

  protected abstract String eachRentalString(Rental aRental);

  protected abstract String footer(Customer aCustomer);
}
