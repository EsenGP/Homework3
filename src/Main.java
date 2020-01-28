import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите своё имя: ");
        String name = sc.next();

        System.out.println("Введите семизначное число:");
        String number = sc.next();
        String num1 = number.substring(0,1);
        String num2 = number.substring(1,2);
        String num3 = number.substring(2,3);
        String num4 = number.substring(3,4);
        String num5 = number.substring(4,5);
        String num6 = number.substring(5,6);
        String num7 = number.substring(6,7);
        int nu1 = Integer.parseInt(num1);
        int nu2 = Integer.parseInt(num2);
        int nu3 = Integer.parseInt(num3);
        int nu4 = Integer.parseInt(num4);
        int nu5 = Integer.parseInt(num5);
        int nu6 = Integer.parseInt(num6);
        int nu7 = Integer.parseInt(num7);

        int nu36 = nu3 + nu6;
        int nu2346 = nu2+nu3+nu4+nu6;

        System.out.println("        Задание 1 \nИмя: " + name +
                "\n1)Сумма всех третих чисел: " + (nu36) +
                "\n2)Сумма всех вторых и третих чисел: " + nu2346);
        int cda = nu1*nu2*nu3*nu4*nu5*nu6*nu7;
        String acd = Integer.toString(cda);
        String abc = new StringBuffer(acd).reverse().toString();
        System.out.println("3)Произведение всех чисел в обратном порядке:" + abc);
        System.out.println("4)Квадратный корень из числа первого задания: " + Math.sqrt(nu36));
        System.out.println("4)Квадратный корень из числа второго задания: " + Math.sqrt(nu2346вп));


    }
}
