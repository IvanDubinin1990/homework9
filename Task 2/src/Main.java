import java.util.Scanner;

public class Main {

    static int x;

    public static void main(String[] args) {
        //Написать программу, в которой пользователь вводит целое число.
        //Если число четное, то печатаем true, если не четное, печатаем false
        //В методе main НЕ ДОПУСТИМО написание какого либо кода, кроме вызова методов.
        //Методы и их логику продумайте сами

        x = inputInt();
        System.out.println(checkInputInt(x));
    }

    public static int inputInt() {
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        return x;
    }

    public static boolean checkInputInt (int y) {
        if (y % 2 == 0) {
            return true;
        }else{
            return false;
        }
    }
}
