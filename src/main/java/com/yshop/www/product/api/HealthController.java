package com.yshop.www.product.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    private static final Logger logger = LoggerFactory.getLogger(HealthController.class);

    @GetMapping("/")
    public String index() {
        logger.trace("A TRACE HealthController Message");
        logger.debug("A DEBUG HealthController Message");
        logger.info("An INFO HealthController Message"); // Default minimum visible level
        logger.warn("A WARN HealthController Message");
        logger.error("An ERROR HealthController Message");
        return "Ok Running!";
    }


}
