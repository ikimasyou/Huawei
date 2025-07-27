import java.util.*;
public class HJ51 {

	HJ51(){
		Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int year=in.nextInt();
        int month=in.nextInt();
        int day=in.nextInt();
        int[] m={31,28,31,30,31,30,31,31,30,31,30,31};
        if(year%4==0&&year%100!=0||year%400==0) m[1]=29;
        System.out.print(days(m,month-1)+day);
	}
	public static int days(int[] m,int n){
        int res=0;
        for(int i=0;i<n;i++){
            res+=m[i];
        }
        return res;
    } 
}
