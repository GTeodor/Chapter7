public class ComputeDeviation {
    public static void main(String[] args) {
        double[] y = {1.9, 2.5, 3.7, 2, 1, 6, 3, 4, 5, 2};
        System.out.printf("The mean is %4.2f\n",mean(y));
        System.out.printf("The standard deviation is %4.5f",deviation(y));

    }

    /** Compute the deviation of the double values */
   public static double deviation(double[] x) {
       double sum  = 0;
       for (int i = 0; i < x.length; i++) {
           sum += Math.pow((x[i] - mean(x)),2);

       }
       return Math.sqrt(sum / (x.length - 1));
     }

    /** Compute the mean of an array of double values */
    public static double mean(double[] x) {
        double sum = 0;
        for (int i = 0; i < x.length; i++)
            sum += x[i];

        return sum / x.length;
    }

}
