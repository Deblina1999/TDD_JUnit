package TDD_JUnit.Task7;
import java.util.*;
public class RemoveA
{

	public String remove(String string)
	{
		String m1 = string;
		StringTokenizer m = new StringTokenizer(m1, "A");
		String s2 = "";
		if (string.equals(""))
			return string;
		else
			while (m.hasMoreTokens())
			{
    				s2=s2+m.nextToken();
			}
			return s2;
	}
	

}
