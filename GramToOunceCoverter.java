
public class GramToOunceCoverter extends MassConverter {
	
	public GramToOunceCoverter() {
		super("Gram", "Ounce");
	}
	public GramToOunceCoverter(MassConverter baseConverter) {
		super(baseConverter, "Gram", "Ounce");
	}

	@Override
	public double convert(double inGrams) {
		if(baseConverter != null){
			inGrams = baseConverter.convert(inGrams);
		}
		inputMass = inGrams;
		covertedMass = inGrams * 0.035274;
		return covertedMass;
	}

	@Override
	public String toString() {
		return "Gram to Ounce Converter";
	}
	
	@Override
	public UnitConverter Clone() {
		return new GramToOunceCoverter();
	}

}
