import java.util.LinkedList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
	static String flashMessage = "";
	static List<String> conversionNames = Arrays.asList("DollarToEuro","EuroToDoller", "PoundToEuro", "EuroToPound",
			"MeterToMile", "MileToMeter", "InchToCm", "CmToInch", "FootToYard", "YardToFoot", 
			"KilogramToPound", "PoundToKilogram", "TonToPound", "PoundToTon", "OunceToGram", "GramToOunce");
	static List<String> illegalInversions = Arrays.asList("MeterToMile", "MileToMeter", "InchToCm", "CmToInch", "FootToYard", "YardToFoot");
    static LinkedList<Command> commandList = new LinkedList<>();

  public static void main(String[] args)
  {
    
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
            DisplayCurrentCommands();
    		DisplayMenu();
    }
    System.out.println("Executing command list...");

    ConverterFactory factory = ConverterFactory.GetInstance();
    for(int i = 0 ; i < commandList.size(); i++){
        commandList.get(i).Execute(factory);
    }
  }
  
  static void ProcessInput(String input) {
	  Command command = GetCommand(input);
      if(command != null)
          commandList.add(command);
  }
  
  static Command GetCommand(String input) {
	  String[] words = input.split(" ");
      if(words.length != 2){
          flashMessage = "ERROR : Wrong input format!!! Please notice the input formats given in the menu.";
          return null;
      }else{
          boolean isValid = IsValidConversionName(words[0]) && IsNumberInput(words[1]);
          if(isValid)
            flashMessage = "Command added successfully.";
          return (isValid)?new Command(input, words[0], Double.parseDouble(words[1])) : null;
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
	  System.out.println("\n# Input format : ");
	  System.out.println("[conversion_name] [value_to_be_converted] (e.g. DollarToEuro 1000)");
	  System.out.println("\n\nEnter your command (Ctrl+d to exit entry mode) : ");
  }

  static void DisplayCurrentCommands(){
      if(commandList.size() > 0) {
          System.out.println("Current command list : ");
          for (int i = 0; i < commandList.size(); i++) {
            System.out.println("\033[34m"+commandList.get(i).GetActualCommand());
          }
          System.out.println("\033[30m");
      }
  }
}
