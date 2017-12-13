
public class EuroToPoundConverter extends CurrencyConverter {
	  
	public EuroToPoundConverter() {
	        super("Euro", "Pound");
	    }
	public EuroToPoundConverter(CurrencyConverter baseConverter) {
		super(baseConverter, "Euro", "Pound");
	}

	@Override
	public double convert(double inEuros) {
		if(baseConverter != null){
			inEuros = baseConverter.convert(inEuros);
		}
		inputValue = inEuros;
		convertedValue = inEuros * 0.89;
		return convertedValue;
	}

	@Override
	public String toString() {
	        return "Euro to Pound Converter";
	    }

	@Override
	public UnitConverter Clone() {
			return new EuroToPoundConverter();
		}

}
