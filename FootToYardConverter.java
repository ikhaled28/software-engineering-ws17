public class FootToYardConverter extends LengthConverter {
    public FootToYardConverter() {
        super("Foot", "Yard");
    }

    @Override
    public double convert(double feetValue) {
        inValue = feetValue;
        outValue = feetValue * 0.333333;
        return outValue;
    }

    @Override
    public String toString() {
        return "Foot to Yard Converter";
    }
}
