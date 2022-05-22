import java.lang.*;
import java.util.*;

class ST1
{
    public static void main(String arg[])
    {
        Stack <Integer>obj = new Stack<Integer>();

        obj.push(11);
        obj.push(22);
        obj.push(33);
        obj.push(44);

        Iterator iobj = obj.iterator();
        while(iobj.hasNext())
        {
            ref = (Student)iobj.next();
            ref.Display();
        }

        System.out.println("Popped elements are : ");

        ref = obj.pop();
        System.out.println("Popped element is : "+ref.name);

        ref = obj.pop();
        System.out.println("Popped element is : "+ref.name);
    }
}