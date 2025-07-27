import java.util.*;
public class HJ28 {

	HJ28(){
		Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int n=in.nextInt();
        int res=0;
        for(int i=0;i<32;i++){
            if((n&1)==1) res++;
            n=n>>>1;
        }
        System.out.print(res);
	}
}
