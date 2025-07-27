import java.util.*;
public class HJ39 {

	HJ39(){
		Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int n=in.nextInt();in.nextLine();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int b0=0;
        int sum=0;
        int sn=0;
        for(int ns:arr){
            if(ns<0) b0++;
            else if(ns>0){
                sum+=ns;
                sn++;
            }
        }
        System.out.print(b0+" ");
        if(sn==0){
            System.out.print(0);
        }else{
            System.out.printf("%.11f",(double)sum/sn);
        }
	}
}
