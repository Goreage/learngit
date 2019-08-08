package codes.setandmap.dachang;

import java.util.HashSet;

class Name1
{
    private String first;
    private String last;
    public Name1(String frist,String last)
    {
        this.first = first;
        this.last = last;
    }
    //根据frist判断两个Name1是否相等
    @Override
    public boolean equals(Object o)
    {
        if(this == o)
        {
            return true;
        }
        if(o.getClass() == Name1.class)
        {
            Name1 n = (Name1)o;
            return n.first.equals(first);
        }
        return false;
    }
    //根据frist计算Name对象的hashCode()返回值
    @Override
    public int hashCode()
    {
        return first.hashCode();
    }
    @Override
    public String toString()
    {
        return "Name[first=" + first + ",last=" + last + "]";
    }
}
public class HashSetTest2 {
    public static void main(String[] args){
        HashSet<Name1> set = new HashSet<>();
        set.add(new Name1("abc", "123"));
        set.add(new Name1("abc","456"));
        System.out.println(set);
    }
}
