public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();




    }

    public static void task1() {
        System.out.println("Задача 1");
        int income = 15000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            month = month + 1;
            total = total + income;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number +" ");
        }
        System.out.println();
        for (number = 10; number > 0; number--){
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int populationY = 12_000_000;
        int year = 0;
        int childBirthOnThousand = 17;
        int mortalityRateOnThousand = 8;
        int populationGrowth = (populationY / 1000) * (childBirthOnThousand - mortalityRateOnThousand);
        while (year < 10) {
            year++;
            populationY = populationY + populationGrowth;
            System.out.println("Год " + year + ", численность населения составляет " + populationY);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int contributionVasiliy = 15_000;
        int monthContributionVasiliy = 0;
        int interestRate = 7;
        while (contributionVasiliy < 12_000_000) {
            monthContributionVasiliy++;
            contributionVasiliy = (contributionVasiliy / 100) * interestRate + contributionVasiliy ;
            System.out.println("Месяц " + monthContributionVasiliy + ", сумма вклада " + contributionVasiliy + " рублей");
        }

    }

    public static void task5() {
        System.out.println("Задача 5");
        int contributionVasiliy = 15_000;
        int monthContributionVasiliy = 0;
        int interestRate = 7;
        while (contributionVasiliy < 12_000_000) {
            monthContributionVasiliy++;
            contributionVasiliy = (contributionVasiliy / 100) * interestRate + contributionVasiliy ;
            if ( monthContributionVasiliy % 6 == 0) {
                System.out.println("Месяц " + monthContributionVasiliy + ", сумма вклада " + contributionVasiliy + " рублей");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int contributionVasiliy = 15_000;
        int monthContributionVasiliy = 0;
        int interestRate = 7;
        while (monthContributionVasiliy <= 12 * 9 ) {
            monthContributionVasiliy++;
            contributionVasiliy = (contributionVasiliy / 100) * interestRate + contributionVasiliy ;
            if ( monthContributionVasiliy % 6 == 0) {
                System.out.println("Месяц " + monthContributionVasiliy + ", сумма вклада " + contributionVasiliy + " рублей");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int firstFridayDay = 2;
        for (int day = firstFridayDay; day <= 31; day = day + 7){

                System.out.println("Сегодня пятница, " + day + " число. Необходимо подготовить отчёт");

        }
    }
    public static  void task8() {
        System.out.println("Задача 8");
        int accountStart = 1823;
        int accountEnd = 2123;
        for (int year = 0; year <= accountEnd ; year = year + 79) {
           if (year >= accountStart){
               System.out.println(year);
           }
        }
    }

}