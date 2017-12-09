package com.yuan.first;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FirstApplicationTests {

	@Test
	public void contextLoads() {
		Jedis jedis = new Jedis("39.106.127.238",6379);
		jedis.set("11", "123");
		String value = jedis.get("11");
		System.out.println(value);
		jedis.close();
	}

}
