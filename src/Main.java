public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        System.out.println("Ваш индекс массы тела: " + service.calculate(1.87, 98.0));
        System.out.println();
        System.out.println("Ваш индекс массы тела: " + service.calculate(1.78, 72.0));
        System.out.println();
    }
}