import java.util.*;
public class HJ8 {

	HJ8(){
		Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String str=in.nextLine();
        int eNum=str.length()-str.replaceAll("[A-Za-z]","").length();
        int knum=str.length()-str.replaceAll(" ","").length();
        int num=str.length()-str.replaceAll("[0-9]","").length();
        int onum=str.length()-eNum-knum-num;
        System.out.println(eNum);
        System.out.println(knum);
        System.out.println(num);
        System.out.println(onum);
	}
}
