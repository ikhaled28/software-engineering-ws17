public abstract class LengthConverter extends UnitConverter {
    protected String sourceLengthName;
    protected String destinationLengthName;
    protected double inValue;
    protected double outValue;

    public LengthConverter(String sourceLengthName, String destinationLengthName){
        this.sourceLengthName = sourceLengthName;
        this.destinationLengthName = destinationLengthName;
        this.inValue = 0;
        this.outValue = 0;
    }

    @Override
    public void print() {
        System.out.format(toString() + " has converted "+inValue+" %s to %.6f %s", sourceLengthName, outValue, destinationLengthName);
    }
}
