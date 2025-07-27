import java.util.*;
public class HJ44 {

	HJ44(){
		Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int n=in.nextInt();
        in.nextLine();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        in.nextLine();
        int flag=in.nextInt();
        Arrays.sort(arr);
        if(flag==0){
            for(int i=0;i<n-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.print(arr[n-1]);
            return;
        }
        int[] rra=new int[n];
        int index=0;
        for(int i=n-1;i>=0;i--){
            rra[index++]=arr[i];
        }
        if(flag==1){
            for(int i=0;i<n-1;i++){
                System.out.print(rra[i]+" ");
            }
            System.out.print(rra[n-1]);
            return;
        }
	}
}
