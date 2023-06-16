import java.util.Scanner;

public class Pro3 {
    public static void main(String[] args)
    {
        int[] marks = new int[2];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("PLease enter 2 numbers : ");
        for(int i = 0;i < 2; i++)
        {
            marks[i] = sc.nextInt();
        }

        System.out.println("Marks are : ");
        for(int i = 0; i<2; i++)
        {
            System.out.println(marks[i]);
        }

        

    }
    
}
