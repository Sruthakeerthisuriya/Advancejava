package com.Spring.aop.fifth;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.Spring.aop.second.TrackBookServiceAfter;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {
	
	@Bean
	public BookService getBookService() {
		return new BookService();
	}
	
	@Bean
	public TrackBookServiceAfterThrowing getTrackBookServiceAfterThrowing() {
		return new TrackBookServiceAfterThrowing();
	}

}