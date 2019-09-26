import java.util.Scanner;

public class khong_P1 {
	 public static void main(String[] args)
	  {
	     getnum(); //Calls for getnum() method
	      
	  }  
	   
	  public static int getnum()
	  {
	    int fourD = 0, stringSize = 0;
	    String fourDs; //To hold the value of input number in a String
	     
	    Scanner kb = new Scanner(System.in);
	    while (stringSize != 4)
	    {
	      System.out.println("Enter a four digit number"); //Prompt user for four digit number
	      fourDs = kb.nextLine();
	      stringSize = fourDs.length(); //Checks length of String
	       
	      if (stringSize == 4)
	      {
	         
	        fourD = Integer.parseInt(fourDs);
	 
	      }
	    }
	    encrypt(fourD);
	    return fourD; //Return value of input
	    }
	 
	 
	  public static int encrypt(int num) 
	  {
	    int a, b, c, d;
	     
	    a = num / 1000;
	    b = num / 100 % 10;
	    c = num / 10 % 10;
	    d = num % 10;
	     
	    a = (a + 7)%10;
	    b = (b + 7)%10;
	    c = (c + 7)%10;
	    d = (d + 7)%10;
	     
	    System.out.println(c+d+a+b);
	    return (c+d+a+b); //Returns encrypted value

	  }
}