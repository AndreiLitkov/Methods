//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void isYearLeap( int year){
        if ((year%4==0 && year%100!=0) || (year%400==0)) {
            System.out.println(year+ " год  - високосный год");
        }else if(year<1584){
            System.out.println(year+ " год. В этом году еще не было выбрано такое правило про определения вискокосного года.");
        }else{
            System.out.println(year+ " год - не високосный год");
        }
    }
    public static void whatProgramInstall( int clientOs , int clientDeviceYear){
        if (clientOs==0){
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }else if(clientDeviceYear<2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if(clientOs==1){
            System.out.println("Установите версию приложения для Android по ссылке.");
        }else if(clientDeviceYear<2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }
    }
    public static void deliveryDays(int distance){
        if (distance<20){
            System.out.println("Потребуется 1 день для доставки");
        }else if (distance>=20 && distance<=60){
            System.out.println("Потребуется 2 дня для доставки");
        }else if(distance>60 && distance<=100){
            System.out.println("Потребуется 3 дня для доставки");
        }else{
            System.out.println("Доставки нет");
        }
    }
    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1");
        int year = 1800;
        isYearLeap(year);

        //Task 2
        System.out.println("Task 2");
        int clientOSNew = 0;
        int clientDeviceYear = 2013;
        whatProgramInstall(clientOSNew , clientDeviceYear);

        //Task 3
        System.out.println("Task 3");
        int deliveryDistance = 95;
        deliveryDays(deliveryDistance);
    }
}