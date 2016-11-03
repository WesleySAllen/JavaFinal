//wes allen
package HighLow;
import java.lang.Math;
public class  Die
{
	int dots;
	public Die()
	{
		dots = ((int)(Math.random() * 10000 % 6 + 1));
	}
	public int getdots()
	{
		return dots;
	}
}