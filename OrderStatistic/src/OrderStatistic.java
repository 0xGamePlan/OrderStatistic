import java.util.ArrayList;

public class OrderStatistic {

    public static int findSmallestValue(ArrayList<Integer> numberList){
        int smallestValue = numberList.get(0);
        for (int number : numberList) {
            if(number <= smallestValue){
                smallestValue = number;
            }
        }
        return smallestValue;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(15);
        numberList.add(20);
        numberList.add(5);
        numberList.add(25);
        numberList.add(2);
        numberList.add(30);
        System.out.println(findSmallestValue(numberList));
    }
}
