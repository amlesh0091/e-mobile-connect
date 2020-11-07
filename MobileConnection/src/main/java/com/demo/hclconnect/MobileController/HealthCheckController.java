
package com.demo.hclconnect.MobileController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

	@RequestMapping(value = "/health-check", method = RequestMethod.HEAD)
	public void healthCheck() {

	}

}
