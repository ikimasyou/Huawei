import java.util.*;
public class HJ13 {

	HJ13(){
		Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String str=in.nextLine();
        char[] ch=str.toCharArray();
        for(char c:ch){
            if(str.length()-str.replaceAll(String.valueOf(c),"").length()==1){
                System.out.print(c);
                return;
            }
        }
        System.out.print(-1);
	}
}
