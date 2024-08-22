package Listener;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Runnerexe
{
@Test
public void Compose()
{
	System.out.println("msg composed");
}
public void sentItems()
{
	System.out.println("msg sent");
	Assert.fail();
}
public void trash()
{
	System.out.println("msg deleted");
}
}

