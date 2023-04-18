import java.util.Arrays;

public class ArrayReverse {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    int[] reversedArr = reverseArray(arr);
    System.out.println(Arrays.toString(reversedArr));
}
  public static int[] reverseArray(int[] arr) {
    int length = arr.length;
    int[] reversedArr = new int[length];

    for (int i = 0; i < length; i++) {
        reversedArr[length - i - 1] = arr[i];
    }

    return reversedArr;
}
}
