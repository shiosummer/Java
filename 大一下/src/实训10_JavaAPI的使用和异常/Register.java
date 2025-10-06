package 实训10_JavaAPI的使用和异常;

import java.util.Scanner;

public class Register {
    private String username;
    private String password;
    private String confirmPassword;

    public Register(String username, String password, String confirmPassword) {
        this.username = username;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public void verify(){
        if(username.length()<3){
            Scanner sc = new Scanner(System.in);
            System.out.print("用户名不能少于3位！\n请重新输入用户名:");
            String username = sc.nextLine();
            Register reg = new Register(username,password,confirmPassword);
            reg.verify();
            return;
        }
        if(password.length()<6){
            Scanner sc = new Scanner(System.in);
            System.out.print("密码不能少于6位！\n请重新输入密码:");
            String password = sc.nextLine();
            System.out.print("请确认密码:");
            String confirmPassword = sc.nextLine();
            Register reg = new Register(username,password,confirmPassword);
            reg.verify();
            return;
        }
        if(!password.equals(confirmPassword)){
            Scanner sc = new Scanner(System.in);
            System.out.print("两次输入的密码必须相同！\n请重新输入密码:");
            String confirmPassword = sc.nextLine();
            Register reg = new Register(username,password,confirmPassword);
            reg.verify();
            return;
        }

        System.out.println("注册成功，请牢记用户名:"+username+"和密码:"+password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}

class RegisterTest{
    public static void main(String[] args) {
        System.out.println("***欢迎进入注册系统***");
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入用户名:");
        String username = sc.next();
        System.out.print("请输入密码:");
        String password = sc.next();
        System.out.print("请确认密码:");
        String confirmPassword = sc.next();
        Register reg = new Register(username,password,confirmPassword);
        reg.verify();
    }
}
