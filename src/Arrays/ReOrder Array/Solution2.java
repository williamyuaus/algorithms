

public class Solution2 {
    public int[] reOrderArray(int[] array) {
        int j = 0;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] % 2 == 1) {
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
                j = i + 1;
            }
        }
        return array;
    }
    
}
