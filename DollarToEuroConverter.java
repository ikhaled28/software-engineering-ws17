public class DollarToEuroConverter extends CurrencyConverter
{ 
	public DollarToEuroConverter() {
		super("Dollar", "Euro");
	}

	public DollarToEuroConverter(CurrencyConverter baseConverter) {
		super(baseConverter, "Dollar", "Euro");
	}

	@Override
	public double convert(double inDollars) {
		if(baseConverter != null){
			inDollars = baseConverter.convert(inDollars);
		}
		inputValue = inDollars;
		convertedValue = inDollars * 0.85;
		return convertedValue;
	}

	@Override
	public String toString() {
		return "Dollar to Euro Converter";
	}

	@Override
	public UnitConverter Clone() {
		return new DollarToEuroConverter();
	}
};
