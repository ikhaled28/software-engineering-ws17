
public class EuroToPoundConverter extends CurrencyConverter {
	  
	  public EuroToPoundConverter() {
	        super("Euro", "Pound");
	    }

	    @Override
	    public double convert(double inEuros) {
	        inputValue = inEuros;
	        convertedValue = inEuros * 0.89;
	        return convertedValue;
	    }

	    @Override
	    public String toString() {
	        return "Euro to Pound Converter";
	    }

}
