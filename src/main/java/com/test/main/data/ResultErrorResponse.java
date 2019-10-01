package com.test.main.data;

public class ResultErrorResponse {

  private int statusCode;
  private String errorMessage;
  private long errorTimestamp;

  public ResultErrorResponse() {

  }

  public ResultErrorResponse(int statusCode, String errorMessage, long errorTimestamp) {
    this.statusCode = statusCode;
    this.errorMessage = errorMessage;
    this.errorTimestamp = errorTimestamp;
  }

  public int getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(int statusCode) {
    this.statusCode = statusCode;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public long getErrorTimestamp() {
    return errorTimestamp;
  }

  public void setErrorTimestamp(long errorTimestamp) {
    this.errorTimestamp = errorTimestamp;
  }


}
