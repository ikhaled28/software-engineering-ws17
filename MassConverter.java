
public abstract class MassConverter extends UnitConverter{
	
	protected String inputMassUnit;
    protected String convertedMassUnit;
    protected double inputMass;
    protected double covertedMass;

    public MassConverter(String inputMassUnit, String convertedMassUnit){
        this.inputMassUnit = inputMassUnit;
        this.convertedMassUnit = convertedMassUnit;
        this.inputMass = 0;
        this.covertedMass = 0;
    }
    
//Exception Handling For Assignment 7 : Checking Exception For Illegal type for Mass Conversion
    
    public MassConverter(MassConverter baseConverter, String inputMassUnit, String convertedMassUnit){
        this(inputMassUnit, convertedMassUnit);
        this.baseConverter = baseConverter;
        try {
            if (baseConverter.convertedMassUnit != inputMassUnit) {
                throw new IllegalTypeException(inputMassUnit, baseConverter.convertedMassUnit);
            }
        }catch (IllegalTypeException e){
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
    
    @Override 
    public String GetInputUnit(){
    		return this.inputMassUnit;
    }
    
    @Override
    public String GetOutputUnit() {
    		return this.convertedMassUnit;
    }
    
    @Override
    public void print() {
    		if(baseConverter != null){
    			baseConverter.print();
    			System.out.print(" --> ");
    		}
        //System.out.format(toString() + " has converted "+inputMass+" %s to %.6f %s", inputMassUnit, covertedMass, convertedMassUnit);
        System.out.format(inputMass + " %s to %.6f %s", inputMassUnit, covertedMass, convertedMassUnit);

    }

}
