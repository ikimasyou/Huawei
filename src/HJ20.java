import java.util.*;
public class HJ20 {

	HJ20(){
		Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int n=in.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=in.next();
        }
        String search=in.next();
        int index=in.nextInt();
        List<String> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(!arr[i].equals(search)&&isBro(search,arr[i])) list.add(arr[i]);
        }
        Collections.sort(list);
        System.out.println(list.size());
        if(index<=list.size()&&index>0) System.out.print(list.get(index-1));
	}
	public static boolean isBro(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return new String(ch1).equals(new String(ch2));
    }
}
