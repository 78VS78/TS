import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String str;
        int max_val, min_val,a,b,i;
        boolean z=true;

        Scanner sc = new Scanner(System.in);
        System.out.println("введи число");
        if (sc.hasNextDouble()) {
            double val_d = sc.nextDouble();
            long val_i = (long) val_d;

            if (val_i < 0) {
                char znak = '-';
                val_i = -1 * val_i;
            }
            str = Long.toString(val_i);
            int l = str.length();
            System.out.println("Число наоборот -");
            max_val = Character.getNumericValue(str.charAt(0));
            min_val = Character.getNumericValue(str.charAt(0));
            while (l > 0) {
                if (max_val < Character.getNumericValue(str.charAt(l - 1))) {
                    max_val = Character.getNumericValue(str.charAt(l - 1));
                }
                if (min_val > Character.getNumericValue(str.charAt(l - 1))) {
                    min_val = Character.getNumericValue(str.charAt(l - 1));
                }
                System.out.print(str.charAt(l - 1));
                l--;
            }

            for ( i=0;i<=(str.length()-1);i++) {
                if (z) {
                    for (int j = i + 1; j <=(str.length() - 1); j++) {
                        if (Character.getNumericValue(str.charAt(i)) == (Character.getNumericValue(str.charAt(j)))) {
                            z = false;
                            break;
                        } else {
                            z = true;

                        }
                    }
                }
                else break;
            }

            System.out.println();
            if (z) System.out.println(z);
            System.out.println("Максимальная цифра " + max_val);
            System.out.println("Минимальная  цифра " + min_val);
            l = str.length();
            System.out.println("Последовательность по убыванию: ");
            for (i = 0; i <= l-2 ; i++) {
                a = Character.getNumericValue(str.charAt(i));
                b = Character.getNumericValue(str.charAt(i+1));
                if ((a+1==b)){
                System.out.print(a+""+ b);
                i++;
                }
            }


        }
        else {
            System.out.println("не число");
            return;
        }


    }
}
