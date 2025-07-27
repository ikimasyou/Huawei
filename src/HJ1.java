import java.util.Scanner;

public class HJ1 {
	HJ1(){
		Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String str=in.nextLine();
        String[] strArr=str.split(" ");
        System.out.print(strArr[strArr.length-1].length());
	}
}
