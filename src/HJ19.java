import java.util.*;
public class HJ19 {

	HJ19(){
		Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String str=in.nextLine();
        char[] arr=str.toCharArray();
        List<Character> list =new ArrayList<>();
        for(char c:arr){
            if(Character.isLetter(c)){
                list.add(c);
            }
        }
        list.sort(new Comparator<Character>(){
            public int compare(Character c1,Character c2){
                return Character.toLowerCase(c1)-Character.toLowerCase(c2);
            }
        });
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(Character.isLetter(arr[i])) arr[i]=list.get(index++);
        }
        System.out.print(new String(arr));
	}
}
