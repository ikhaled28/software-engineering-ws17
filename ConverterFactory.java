import java.util.HashMap;

public class ConverterFactory {
	
	static ConverterFactory instance;
	HashMap<String, UnitConverter> objectDictionary;
	
	protected ConverterFactory() {
		instance = this;
		objectDictionary = new HashMap<>();
		objectDictionary.put("DollarToEuro", new DollarToEuroConverter());
		objectDictionary.put("EuroToDoller", new EuroToDollarConverter());
		objectDictionary.put("PoundToEuro", new PoundToEuroConverter());
		objectDictionary.put("EuroToPound", new EuroToPoundConverter());
		objectDictionary.put("MeterToMile", new MeterToMileConverter());
		objectDictionary.put("MileToMeter", new MileToMeterConverter());
		objectDictionary.put("InchToCm", new InchToCmConverter());
		objectDictionary.put("CmToInch", new CmToInchConverter());
		objectDictionary.put("FootToYard", new FootToYardConverter());
		objectDictionary.put("YardToFoot", new YardToFootConverter());
		objectDictionary.put("KilogramToPound", new KilogramToPoundConverter());
		objectDictionary.put("PoundToKilogram", new PoundToKilogramConverter());
		objectDictionary.put("TonToPound", new TonToPoundConverter());
		objectDictionary.put("PoundToTon", new PoundToTonConverter());
		objectDictionary.put("OunceToGram", new OunceToGramCoverter());
		objectDictionary.put("GramToOunce", new GramToOunceCoverter());
	}
	
	public static ConverterFactory GetInstance() {
		if(instance == null)
			new ConverterFactory();
		
		return instance;
	}
	
	public UnitConverter Create(String option) {
		if(objectDictionary.containsKey(option))
			return objectDictionary.get(option);
		return null;
	}
}
