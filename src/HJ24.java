import java.util.*;
public class HJ24 {

	HJ24(){
		Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String str=in.nextLine();
        int n=in.nextInt();
        List<String> list=new ArrayList<>();
        for(int i=0;i<=str.length()-n;i++){
            list.add(str.substring(i,i+n));
        }
        float max=0;
        for(String sl:list){
            if(max<m(sl)) max=m(sl);
        }
        for(String sl:list){
            if(max==m(sl)){
                System.out.print(sl);
                return;
            }
        }
	}
	public static float m(String s){
        return (float)(s.length()-s.replaceAll("G|C","").length())/s.length();
    }
}
