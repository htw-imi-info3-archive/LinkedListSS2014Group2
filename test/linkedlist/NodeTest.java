package linkedlist;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class NodeTest {

	@Before
	public void createList(){
		//....
		
	}
	@Test
	public void testCreateListWithOneElement() {
		Node<String> list = new Node<>("a");
		assertEquals("a",list.toString());
	}
	@Test
	public void testCreateListWithTwoElements() {
		Node<String> list = new Node<>("a",new Node<>("b"));
		assertEquals("a, b",list.toString());
	}
	@Test
	public void testCreateListWithFourElements() {
		Node<String> list = new Node<>("a",new Node<>("b",new Node<>("c",new Node<>("d"))));
		assertEquals("a, b, c, d",list.toString());
	}
	
	

}
