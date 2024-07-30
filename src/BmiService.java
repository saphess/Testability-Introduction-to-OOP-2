public class BmiService {
    public int calculate(double massKg, double heightMeter) {
        double index = massKg / (heightMeter * heightMeter);
        return (int) index;
    }
}
