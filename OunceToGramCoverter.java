
public class OunceToGramCoverter extends MassConverter {

	public OunceToGramCoverter() {
		super("Ounce", "Gram");
	}

	@Override
	public double convert(double inOuncess) {
		inputMass = inOuncess;
		covertedMass = inOuncess * 28.3495;
		return covertedMass;
	}

	@Override
	public String toString() {
		return "Ounce to Gram Converter";
	}
}
