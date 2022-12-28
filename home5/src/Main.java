import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        //Инициализация массива числами от 0 до 100
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 101);

            }
        }
        System.out.println(Arrays.deepToString(arr));
//Инициализация массива числами треугольник
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i < j) {
                    arr[i][j] = 0;
                } else
                    arr[i][j] = 1;
            }


        }
        System.out.println(Arrays.deepToString(arr));
//красивый вывод
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i < j) {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = 1;
                    System.out.print(arr[i][j]);
                }
            }
            System.out.println();

        }

    }
}


