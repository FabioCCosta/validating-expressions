package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import code.ExpressionImpl;

public class ExpressionTest {
	ExpressionImpl expressionImpl = new ExpressionImpl();

	@Test
	public void test00() {
		String s = "{}()a[]{}b{}c{}d{{e: 'p'}}()";
		assertTrue(expressionImpl.isValidOperators(s));
	}
	
	@Test
	public void test01() {
		String s = "(){{[()[](())()]}}";
		assertTrue(expressionImpl.isValidOperators(s));
	}
	
	@Test
	public void test02() {
		String s = "({})";
		assertTrue(expressionImpl.isValidOperators(s));
	}

}
