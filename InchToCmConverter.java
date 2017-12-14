public class InchToCmConverter extends LengthConverter {
    public InchToCmConverter() {
        super("Inches", "Centimeters");
    }
    
    public InchToCmConverter(LengthConverter baseConverter) {
        super(baseConverter, "Inches", "Centimeters");
    }

    @Override
    public double convert(double inchValue) {
    		if(baseConverter != null){
    			inchValue = baseConverter.convert(inchValue);
		}
        inValue = inchValue;
        outValue = inchValue * 2.54;
        return outValue;
    }

    @Override
    public String toString() {
        return "Inch to Centimeter Converter";
    }
    
    @Override
	public UnitConverter Clone() {
		return new InchToCmConverter();
	}
}
