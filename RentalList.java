import java.util.ArrayList;

class Rental {
  public static final int PRICE_PER_HOUR = 40;
  public static final int MINS_IN_HOUR = 60;

  private String contactNumber;
  private int numberOfMinutes;
  private int hoursOfRental;
  private double price;

  private int minsOverHour;

  public Rental(String contactNumber, int numberOfMinutes) {
    setContactNumber(contactNumber);
    setNumberOfMinutes(numberOfMinutes);
  }

  public String getContactNumber() {
    return this.contactNumber;
  }

  public int getNumberOfMinutes() {
    return this.numberOfMinutes;
  }

  public int getHoursOfRental() {
    return this.hoursOfRental;
  }

  public double getPrice() {
    return this.price;
  }

  public void setContactNumber(String contactNumber) {
    this.contactNumber = contactNumber;
  }

  public void setNumberOfMinutes(int numberOfMinutes) {
    this.numberOfMinutes = numberOfMinutes;
    setHoursOfRental(numberOfMinutes);
  }

  public void setHoursOfRental(int numberOfMinutes) {
    this.minsOverHour = numberOfMinutes / MINS_IN_HOUR;
    this.hoursOfRental = minsOverHour;
    setPrice(hoursOfRental * PRICE_PER_HOUR);
  }

  public void setPrice(double price) {
    this.price = price;
  }
}

public class RentalList {
  public static void main(String[] args) {
    ArrayList<Rental> rentals = new ArrayList<Rental>();


    rentals.add(new Rental("CANOE", 300));
    rentals.add(new Rental("KAYAK", 100));

    for (int i = 0; i < rentals.size(); i++) {
      System.out.println("Contact Number: " + rentals.get(i).getContactNumber());
      System.out.println("Hours of Rental: " + rentals.get(i).getHoursOfRental());
      System.out.println("Minutes: " + rentals.get(i).getNumberOfMinutes());
      System.out.println(("Price: " + rentals.get(i).getPrice()));
      System.out.println();
    }
  }
}
