package www.douyou.shanghai.www.douyou.shanghai.array;

import java.util.HashMap;
import java.util.Map;
/**
 * 判断HashMap的key是否可以为null
 * static final int hash(Object key) {
 *         int h;
 *         return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
 *     }
 *     从他的底层源码来看当key等于null时返回0
 */
public class TestHashMap {
    public static void main(String[] args){

        Map<String, Object> map = new HashMap<>();
        map.put(null,"douyou");

        System.out.println(map.get(null));
    }
}
