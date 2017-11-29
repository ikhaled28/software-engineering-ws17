class Main {
  public static void main(String[] args)
  {
    String converterName = "DollarToEuroasd";
    String value = "1000";

    
    /*
     *
     * Accepted Converter Names
     *
     * CurrencyConverter
     *
     *   DollarToEuro
     *   EuroToDoller
     *   PoundToEuro
     *   EuroToPound
     *
     *
     * LengthConverter
     *
     *   MeterToMile
     *   MileToMeter
     *   InchToCm
     *   CmToInch
     *   FootToYard
     *   YardToFoot
     *
     *
     * MassConverter
     *
     *   KilogramToPound
     *   PoundToKilogram
     *   TonToPound
     *   PoundToTon
     *   OunceToGram
     *   GramToOunce
     *
    */
    
    UnitConverter myConverter = ConverterFactory.GetInstance().Create(converterName);
    if(myConverter == null) {
    		System.out.println("Wrong input given as converter name. Terminating...");
    		return;
    }
    
    double valueToBeConverted = 0;
    try {
      valueToBeConverted = Double.parseDouble(value);
    }catch (Exception e){
      System.out.println("Wrong input value. Terminating...");
      return;
    }
    
    double convertedValue = myConverter.convert(valueToBeConverted);
    System.out.println(convertedValue);
    myConverter.print();
    
    
    
  }
}
