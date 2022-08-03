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
        thestack.push(35);


        for(int i=0; i<10; i++){
            // print the top node
            System.out.println(thestack.stackArray[thestack.top]);
            System.out.println(thestack.stackArray[i]);
        }
    }
}
