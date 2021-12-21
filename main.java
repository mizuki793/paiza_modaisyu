import java.util.*;

        //https://paiza.jp/works/mondai/prob60/substring_9
        //文字列を切り取る
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
//        System.out.println(first);
        int last = sc.nextInt();
//        System.out.println(last);
        sc.nextLine();
        String text = sc.nextLine();
        String result = text.substring(first-1,last);
        System.out.println(result);

    }
}
