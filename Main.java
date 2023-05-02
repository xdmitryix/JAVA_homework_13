// Написать проект калькулятор для комплексным чисел, с элементами логирования действий пользователя. Достаточно сделать хотя-бы два действия.
// Сделал логгирование в файл txt. Реализовал сложение и умножение комплексных чисел.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Logger lg = new Logger();
        Scanner iScanner = new Scanner(System.in);
        System.out.println("число формата a+bi\n");
        System.out.println("введи число a:\n");
        int a = iScanner.nextInt();
        System.out.println("введи число b:\n");
        int b = iScanner.nextInt();
        System.out.printf("число: %d+%di\n", a,b);
        lg.log("число:", a, "+", b);
        while (true) {
            System.out.println("введи команду (+ или * или =)");
            String cmd = iScanner.next();
            if (cmd.equals("=")) {
                System.out.printf("результат: %d+%di\n", a,b);
                lg.log("результат:", a, "+", b);
                break;
            }else{
            System.out.println("число формата a+bi\n");
            System.out.println("введи число a:\n");
            int a2 = iScanner.nextInt();
            System.out.println("введи число b:\n");
            int b2 = iScanner.nextInt();
            if (cmd.equals("+")) {
                a = Calculator.sum(a, a2);
                b = Calculator.sum(b, b2);
                System.out.printf("результат: %d+%di\n", a,b);
                lg.log("прибавили:", a2, "+", b2);
            }else{
                if (cmd.equals("*")) {
                int aOne = Calculator.multi(a, a2); 
                int aTwo = Calculator.multi(b, b2); 
                int bOne = Calculator.multi(a, b2);
                int bTwo = Calculator.multi(b, a2);
                a = Calculator.minus(aOne, aTwo);
                b = Calculator.sum(bOne, bTwo);
                System.out.printf("результат: %d+%di\n", a,b);
                lg.log("умножили на:", a2, "+", b2);
                }else{
                    System.out.println("некорректная команда");
                }
            }
            }
            
        }
    }
}