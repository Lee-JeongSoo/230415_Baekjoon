//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Map map;
//        Scanner inputData = new Scanner(System.in);
//        int column = inputData.nextInt();
//        int row = inputData.nextInt();
//        int gapHorizontal = inputData.nextInt();
//        int gapVertical = inputData.nextInt();
//
//        map = new Map(column, row, gapHorizontal, gapVertical);
//        System.out.println(map.calculateMaxCapacity());
//    }
//}
import java.util.Scanner;

public class Main {
    private static int column;
    private static int row;
    private static int gapHorizontal;
    private static int gapVertical;

    private static int calculateMaxCapacity(){
        int map[]= new int[2];
        map[0] = column;
        map[1]= row;

        int capacityVertical;
        int capacityHorizontal;
        int capacityTotal;
        capacityVertical = (int)((row - 1)/ (gapVertical+1))+1;
        capacityHorizontal= (int)((column - 1)/ (gapHorizontal+1))+1;
        capacityTotal = capacityHorizontal*capacityVertical;

        return capacityTotal;
    }

    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        column = inputData.nextInt();
        row = inputData.nextInt();
        gapHorizontal = inputData.nextInt();
        gapVertical = inputData.nextInt();

        System.out.println(calculateMaxCapacity());
    }
}