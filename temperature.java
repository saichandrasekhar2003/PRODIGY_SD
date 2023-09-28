import java.util.Scanner;
import java.io.*;
class temperature
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Celcius to faranheat,kelvin\n 2.faranheat to Celcius,kelvin\n 3.kelvin to Celcius,faranheat");
        System.out.println("Enter Your choice:");
        int op=sc.nextInt();
        switch(op)
        {
            case 1:
                System.out.print("Enter your temperatue:");
                float c=sc.nextFloat();
                celcius(c);
                break;
	   case 2:
                System.out.print("Enter your temperatue:");
                float f=sc.nextFloat();
                faranheat(f);
                break;
	   case 3:
                System.out.print("Enter your temperatue:");
                float k=sc.nextFloat();
                kelvin(k);
                break;
            default:
                System.out.println("Inavlid choice");
        }

    }
    static void celcius(float c)
    {
        float f,k;
        f=((9*c)/5)+32;
        System.out.println("the temperature in faranheat is:"+f);
        k=c+273;
        System.out.println("the temperature in kelvin is:"+k);
    }
    static void faranheat(float f)
    {
        float c,k;
        c=((f-32)*5)/9;
        System.out.println("the temperature in celcius is:"+c);
        k=(((f-32)*5)/9)+273;
        System.out.println("the temperature in kelvin is:"+k);
    }
    static void kelvin(float k)
    {
        float f,c;
        f=(((k-273)*9)/5)+32;
        System.out.println("the temperature in faranheat is:"+f);
        c=k-273;
        System.out.println("the temperature in celcius is:"+c);
    }
    
}