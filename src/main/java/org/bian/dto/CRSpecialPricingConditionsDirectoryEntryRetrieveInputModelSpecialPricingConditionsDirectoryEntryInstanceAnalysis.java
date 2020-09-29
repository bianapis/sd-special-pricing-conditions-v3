package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSpecialPricingConditionsDirectoryEntryRetrieveInputModelSpecialPricingConditionsDirectoryEntryInstanceAnalysis
 */
public class CRSpecialPricingConditionsDirectoryEntryRetrieveInputModelSpecialPricingConditionsDirectoryEntryInstanceAnalysis   {
  private String specialPricingConditionsDirectoryEntryInstanceAnalysisReference = null;

  private String specialPricingConditionsDirectoryEntryInstanceAnalysisReportType = null;

  private String specialPricingConditionsDirectoryEntryInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return specialPricingConditionsDirectoryEntryInstanceAnalysisReference
  **/

  public String getSpecialPricingConditionsDirectoryEntryInstanceAnalysisReference() {
    return specialPricingConditionsDirectoryEntryInstanceAnalysisReference;
  }

  public void setSpecialPricingConditionsDirectoryEntryInstanceAnalysisReference(String specialPricingConditionsDirectoryEntryInstanceAnalysisReference) {
    this.specialPricingConditionsDirectoryEntryInstanceAnalysisReference = specialPricingConditionsDirectoryEntryInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return specialPricingConditionsDirectoryEntryInstanceAnalysisParameters
  **/

  public String getSpecialPricingConditionsDirectoryEntryInstanceAnalysisParameters() {
    return specialPricingConditionsDirectoryEntryInstanceAnalysisParameters;
  }

  public void setSpecialPricingConditionsDirectoryEntryInstanceAnalysisParameters(String specialPricingConditionsDirectoryEntryInstanceAnalysisParameters) {
    this.specialPricingConditionsDirectoryEntryInstanceAnalysisParameters = specialPricingConditionsDirectoryEntryInstanceAnalysisParameters;
  }


}

