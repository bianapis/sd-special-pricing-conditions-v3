package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPricingTermsRetrieveOutputModelPricingTermsInstanceAnalysis
 */
public class BQPricingTermsRetrieveOutputModelPricingTermsInstanceAnalysis   {
  private Object pricingTermsInstanceAnalysisRecord = null;

  private String pricingTermsInstanceAnalysisReportType = null;

  private String pricingTermsInstanceAnalysisParameters = null;

  private Object pricingTermsInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return pricingTermsInstanceAnalysisRecord
  **/

  public Object getPricingTermsInstanceAnalysisRecord() {
    return pricingTermsInstanceAnalysisRecord;
  }

  public void setPricingTermsInstanceAnalysisRecord(Object pricingTermsInstanceAnalysisRecord) {
    this.pricingTermsInstanceAnalysisRecord = pricingTermsInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return pricingTermsInstanceAnalysisReportType
  **/

  public String getPricingTermsInstanceAnalysisReportType() {
    return pricingTermsInstanceAnalysisReportType;
  }

  public void setPricingTermsInstanceAnalysisReportType(String pricingTermsInstanceAnalysisReportType) {
    this.pricingTermsInstanceAnalysisReportType = pricingTermsInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return pricingTermsInstanceAnalysisParameters
  **/

  public String getPricingTermsInstanceAnalysisParameters() {
    return pricingTermsInstanceAnalysisParameters;
  }

  public void setPricingTermsInstanceAnalysisParameters(String pricingTermsInstanceAnalysisParameters) {
    this.pricingTermsInstanceAnalysisParameters = pricingTermsInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return pricingTermsInstanceAnalysisReport
  **/

  public Object getPricingTermsInstanceAnalysisReport() {
    return pricingTermsInstanceAnalysisReport;
  }

  public void setPricingTermsInstanceAnalysisReport(Object pricingTermsInstanceAnalysisReport) {
    this.pricingTermsInstanceAnalysisReport = pricingTermsInstanceAnalysisReport;
  }


}

