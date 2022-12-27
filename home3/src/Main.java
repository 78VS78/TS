
public class Main {
    public static void main(String[] args){
    double[] ar={-56,567,23,1,0,12,17,22,19999,78};
    double max,min;
    int i;
           //поиск максимального и минимального значения
            max=ar[0];
            min=ar[0];
            for(i=1;i<ar.length;i++)
            {   if (max < ar[i]) {
                    max = ar[i];
                }
                if (min > ar[i]) {
                    min = ar[i];
                }
            }
            System.out.println("Max="+max);
            System.out.println("Min="+min);
// вывод четного и нечетного
            for(i=1;i<ar.length;i++){
                if ((ar[i])%2==0) {
                 System.out.print("Четн- "+ar[i]+", ");
                }
                if ((ar[i])%2!=0) {
                 System.out.print("Не четн- "+ar[i]+", ");
                }
            }
// Самое длинное и сам короткое
            max=ar[0];
            min=ar[0];
            for(i=1;i<ar.length;i++)  {
              if (Double.toString(Math.abs(max)).length() < Double.toString(Math.abs(ar[i])).length()) {
                  max = ar[i];
              }
              if (Double.toString(Math.abs(min)).length() > Double.toString(Math.abs(ar[i])).length()) {
                  min = ar[i];
              }
            //if (Double.toString(Math.abs(min)) > (Double.toString(Math.abs(ar[i])))) {
              //  min = ar[i];
            //}
            }
            System.out.println();
            System.out.println("Длинное="+max);
            System.out.println("Короткое="+min);
//Полидромы числа
        //public static boolean pali(String testMe){
        //    StringBuilder sb = new StringBuilder(testMe);
        //    return testMe.equals(sb.reverse().toString());
        //}

    }
}
