import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class list {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("a");
        a.add("b");
        a.add("c");
        a.remove("a");
        a.set(0,"a");
        List<String> b = new ArrayList<>();
        b.add("a");
        a.contains(b);
        for (String s:a){
            System.out.println(s);
        }
        Map<String,String> map = new HashMap<>();
        map.put("a","a");
        map.put("b","b");

        Map<String,String> map2 = new HashMap<>();
        map2.put("a","a");
        map2.put("b","b");

        map2.putAll(map);
        map.containsKey("a");
        System.out.println(map.get("a"));
        for (Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+entry.getValue());
        }
    }

    public static int demo(int a,int b){
        return a;
    }
}

/**
 * 一级目录
 */
class FirstCatalog{
    private String name;
    private SecondCatalog[] SC;
}

/**
 * 二级目录
 */
class SecondCatalog{
    private String name;
    private ThreeCatalog[] SC;
}

/**
 * 三级目录
 */
class ThreeCatalog {
    private String name;
}

