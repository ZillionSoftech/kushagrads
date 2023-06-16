import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Pro4 {
    public static void main(String[] args)
    {
        int[] marks = new int[5];
        Scanner sc = new Scanner(System.in);
        
        for(int i=0;i<5;i++){
            marks[i] = -1;
        }


        System.out.println("Enter four numbers : ");
        for(int i=0;i<4;i++){
            marks[i] =sc.nextInt();
        }

        for(int i = 1 ;i < 4;i++)
        {
            marks[i] = marks[i-1];
            System.out.println(marks[i]);

        }       
       
        System.out.println("Marks are : --");
        for(int i=0;i<5;i++){
            System.out.println(marks[i]);
        }

        

    }
    
}
