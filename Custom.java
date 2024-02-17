import java.util.Scanner;
class MyException extends Exception
{
public MyException(String a)
{
super(a);
}
}


public class Custom
{
 static String[] units={" ","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
 static String[] teens={" ","Eleven","Tweleve","Thirtheen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
static String[] tens={" ","Ten","Twenty","Thirthy","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};

public static String convert(int n)
{
if(n<10)
{
return units[n];
}
else if (n<20)
{
return teens[n-10];
}
else if (n<100)
{
return tens[n/10] + " " + convert(n%10);
}
else if (n<1000)
{
return units[n/100] + " Hundred " + " and " + convert(n%100);
}
else if (n<100000)
{
return convert(n/1000) + " Thousand " + convert(n%1000);
}
else if (n<10000000)
{
return convert(n/100000) + " Lakh " + convert(n%100000);
}
else 
{
return convert(n/10000000) + " Crore " + convert(n%10000000);
}
}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number: ");
int n=sc.nextInt();
try
{
if(n<0)
{
throw new MyException("Please insert positive number only");
}
System.out.println("In words: " +convert(n));
}
catch(MyException e){
System.out.print(e.getMessage());
}
}
}