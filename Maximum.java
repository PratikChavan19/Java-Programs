import java.lang.*;
import java.util.*;

class Maximum
{
    public static void main(String arg[])
    {
        int iCnt = 0, iMax = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int size = sobj.nextInt();

        int Arr[] = new int[size];

        System.out.println("Enter the elements of array");
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(iMax > Arr[iCnt])
            {
                iMax = iMax;
            }
            else
            {
                iMax = Arr[iCnt];
            }
        }
        System.out.println("Largest number is : " +iMax);
    }
}