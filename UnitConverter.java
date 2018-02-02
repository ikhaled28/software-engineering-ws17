public abstract class UnitConverter
{
  protected UnitConverter baseConverter = null;
  public UnitConverter() { }
  public abstract double convert(double inValue);
  public abstract String toString();
  public abstract void print();
  
  public UnitConverter Clone() {
	return null;
  }
  
  public String GetInputUnit() {
	  return "";
  }
  
  public String GetOutputUnit() {
	  return "";
  }

}

// Exception Handling For Assignment 7 : Checking Exception For Illegal type found while chaining

class IllegalTypeException extends Exception{
  public IllegalTypeException(){
    super("\nIllegal type found while chaining . Program terminating...");
  }
//Exception Handling For Assignment 7 : Checking Exception For Illegal type found while chaining
  public IllegalTypeException(String expected, String found){
    super("\nIllegal type found while chaining ( Expected : "+expected+", Found : "+found+"). Program terminating...");
  }
}
//Exception Handling For Assignment 7 : Checking Exception For Illegal type for Inversion
class IllegalInversionException extends Exception{
	  public IllegalInversionException(){
	    super("\nIllegal type found for inversion. Program terminating...");
	  }
	  
	  public IllegalInversionException(String className){
		    super("\nIllegal type found for inversion. "+className+" not supported. Program terminating...");
		  }
	}

