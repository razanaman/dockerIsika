package com.isikatp.back;

import com.isikatp.back.controller.BonjourController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.Model;

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


}
