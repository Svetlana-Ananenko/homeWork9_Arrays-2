import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        System.out.println("___Задача №1___");
        double [] salaryInMonth = new double[5];
        salaryInMonth[0] = 30000;
        salaryInMonth[1] = 15000;
        salaryInMonth[2] = 60000;
        salaryInMonth[3] = 3000;
        salaryInMonth[4] = 90000;
        double summa = 0;

        for (int i = 0; i < salaryInMonth.length; i++) {
            summa = summa + salaryInMonth[i];
        }

        System.out.println("Сумма трат за месяц составила " + summa + " рублей.");


        System.out.println("___Задача №2___");
        double[] salaryInWeek = {7000, 3500, 14000, 700, 21000};
        double max = -1;

        for (int i = 0; i < salaryInWeek.length; i++) {

            if (salaryInWeek[i] > max) {
                max = salaryInWeek[i];
            }

        }


        double min = max;
        for (int i = 0; i < salaryInWeek.length; i++) {

            if (salaryInWeek[i] < min) {
                min = salaryInWeek[i];
            }

        }
        System.out.printf("Минимальная сумма трат за неделю составила %s рублей. Максимальная сумма трат за неделю составила %s рублей\n", min, max);




        System.out.println("___Задача №3___");
        double numberOfDaysInAMonth = 31;
        double numberOfDaysInAWeek = 7;
        double numberOfWeeksInAMonth = numberOfDaysInAMonth / numberOfDaysInAWeek;
        // System.out.println(numberOfWeeksInAMonth);

        double[] salaryInMonth2 = new double[5];
        salaryInMonth2[0] = 60000;
        salaryInMonth2[1] = 35000;
        salaryInMonth2[2] = 8000;
        salaryInMonth2[3] = 95000;
        salaryInMonth2[4] = 26000;
        double summa2 = 0;

        for (int i = 0; i < salaryInMonth2.length; i++) {
            summa2 = summa2 + salaryInMonth2[i];
        }
        summa2 = summa2 / numberOfWeeksInAMonth;

        System.out.printf("Средняя сумма трат за месяц составила %s рублей \n" , summa2  );


        System.out.println("___Задача №4___");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        char temp;
        for (int i = reverseFullName.length-1; i >=0 ; i--) {
            System.out.print(reverseFullName[i]);
        }

        System.out.println("____________");

        for (int i = 0; i < reverseFullName.length/2 ; i++) {
            temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length-1-i];
            reverseFullName[reverseFullName.length - 1 - i] = temp;


        }
        System.out.print(Arrays.toString(reverseFullName));




        System.out.println("___Задача №4___");
        char[] reverseFullName2 = { 'a', 't', 'e', 'v', 'S'};

        char temp2 ;

            for (int i = 0; i < reverseFullName2.length/2 ; i++) {
            temp2 = reverseFullName2[i];
            reverseFullName2[i] = reverseFullName2[reverseFullName2.length-1-i];
            reverseFullName2[reverseFullName2.length - 1 - i] = temp2;


        }
        System.out.print(Arrays.toString(reverseFullName2));


    }
}