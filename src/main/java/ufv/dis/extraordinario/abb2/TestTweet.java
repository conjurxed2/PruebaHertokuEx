package ufv.dis.extraordinario.abb2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestTweet {
	
	
	@Test
	public void addTweetLista() {
		
		Tweet t = new Tweet("pepe", "todo bien");
		
		Tweets Lista = new Tweets();
		
		Lista.addTweet(t);
		assertEquals(1, Lista.getlistsize());
	}
	
	@Test
	public void createTweet() {
		Tweet t = new Tweet("pepe", "todo bien");
		assertEquals("pepe", t.getNombre());
	}
	
}
