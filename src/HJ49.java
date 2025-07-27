import java.util.*;
public class HJ49 {

	HJ49(){
		Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int n=in.nextInt();in.nextLine();
        String s=in.nextLine();
        int location=1;
        int start=1;
        int end=Math.min(n,4);
        if(end<4){
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='U') location=(location-1-1+n)%n+1;
                else if(s.charAt(i)=='D') location=location%n+1;
            }
            for(int i=start;i<end;i++){
                System.out.print(i+" ");
            }
            System.out.println(end);
            System.out.print(location);
            return;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='U'){
                location=(location-1-1+n)%n+1;
            }else if(s.charAt(i)=='D'){
                location=location%n+1;
            }
            if(location>end){
                end=location;
                start=location-3;
            }else if(location<start){
                start=location;
                end=start+3;
            }
        }
        System.out.print(start+" ");System.out.print((start+1)+" ");
        System.out.print((start+2)+" ");System.out.println(end);
        System.out.print(location);
	}
}
