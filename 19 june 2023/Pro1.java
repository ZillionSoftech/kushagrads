// traversing
// searching
// sorting
//delete
// queue>delete
// stack > pop

//add
// queue => add
// stack > push

class Stack{

    int size;
    int top;
    int[] array;

    public Stack(int size){
        this.size=size;
        top=-1;
        array=new int[size];
    }

    public boolean push(int element){
        boolean status=false;
        if(!isFull()){
            top++;
            array[top]=element;   
            return true;
        }
        return status;
    }

    public boolean isFull(){
        boolean status=true;

        if(top<(size-1)){
           return false; 
        }
        return status;
    }
}

class Pro1{
    public static void main(String[] args) {
        Stack stack=new Stack(5);
        System.out.println(stack.push(100));
        System.out.println(stack.size);
    }
}
