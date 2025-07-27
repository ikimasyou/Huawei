import java.util.*;
public class HJ53 {

	HJ53(){
		Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int personNum=in.nextInt();in.nextLine();
        Map<String,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<personNum;i++){
            map.put(in.next(),0);
        }
        in.nextLine();
        int touhyouNum=in.nextInt();in.nextLine();
        int touhyou=0;
        while(in.hasNext()){
            String s=in.next();
            if(is(map,s)){
                touhyou++;
                map.put(s,map.get(s)+1);
            }
        }
        for(String s:map.keySet()){
            System.out.println(s+" : "+map.get(s));
        }
        System.out.print("Invalid : "+(touhyouNum-touhyou));
	}
	public static boolean is(Map<String,Integer> map,String s){
        for(String x:map.keySet()){
            if(x.equals(s)) return true;
        }
        return false;
    }
}
