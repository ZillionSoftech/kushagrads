class Pro1{
    public static void main(String[] args) {
        int[] marks=new int[5];
        
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            marks[i]=sc.nextInt();
        }
        
        System.out.println("Marks are : --");
        for(int i=0;i<5;i++){
            System.out.println(marks[i]);
        }
    }
}