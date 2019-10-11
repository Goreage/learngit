package org.zhuhui.throwandthrows;

/**
 * 四、throw与throws的比较
 *
 * throws出现在方法函数头；而throw出现在函数体。
 * throws表示出现异常的一种可能性，并不一定会发生这些异常；throw则是抛出了异常，执行throw则一定抛出了某种异常对象。
 * 两者都是消极处理异常的方式（这里的消极并不是说这种方式不好），只是抛出或者可能抛出异常，但是不会由函数去处理异常，真正的处理异常由函数的上层调用处理。
 *
 *
 * 五、编程习惯：
 *
 * 在写程序时，对可能会出现异常的部分通常要用try{…}catch{…}去捕捉它并对它进行处理；
 * 用try{…}catch{…}捕捉了异常之后一定要对在catch{…}中对其进行处理，那怕是最简单的一句输出语句，或栈输入e.printStackTrace();用try{…}catch{…}捕捉了异常之后一定要对在catch{…}中对其进行处理，那怕是最简单的一句输出语句，或栈输入e.printStackTrace();
 * 如果是捕捉IO输入输出流中的异常，一定要在try{…}catch{…}后加finally{…}把输入输出流关闭；如果是捕捉IO输入输出流中的异常，一定要在try{…}catch{…}后加finally{…}把输入输出流关闭；
 * 如果在函数体内用throw抛出了某种异常，最好要在函数名中加throws抛异常声明，然后交给调用它的上层函数进行处理。如果在函数体内用throw抛出了某种异常，最好要在函数名中加throws抛异常声明，然后交给调用它的上层函数进行处理。
 *
 *
 */
public class UpClassCatchThrows {
    public static void function() throws NumberFormatException{
        String  s = "abc";
        System.out.println(Double.parseDouble(s));
    }

    public static void main(String[] args){
        try{
            function();
        }catch(NumberFormatException e){
            System.err.println("非数据类型不能强制类型转换");
            //e.printStackTrace();
        }
    }
}
