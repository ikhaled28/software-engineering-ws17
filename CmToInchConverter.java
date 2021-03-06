public class CmToInchConverter extends LengthConverter {
    public CmToInchConverter() {
        super("Centimeters", "Inches");
    }
    
    public CmToInchConverter(LengthConverter baseConverter) {
        super(baseConverter, "Centimeters", "Inches");
    }

    @Override
    public double convert(double cmValue) {
    		if(baseConverter != null){
    			cmValue = baseConverter.convert(cmValue);
		}
        inValue = cmValue;
        outValue = cmValue * 0.393701;
        return outValue;
    }

    @Override
    public String toString() {
        return "Centimeter to Inch Converter";
    }

	@Override
	public UnitConverter Clone() {
		return new CmToInchConverter();
	}
}
