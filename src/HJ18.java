import java.util.*;
public class HJ18 {

	HJ18(){
		Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        char[] ch=in.nextLine().toCharArray();
        Arrays.sort(ch);
        System.out.print(new String(ch));
	}
}
