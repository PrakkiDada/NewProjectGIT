import java.util.*;

public class ArrayListExam {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = s.nextInt();
        for (int i = 0; i < n; i++)
            list.add(s.nextInt());
        reverseArrayList(list);
        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
    }

    // Method to reverse the ArrayList
    static void reverseArrayList(ArrayList<Integer> list) {
        ArrayList<Integer> listCopy = new ArrayList<Integer>();
        int k = list.size() - 1;
        for (int i = 0; i < list.size() ; i++) {
            listCopy.add(i, list.get(k));
            k--;
        }
       list.clear();
        for (int i = 0; i < listCopy.size() ; i++) {
            list.add(i, listCopy.get(i));

        }
    }
}