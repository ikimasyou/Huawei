import java.util.*;
public class HJ31 {

	HJ31(){
		Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String[] strArr=in.nextLine().split(";");
        int x=0;
        int y=0;
        for(String s:strArr){
            if(s.matches("[ADWS][0-9]{1,2}")){
                char c=s.charAt(0);
                int r=Integer.valueOf(s.substring(1,s.length()));
                switch(c){
                    case 'A':x-=r;break;
                    case 'D':x+=r;break;
                    case 'W':y+=r;break;
                    case 'S':y-=r;break;
                }
            }
        }
        System.out.print(x+","+y);
	}
}
