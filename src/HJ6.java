import java.util.*;
public class HJ6 {

	HJ6(){
		Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String str=in.nextLine();
        String[] strArr=str.split(" ");
        int l=0;
        int r=strArr.length-1;
        while(l<r){
            String temp=strArr[l];
            strArr[l]=strArr[r];
            strArr[r]=temp;
            l++;
            r--;
        }
        System.out.print(String.join(" ",strArr));
	}
}
