package com.demo.hclconnect.MobileEMobileService;

import com.demo.hclconnect.MobileNewRequestResponseDTO.EMobileResponseDetailsDTO;


public interface EmobileService {

	/**
	 * method will return the details for the requestId of particular id
	 * 
	 * @param requestId
	 *            id of the requestId
	 * @return requestId details
	 * @throws InvalidInputException
	 */
	EMobileResponseDetailsDTO getConnectionDetails(Integer requestId) throws Exception;

	
}
