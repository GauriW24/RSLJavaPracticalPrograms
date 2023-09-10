package practicalModuleTwo;
import java.util.HashMap;
import java.util.Map;


public class practicalEighteen {

	public static void main(String[] args) 
	{
		HashMap<String, String> hm = new HashMap<>();
		hm.put("coruscate", "To sparkle");
		hm.put("Abysmal", "terrible");
		hm.put("Fidgery", "restless");
		hm.put("whimsical", "playful");
		hm.put("shrill", "sharp");
		
		for(Map.Entry<String, String> entry: hm.entrySet())
		{
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " : " + value);
		}
	}

}
