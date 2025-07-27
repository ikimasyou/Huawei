import java.util.*;
public class HJ42 {

	HJ42(){
		Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int n1=in.nextInt();
        in.nextLine();
        int n2=in.nextInt();
        System.out.println(get1(n1));
        System.out.println(get1(n2));
	}
	public static int get1(int n){
        int res=0;
        for(int i=0;i<32;i++){
            if((n&1)==1) res++;
            n=n>>>1;
        }
        return res;
    }
}
