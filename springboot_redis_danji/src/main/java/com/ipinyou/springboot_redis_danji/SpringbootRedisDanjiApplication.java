package com.ipinyou.springboot_redis_danji;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@SpringBootApplication
@EnableCaching
public class SpringbootRedisDanjiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRedisDanjiApplication.class, args);
	}
}
