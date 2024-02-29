public class Silly
{
    public static int median(int[] arr)
    {
        return arr[arr.length/2];
    }
    public static int range(int[] arr)
    {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max-min;
    }
}