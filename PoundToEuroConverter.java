
public class PoundToEuroConverter extends CurrencyConverter{

	public PoundToEuroConverter() {
	        super("Pound", "Euro");
	    }
	public PoundToEuroConverter(CurrencyConverter baseConverter) {
		super(baseConverter, "Pound", "Euro");
	}

	@Override
	public double convert(double inPounds) {
		if(baseConverter != null){
			inPounds = baseConverter.convert(inPounds);
		}
		inputValue = inPounds;
		convertedValue = inPounds * 1.1236;
		return convertedValue;
	}

	@Override
	public String toString() {
	        return "Pound to Euro Converter";
	    }
	    
	@Override
	public UnitConverter Clone() {
			return new PoundToEuroConverter();
		}

}
