import TinyTestJ.RunTests;

class Main {
  public static void main(String[] args)
  {
    String conversion = "DollarToEuro";
    String value = "1000";

    
    /*
     * TODO
     *
     * use desired conversion here
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
    

    UnitConverter myConverter;

    if(conversion == "DollarToEuro")
      myConverter = new DollarToEuroConverter();
    else if(conversion == "EuroToDoller")
      myConverter = new EuroToDollarConverter();
    else if(conversion == "PoundToEuro")
      myConverter = new PoundToEuroConverter();
    else if(conversion == "EuroToPound")
      myConverter = new EuroToPoundConverter();
    else if(conversion == "MeterToMile")
      myConverter = new MeterToMileConverter();
    else if(conversion == "MileToMeter")
      myConverter = new MileToMeterConverter();
    else if(conversion == "InchToCm")
      myConverter = new InchToCmConverter();
    else if(conversion == "CmToInch")
      myConverter = new CmToInchConverter();
    else if(conversion == "FootToYard")
      myConverter = new FootToYardConverter();
    else if(conversion == "YardToFoot")
      myConverter = new YardToFootConverter();
    else if(conversion == "KilogramToPound")
      myConverter = new KilogramToPoundConverter();
    else if(conversion == "PoundToKilogram")
      myConverter = new PoundToKilogramConverter();
    else if(conversion == "TonToPound")
      myConverter = new TonToPoundConverter();
    else if(conversion == "PoundToTon")
      myConverter = new PoundToTonConverter();
    else if(conversion == "OunceToGram")
      myConverter = new OunceToGramCoverter();
    else if(conversion == "GramToOunce")
      myConverter = new GramToOunceCoverter();
    else
      myConverter = new DollarToEuroConverter();

    double valueToBeConverted = 0;
    try {
      valueToBeConverted = Double.parseDouble(value);
    }catch (Exception e){
      System.out.println("Wrong input value");
    }
    double convertedValue = myConverter.convert(valueToBeConverted);

    //System.out.format(myConverter.toString(),valueToBeConverted, convertedValue);
    myConverter.print();
  }
}
