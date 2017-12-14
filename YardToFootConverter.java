public class YardToFootConverter extends LengthConverter{
    public YardToFootConverter() {
        super("Yard", "Foot");
    }
    
    public YardToFootConverter(LengthConverter baseConverter) {
        super(baseConverter, "Yard", "Foot");
    }

    @Override
    public double convert(double yardValue) {
    		if(baseConverter != null){
    			yardValue = baseConverter.convert(yardValue);
		}
        inValue = yardValue;
        outValue = yardValue * 3;
        return outValue;
    }

    @Override
    public String toString() {
        return "Yard to Foot Converter";
    }
    
    @Override
	public UnitConverter Clone() {
		return new YardToFootConverter();
	}
}