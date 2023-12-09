public class Main {
    public static void main(String[] args) {
        double [] numbers = {5.0, 69.5, -8.0, 65.9, 7.1, -3.0, 12.0, -2.0, 13.0, -4.0, 15.0, -9.3, 54.0, -6.0, 37.0};
        boolean negative = false;
        double sum = 0;
        int count = 0;
        for (double i:numbers) {
            if (negative && i>0) {
                sum += i;
                count++;
            }
            if (i <0) {
                negative = true;
            }
        }
        double avg = sum/count;
        System.out.println("Average " +avg);

    }
}