import java.util.*;
public class HJ4 {

	HJ4(){
		Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        char[] ch=in.nextLine().toCharArray();
        BitSet set=new BitSet();
        for(char c:ch){
            set.set(c);
        }
        System.out.print(set.cardinality());
	}
}
