
public class PoundToKilogramConverter extends MassConverter {

	public PoundToKilogramConverter() {
		super("Pound", "Kilogram");
	}

	public PoundToKilogramConverter(MassConverter baseConverter) {
		super(baseConverter, "Pound", "Kilogram");
	}
	@Override
	public double convert(double inPounds) {
		if(baseConverter != null){
			inPounds = baseConverter.convert(inPounds);
		}
		inputMass = inPounds;
		covertedMass = inPounds * 0.453592;
		return covertedMass;
	}

	@Override
	public String toString() {
		return "Pound to Kilogram Converter";
	}
	
	@Override
	public UnitConverter Clone() {
		return new PoundToKilogramConverter();
	}
}
