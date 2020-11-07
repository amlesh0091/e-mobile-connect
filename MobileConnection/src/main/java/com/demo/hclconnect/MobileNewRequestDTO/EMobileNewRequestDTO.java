/**
 * 
 */
package com.demo.hclconnect.MobileNewRequestDTO;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;

/**
 * @author JhaA
 *
 */

@Getter
@Setter
public class EMobileNewRequestDTO {

	private String irstName;
	private String lastName;
	private int 	refMobileNumber;
	private String emailId ;
	private String govtId;
	private String planCode;
	private String status;
	private String RequestId;
	private MultipartFile documentFile;


	
}



