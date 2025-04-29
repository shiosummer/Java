package 实训10_JavaAPI的使用和异常;

import java.io.IOException;

public class Runtime_打开记事本 {
    public static void main(String[] args) throws IOException, InterruptedException {
        try {
            Runtime runtime = Runtime.getRuntime();
            Process process = runtime.exec("notepad.exe");
            Thread.sleep(3000);
            runtime.exec("taskkill /F /IM notepad.exe");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

