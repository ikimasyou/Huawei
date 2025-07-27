import java.util.*;
public class HJ50 {

	HJ50(){
		Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int length = in.nextInt();
        in.nextLine();
        int flag = in.nextInt();
        in.nextLine();
        Node[] list = new Node[length];
        for (int i = 0; i < length; i++) {
            String[] arr = in.nextLine().split(" ");
            list[i] = new Node(arr[0], Integer.parseInt(arr[1]));
        }
        if(flag==0) flag0(list);
        if(flag==1) flag1(list);
	}
	public static void flag0(Node[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length - i - 1; j++) {
                if (list[j].getGrade() < list[j+1].getGrade()) {
                    Node temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        for (Node node : list) {
            System.out.println(node.getName() + " " + node.getGrade());
        }
    }
    public static void flag1(Node[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length - i - 1; j++) {
                if (list[j].getGrade() > list[j+1].getGrade()) {
                    Node temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        for (Node node : list) {
            System.out.println(node.getName() + " " + node.getGrade());
        }
    }
}

class Node {
    private String name;
    private int grade;
    Node(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
    public String getName() {
        return name;
    }
    public int getGrade() {
        return grade;
    }
}