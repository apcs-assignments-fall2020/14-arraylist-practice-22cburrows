import java.util.ArrayList;

public class MyMain {

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) { 
        int c = 0;
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) % 2 != 0){
                c++;
            }
        }
        return c;
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) { 
        for (int i = 0; i < list1.size(); i++){
            for (int j = 0; j < list2.size(); j++){
                if (list1.get(i) == list2.get(j)){
                    return true;
                }
            }
        }
        return false;
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    public static ArrayList<Integer> convertToArrayList(int[] arr) { 
        ArrayList<Integer> nums = new ArrayList<Integer> ();
        for (int i = 0; i < arr.length; i++){
            nums.add(arr[i]);
        }
        return nums;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(-5);
        list.add(8);
        list.add(10);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(9);
        list2.add(10);
        list2.add(-2);
        list2.add(4);

        int[] intlst = {1, 4, 4, 6, 7};



        System.out.println("there are " +  countOdd(list) + " odd numbers in this list.");

        if (checkDuplicates(list, list2) == true){
            System.out.println("These two lists have the same number in both lists");
        }
        else{
            System.out.println("These two lists do not have the same number in both lists");

        }

        System.out.println("ArrayList: " + convertToArrayList(intlst));
    }
}
