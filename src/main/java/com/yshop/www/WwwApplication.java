package com.yshop.www;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WwwApplication {

    private static Logger LOG = LoggerFactory.getLogger(WwwApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(WwwApplication.class, args);
        LOG.info("------------Main Class Logger----------");
	}

}
