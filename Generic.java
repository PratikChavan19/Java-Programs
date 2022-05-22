import java.lang.*;

// template <class T>
class Arithmetic <T>
{
    public T Addition(T No1, T No2)
    {
        if((No1 instanceof Integer) && (No2 instanceof Integer))
        {
            return (T)(Integer)((Integer)No1 + (Integer)No2);
        }
        else if((No1 instanceof Float) && (No2 instanceof Float))
        {
            return (T)(Float)((Float)No1 + (Float)No2);
        }
        else if((No1 instanceof Double) && (No2 instanceof Double))
        {
            return (T)(Float)((Float)No1 + (Float)No2);
        }
        else
        {
            return null;
        }
    }
}

class Generic
{
    public static void main(String arg[])
    {
        Arithmetic <Integer>obj = new Arithmetic<Integer>();
        Integer ret = 0;
        ret = obj.Addition(10, 11);
        System.out.println("Addition is : "+ret);

        Arithmetic <Float>obj2 = new Arithmetic<Float>();
        Float ret2 = 0.0f ;
        ret2 = obj2.Addition(10.8f, 11.4f);
        System.out.println("Addition is : "+ret2);
    }
}