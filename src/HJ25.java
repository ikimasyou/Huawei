import java.util.*;
public class HJ25 {

	HJ25(){
		Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String str=in.nextLine();
        List<String> list=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                if(is(str.substring(i,j))) list.add(str.substring(i,j));
            }
        }
        int max=0;
        for(String s:list){
            if(max<s.length()) max=s.length();
        }
        System.out.print(max);
	}
	public static boolean is(String s){
        int l=0;
        int r=s.length()-1;
        while(l<=s.length()&&r>=0&&s.charAt(l)==s.charAt(r)){
            l++;
            r--;
        }
        if(r+1==0) return true;
        return false;
    }
}
