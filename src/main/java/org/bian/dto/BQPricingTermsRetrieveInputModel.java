package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPricingTermsRetrieveInputModelPricingTermsInstanceAnalysis;
import org.bian.dto.BQPricingTermsRetrieveInputModelPricingTermsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQPricingTermsRetrieveInputModel
 */
public class BQPricingTermsRetrieveInputModel   {
  private Object pricingTermsRetrieveActionTaskRecord = null;

  private String pricingTermsRetrieveActionRequest = null;

  private BQPricingTermsRetrieveInputModelPricingTermsInstanceReport pricingTermsInstanceReport = null;

  private BQPricingTermsRetrieveInputModelPricingTermsInstanceAnalysis pricingTermsInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return pricingTermsRetrieveActionTaskRecord
  **/

  public Object getPricingTermsRetrieveActionTaskRecord() {
    return pricingTermsRetrieveActionTaskRecord;
  }

  public void setPricingTermsRetrieveActionTaskRecord(Object pricingTermsRetrieveActionTaskRecord) {
    this.pricingTermsRetrieveActionTaskRecord = pricingTermsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return pricingTermsRetrieveActionRequest
  **/

  public String getPricingTermsRetrieveActionRequest() {
    return pricingTermsRetrieveActionRequest;
  }

  public void setPricingTermsRetrieveActionRequest(String pricingTermsRetrieveActionRequest) {
    this.pricingTermsRetrieveActionRequest = pricingTermsRetrieveActionRequest;
  }


  /**
   * Get pricingTermsInstanceReport
   * @return pricingTermsInstanceReport
  **/

  public BQPricingTermsRetrieveInputModelPricingTermsInstanceReport getPricingTermsInstanceReport() {
    return pricingTermsInstanceReport;
  }

  public void setPricingTermsInstanceReport(BQPricingTermsRetrieveInputModelPricingTermsInstanceReport pricingTermsInstanceReport) {
    this.pricingTermsInstanceReport = pricingTermsInstanceReport;
  }


  /**
   * Get pricingTermsInstanceAnalysis
   * @return pricingTermsInstanceAnalysis
  **/

  public BQPricingTermsRetrieveInputModelPricingTermsInstanceAnalysis getPricingTermsInstanceAnalysis() {
    return pricingTermsInstanceAnalysis;
  }

  public void setPricingTermsInstanceAnalysis(BQPricingTermsRetrieveInputModelPricingTermsInstanceAnalysis pricingTermsInstanceAnalysis) {
    this.pricingTermsInstanceAnalysis = pricingTermsInstanceAnalysis;
  }


}

