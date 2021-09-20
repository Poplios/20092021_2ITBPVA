
import java.util.Random;
import java.util.Scanner;

public class Ben1{
public static Scanner sc = new Scanner(System.in);
public static Random rd = new Random();

public static void main(String[] args) {


    int x;  
    Scanner sc = new Scanner(System.in);  
    System.out.print("kolik čísel chceš v arrayi: ");  
    
    x =sc.nextInt();  
   
    int[] array = new int[10];  
    System.out.println("zadej indexi: ");  
        for(int i = 0; i < x; i++)  
    {  
    array[i] = sc.nextInt();  
    }  
    System.out.println("toto je v arrayi: ");  

    for (int i = 0; i < x; i++)   
    {  
    System.out.print(array[i] + " ");  
    }  
    }  
  

public static void dejVlevo(){

        
}
}