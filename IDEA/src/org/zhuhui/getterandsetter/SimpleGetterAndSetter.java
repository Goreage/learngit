package org.zhuhui.getterandsetter;

/**
 * @date 2019 - 10 -7
 * what is getter and settter
 * 在Java中，getter和setter是两种常规方法，用于检索和更新变量的值。
 *
 */
public class SimpleGetterAndSetter {
    private int age;
    private int salar;

    public int getSalar() {
        return salar;
    }

    /**
     * 通过使用getter和setter，程序员可以控制如何以适当的方式访问和更新其重要变量，
     * 例如在指定范围内更改变量的值。考虑以下setter方法的代码：
     * @param salar
     */
    public void setSalar(int salar) {
        if(salar < 3000 || salar > 300000){
            throw new IllegalArgumentException();
        }
        this.salar = salar;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
