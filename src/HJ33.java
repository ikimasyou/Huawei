import java.util.*;
public class HJ33 {

	HJ33(){
		Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        char[] ch=in.nextLine().toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]<='z'&&ch[i]>='a'){
                if(ch[i]=='a'||ch[i]=='b'||ch[i]=='c'){
                    ch[i]='2';
                }
                if(ch[i]=='d'||ch[i]=='e'||ch[i]=='f'){
                    ch[i]='3';
                }
                if(ch[i]=='g'||ch[i]=='h'||ch[i]=='i'){
                    ch[i]='4';
                }
                if(ch[i]=='j'||ch[i]=='k'||ch[i]=='l'){
                    ch[i]='5';
                }
                if(ch[i]=='m'||ch[i]=='n'||ch[i]=='o'){
                    ch[i]='6';
                }
                if(ch[i]=='p'||ch[i]=='q'||ch[i]=='r'||ch[i]=='s'){
                    ch[i]='7';
                }
                if(ch[i]=='t'||ch[i]=='u'||ch[i]=='v'){
                    ch[i]='8';
                }
                if(ch[i]=='w'||ch[i]=='x'||ch[i]=='y'||ch[i]=='z'){
                    ch[i]='9';
                }
            }else if(ch[i]>='A'&&ch[i]<='Z'){
                ch[i]=(char)((ch[i]-'A'+1)%26+'a');
            }
        }
        System.out.print(new String(ch));
	}
}
