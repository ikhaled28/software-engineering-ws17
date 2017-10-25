
public class EuroToPoundConverter extends CurrencyConverter {

	public EuroToPoundConverter() { }

	  public double convert(double inEuros) {
	    return inEuros*0.89;
	  }

	  public String toString(){
	    return "Euro to Pound Converter has converted %.2f Euro to %.2f Pound";
	  }

	  public void print(){
	    System.out.println(toString());
	  }

}
