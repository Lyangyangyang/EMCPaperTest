package yang.liu;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UnitTest {
	private NodeList n1,n2,n3,n4,n5,n6,n7,n8;
	

	@Before
    public void setUp() throws Exception {
		n8=new NodeList(8,n8);
		n7=new NodeList(7,n8);
		n6=new NodeList(6,n7);
		n5=new NodeList(5,n6);
		 n4=new NodeList(4,n5);
		 n3=new NodeList(3,n4);
		 n2=new NodeList(2,n3);
		 n1=new NodeList(1,n2);
    }


	@Test
	public void testReverse() {
		
		
		ReverseNodeGroupByK.reverse(n1,n5);
	}

	@Test
	public void testReverseNodeGroupByK() {
		int k=0;
		ReverseNodeGroupByK.ReverseNodeGroupByK(n1,k);
		
	}

	

}
