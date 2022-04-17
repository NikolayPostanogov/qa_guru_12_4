package guru.qa;

public class FirstApp {
    public static void main(String[] args) {
        char symbol = 'w'; //one symbol
        char[] array = new char[]{'w', 'a', 's'};
        char[][] array2 = new char[][]{{'w', 'a', 's'}, {'s', 'a', 'w'}};
        boolean flag = false; // true/false
        byte aByte;
        short aShort = 1;
        int aInt = 1;
        Integer boxed = 1;
        long aLong = 1L;
        float aFloat;
        double aDouble = 1.2;

        String aString = "Hello, world!";

        aByte = 127;
        System.out.println("Начальное значение: " + aByte);
        aByte++;
        System.out.println("Переполнение max: " + aByte);
        aByte--;
        System.out.println("Переполнение min: " + aByte);

        int a = 5, b = 3;
        System.out.println("a= " + a + ", b= " + b);
        System.out.println("Сложение: " + (a + b));
        System.out.println("Вычитание: " + (a - b));
        System.out.println("Умножение: " + (a * b));
        System.out.println("Деление(целочисленное): " + (a / b));
        System.out.println("Остаток от деления: " + (a % b));

        if (a > b && a < aByte){
            System.out.println("well0");
        }
        if (a<b || a<aByte){
            System.out.println("well1");
        }
        if (!(a<b)){
            System.out.println("well3");
        }

        short as = 5;
        long al = 5L;
        System.out.println("Сложение short и long: " + (as+al));
    }
}