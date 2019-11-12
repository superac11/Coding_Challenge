/******************************************************************************
Code:Sagar Acharya
Date:11/11/2019
Challenge:
You have a list of 8 numbers from 1 to 10 (either generated randomly or entered 
by a user). You also have a target number. Your code has to display 2 numbers in 
the list that either total or make the product of (you are free to choose which operation) 
the target number. If none, you simply display an appropriate message that none apply. 
If you are competing, submit your (own, original) code by or before Wednesday at 5pm. 
Copied code is invalid and will be disqualified. The first to solve in each language wins


*******************************************************************************/
import java.util.Arrays;
public class Two_Numbers
{
    public static int stat=0;
  public static void main (String[]args)
  {
    int[] GivenArrayList = { 1, 2, 3, 4, 5, 6, 7, 8 };
    int userinput = 8;
    System.out.print ("Given number list " + Arrays.toString (GivenArrayList));
    TestValue (userinput, GivenArrayList);
  }

/*
@parm takes the user input and array.
If the number match then print the array indicies and the value in it with the operation.
If not then print NO match.
*/

  public static void TestValue(int numUser, int[]GivenArrayList)
  {
    System.out.print ("\nUser Input " + numUser + "\n");

    for (int i = 0; i < 8; i++)
      {
		  for (int j = 0; j < 8; j++)
			{

			if (((GivenArrayList[i]) + (GivenArrayList[j])) == numUser  ){
				  System.out.print ("Array Indicies [" + i + "] " + GivenArrayList[i] +	" + [" + j + "] " + GivenArrayList[j] +" = "+numUser+"\n");
					stat=1;
	    }
	    
	    if (((GivenArrayList[i]) * (GivenArrayList[j])) == numUser  ){
	          System.out.print ("Array Indicies [" + i + "] " + GivenArrayList[i] +	" * [" + j + "] " + GivenArrayList[j] +" = "+numUser+"\n");
				stat=1;
	    }
	  }
  }
  if(stat==0){ 
        System.out.print ("No Operation match the given input");}
      }
	  }
