package 实训1_第一个Java程序_入门;
public class 常量输出 {
public static void main(String[] args) {
	System.out.println(101);
	System.out.println(0101);
	System.out.println(0b101);
	System.out.println(0x101);
	System.out.println(10.1);
	System.out.println('A');
	System.out.println('\n');
	System.out.println("hello\nworld!");
	System.out.println(true);
	System.out.println(false);
	//这是一个单行注释
	//null无法直接用System.out.println(null)进行输出
	/*这是一个多行注释
	null无法直接用System.out.println(null)进行输出*/
	Object a = null;
	String b = null;
	System.out.println(a);
	System.out.println(b);
}
}
