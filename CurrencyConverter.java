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

 // Exception Handling For Assignment 7
    public CurrencyConverter(CurrencyConverter baseConverter, String inputCurrencyName, String convertedCurrencyName){
        this(inputCurrencyName, convertedCurrencyName);
        this.baseConverter = baseConverter;
        try {
            if (baseConverter.convertedCurrencyName != inputCurrencyName) {
                throw new IllegalTypeException(inputCurrencyName, baseConverter.convertedCurrencyName);
            }
        }catch (IllegalTypeException e){
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
    
    @Override 
    public String GetInputUnit(){
    		return this.inputCurrencyName;
    }
    
    @Override
    public String GetOutputUnit() {
    		return this.convertedCurrencyName;
    }
    
    @Override
    public void print() {
        if(baseConverter != null){
            baseConverter.print();
            System.out.print(" --> ");
        }
//        System.out.format(toString() + " : "+inputValue+" %s to %.6f %s", inputCurrencyName, convertedValue, convertedCurrencyName);
        System.out.format(inputValue+" %s to %.6f %s", inputCurrencyName, convertedValue, convertedCurrencyName);
    }
	
}
