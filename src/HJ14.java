import java.util.*;
public class HJ14 {

	HJ14(){
		Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int n=in.nextInt();
        in.nextLine();
        String[] strArr=new String[n];
        for(int i=0;i<n;i++){
            strArr[i]=in.nextLine();
        }
        Arrays.sort(strArr);
        for(String s:strArr){
            System.out.println(s);
        }
	}
}
