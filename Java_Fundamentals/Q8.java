public class Q8 {
    public static void main(String[] args) {
        double r = 6378;
        double vKm = (4.0 / 3) * Math.PI * Math.pow(r, 3);
        double vMi = vKm / Math.pow(1.6, 3);
        System.out.println("The volume of earth in cubic kilometers is " + vKm + " and cubic miles is " + vMi);
    }
}