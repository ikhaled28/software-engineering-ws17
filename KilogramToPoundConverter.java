
public class KilogramToPoundConverter extends MassConverter {

	public KilogramToPoundConverter() {
		super("Kilogram", "Pound");
	}

	@Override
	public double convert(double inKilograms) {
		inputMass = inKilograms;
		covertedMass = inKilograms * 2.20462;
		return covertedMass;
	}

	@Override
	public String toString() {
		return "Pound to Kilogram Converter";
	}
	
	@Override
	public UnitConverter Clone() {
		return new KilogramToPoundConverter();
	}
}
