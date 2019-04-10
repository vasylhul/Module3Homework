package task2;

public class Main {
    public static void main(String[] args) {
        Accounting acc = new Accounting();
        double result = acc.pay(1.5, 9.99);
        System.out.println(String.format("%.2f", result));

        //double roundOff = Math.round(result*100)/100.00;
        //System.out.println(roundOff);
    }
}
