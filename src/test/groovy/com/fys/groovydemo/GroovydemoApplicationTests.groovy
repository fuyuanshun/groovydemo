package com.fys.groovydemo

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class GroovydemoApplicationTests {

	@Test
	void contextLoads() {
		def addNum = {a,b -> {
			println ("计算结果：$a + $b = ${a+b}")
		}}

		addNum(5, 8)
		addNum(3, 4)
	}

}
