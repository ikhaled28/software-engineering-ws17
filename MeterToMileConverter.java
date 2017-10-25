public class MeterToMileConverter extends LengthConverter {
    public MeterToMileConverter() {
        super("Meters", "Miles");
    }

    @Override
    public double convert(double mileValue) {
        inValue = mileValue;
        outValue = mileValue * 0.000621371;
        return outValue;
    }

    @Override
    public String toString() {
        return "Meter to Mile Converter";
    }


}
