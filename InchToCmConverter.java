public class InchToCmConverter extends LengthConverter {
    public InchToCmConverter() {
        super("Inches", "Centimeters");
    }

    @Override
    public double convert(double inchValue) {
        inValue = inchValue;
        outValue = inchValue * 2.54;
        return outValue;
    }

    @Override
    public String toString() {
        return "Inch to Centimeter Converter";
    }
}
