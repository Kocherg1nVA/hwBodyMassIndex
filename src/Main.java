public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.78;
        double weight = 72.0;
        int bmi = (int) service.calculate(height, weight);
        System.out.println("Ваш индекс массы тела: " + bmi);
    }
}