import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapString {
    private String name;

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("aad", "hai");
        map.put("a", "hoa");
        map.put("cbb", "hoa");
        map.put("b", "aaa");
        map.put("eff", "abc");
        System.out.println(map);
        Map<String, String> map1 = new TreeMap<String, String>(map);

        System.out.println(map1);

    }
}
