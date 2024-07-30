public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double massKg = 98;
        double heightMeter = 1.87;

        System.out.println("Индекс массы тела: " + service.calculate(massKg, heightMeter));

        System.out.println();
        System.out.println("РОСТ 1.58м ВЕС 50кг, BMI 20");
        System.out.println(service.calculate(50, 1.58));

        System.out.println();
        System.out.println("РОСТ 1.93м ВЕС 82кг, BMI 22");
        System.out.println(service.calculate(82, 1.93));
    }
}
