public class MileToMeterConverter extends LengthConverter {
    public MileToMeterConverter() {
        super("Miles", "Meters");
    }
    @Override
    public double convert(double meterValue) {
        inValue = meterValue;
        outValue = meterValue * 1609.34;
        return outValue;
    }

    @Override
    public String toString() {
        return "Mile to Meter Converter";
    }
}
