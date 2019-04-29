package com.helloworld;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestService {

	private Service service = new Service();

	@Test
	public void testPrintMessage() {
		assertEquals(20, service.sum(10, 10));
	}
}
