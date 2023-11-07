import java.util.Scanner;

public class Main {
    static double a = 0;
    static double b = 0;

    public static void main(String[] args) {
        //todo Вам нужно дополнить методы так, чтобы получился рабочий калькулятор
        a = inputDouble();
        b = inputDouble();

        sum();      //Метод суммирования чисел
        multiply(); //Метод умножения чисел
        diff();     //Метод вычитания чисел
        divide();   //Метод деления чисел
    }

    private static void divide() {
        //todo дописать логику и печать результата
        System.out.println("Частное чисел " + a + " и " + b + " равна " + (a/b));
    }

    private static void diff() {
        //todo дописать логику и печать результата
        System.out.println("Разность чисел " + a + " и " + b + " равна " + (a-b));
    }

    private static void multiply() {
        //todo дописать логику и печать результата
        System.out.println("Произведение чисел " + a + " и " + b + " равна " + (a*b));
    }

    private static void sum() {
        //todo дописать логику и печать результата
        System.out.println("Сумма чисел " + a + " и " + b + " равна " + (a+b));
    }

    private static double inputDouble() {
        //todo дописать логику
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        return x;
    }
}
