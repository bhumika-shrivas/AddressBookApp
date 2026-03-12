package com.addressbookapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

// Simple Spring Boot smoke test: verifies that the application context starts up
// without throwing exceptions. This helps catch missing bean configuration or
// startup-time errors early in the test suite.
@SpringBootTest
class AddressBookAppApplicationTests {

	@Test
	void contextLoads() {
		// test passes if context initialization completes successfully
	}

}