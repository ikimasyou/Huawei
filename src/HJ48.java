import java.util.*;
public class HJ48 {

	HJ48(){
		Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int size=in.nextInt();
        int end=in.nextInt();in.nextLine();
        int[] arr=new int[size];
        int i=0;
        while(in.hasNextInt()){
            arr[i++]=in.nextInt();
        }
        Arrays.sort(arr);
        for(int s=0;s<end-1;s++){
            System.out.print(arr[s]+" ");
        }
        System.out.print(arr[end-1]);
	}
}
