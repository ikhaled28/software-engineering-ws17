
public class PoundToEuroConverter extends CurrencyConverter{
	
	public PoundToEuroConverter() { }

	  public double convert(double inPounds) {
	    return inPounds*1.12;
	  }

	  public String toString(){
	    return "Pound to Euro Converter has converted %.2f Pound to %.2f Euro";
	  }

	  public void print(){
	    System.out.println(toString());
	  }

}
