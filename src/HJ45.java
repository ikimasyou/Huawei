import java.util.*;
public class HJ45 {

	HJ45(){
		Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int min=Integer.MAX_VALUE;
        while(in.hasNextInt()){
            int a=in.nextInt();
            if(min>a) min=a;
        }
        System.out.print(min);
	}
}
