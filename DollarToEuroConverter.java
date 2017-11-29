public class DollarToEuroConverter extends CurrencyConverter
{ 
	public DollarToEuroConverter() {
		super("Dollar", "Euro");
	}

	@Override
	public double convert(double inDollars) {
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
