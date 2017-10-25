public class DollarToEuroConverter extends CurrencyConverter
{
  public DollarToEuroConverter() { }

  public double convert(double inDollars) {
    return inDollars*0.85;
  }

  public String toString(){
    return "Dollar to Euro Converter has converted %.2f USD to %.2f EURO";
  }

  public void print(){
    System.out.println(toString());
  }
};
