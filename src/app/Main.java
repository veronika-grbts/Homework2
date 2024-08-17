package app;

public class Main {
    private static final  double CONV_M = 1.6093;
    private static  final double CONV_K = 0.62137;
    public static void main(String[] args) {
        System.out.println("Converter App");
        double miles = 5;
        double km = 10;
        double kilometers = convMilesToKilometers(miles);
        double m = convKilometersToMiles(km);

        System.out.println("Result is "+ kilometers + " kilometers and " + m + " miles");
    }

    private static double convMilesToKilometers(double miles){
        return miles * CONV_M;
    }

    private static double convKilometersToMiles(double km){
        return km * CONV_K;
    }
}
