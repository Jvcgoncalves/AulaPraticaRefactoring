package classes.statement.HtmlStatement;

import java.util.Enumeration;
import classes.customer.Customer;
import classes.rental.Rental;
import classes.statement.Statement;

public class HtmlStatement extends Statement {

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

  protected String header(Customer aCustomer) {
    return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
  }

  protected String eachRentalString(Rental aRental) {
    return aRental.getMovie().getTitle() + ": " +
           aRental.getCharge() + "<BR>\n";
  }

  protected String footer(Customer aCustomer) {
    return "<P>You owe <EM>" + aCustomer.getTotalCharge() + "</EM><P>\n" +
           "On this rental you earned <EM>" +
           aCustomer.getTotalFrequentRenterPoints() +
           "</EM> frequent renter points<P>";
  }
}
