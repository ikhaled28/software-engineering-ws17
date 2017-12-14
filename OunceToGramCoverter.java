
public class OunceToGramCoverter extends MassConverter {

	public OunceToGramCoverter() {
		super("Ounce", "Gram");
	}
	public OunceToGramCoverter(MassConverter baseConverter) {
		super(baseConverter, "Ounce", "Gram");
	}	

	@Override
	public double convert(double inOuncess) {
		if(baseConverter != null){
			inOuncess = baseConverter.convert(inOuncess);
		}
		inputMass = inOuncess;
		covertedMass = inOuncess * 28.3495;
		return covertedMass;
	}

	@Override
	public String toString() {
		return "Ounce to Gram Converter";
	}
	
	@Override
	public UnitConverter Clone() {
		return new OunceToGramCoverter();
	}
}
