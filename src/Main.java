public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bmi = (int) service.calculate(187,98);
        System.out.println("Индекс массы тела = " + bmi);
    }
}
