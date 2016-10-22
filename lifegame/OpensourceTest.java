import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OpensourceTest {
	@Before
	public void setUp() throws Exception {
	}
	Opensource ops=new Opensource();
	String pname = "lalala";
	String pfriend = "hahaha";
	@Test
	public void testSetName() {
		ops.setName(pname);
		assertEquals(ops.name,pname);
	}
	@Test
	public void testSetFriend() {
		ops.setFriend(pfriend);
		assertEquals(ops.friend,pfriend);
	}
	@Test
	public void testGetName() {
		if(ops.getName()==ops.name)
		{
			assertEquals(1,1);
		}
		else
			assertEquals(1,0);
	}
	@Test
	public void testGetFriend() {
		assertEquals(ops.getFriend(),ops.friend);
	}

}
