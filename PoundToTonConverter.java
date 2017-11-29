
public class PoundToTonConverter extends MassConverter {

	public PoundToTonConverter() {
		super("Pound", "Ton");
	}

	@Override
	public double convert(double inPounds) {
		inputMass = inPounds;
		covertedMass = inPounds * 0.0005;
		return covertedMass;
	}

	@Override
	public String toString() {
		return "Pound to Ton Converter";
	}
	
	@Override
	public UnitConverter Clone() {
		return new PoundToTonConverter();
	}
}
