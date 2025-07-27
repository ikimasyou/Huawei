import java.util.*;
public class HJ32 {

	HJ32(){
		Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while(in.hasNextLine()){
            if(isOk(in.nextLine())) System.out.println("OK");
            else System.out.println("NG");
        }
	}
	public static boolean isOk(String s){
        if(s.length()<8) return false;
        int charaNum=0;
        if(s.matches(".*[A-Z].*")) charaNum++;
        if(s.matches(".*[a-z].*")) charaNum++;
        if(s.matches(".*[0-9].*")) charaNum++;
        if(s.matches(".*[^A-Za-z0-9].*")) charaNum++;
        if(charaNum<3) return false;
        for(int i=0;i<s.length()-2;i++){
            for(int j=i+3;j<=s.length();j++){
                if(s.substring(j).contains(s.substring(i,j))) return false;
            }
        }
        return true;
    }
}
