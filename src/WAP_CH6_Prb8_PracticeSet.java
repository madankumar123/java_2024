public class WAP_CH6_Prb8_PracticeSet {
    public static void main(String[] args) {
        boolean isSorted = true;
        int [] arr = {1, 12, 3, 4, 5, 34, 67};
        for(int i=0;i<arr.length-1;i++){     // length-1 bcoz 1 will sort with 12, 12 with 3, 3 with4, but 67 cannot
            if(arr[i] > arr[i+1]){         // if arr[i] is greater than
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }


    }
}

