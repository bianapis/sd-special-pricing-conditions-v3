package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSpecialPricingConditionsDirectoryEntryRetrieveInputModelSpecialPricingConditionsDirectoryEntryInstanceReportRecord
 */
public class CRSpecialPricingConditionsDirectoryEntryRetrieveInputModelSpecialPricingConditionsDirectoryEntryInstanceReportRecord   {
  private String specialPricingConditionsDirectoryEntryInstanceReportReference = null;

  private String specialPricingConditionsDirectoryEntryInstanceReportType = null;

  private String specialPricingConditionsDirectoryEntryInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return specialPricingConditionsDirectoryEntryInstanceReportReference
  **/

  public String getSpecialPricingConditionsDirectoryEntryInstanceReportReference() {
    return specialPricingConditionsDirectoryEntryInstanceReportReference;
  }

  public void setSpecialPricingConditionsDirectoryEntryInstanceReportReference(String specialPricingConditionsDirectoryEntryInstanceReportReference) {
    this.specialPricingConditionsDirectoryEntryInstanceReportReference = specialPricingConditionsDirectoryEntryInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return specialPricingConditionsDirectoryEntryInstanceReportType
  **/

  public String getSpecialPricingConditionsDirectoryEntryInstanceReportType() {
    return specialPricingConditionsDirectoryEntryInstanceReportType;
  }

  public void setSpecialPricingConditionsDirectoryEntryInstanceReportType(String specialPricingConditionsDirectoryEntryInstanceReportType) {
    this.specialPricingConditionsDirectoryEntryInstanceReportType = specialPricingConditionsDirectoryEntryInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return specialPricingConditionsDirectoryEntryInstanceReportParameters
  **/

  public String getSpecialPricingConditionsDirectoryEntryInstanceReportParameters() {
    return specialPricingConditionsDirectoryEntryInstanceReportParameters;
  }

  public void setSpecialPricingConditionsDirectoryEntryInstanceReportParameters(String specialPricingConditionsDirectoryEntryInstanceReportParameters) {
    this.specialPricingConditionsDirectoryEntryInstanceReportParameters = specialPricingConditionsDirectoryEntryInstanceReportParameters;
  }


}

