import java.util.*;
public class HJ7 {

	HJ7(){
		Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String str=in.nextLine();
        char[] ch=str.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:ch){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int min=Integer.MAX_VALUE;
        for(char c:map.keySet()){
            if(map.get(c)<min) min=map.get(c);
        }
        for(char c:map.keySet()){
            if(map.get(c)==min) str=str.replaceAll(String.valueOf(c),"");
        }
        System.out.print(str);
	}
}
