public class CmToInchConverter extends LengthConverter {
    public CmToInchConverter() {
        super("Centimeters", "Inches");
    }

    @Override
    public double convert(double cmValue) {
        inValue = cmValue;
        outValue = cmValue * 0.393701;
        return outValue;
    }

    @Override
    public String toString() {
        return "Centimeter to Inch Converter";
    }
}
