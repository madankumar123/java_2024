public class WAP_CH6_Prb3_PracticeSet {
    public static void main(String[] args) {
// sum divided by no.values

        float[] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for (float element : marks) {
            sum = sum + element;
        }
        System.out.println("The value of average marks is " + sum / marks.length);
    }
}