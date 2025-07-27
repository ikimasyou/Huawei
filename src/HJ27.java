import java.util.*;
public class HJ27 {

	HJ27(){
		Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String str=in.nextLine();
        LinkedHashSet<Character> set=new LinkedHashSet<>();
        for(int i=str.length()-1;i>=0;i--){
            set.add(str.charAt(i));
        }
        for(char c:set){
            System.out.print(c);
        }
	}
}
