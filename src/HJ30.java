import java.util.*;
public class HJ30 {

	HJ30(){
		Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        float f=in.nextFloat();
        if(f-(int)f>=0.5) System.out.print((int)f+1);
        else System.out.print((int)f);
	}
}
