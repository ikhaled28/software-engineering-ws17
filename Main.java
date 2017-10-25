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
     *   KgToPound
     *   PoundToKg
     *   TonToPound
     *   PoundToTon
     *   OunceToGram
     *   GramToOunce
     *
    */

    UnitConverter myConverter;

    if(conversion == "DollarToEuro")
      myConverter = new DollarToEuroConverter();
    else
      myConverter = new DollarToEuroConverter();

    double valueToBeConverted = Double.parseDouble(value);
    double convertedValue = myConverter.convert(valueToBeConverted);

    System.out.format(myConverter.toString(),valueToBeConverted, convertedValue);
  }
}
