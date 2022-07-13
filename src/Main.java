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
            System.out.println("���������� ������ ���������� ��� Android �� ������");
        } else {
            System.out.println("���������� ������ ���������� ��� iOS �� �������");
        }
    }

    public static void task2() {
        int clientOS = 0;
        int clientDeviceYear = 2014;
        if (clientDeviceYear < 2015) {
            if (clientOS == 1) {
                System.out.println("���������� ����������� ������ ���������� ��� Android �� ������");
            } else {
                System.out.println("���������� ����������� ������ ���������� ��� iOS �� ������");
            }
        } else {
            if (clientOS == 1) {
                System.out.println("���������� ������ ���������� ��� Android �� ������");
            } else {
                System.out.println("���������� ������ ���������� ��� iOS �� ������");
            }
        }
    }

    public static void task3() {
        int year = 100;
        boolean condition1 = (year % 4 == 0 && year % 100 != 0);
        boolean condition2 = (year % 400 == 0);
        if (condition1 || condition2) {
            System.out.println(year + " ��� �������� ����������");
        } else {
            System.out.println(year + " ��� �� �������� ����������");
        }
    }

    public static void task4() {
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("����������� ����: " + 1);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("����������� ����: " + 2);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("����������� ����: " + 3);
        }
    }

    public static void task5() {
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("����");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("�����");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("����");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("�����");
                break;
            default:
                break;
        }
    }
}