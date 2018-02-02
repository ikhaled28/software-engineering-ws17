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
 
    // Exception Handling For Assignment 7
    public LengthConverter(LengthConverter baseConverter, String sourceLengthName, String destinationLengthName){
        this(sourceLengthName, destinationLengthName);
        this.baseConverter = baseConverter;
        try {
            if (baseConverter.destinationLengthName != sourceLengthName) {
                throw new IllegalTypeException(sourceLengthName, baseConverter.destinationLengthName);
            }
        }catch (IllegalTypeException e){
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
    
    @Override 
    public String GetInputUnit(){
    		return this.sourceLengthName;
    }
    
    @Override
    public String GetOutputUnit() {
    		return this.destinationLengthName;
    }

    @Override
    public void print() {
    		if(baseConverter != null){
			baseConverter.print();
			System.out.print(" --> ");
    		}
//        System.out.format(toString() + " has converted "+inValue+" %s to %.6f %s", sourceLengthName, outValue, destinationLengthName);
        System.out.format(inValue + " %s to %.6f %s", sourceLengthName, outValue, destinationLengthName);
    }
}
