import java.util.*;
public class HJ21 {

	HJ21(){
		Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String line1=in.nextLine();
        String line2=in.nextLine();
        String shortLine,longLine;
        if(line1.length()>line2.length()){
            shortLine=line2;
            longLine=line1;
        }else{
            shortLine=line1;
            longLine=line2;
        }
        List<String> list=new ArrayList<>();
        for(int i=0;i<shortLine.length();i++){
            for(int j=i+1;j<=shortLine.length();j++){
                if(is(shortLine.substring(i,j),longLine)) list.add(shortLine.substring(i,j));
            }
        }
        int max=0;
        for(String s:list){
            if(s.length()>max) max=s.length();
        }
        for(String s:list){
            if(s.length()==max){
                System.out.print(s);
                return;
            }
        }
	}
	public static boolean is(String s1,String s2){
        return s2.contains(s1);
    }
}
