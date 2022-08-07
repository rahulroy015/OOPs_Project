
public class LargestNum {

    public static String largestNumber(int[] nums) {
        int n = nums.length;
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        for (int i = 0; i < n - 1; i++) {

            int min = i;
            for (int j = i + 1; j < n; j++) {

                String str1 = arr[min] + arr[j];
                String str2 = arr[j] + arr[min];
                if (str2.compareTo(str1) > 0) {
                    min = j;
                }
            }
            String str = arr[i];
            arr[i] = arr[min];
            arr[min] = str;
        }

        if (arr[0].charAt(0) == '0') {
            return "0";
        }

        String res = "";
        for (int i = 0; i < n; i++) {
            res += arr[i];
        }

        return res;

    }

    public static void main(String[] args) {
        int[] nums = { 2, 56, 30 };
        System.out.println(largestNumber(nums));
    }
}
