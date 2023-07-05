public class ConvertTemperature {
    public static void main(String args[]){
        double celsius = 36.50;
        System.out.println(ConvertTemperature.convertTemperature(celsius));
    }
    public static double[] convertTemperature(double celsius) {
        double arr[] = new double[2];
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius*1.80 + 32.00;
        arr[0] = kelvin;
        arr[1] = fahrenheit;
        return arr;
    }
}
