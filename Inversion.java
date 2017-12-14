public class Inversion extends UnitConverter{

	String inputUnitName;
    String convertedUnitName;
    double inputValue;
    double convertedValue;
	
	public Inversion(MassConverter baseConverter) {
//		try {
//			if(baseConverter.getClass().getSuperclass().toString().equals(LengthConverter.class.toString())) {
//				throw new IllegalInversionException(baseConverter.getClass().toString());
//			}
//		}
//		catch(IllegalInversionException e) {
//			System.out.println(e.getMessage());
//			System.exit(0);
//		}
		
		this.baseConverter = baseConverter; 
		this.inputUnitName = baseConverter.GetOutputUnit();
		this.convertedUnitName = baseConverter.GetInputUnit();
	}
	
	public Inversion(CurrencyConverter baseConverter) {
//		try {
//			if(baseConverter.getClass().getSuperclass().toString().equals(LengthConverter.class.toString())) {
//				throw new IllegalInversionException(baseConverter.getClass().toString());
//			}
//		}
//		catch(IllegalInversionException e) {
//			System.out.println(e.getMessage());
//			System.exit(0);
//		}
		
		this.baseConverter = baseConverter; 
		this.inputUnitName = baseConverter.GetOutputUnit();
		this.convertedUnitName = baseConverter.GetInputUnit();
	}
	
	@Override
	public double convert(double inValue) {
		this.inputValue = inValue;
		double actualResult = baseConverter.convert(inValue);
		double factor = actualResult / inValue;
		this.convertedValue = inValue * (1/factor);
		return convertedValue;
	}

	@Override
	public String toString() {
		return "Inversion : ";
	}

	@Override
	public void print() {
		System.out.format(toString() + inputValue + " %s to %.6f %s\n", inputUnitName, convertedValue, convertedUnitName);
	}

}
