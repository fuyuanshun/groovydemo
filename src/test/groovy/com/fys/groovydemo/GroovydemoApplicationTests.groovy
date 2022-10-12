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

	/**
	 * 引号测试
	 */
	@Test
	void testQuotes(){
		def s = "fys"

		// 不会解析其中的变量$
		// 结果： abc $s
		println 'abc $s'

		// 可以解析其中的$
		// 结果： abc fys
		println "abc $s"

		// 不会解析其中的变量$ 但是可以解析格式
		println '''abc $s 23
			324235235
		'''
	}
}
