import java.util.*;
public class HJ43 {

	HJ43(){
		Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String str=in.nextLine();
        String[] arr=str.split(",");
        System.out.print(Long.parseLong(arr[3])-Long.parseLong(arr[1])-1);
	}
}
