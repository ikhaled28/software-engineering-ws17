public class YardToFootConverter extends LengthConverter{
    public YardToFootConverter() {
        super("Yard", "Foot");
    }

    @Override
    public double convert(double yardValue) {
        inValue = yardValue;
        outValue = yardValue * 3;
        return outValue;
    }

    @Override
    public String toString() {
        return "Yard to Foot Converter";
    }
}