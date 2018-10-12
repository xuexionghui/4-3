package com.junlaninfo.dao;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.ObjectIdGenerators.StringIdGenerator;

@Repository
public class RedisDao {
     
	@Autowired
	private StringRedisTemplate  redisTemplate;
	/*
	 * 将键和值存入到redis中
	 */
	public void setKey(String key ,Object value) {
		
		ValueOperations<String, String> ops = redisTemplate.opsForValue();
		ops.set(key, (String) value,1, TimeUnit.MINUTES);   //将键和值存入到redis中
	}
	
	/*
	 * 根据键从redis数据库中取出值
	 */
	public String   getValue(String key) {
		ValueOperations<String, String> ops = this.redisTemplate.opsForValue();
	     return ops.get(key);	
	}
}
