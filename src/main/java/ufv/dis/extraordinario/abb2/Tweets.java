package ufv.dis.extraordinario.abb2;

import java.util.ArrayList;

public class Tweets {
		
	private ArrayList <Tweet> tweets;
	
	public void Lista() {
		
		tweets = new ArrayList<Tweet>();
	}
	
	public void addTweet(Tweet t) {
		tweets.add(t);
	}
	public void removeTweet(Tweet t) {
		tweets.remove(t);
	}
	public int getlistsize() {
		return tweets.size();
	}
	
}
