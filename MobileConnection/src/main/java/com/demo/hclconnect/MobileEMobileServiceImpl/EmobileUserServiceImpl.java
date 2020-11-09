package com.demo.hclconnect.MobileEMobileServiceImpl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.demo.hclconnect.MobileConnection.Repository.EmobileRepository;
import com.demo.hclconnect.MobileController.EMobileConnectionGetStatusAndDetails;
import com.demo.hclconnect.MobileEMobileException.InvalidInputException;
import com.demo.hclconnect.MobileNewRequestResponseDTO.EMobileResponseDetailsDTO;
import com.demo.hclconnect.enums.ResponseEnum;

public class EmobileUserServiceImpl {
	
	private static final String EMOBILE_NEW_CONNECTION_DETAILS_FOR_THE_ID = "EMobileConnection details for the id:";
	private static final Logger logger = LoggerFactory.getLogger(EMobileConnectionGetStatusAndDetails.class);

	@Autowired
	private EmobileRepository emobileRepository;
	
	
	public EMobileResponseDetailsDTO getConnectionDetails(Integer requestId) throws Exception {
		Optional<EMobileResponseDetailsDTO> eMobileResponseDetailsDTO= emobileRepository.findById(requestId);
		logger.info(EMOBILE_NEW_CONNECTION_DETAILS_FOR_THE_ID + requestId);
		if (!eMobileResponseDetailsDTO.isPresent()) {
			throw new Exception(ResponseEnum.SVC0006.createResponseMessage(String.valueOf(requestId)));
		}
		EMobileResponseDetailsDTO eMobileResponseDetails = new EMobileResponseDetailsDTO();
		
		return eMobileResponseDetails;
	}


}
