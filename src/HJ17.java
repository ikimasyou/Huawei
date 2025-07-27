import java.util.*;
public class HJ17 {

	HJ17(){
		Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        String t=in.nextLine();
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        for(char c:set){
            if(!t.contains(String.valueOf(c))){
                System.out.print(false);
                return;
            }
        }
        System.out.print(true);
	}
}
