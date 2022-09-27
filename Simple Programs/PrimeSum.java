//find sum of prime numbers from 1 to n
import java.util.*;
public class PrimeSum{
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  //scanner class for input
  
int i,num,count, sum=0;
System.out.println("Please Enter maximum value: ");
int maxValue=sc.nextInt();

System.out.println("Sum of Prime numbers between 1 to "+maxValue+" are : ");

//forloop for finding and printing all prime numbers in given range
for(num=1; num<=maxValue; num++){
  count=0;
  for(i=2; i<=num/2; i++){
    if(num%i==0){
      count++;
      break;
    }
}
if(count==0 && num !=1){
  sum+=num;
}
}
  System.out.println(sum);
}
}
