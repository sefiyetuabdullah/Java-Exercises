package testcar;

class Car 
{

  // variables
  private String make;
  private String model;
  private int year;
  private int miles;
  private double msrp;

  //set default values
  public void Car() 
  {
    this.make = "MAKE";
    this.model = "MODEL";
    this.year = 2019;
    this.miles = 49940;
    this.msrp = 10.09;
  }

  // constructor setting values
  public void Car(String make,String model,int year,int miles,double msrp) 
  {
    this.make = make;
    this.model = model;
    this.year = year;
    this.miles = miles;
    this.msrp = msrp;
  }

  // set method
  public void setMake(String make) 
  {
    this.make = make;
  }

  public void setModel(String model) 
  {
    this.model = model;
  }

  public void setYear(int year) 
  {
    this.year = year;
  }

  public void setMiles(int miles) 
  {
    this.miles = miles;
  }

  public void setMsrp(double msrp) 
  {
    this.msrp = msrp;
  }

  // get method
  public String getMake() 
  {
    return this.make;
  }

  public String getModel()
  {
    return this.model;
  }

  public int getYear()
  {
    return this.year;
  }

  public int getMiles()
  {
    return this.miles;
  }

  public double getMsrp() 
  {
    return this.msrp;
  }

}

public class Main
{
  // Print each car with attributes
  public static void calculatePrice(String make, String model, int year, int miles, double msrp) { 
    // current price
    double price = msrp - ((miles / 250.0) * msrp);
    System.out.println("A " + year + " " + make + " " + model + " with " + msrp + "$ msrp driven for " + miles + " miles sells for "+ price+"$.");
  }

  public static void main(String[] args) {
    //first car object 
    Car first = new Car();
    first.setMake("Chevrolet");
    first.setModel("Camaro");
    first.setYear(2016);
    first.setMiles(50);
    first.setMsrp(24500.00);

    // second car
    Car second = new Car();
    // set second attributes
    second.setMake("Toyota");
    second.setModel("Rav4");
    second.setYear(2012);
    second.setMiles(130);
    second.setMsrp(22500.0);

    // calculate price 
    calculatePrice(first.getMake(), first.getModel(), first.getYear(), first.getMiles(), first.getMsrp()); calculatePrice(second.getMake(), second.getModel(), second.getYear(), second.getMiles(), second.getMsrp());
    }
  }
