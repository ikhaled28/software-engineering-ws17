
public class PoundToKilogramConverter extends MassConverter {

	public PoundToKilogramConverter() {
		super("Pound", "Kilogram");
	}

	@Override
	public double convert(double inPounds) {
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
