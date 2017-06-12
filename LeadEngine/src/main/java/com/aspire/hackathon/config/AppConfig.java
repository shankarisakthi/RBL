package com.aspire.hackathon.config;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

@Configuration
@ComponentScan(basePackages = "com.aspire")
public class AppConfig {
	
	@Bean
	public MongoDbFactory mongoDbFactory() throws Exception {
		MongoCredential crendential = MongoCredential.createCredential("admin", "admin", "admin".toCharArray());
		MongoClient mongoClient = new MongoClient(new ServerAddress("localhost", 27017), Arrays.asList(crendential));
		return new SimpleMongoDbFactory(mongoClient, "admin");
	}
	
	@Bean
	public MongoTemplate mongoTemplate() throws Exception {
		return new MongoTemplate(mongoDbFactory());
	}
	
}
