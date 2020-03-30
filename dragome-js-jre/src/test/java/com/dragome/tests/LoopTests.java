package com.dragome.tests;

import org.junit.Test;
import org.junit.runner.RunWith;

import junit.framework.TestCase;

@RunWith(DragomeTestRunner.class)
public class LoopTests extends TestCase
{

	@Test
	public void testForLoop()
	{
		int count = 0;
		int size = 2;
		for(int i = 0; i < size; i++) {
			count++;
		}
		assertEquals(2, count);
	}

	private int loopTest() {
		int count = 0;
		System.out.println("PASSAA");
		boolean flag = true;
		try {
			int size = 2;
			for(int i = 0; i < size; i++) {
				count++;
				if(flag) {
					int a = 0;
					a++;
				}
			}
		}
		catch(RuntimeException ex) {
			int test = 0;
			test = test + 1;
//			throw new RuntimeException("FAILLL");
		}
		return count;
	}

	@Test
	public void testForLoop2()
	{
		int count = loopTest();
		assertEquals(2, count);
	}
}
