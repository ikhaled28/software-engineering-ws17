public class MileToMeterConverter extends LengthConverter {
    public MileToMeterConverter() {
        super("Miles", "Meters");
    }
    
    public MileToMeterConverter(LengthConverter baseConverter) {
        super(baseConverter, "Miles", "Meters");
    }
    
    @Override
    public double convert(double meterValue) {
    		if(baseConverter != null){
    			meterValue = baseConverter.convert(meterValue);
		}
        inValue = meterValue;
        outValue = meterValue * 1609.34;
        return outValue;
    }

    @Override
    public String toString() {
        return "Mile to Meter Converter";
    }
    
    @Override
	public UnitConverter Clone() {
		return new MileToMeterConverter();
	}
}
