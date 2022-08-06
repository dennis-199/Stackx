public class StackTest {

    public static void main(String[] args)
    {

        StackX thestack = new StackX(10);
        thestack.push(20);
        thestack.push(40);
        thestack.push(60);
        thestack.push(80);
        thestack.push(90);

        thestack.push(200);
        thestack.push(300);
        thestack.push(45);
        thestack.push(25);
        thestack.push(33);

       //thestack.push(43);

        System.out.println("The size of the array is: == "+thestack.size());




        System.out.println("---------------The stack before removing an element pop-------------");
        System.out.println("Top element is "+thestack.peek());
        // Check if the stack is full
        System.out.println("Check if the stack is FULL if full return true or else false: == "+thestack.isFull());
        // remove item from the top of the stack
        thestack.pop();
        // print the top node
        System.out.println(thestack.stackArray[thestack.top]);
        System.out.println("----------------The stack after removing the top element--------------");
        // peek at the top element
        System.out.println("Top element now is "+thestack.peek());
        // check if the stack is full or not
        System.out.println("Check if the stack is FULL if full return true or else false: == "+thestack.isFull());
        System.out.println("Check if stack is empty: == "+thestack.isEmpty());




        for(int i=0; i<10; i++){

            System.out.println(thestack.stackArray[i]);
        }
    }
}
