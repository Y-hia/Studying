package d1_stringbuilder;

public class StringBuilderDemo3 {
    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(printArr(arr));
    }

    private static String printArr(int[] arr) {
        if (arr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            int data = arr[i];
            sb.append(data).append(i == arr.length - 1 ? "" : ",");
        }
        sb.append("]");
        return sb.toString();
    }
}
