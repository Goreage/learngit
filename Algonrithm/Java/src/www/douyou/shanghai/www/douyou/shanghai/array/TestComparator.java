package www.douyou.shanghai.www.douyou.shanghai.array;

import java.util.Comparator;

public class TestComparator {
    public static void main(String[] args){
        /**
         * 使用Comparator接口，实现字符串比较
         */

        Comparator com1 = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };

        /**
         * 用Lambda表达式来表示字符串的比较
         */
        System.out.println(com1.compare("a", "b"));

        Comparator<String> stringComp = (s1, s2) -> s1.compareTo(s2);

        System.out.println(stringComp.compare("e", "a"));

        /**
         * jdk1.8对Comparator改动比较大的，里面有一个静态方法，
         * naturalOrder自动返回一个表达式
         */
        Comparator<String> tComparator = Comparator.naturalOrder();
        System.out.println(tComparator.compare("k", "a"));
    }
}
