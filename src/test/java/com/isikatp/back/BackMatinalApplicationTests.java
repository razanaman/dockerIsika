package com.isikatp.back;

import com.isikatp.back.controller.BonjourController;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collection;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BackMatinalApplicationTests {
	@Autowired
	BonjourController bonjourController;
	@Test
	void contextLoads() {

	}

	@Test
	public void testBonjourController() {

		String expected = "Alain";

		String result = bonjourController.salut("Alain");
		assertEquals(expected, result);
	}
	@Test
	public void testSomme() {

		int expected = 8;
		int result = bonjourController.somme(3,5);
		assertEquals(expected, result);
	}

}
