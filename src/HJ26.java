import java.util.*;
public class HJ26 {

	HJ26(){
		Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        if(n==0){
            System.out.print(0);
            return;
        }
        while(n>0){
            System.out.print(n%10);
            n/=10;
        }
	}
}
