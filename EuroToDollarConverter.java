
public class EuroToDollarConverter extends CurrencyConverter{
	  
	  public EuroToDollarConverter() {
	      super("Euro", "Dollar");
	  }

	  @Override
	  public double convert(double inEuros) {
	      inputValue = inEuros;
	      convertedValue = inEuros * 1.18;
	      return convertedValue;
	  }

	  @Override
	  public String toString() {
	      return "Euro to Dollar Converter";
	  }

	@Override
	public UnitConverter Clone() {
		return new EuroToDollarConverter();
	}

}
