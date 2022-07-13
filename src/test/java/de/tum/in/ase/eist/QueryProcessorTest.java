package de.tum.in.ase.eist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class QueryProcessorTest {

	private final de.tum.in.ase.eist.QueryProcessor queryProcessor = new de.tum.in.ase.eist.QueryProcessor();

	@Test
	void testEmptyStringIfCannotProcessQuery() {
		assertEquals("", queryProcessor.process("test"));
	}

	@Test
	void testKnowsAboutShakespeare() {
		String actual = queryProcessor.process("Shakespeare");
		if (!actual.contains("playwright")) {
			fail("The QueryProcessor does not know about Shakespeare.");
		}
	}

	@Test
	void isNotCaseSensitive() {
		String actual = queryProcessor.process("shakespeare");
		if (!actual.contains("playwright")) {
			fail("Your QueryProcessor should not be case sensitive.");
		}
	}

	@Test
	void adding(){
		String actual = queryProcessor.process("what is 11 plus 8");
		if (actual.contains("19")) {
			System.out.println(actual);
			fail("Adding doesnt work");
		}
	}

	@Test
	void largest(){
		String actual = queryProcessor.process("what is 11 plus 8");
//		String query = "which of the following numbers are primes: 1, 2";
//		int t = Integer.parseInt(query.split("primes: ")[1].split(",")[0]);
//		int t2 = Integer.parseInt(query.split(", ")[1]);
//		System.out.println(t + "" + t2);

		if (actual.contains("19")) {
			System.out.println(actual);
			fail("Adding doesnt work");
		}
	}

}
