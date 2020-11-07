/**
 * 
 */
package com.demo.hclconnect.MobileController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.hclconnect.MobileNewRequestResponseDTO.EMobileResponseDetailsDTO;
import com.haufe.agilehats.projects.beans.ProjectResponseDto;
import com.haufe.agilehats.projects.enums.ResponseEnum;
import com.haufe.agilehats.projects.exception.InvalidInputException;

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

	/*@GetMapping
	public ResponseEntity<EMobileResponseDetailsDTO> getProject(@RequestParam("requestId") Integer requestId)
			throws InvalidInputException {
		if (requestId == null) {
			throw new InvalidInputException(
					ResponseEnum.SVC0005.createResponseMessage("RequestId Id is missing.")); // "project
		}
		logger.info("Details for project with project id: " + projectId);
		
		logger.debug("project fetched successfully for id: " + projectId + STATUS_CODE + HttpStatus.OK);
		return new ResponseEntity<>(EMobileResponseDetailsDTO, HttpStatus.OK);

	}*/


}
