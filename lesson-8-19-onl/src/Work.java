import java.util.Scanner;

public class Work {

    public boolean working() {
        boolean t=true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Хотите продолжить: y - Да, n - Нет");
        String next = scanner.next();
        switch (next) {
            case "n":
                t=false;
                return t;
            case "y":
                t=true;
                return t;

        }
        t=false;
        return t;
    }

}

