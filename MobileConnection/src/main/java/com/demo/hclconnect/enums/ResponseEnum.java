package com.demo.hclconnect.enums;

public enum ResponseEnum {

	SVC0001("SVC0001", "System Exception"),
	SVC0005("SVC0005", "Invalid Input - %s"), 
	SVC0006("SVC0006", "Entity Does not Exist for - %s"),
	SVC0008("SVC0008", "Forbidden - %s"),
	SVC0014("SVC0014", "Unauthorised user"), 
	SVC0015("SVC0015", "Invalid action- Project is already published"), 
	SVC0016("SVC0016", "unprocessable entity"),
	SVC0013("SVC0013", "File Upload Error - %s"),
	SVC0018("SVC0018", "project Logo not found- %s"),
	SVC0017("SVC0017", "File Download Error - %s"),
	SVC0024("SVC0024", "project document not found- %s");
	

	private String responseCode;
	private String responseMessage;

	private ResponseEnum(String responseCode, String responseMessage) {
		this.responseCode = responseCode;
		this.responseMessage = responseMessage;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public String createResponseMessage(String errMsg) {
		String errorResponse = String.format(responseMessage, errMsg);
		return errorResponse;
	}

}
