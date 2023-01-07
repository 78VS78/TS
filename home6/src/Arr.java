import java.util.Arrays;

public class Arr {
    double[] ar;

    public Arr(double[] ar) {
        this.ar = ar;
    }

    //поиск максимального и минимального значения
    public void Min_max() {
        double max = ar[0];
        double min = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (max < ar[i]) {
                max = ar[i];
            }
            if (min > ar[i]) {
                min = ar[i];
            }
        }
        System.out.println("Max=" + max);
        System.out.println("Min=" + min);
    }

    // вывод четного и нечетного
    public void Chetn() {
        for (int i = 1; i < ar.length; i++) {
            if ((ar[i]) % 2 == 0) {
                System.out.print("Четн- " + ar[i] + ", ");
            }
            if ((ar[i]) % 2 != 0) {
                System.out.print("Не четн- " + ar[i] + ", ");
            }
        }
    }

    // Самое длинное и сам короткое
    public void Longes() {
        double max = ar[0];
        double min = ar[0];
        for (int i = 1; i < ar.length; i++) {
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
    }

    //Полидромы числа
    public void Longest() {
        for (int j = 0; j < ar.length; j++) {
            String s = Double.toString(ar[j]);
            String result = "";
            for (int i = 0; i < s.length(); i++) {
                result = s.charAt(i) + result;
            }
            if (s.equals(result)) {
                System.out.println("Полиндромы :" + s);
            }
        }
    }

    public void Puzir() {
        //Пузырек
        double max;
        for (int j = 0; j < ar.length; j++) {

            for (int i = 0; i < ar.length - 1; i++) {
                if (ar[i] > ar[i + 1]) {
                    {
                        max = ar[i];
                        ar[i] = ar[i + 1];
                        ar[i + 1] = max;
                    }

                }
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(ar));
    }
}