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

}

class IllegalTypeException extends Exception{
  public IllegalTypeException(){
    super("\nIllegal type found while chaining . Program terminating...");
  }

  public IllegalTypeException(String expected, String found){
    super("\nIllegal type found while chaining ( Expected : "+expected+", Found : "+found+"). Program terminating...");
  }
}

