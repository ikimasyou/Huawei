import java.util.Scanner;
public class HJ9 {

	HJ9(){
		Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        System.out.print(in.nextLine().substring(0,in.nextInt()));
	}
}
