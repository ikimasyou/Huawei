import java.util.*;
public class HJ12 {

	HJ12(){
		Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String[] str=in.nextLine().split("[^0-9]");
        int max=0;
        for(String s:str){
            if(max<s.length()) max=s.length();
        }
        for(String s:str){
            if(max==s.length()){
                System.out.print(s);
            }
        }
        System.out.print(","+max);
	}
}
