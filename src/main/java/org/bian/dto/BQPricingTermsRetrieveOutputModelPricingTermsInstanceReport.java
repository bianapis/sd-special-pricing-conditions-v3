package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPricingTermsRetrieveOutputModelPricingTermsInstanceReport
 */
public class BQPricingTermsRetrieveOutputModelPricingTermsInstanceReport   {
  private Object pricingTermsInstanceReportRecord = null;

  private String pricingTermsInstanceReportType = null;

  private String pricingTermsInstanceReportParameters = null;

  private Object pricingTermsInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return pricingTermsInstanceReportRecord
  **/

  public Object getPricingTermsInstanceReportRecord() {
    return pricingTermsInstanceReportRecord;
  }

  public void setPricingTermsInstanceReportRecord(Object pricingTermsInstanceReportRecord) {
    this.pricingTermsInstanceReportRecord = pricingTermsInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return pricingTermsInstanceReportType
  **/

  public String getPricingTermsInstanceReportType() {
    return pricingTermsInstanceReportType;
  }

  public void setPricingTermsInstanceReportType(String pricingTermsInstanceReportType) {
    this.pricingTermsInstanceReportType = pricingTermsInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return pricingTermsInstanceReportParameters
  **/

  public String getPricingTermsInstanceReportParameters() {
    return pricingTermsInstanceReportParameters;
  }

  public void setPricingTermsInstanceReportParameters(String pricingTermsInstanceReportParameters) {
    this.pricingTermsInstanceReportParameters = pricingTermsInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return pricingTermsInstanceReport
  **/

  public Object getPricingTermsInstanceReport() {
    return pricingTermsInstanceReport;
  }

  public void setPricingTermsInstanceReport(Object pricingTermsInstanceReport) {
    this.pricingTermsInstanceReport = pricingTermsInstanceReport;
  }


}

