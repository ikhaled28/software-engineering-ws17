
public abstract class CurrencyConverter extends UnitConverter{
	
	protected String inputCurrencyName;
    protected String convertedCurrencyName;
    protected double inputValue;
    protected double convertedValue;

    public CurrencyConverter(String inputCurrencyName, String convertedCurrencyName){
        this.inputCurrencyName = inputCurrencyName;
        this.convertedCurrencyName = convertedCurrencyName;
        this.inputValue = 0;
        this.convertedValue = 0;
    }

    @Override
    public void print() {
        System.out.format(toString() + " has converted "+inputValue+" %s to %.6f %s", inputCurrencyName, convertedValue, convertedCurrencyName);
    }
	
}
