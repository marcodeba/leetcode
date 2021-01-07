package offer;

public class Tools {
    public static void printArrays(int[] levelOrder) {
        for (int i = 0; i < levelOrder.length; i++) {
            if (i == levelOrder.length - 1) {
                System.out.print(levelOrder[i]);
            } else {
                System.out.print(levelOrder[i] + ", ");
            }
        }
    }
}
