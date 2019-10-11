package org.zhuhui;

/**
 * 深拷贝
 * （1）、定义
 *
 * 深拷贝是一个整个独立的对象拷贝，深拷贝会拷贝所有的属性,并拷贝属性指向的动态分配的内存。
 * 当对象和它所引用的对象一起拷贝时即发生深拷贝。深拷贝相比于浅拷贝速度较慢并且花销较大。
 *
 * 简而言之，深拷贝把要复制的对象所引用的对象都复制了一遍。
 */
public class DeepCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Teacher2 teacher = new Teacher2();
        teacher.setName("riemin");
        teacher.setAge(27);

        Student3 student1 = new Student3();
        student1.setName("edgar");
        student1.setAge(18);
        student1.setTeacher(teacher);

        Student3 student2 = (Student3)student1.clone();
        System.out.println("拷贝后");
        System.out.println(student2.getName());
        System.out.println(student2.getAge());
        System.out.println(student2.getTeacher().getName());
        System.out.println(student2.getTeacher().getAge());

        System.out.println("修改老师的信息后----------------");
        //修改老师的信息
        teacher.setName("Games");
        System.out.println(student1.getTeacher().getName());
        System.out.println(student2.getTeacher().getName());
    }
}

class Teacher2 implements Cloneable{
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

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

class Student3 implements Cloneable{
    private String name;
    private int age;
    private Teacher2 teacher;

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

    public Teacher2 getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher2 teacher) {
        this.teacher = teacher;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        //浅复制时
        //Object object = super.clone();
        //return object;

        //改为深复制
        Student3 student = (Student3)super.clone();
        //本来是浅拷贝，现在将Teacher对复制一份并重新set进来
        student.setTeacher((Teacher2)student.getTeacher().clone());
        return student;
    }
}