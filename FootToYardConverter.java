public class FootToYardConverter extends LengthConverter {
    public FootToYardConverter() {
        super("Foot", "Yard");
    }
    
    public FootToYardConverter(LengthConverter baseConverter) {
        super(baseConverter, "Foot", "Yard");
    }

    @Override
    public double convert(double feetValue) {
    		if(baseConverter != null){
    			feetValue = baseConverter.convert(feetValue);
		}
        inValue = feetValue;
        outValue = feetValue * 0.333333;
        return outValue;
    }

    @Override
    public String toString() {
        return "Foot to Yard Converter";
    }
    
    @Override
	public UnitConverter Clone() {
		return new FootToYardConverter();
	}
}
