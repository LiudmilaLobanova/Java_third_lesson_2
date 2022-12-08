public class Main {
    public static void main(String[] args) {

        BmiService bmi = new BmiService();

        float w = 65;
        float h = 160;
        float r = bmi.calculate(w,h);


        System.out.println("Для роста " + h + " см. и веса " + w +
                "кг., индекс массы тела составит: ");
        System.out.printf("%.2f",r);

    }
}