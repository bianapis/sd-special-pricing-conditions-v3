package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSpecialPricingConditionsDirectoryEntryRetrieveOutputModelSpecialPricingConditionsDirectoryEntryInstanceReportRecord
 */
public class CRSpecialPricingConditionsDirectoryEntryRetrieveOutputModelSpecialPricingConditionsDirectoryEntryInstanceReportRecord   {
  private String specialPricingConditionsDirectoryEntryInstanceReportData = null;

  private String specialPricingConditionsDirectoryEntryInstanceReportType = null;

  private Object specialPricingConditionsDirectoryEntryInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return specialPricingConditionsDirectoryEntryInstanceReportData
  **/

  public String getSpecialPricingConditionsDirectoryEntryInstanceReportData() {
    return specialPricingConditionsDirectoryEntryInstanceReportData;
  }

  public void setSpecialPricingConditionsDirectoryEntryInstanceReportData(String specialPricingConditionsDirectoryEntryInstanceReportData) {
    this.specialPricingConditionsDirectoryEntryInstanceReportData = specialPricingConditionsDirectoryEntryInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return specialPricingConditionsDirectoryEntryInstanceReport
  **/

  public Object getSpecialPricingConditionsDirectoryEntryInstanceReport() {
    return specialPricingConditionsDirectoryEntryInstanceReport;
  }

  public void setSpecialPricingConditionsDirectoryEntryInstanceReport(Object specialPricingConditionsDirectoryEntryInstanceReport) {
    this.specialPricingConditionsDirectoryEntryInstanceReport = specialPricingConditionsDirectoryEntryInstanceReport;
  }


}

