public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылкее");
        }
    }

    public static void task2() {
        int clientOS = 0;
        int clientDeviceYear = 2014;
        if (clientDeviceYear < 2015) {
            if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else {
            if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
    }

    public static void task3() {
        int year = 100;
        boolean condition1 = (year % 4 == 0 && year % 100 != 0);
        boolean condition2 = (year % 400 == 0);
        if (condition1 || condition2) {
            System.out.println(year + " год является високосным»");
        } else {
            System.out.println(year + " год не является високосным»");
        }
    }

    public static void task4() {
        int deliveryDistance = 95;
        int deliveryPeriod = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryPeriod);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryPeriod += 1;
            System.out.println("Потребуется дней: " + deliveryPeriod);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            deliveryPeriod += 2;
            System.out.println("Потребуется дней: " + deliveryPeriod);
        }
    }

    public static void task5() {
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет");
                break;
        }
    }
}