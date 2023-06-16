import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        // int mark[]=new int[5];
        // int mark[]={1,2,3,4,5,6};

        int size = 0;
        int fillSize = 0;

        System.out.println("Tolat Seats Required : ");
        Scanner sc = new Scanner(System.in);

        size = sc.nextInt();
        int seat[] = new int[size];

        System.out.println("Total Seat For students : " + size);
        System.out.println("Occupied Seat : " + fillSize);
        int emptySize = size - fillSize;

        System.out.println("Enter how many addmistions required : ");
        int addmission = sc.nextInt();

        if (addmission <= emptySize) {
            for (int i = 0; i < addmission; i++) {
                System.out.println("Enter element : ");
                seat[i] = sc.nextInt();
                emptySize--;
            }
        } else {
            System.out.println("No seats avaiable");
        }

        System.out.println("Total Seat For students : " + size);
        System.out.println("Occupied Seat : " + (size - emptySize));
        System.out.println("Empty Seat : " + (emptySize));

        System.out.println("Enter new admission : ");
        int count = sc.nextInt();

        if (count < emptySize) {
            for (int i = fillSize; i < (count + fillSize); i++) {

                System.out.println("Enter element : ");
                seat[i] = sc.nextInt();
                emptySize--;

            }
        } else {

        }

        System.out.println("Total Seat For students : " + size);
        System.out.println("Occupied Seat : " + (size - emptySize));
        System.out.println("Empty Seat : " + (emptySize));

    }
}
