
public class PoundToTonConverter extends MassConverter {

	public PoundToTonConverter() {
		super("Pound", "Ton");
	}
	public PoundToTonConverter(MassConverter baseConverter) {
		super(baseConverter, "Pound", "Ton");
	}

	@Override
	public double convert(double inPounds) {
		if(baseConverter != null){
			inPounds = baseConverter.convert(inPounds);
		}
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
