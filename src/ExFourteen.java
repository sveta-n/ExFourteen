import java.util.Arrays;

public class ExFourteen {
    public static void main(String[] args) {
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++){
            array[i] = ((int) (Math.random() * 41) - 20);
        }
        System.out.println(Arrays.toString(array));

        int maxNum = array[0];
        int minNum = array[0];

        for (int j : array){
            if (j > maxNum)
                maxNum = j;

            if (j < minNum)
                minNum = j;
        }
        System.out.println("max = " + maxNum);
        System.out.println("min = " + minNum);

        int abs1 = maxNum, abs2 = minNum;
        int result1 = Math.abs(abs1);
        int result2 = Math.abs(abs2);


        int resultAbs = Math.max(result1, result2);
        System.out.println("наибольшее по модулю = " + resultAbs);
    }
}