package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSpecialPricingConditionsDirectoryEntryRetrieveOutputModelSpecialPricingConditionsDirectoryEntryInstanceAnalysis
 */
public class CRSpecialPricingConditionsDirectoryEntryRetrieveOutputModelSpecialPricingConditionsDirectoryEntryInstanceAnalysis   {
  private String specialPricingConditionsDirectoryEntryInstanceAnalysisData = null;

  private String specialPricingConditionsDirectoryEntryInstanceAnalysisReportType = null;

  private Object specialPricingConditionsDirectoryEntryInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return specialPricingConditionsDirectoryEntryInstanceAnalysisData
  **/

  public String getSpecialPricingConditionsDirectoryEntryInstanceAnalysisData() {
    return specialPricingConditionsDirectoryEntryInstanceAnalysisData;
  }

  public void setSpecialPricingConditionsDirectoryEntryInstanceAnalysisData(String specialPricingConditionsDirectoryEntryInstanceAnalysisData) {
    this.specialPricingConditionsDirectoryEntryInstanceAnalysisData = specialPricingConditionsDirectoryEntryInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return specialPricingConditionsDirectoryEntryInstanceAnalysisReportType
  **/

  public String getSpecialPricingConditionsDirectoryEntryInstanceAnalysisReportType() {
    return specialPricingConditionsDirectoryEntryInstanceAnalysisReportType;
  }

  public void setSpecialPricingConditionsDirectoryEntryInstanceAnalysisReportType(String specialPricingConditionsDirectoryEntryInstanceAnalysisReportType) {
    this.specialPricingConditionsDirectoryEntryInstanceAnalysisReportType = specialPricingConditionsDirectoryEntryInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return specialPricingConditionsDirectoryEntryInstanceAnalysisReport
  **/

  public Object getSpecialPricingConditionsDirectoryEntryInstanceAnalysisReport() {
    return specialPricingConditionsDirectoryEntryInstanceAnalysisReport;
  }

  public void setSpecialPricingConditionsDirectoryEntryInstanceAnalysisReport(Object specialPricingConditionsDirectoryEntryInstanceAnalysisReport) {
    this.specialPricingConditionsDirectoryEntryInstanceAnalysisReport = specialPricingConditionsDirectoryEntryInstanceAnalysisReport;
  }


}

