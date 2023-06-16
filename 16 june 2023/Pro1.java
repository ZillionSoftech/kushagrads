import java.util.Scanner;

class Pro1{
    public static void main(String[] args) {
        int[] marks=new int[5];
        System.out.println("Eenter five element : ");

        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<5;i++){
            marks[i]=sc.nextInt();
        }
        // sorting logic start

        int n=marks.length;
        int temp=0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(marks[i]>marks[i+1]){
                    temp=marks[i];
                    marks[i]=marks[i+1];
                    marks[i+1]=temp;
                }
            }
        }
        // 

        System.out.println("all elements in the array : ");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}