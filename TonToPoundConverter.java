
public class TonToPoundConverter extends MassConverter {

	public TonToPoundConverter() {
		super("Ton", "Pound");
	}
	
	public TonToPoundConverter(MassConverter baseConverter) {
		super(baseConverter, "Ton", "Pound");
	}

	@Override
	public double convert(double inTons) {
		if(baseConverter != null){
			inTons = baseConverter.convert(inTons);
		}
		inputMass = inTons;
		covertedMass = inTons * 2000;
		return covertedMass;
	}

	@Override
	public String toString() {
		return "Ton to Pound Converter";
	}
	
	@Override
	public UnitConverter Clone() {
		return new TonToPoundConverter();
	}
}
