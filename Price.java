import java.util.Scanner;
public class Price
{
  public static void main(String args[])
  {
    int i;
    Scanner obj=new Scanner(System.in);
    int n=5;
    float avg=0;
    int sum=0;
    int arr[]=new int[n];
    System.out.println("Enter price of 5 products");
    for(i=0;i<n;i++)
      arr[i]=obj.nextInt();
    for(i=0;i<n;i++)
      sum=sum+arr[i];
      avg=sum/n;
    System.out.println("Average price is: "+avg);
    for(i=0;i<n;i++)
    {
      if(arr[i]>avg)
        System.out.println(arr[i]+" is greater than" +avg);
    }
  }
}