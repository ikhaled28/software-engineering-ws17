import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
	public enum CommandType{
		BASIC, CHAIN, INVERT, INVALID
	}
	static String flashMessage = "";
	static List<String> conversionNames = Arrays.asList("DollarToEuro","EuroToDoller", "PoundToEuro", "EuroToPound",
			"MeterToMile", "MileToMeter", "InchToCm", "CmToInch", "FootToYard", "YardToFoot", 
			"KilogramToPound", "PoundToKilogram", "TonToPound", "PoundToTon", "OunceToGram", "GramToOunce");
	static List<String> illegalInversions = Arrays.asList("MeterToMile", "MileToMeter", "InchToCm", "CmToInch", "FootToYard", "YardToFoot");
  public static void main(String[] args)
  {
    String converterName = "DollarToEuro";
    String value = "1000";

    
    
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
//    System.out.println(convertedValue);
//    myConverter.print();
    
//    UnitConverter temp = new EuroToDollarConverter(new PoundToEuroConverter());
//    temp.convert(valueToBeConverted);
//    temp.print();
    
//    UnitConverter temp = new Inversion(new DollarToEuroConverter());
//    temp.convert(valueToBeConverted);
//    temp.print();
    
    
    Scanner scanner = new Scanner(System.in);
    DisplayMenu();
    while(scanner.hasNext()) {
    		String input = scanner.nextLine();
    		ProcessInput(input);
    		System.out.println("\n"+flashMessage+"\n");
    		flashMessage = "";
    		DisplayMenu();
    }
    System.out.println("Done");
  }
  
  static void ProcessInput(String input) {
	  GetCommandType(input);
  }
  
  static CommandType GetCommandType(String input) {
	  String[] words = input.split(" ");
	  if(words.length < 2 || words.length > 3) {
		  flashMessage = "ERROR : Wrong input format!!! Please notice the input formats given in the menu.";
		  return CommandType.INVALID;
	  }else if(words.length == 2){
		  boolean isValid = IsValidConversionName(words[0]) && IsNumberInput(words[1]);
		  if(isValid)
			  flashMessage = "Command added successfully.";
		  return (isValid)?CommandType.BASIC : CommandType.INVALID;
	  }else if(words.length == 3) {
		  boolean isValid = false;
		  CommandType type = CommandType.INVALID;
		  if(words[0] == "invert") {
			  isValid = IsValidConversionName(words[1]) && !IsIllegalInversion(words[1]) && IsNumberInput(words[2]);
			  type = (isValid) ? CommandType.INVERT : CommandType.INVALID;
		  }
		  else {
			  isValid = IsValidConversionName(words[0]) && IsValidConversionName(words[1]) && IsNumberInput(words[2]);
			  type = (isValid) ? CommandType.CHAIN : CommandType.INVALID;
		  }
		  if(isValid)
			  flashMessage = "Command added successfully.";
		  return type;
	  }else {
		  return CommandType.INVALID;
	  }
  }
  
  static boolean IsNumberInput(String data) {
	  try {
		  double valueToBeConverted = Double.parseDouble(data);
		  return true;
	  }catch (Exception e){
		  flashMessage = "ERROR : Unable to get the number from the command!!!";
	      return false;
	  }
  }
  
  static boolean IsValidConversionName(String conversion) {
	  boolean isValid = conversionNames.contains(conversion);
	  if(!isValid)
		  flashMessage += "ERROR : Illegal conversion name!!! Please notice the accepted conversion names in the menu";
	  return isValid;
  }
  
  static boolean IsIllegalInversion(String conversion) {
	  boolean illegal = illegalInversions.contains(conversion);
	  if(illegal)
		  flashMessage += "ERROR : Illegal conversion name for inverted conversion";
	  return illegal;
  }
  
  static void DisplayMenu() {
	  System.out.println("Accepted conversion names :");
	  System.out.println("---------------------------------------");
	  System.out.println("DollarToEuro \tEuroToDoller \tPoundToEuro \tEuroToPound");
	  System.out.println("MeterToMile \tMileToMeter \tInchToCm \tCmToInch \tFootToYard \tYardToFoot");
	  System.out.println("KilogramToPound \tPoundToKilogram \tTonToPound \tPoundToTon \tOunceToGram \tGramToOunce");
	  System.out.println("---------------------------------------");
	  System.out.println("\n# Input formats : ");
	  System.out.println("- Basic conversion : [conversion_name] [value_to_be_converted] (e.g. DollarToEuro 1000)");
	  System.out.println("- Chain conversion : [conversion_name] [conversion_name] [value_to_be_converted] (e.g. DollarToEuro EuroToPound 1000)");
	  System.out.println("- Invert conversion : invert [conversion_name] [value_to_be_converted] (e.g. invert DollarToEuro 1000)");
	  System.out.println("\n\nEnter your command : ");
  }
}
