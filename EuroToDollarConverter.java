
public class EuroToDollarConverter extends CurrencyConverter{
	
	public EuroToDollarConverter() { }

	  public double convert(double inEuros) {
	    return inEuros*1.18;
	  }

	  public String toString(){
	    return "Euro to Dollar Converter has converted %.2f Euro to %.2f Dollar";
	  }

	  public void print(){
	    System.out.println(toString());
	  }

}
