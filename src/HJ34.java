import java.util.*;
public class HJ34 {

	HJ34(){
		Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String[] s=in.nextLine().split("[^A-Za-z]");
        String[] d=new String[s.length];
        int j=0;
        for(int i=s.length-1;i>=0;i--){
            d[j++]=s[i];
        }
        System.out.print(String.join(" ",d));
	}
}
