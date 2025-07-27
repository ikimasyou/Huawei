import java.util.*;
public class HJ15 {

	HJ15(){
		Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String line1=in.nextLine();
        String line2=in.nextLine();
        char[] ch1=line1.toCharArray();
        char[] ch2=line2.toCharArray();
        encode(ch1);
        decode(ch2);
	}
	public static void encode(char[] ch){
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='a'&&ch[i]<='z'){
                ch[i]=(char)((ch[i]-'a'+1)%26+'A');
            }else if(ch[i]>='A'&&ch[i]<='Z'){
                ch[i]=(char)((ch[i]-'A'+1)%26+'a');
            }else if(ch[i]>='0'&&ch[i]<='9'){
                ch[i]=(char)((ch[i]-'0'+1)%10+'0');
            }
        }
        System.out.println(new String(ch));
    }
    public static void decode(char[] ch){
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='a'&&ch[i]<='z'){
                if(ch[i]-1<'a') ch[i]='Z';
                else ch[i]=(char)((ch[i]-1-'a')%26+'A');
            }else if(ch[i]>='A'&&ch[i]<='Z'){
                if(ch[i]-1<'A') ch[i]='z';
                else ch[i]=(char)((ch[i]-1-'A')%26+'a');
            }else if(ch[i]>='0'&&ch[i]<='9'){
                if(ch[i]-1<'0') ch[i]='9';
                else ch[i]=(char)(ch[i]-1);
            }
        }
        System.out.println(new String(ch));
    }
}
