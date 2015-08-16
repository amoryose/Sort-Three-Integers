// Avraham Moryosef
// CS 420
// 6/1/15

package decisions;

import javax.swing.JOptionPane;

public class SortThreeIntegers
{
	public static void main(String[] args)
	{
		String inputInteger, // input string
			   str; // output string
		
		int a, b, c, // parsed integers
			max,
			least,
			middle;
		
		inputInteger = JOptionPane.showInputDialog ("Enter first integer ");
		a = Integer.parseInt(inputInteger);
		
		inputInteger = JOptionPane.showInputDialog ("Enter second integer ");
		b = Integer.parseInt(inputInteger);
		
		inputInteger = JOptionPane.showInputDialog ("Enter third integer ");
		c = Integer.parseInt(inputInteger);
		
		str = "You gave me: " + a + ", " + b + ", " + c;
		
		max = a;	// largest number
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		
		least = a;	// smallest number
		if (b < least)
			least = b;
		if (c < least)
			least = c;

		middle = a;	// middle number
		if (a > b)
		{
			max = a;
			middle = b;
		}	
		else
		{
			max = b;
			middle = a;
		}
		if (c > max)
		{
			least = middle;
			middle = max;
			max = c;
		}
		else if(c > middle)
		{
			least = middle;
			middle = c;
		}
		else
			least = c;
		
		str = str + "\nIn order: " + least + ", " + middle + ", " + max;
		
		JOptionPane.showMessageDialog(null, str, "Results",
				 JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}
}
