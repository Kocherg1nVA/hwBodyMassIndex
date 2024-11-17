public class BmiService {
    public int calculate(double height, double weight) {
        double bmi = weight / Math.pow(height, 2);
        return (int) bmi;
    }
}
