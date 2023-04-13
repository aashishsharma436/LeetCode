import java.util.*;

public class PascalsTriangle {
    public static void main(String[] args){
        System.out.println(generate(5));
        System.out.println(generate1(4));
    }

    public static List<List<Integer>> generate(int row){
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<>(List.of(1)));
        if (row == 1) return arr;
        arr.add(new ArrayList<>(List.of(1,1)));
        if (row == 2) return arr;
        for (int i=3;i<=row;i++){
            List<Integer> res = new ArrayList<>();
            for (int j=0;j<=arr.get(i-2).size();j++){
                if (j==0 || j==arr.get(i-2).size()) res.add(1);
                else res.add(arr.get(i-2).get(j-1)+arr.get(i-2).get(j));
            }
            arr.add(res);
        }
        return arr;
    }
    public static List<Integer> generate1(int row) {
        if (row == 0) return new ArrayList<>(List.of(1));
        List<Integer> curr = new ArrayList<>(List.of(1));
        List<Integer> prev = generate1(row-1);
        for (int i=1;i<row;i++) curr.add(prev.get(i)+prev.get(i-1));
        curr.add(1);
        return curr;
    }
}
