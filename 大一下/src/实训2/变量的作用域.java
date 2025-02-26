package 实训2;
public class 变量的作用域 {
    public static void main(String[] args) {
        int x=1;
        System.out.println("main："+"x="+x);
        {int y=1;System.out.println("第一层："+"\n"+"x="+x+"\n"+"y="+y);
            /* System.out.println("z="+z);
               变量z在第一层中不存在，无法输出结果 */
            {int z=1;System.out.println("第二层："+"\n"+"x="+x+"\n"+"z="+z);}
        }
    }
}
