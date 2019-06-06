package io.jsd.training.practice.memo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

import io.jsd.training.practice.memo.Fibonacci;

public class FibonacciTest {

	private static final Fibonacci FIB = new Fibonacci();

	@Test
	public void test() {
		assertThat(FIB.fibDP(10), equalTo(55L));
		assertThat(FIB.fibDP2(10), equalTo(55L));
		long start = System.currentTimeMillis();
		System.out.println(FIB.fibMemo(80));
		System.out.println((System.currentTimeMillis() - start) + " ms");
		// 42 2s
		// 43 3s
		// 44 5s
		// 45 8s
		// 46 13s
		// 50 = F11s = 89s
	}

}
