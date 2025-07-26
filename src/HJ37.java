import java.util.*;
public class HJ37 {

	HJ37(){
		Scanner in = new Scanner(System.in);
	    // 注意 hasNext 和 hasNextLine 的区别
	    int n=in.nextInt();
	    float route=(float)n;
	    float h=route;
	    for(int i=0;i<4;i++){
	        h/=2;
	        route+=h*2;
	    }
	    h/=2;
	    System.out.println(route);
	    System.out.print(h);
	}
}
