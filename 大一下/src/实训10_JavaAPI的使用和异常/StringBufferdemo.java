package 实训10_JavaAPI的使用和异常;

public class StringBufferdemo {
    public static void main(String[] args) {
        String original = "青春是一一次远行，回不去了；是一次相逢，忘不掉了。青春是一次伤痛，来不及了。";
        System.out.println(original);
        System.out.println("插入青春两字后:");

        StringBuffer sb = new StringBuffer(original);

        // 1. 插入"青春"两字
        int insertIndex = sb.indexOf("；") + 1;
        sb.insert(insertIndex, "青春");
        System.out.println(sb.toString());
        System.out.println("删除一字后");

        // 2. 删除"一"字
        int deleteIndex = sb.indexOf("是一一次") + 1;
        sb.delete(deleteIndex, deleteIndex + 1);
        System.out.println(sb.toString());
        System.out.println("替换后");

        // 3. 替换"次"为"场"
        int startIndex = 0;
        while ((startIndex = sb.indexOf("次", startIndex)) != -1) {
            sb.replace(startIndex, startIndex + 1, "场");
            startIndex += 1;
        }
        System.out.println(sb.toString());
    }
}