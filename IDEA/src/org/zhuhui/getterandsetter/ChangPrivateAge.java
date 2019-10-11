package org.zhuhui.getterandsetter;


/**
 * 外部代码必须调用getter getNumber()和setter， setNumber()以读取或更新变量，
 * Setter是一种更新变量值的方法。Getter是一种读取变量值的方法。
 * Getter和setter 在Java 中也称为访问器和更改器。
 *
 *
 * Java 中的 getter 和 setter 看起来很简单，但是如果天真地实现，可能会变得很危险。它甚至可能是导致您的代码行为异常的问题的根源。或更糟糕的是，可以通过隐式操纵获取器和设置器的参数并从中获取对象来轻易地利用您的程序。因此，请小心并考虑实施上述最佳实践
 *
 */
public class ChangPrivateAge {
    public static void main(String[] args){
        SimpleGetterAndSetter obj = new SimpleGetterAndSetter();
        obj.setAge(18);
        int num = obj.getAge();

    }
}

