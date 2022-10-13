public class Main {
    public static void main(String[] args) {


        //Task 1-1
        for (int i=1; i<= 10; i++) {
            System.out.print (i + " ");

        }
        System.out.println("\n");
        //Task 1-2
        for (int i=10; i>0; i--) {
            System.out.print (i + " ");
        }
        System.out.println("\n");
        //Task 1-3
        for (int i=0; i<=17; i+=2) {
            System.out.print (i + " ");
        }
        System.out.println("\n");
        //Task 1-4
        for (int i=10; i>=-10; i--) {
            System.out.print (i + " ");
        }
        System.out.println("\n");

        //Task 2-1
        for (int y=1904; y<=2096; y+=4) {
            System.out.println( y + " год является високосным");
        }
        System.out.println("\n");

        //Task 2-2
        for (int num= 7; num<=98; num+=7) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        //Task 2-3
        for (int num=1; num<=512; num*=2) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        //Task 3-1
        int pot=29000, total=0;
        for (int month=1; month<=12; month++) {
             total=total+pot;
             System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("\n");

        //Task 3-2

        int deposit=29000, tot=0;
        for (int month = 1; month <= 12; month++) {
            tot=tot+deposit;
            tot=tot+tot/100;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + tot + " рублей");
        }
        System.out.println("Разность составила " + (tot-total) + " рублей");

    }
}