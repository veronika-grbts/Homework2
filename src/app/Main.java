package app;

public class Main {
    private static final  double CONV_M = 1.6093;

    public static void main(String[] args) {
        System.out.println("Converter App");
        double miles = 5;
        double kilometers = convMilesToKilometers(miles);

        System.out.println("Result is "+ kilometers + " kilometers");
    }

    private static double convMilesToKilometers(double miles){
        return miles * CONV_M;
    }
}
