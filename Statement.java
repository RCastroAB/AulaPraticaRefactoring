public class Statement {
  public String value(Customer aCustomer){
      Enumeration rentals = aCustomer.getRentals();
      String result = "";
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for this rental
      }
      //add footer lines
      return result;

  }
}
