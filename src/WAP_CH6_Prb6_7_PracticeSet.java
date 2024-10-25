public class WAP_CH6_Prb6_7_PracticeSet {
  /*  public static void main(String[] args) {
        int [] arr = {1, 2100, 3, 455, 5, 34, 67};
        int max = 0;
        for(int e: arr){
            if(e>max){                // if element is greater than max (max=0), make it new max
                max = e;              // o/p= 2100 max
            }
        }
        System.out.println("the value of the maximum element in this array is: "+ max);
}
}
   */
        // By using min and max


     //   System.out.println(Integer.MIN_VALUE);
     //   System.out.println(Integer.MAX_VALUE);

    public static void main(String[] args) {
        int [] arr = {1, 2100, 3, -455, 5, 34, 67};   // for positive and negative integers it is usefull
        int max = Integer.MIN_VALUE;
        for(int e: arr){
            if(e>max){                // if element is greater than max, make it new max
                max = e;
            }
        }
        System.out.println("the value of the maximum element in this array is: "+ max);
    }
}
