public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87;
        double weight = 98.0;
        int bmi = (int) service.calculate(height, weight);
        System.out.println("Ваш индекс массы тела: " + bmi);
    }
}