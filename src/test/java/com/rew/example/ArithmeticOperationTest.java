package com.rew.example;

import org.junit.Assert;
import org.junit.Test;

import com.rews.example.ArithmeticOperation;

public class ArithmeticOperationTest {

	
	@Test
	public void testadd() {
		ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
		Integer actual = arithmeticOperation.add(1,2);
		Integer expected = 3;
		Assert.assertEquals(actual, expected);
	}
}
