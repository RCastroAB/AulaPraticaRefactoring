public class Rental {

   private Movie _movie;
   private int _daysRented;

   public Rental(Movie movie, int daysRented) {
      _movie = movie;
      _daysRented = daysRented;
   }

   public int getDaysRented() {
      return _daysRented;
   }

   public Movie getMovie() {
      return _movie;
   }
   public double getCharge() {
      //Adicionar o trecho de código extraído.
      double thisAmount = getMovie().getCharge(getDaysRented());

      return thisAmount;
   }

   public int getFrequentRenterPoints() {
      //Adicionar o trecho de código extraído.
      return getMovie().getFrequentRenterPoints(getDaysRented());
   }
}
