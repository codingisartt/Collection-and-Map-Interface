import java.util.HashMap;
import java.util.Map;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Map<String,String> country=new HashMap<>();

        country.put("TR", "Türkiye");
        country.put("TR", "Türkiye2");
        country.put("GR", "Almanya");
        country.put("EN", "İngiltere");

        country.remove("EN");
        System.out.println(country.get("TR"));
        System.out.println(country.get("EN"));
        System.out.println(country.size());

        System.out.println("#####");

        for(String key:country.keySet()){
            System.out.println(key);
        }

        for(String val: country.values()){
            System.out.println(val);
        }
    }
}