import java.util.*;
public class HJ16 {

	HJ16(){
		Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String str=in.nextLine();
        int max=0;
        for(int i=0;i<str.length();i++){
            for(int j=i;j<=str.length();j++){
                if(is(str.substring(i,j))&&str.substring(i,j).length()>max)
                max=str.substring(i,j).length();
            }
        }
        System.out.print(max);
	}
	public static boolean is(String s){
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}
