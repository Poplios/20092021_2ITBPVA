
import java.util.Scanner;

public class Ben2 {
 
 
    public static void main(String[] args) {

    int x;  
    Scanner sc =new Scanner(System.in);  
    System.out.print("kolik čísel chceš v arrayi: ");  
    
    x =sc.nextInt();  
   
    int[] array = new int[10];  
    System.out.println("zadej indexi: ");  
        for(int i = 0; i < x; i++)  
    {  
    array[i]=sc.nextInt();  
    }  
    System.out.println("toto je v arrayi: ");  
    int počet = 0;

    for (int i = 0; i < x; i++)   
    {  
 
      System.out.println(array[i]);
       počet = i + počet;
        System.out.println(počet);
    }  
    }  


}




