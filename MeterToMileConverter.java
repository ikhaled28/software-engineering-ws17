public class MeterToMileConverter extends LengthConverter {
    public MeterToMileConverter() {
        super("Meters", "Miles");
    }
    
    public MeterToMileConverter(LengthConverter baseConverter) {
        super(baseConverter, "Meters", "Miles");
    }

    @Override
    public double convert(double mileValue) {
    		if(baseConverter != null){
    			mileValue = baseConverter.convert(mileValue);
		}
        inValue = mileValue;
        outValue = mileValue * 0.000621371;
        return outValue;
    }

    @Override
    public String toString() {
        return "Meter to Mile Converter";
    }

    @Override
	public UnitConverter Clone() {
		return new MeterToMileConverter();
	}

}
