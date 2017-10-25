class Main {
  public static void main(String[] args)
  {
    String conversion = "DollarToEuro";
    String value = "234";

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
