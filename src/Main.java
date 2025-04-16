// 按两次 Shift 打开“随处搜索”对话框并输入 `show whitespaces`，
// 然后按 Enter 键。现在，您可以在代码中看到空格字符。
public class Main {
    public static void main(String[] args) {
        // 当文本光标位于高亮显示的文本处时按 Alt+Enter，
        // 可查看 IntelliJ IDEA 对于如何修正该问题的建议。
        System.out.printf("Hello and welcome!");
        System.out.println("Hello GitHub!");
        int a = 5;
        int b = 10;
        int c = a + b;
        System.out.println("The sum of a and b is: " + c);
        // 按 Shift+F10 或点击间距中的绿色箭头按钮以运行脚本。

        if(a > b) {
            System.out.println("a is greater than b");
        } else if (a < b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("a is equal to b");
        }

    }
}