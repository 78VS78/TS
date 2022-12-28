import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] ar = {-56, 567, 23, 1, 0, 121.121, 17, 22.555555555555, 19999, 78};
        double max, min;
        int i, j;
        String s, result;
        //поиск максимального и минимального значения
        max = ar[0];
        min = ar[0];
        for (i = 1; i < ar.length; i++) {
            if (max < ar[i]) {
                max = ar[i];
            }
            if (min > ar[i]) {
                min = ar[i];
            }
        }
        System.out.println("Max=" + max);
        System.out.println("Min=" + min);
// вывод четного и нечетного
        for (i = 1; i < ar.length; i++) {
            if ((ar[i]) % 2 == 0) {
                System.out.print("Четн- " + ar[i] + ", ");
            }
            if ((ar[i]) % 2 != 0) {
                System.out.print("Не четн- " + ar[i] + ", ");
            }
        }
// Самое длинное и сам короткое
        max = ar[0];
        min = ar[0];
        for (i = 1; i < ar.length; i++) {
            if (Double.toString(Math.abs(max)).length() < Double.toString(Math.abs(ar[i])).length()) {
                max = ar[i];
            }
            if (Double.toString(Math.abs(min)).length() > Double.toString(Math.abs(ar[i])).length()) {
                min = ar[i];
            }

        }
        System.out.println();
        System.out.println("Длинное=" + max);
        System.out.println("Короткое=" + min);

//Полидромы числа
        for (j = 0; j < ar.length; j++) {
            s = Double.toString(ar[j]);
            result = "";
            for (i = 0; i < s.length(); i++) {
                result = s.charAt(i) + result;
            }

            if (s.equals(result)) {
                System.out.println("Полиндромы :" + s);
            }
        }
//Пузырек
        for (j = 0; j < ar.length; j++) {

            for (i = 0; i < ar.length - 1; i++) {
                if (ar[i] > ar[i + 1]) {
                    {
                        max = ar[i];
                        ar[i] = ar[i + 1];
                        ar[i + 1] = max;
                    }

                }
            }
        }

        System.out.println(Arrays.toString(ar));
    }
}