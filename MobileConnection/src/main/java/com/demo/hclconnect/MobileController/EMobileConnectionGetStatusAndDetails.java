/**
 * 
 */
package com.demo.hclconnect.MobileController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.hclconnect.MobileEMobileException.InvalidInputException;
import com.demo.hclconnect.MobileEMobileService.EmobileService;
import com.demo.hclconnect.MobileNewRequestResponseDTO.EMobileResponseDetailsDTO;

/**
 * @author JhaA
 *
 */


/**
 * this method id used to get the New Connection details details for particular id
 * 
 * @param ConnectionId
 *            is ConnectionId for which the details are required
 * @return ConnectionId details
 * @throws InvalidInputException
 */

@CrossOrigin
@RestController
@RequestMapping("/GetEMobileConnection")
public class EMobileConnectionGetStatusAndDetails {
	private static final String STATUS_CODE = " status code ";

	private static final Logger logger = LoggerFactory.getLogger(EMobileConnectionGetStatusAndDetails.class);
	@Autowired
	private EmobileService emobileService;
	
	@GetMapping
	public ResponseEntity<EMobileResponseDetailsDTO> getDetails(@RequestParam("requestId") Integer requestId)
			throws Exception {
		if (requestId == null) {
			throw new InvalidInputException("RequestId Id is missing."); 
			
		}
		EMobileResponseDetailsDTO eMobileResponseDetailsDTO = emobileService.getConnectionDetails(requestId);
		logger.debug("project fetched successfully for id: " + requestId + STATUS_CODE + HttpStatus.OK);
		
		return new ResponseEntity<>(eMobileResponseDetailsDTO, HttpStatus.OK);

	}
}
