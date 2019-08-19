import java.util.HashMap;

public class MyClass {
  public static void main(String[] args) {
    HashMap<String, String> capitalCities = new HashMap<String, String>();
    capitalCities.put("Washington", "Olympia");
    capitalCities.put("Oregon", "Salem");
    capitalCities.put("California", "Sacramento");
    capitalCities.put("Alaska", "Juneau");
    System.out.println(capitalCities); 
  }
}
