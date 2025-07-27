import java.util.*;
public class HJ11 {

	HJ11(){
		Scanner in = new Scanner(System.in);
        String str=in.nextLine();
        System.out.print(str.length()-str.replaceAll("[A-Z]","").length());
	}
}
