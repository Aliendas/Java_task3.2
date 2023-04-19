public class BmiService {
    public double calculate(double height_cm, double weight_kg) {
        double height = height_cm / 100;
        double index = weight_kg / (height * height);
        return index;
    }
}