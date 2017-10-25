
public class GramToOunceCoverter extends MassConverter {
	
	public GramToOunceCoverter() {
		super("Gram", "Ounce");
	}

	@Override
	public double convert(double inGrams) {
		inputMass = inGrams;
		covertedMass = inGrams * 0.035274;
		return covertedMass;
	}

	@Override
	public String toString() {
		return "Gram to Ounce Converter";
	}

}
