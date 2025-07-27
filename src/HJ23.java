import java.util.*;
public class HJ23 {

	HJ23(){
		Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int n=in.nextInt();
        in.nextLine();
        String[] strArr=new String[n];
        for(int i=0;i<n;i++){
            strArr[i]=in.nextLine();
        }
        for(String s:strArr){
            System.out.println(beau(s));
        }
	}
	public static int beau(String s){
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int[] arr=map.values().stream().mapToInt(x -> x.intValue()).toArray();
        Arrays.sort(arr);
        int sum=0;
        int add=26;
        for(int i=arr.length-1;i>=0;i--){
            sum+=arr[i]*add--;
        }
        return sum;
    }
}
