
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

    @Override
    public void print() {
        System.out.format(toString() + " has converted %.2f %s to %.2f %s", inputMass, inputMassUnit, covertedMass, convertedMassUnit);
    }

}
