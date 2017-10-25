
public class PoundToEuroConverter extends CurrencyConverter{
		  
	  public PoundToEuroConverter() {
	        super("Pound", "Euro");
	    }

	    @Override
	    public double convert(double inPounds) {
	        inputValue = inPounds;
	        convertedValue = inPounds * 1.12;
	        return convertedValue;
	    }

	    @Override
	    public String toString() {
	        return "Pound to Euro Converter";
	    }

}
