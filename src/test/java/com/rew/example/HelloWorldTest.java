package com.rew.example;
import org.junit.Assert;
import org.junit.Test;

import com.rews.example.HelloWorld;

public class HelloWorldTest {
	
	@Test
	public void test() {
		HelloWorld helloTest = new HelloWorld();
		String test = helloTest.helloWorld();
		Assert.assertEquals("Hello World", test);
	}

}
