public class Q10 {
    public static void main(String[] args) {
        int cp = 129, sp = 191;
        int profit = sp - cp;
        double percent = profit * 100.0 / cp;
        System.out.println("The Cost Price is INR " + cp + " and the Selling Price is INR " + sp
                + "\n\nThe Profit is INR " + profit + " and the Profit Percentage is " + percent);
    }
}