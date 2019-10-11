package org.zhuhui;


/**
 * 什么是 Java 对象深拷贝？面试必问！
 * 介绍
 * 拷贝对象
 * 方法一 构造函数
 * 方法二 重载clone()方法
 * 方法三 Apache Commons Lang序列化
 * 方法四 Gson序列化
 * 方法五 Jackson序列化
 * 总结
 *
 * 一、拷贝的引入
 * （1）、引用拷贝
 *
 * 创建一个指向对象的引用变量的拷贝。由输出结果可以看出，它们的地址值是相同的，
 * 那么它们肯定是同一个对象。teacher和otherteacher的只是引用而已，
 * 他们都指向了一个相同的对象Teacher(“Taylor”,26)。 这就叫做引用拷贝。
 *
 * 对象拷贝
 *
 * 创建对象本身的一个副本。
 * 由输出结果可以看出，它们的地址是不同的，也就是说创建了新的对象，
 * 而不是把原对象的地址赋给了一个新的引用变量,这就叫做对象拷贝。
 *
 * 浅拷贝
 * （1）、定义
 *
 * 被复制对象的所有变量都含有与原来的对象相同的值，
 * 而所有的对其他对象的引用仍然指向原来的对象。
 * 即对象的浅拷贝会对“主”对象进行拷贝，但不会复制主对象里面的对象。
 * ”里面的对象“会在原来的对象和它的副本之间共享。
 *
 * 简而言之，浅拷贝仅仅复制所考虑的对象，而不复制它所引用的对象
 *
 */
public class ShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Teacher teacher = new Teacher();
        teacher.setName("riemann");
        teacher.setAge(27);

        Student2 student1 = new Student2();
        student1.setName("edgar");
        student1.setAge(18);
        student1.setTeacher(teacher);

        Student2 student2 = (Student2)student1.clone();
        System.out.println("拷贝后");
        System.out.println(student2.getName());
        System.out.println(student2.getAge());
        System.out.println(student2.getTeacher().getName());
        System.out.println(student2.getTeacher().getAge());

        System.out.println("修改老师的信息后-----------------");
        //修改老师的信息
        teacher.setName("Games");
        System.out.println(student1.getTeacher().getName());
        System.out.println(student2.getTeacher().getName());

        /**
         * 两个引用student1和student2指向不同的两个对象，
         * 两个引用student1和student2中的两个teacher引用指向的是两个对象，
         * 但对teacher对象的修改只能影响student1对象,所以说是深拷贝
         */
    }
}

class Teacher implements Cloneable{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Student2 implements Cloneable{
    private String name;
    private int age;
    private Teacher teacher;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public Object clone() throws  CloneNotSupportedException{
        Object object = super.clone();
        return object;
    }
}