import java.util.*;
public class HJ5 {

	HJ5(){
		Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        StringBuilder strb=new StringBuilder(in.nextLine());
        strb.reverse();
        System.out.print(strb.toString());
	}
}
