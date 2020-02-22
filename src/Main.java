import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList pairList = new ArrayList();

        System.out.println("Enter pair count");
        int input = in.nextInt();
        for (int i = 1; i <= input; i++) {
            ArrayList twoString = new ArrayList();
            System.out.println("Enter first string");
            String fs = in.next();
            System.out.println("Enter second string");
            String ss = in.next();
            twoString.add(fs);
            twoString.add(ss);
            pairList.add(twoString);
        }
        pairList.forEach(pair-> System.out.println(pair));



    }
}
