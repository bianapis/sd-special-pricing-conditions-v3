package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSpecialPricingConditionsDirectoryEntryRetrieveInputModelSpecialPricingConditionsDirectoryEntryInstanceAnalysis;
import org.bian.dto.CRSpecialPricingConditionsDirectoryEntryRetrieveInputModelSpecialPricingConditionsDirectoryEntryInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRSpecialPricingConditionsDirectoryEntryRetrieveInputModel
 */
public class CRSpecialPricingConditionsDirectoryEntryRetrieveInputModel   {
  private Object specialPricingConditionsDirectoryEntryRetrieveActionTaskRecord = null;

  private String specialPricingConditionsDirectoryEntryRetrieveActionRequest = null;

  private CRSpecialPricingConditionsDirectoryEntryRetrieveInputModelSpecialPricingConditionsDirectoryEntryInstanceReportRecord specialPricingConditionsDirectoryEntryInstanceReportRecord = null;

  private CRSpecialPricingConditionsDirectoryEntryRetrieveInputModelSpecialPricingConditionsDirectoryEntryInstanceAnalysis specialPricingConditionsDirectoryEntryInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return specialPricingConditionsDirectoryEntryRetrieveActionTaskRecord
  **/

  public Object getSpecialPricingConditionsDirectoryEntryRetrieveActionTaskRecord() {
    return specialPricingConditionsDirectoryEntryRetrieveActionTaskRecord;
  }

  public void setSpecialPricingConditionsDirectoryEntryRetrieveActionTaskRecord(Object specialPricingConditionsDirectoryEntryRetrieveActionTaskRecord) {
    this.specialPricingConditionsDirectoryEntryRetrieveActionTaskRecord = specialPricingConditionsDirectoryEntryRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return specialPricingConditionsDirectoryEntryRetrieveActionRequest
  **/

  public String getSpecialPricingConditionsDirectoryEntryRetrieveActionRequest() {
    return specialPricingConditionsDirectoryEntryRetrieveActionRequest;
  }

  public void setSpecialPricingConditionsDirectoryEntryRetrieveActionRequest(String specialPricingConditionsDirectoryEntryRetrieveActionRequest) {
    this.specialPricingConditionsDirectoryEntryRetrieveActionRequest = specialPricingConditionsDirectoryEntryRetrieveActionRequest;
  }


  /**
   * Get specialPricingConditionsDirectoryEntryInstanceReportRecord
   * @return specialPricingConditionsDirectoryEntryInstanceReportRecord
  **/

  public CRSpecialPricingConditionsDirectoryEntryRetrieveInputModelSpecialPricingConditionsDirectoryEntryInstanceReportRecord getSpecialPricingConditionsDirectoryEntryInstanceReportRecord() {
    return specialPricingConditionsDirectoryEntryInstanceReportRecord;
  }

  public void setSpecialPricingConditionsDirectoryEntryInstanceReportRecord(CRSpecialPricingConditionsDirectoryEntryRetrieveInputModelSpecialPricingConditionsDirectoryEntryInstanceReportRecord specialPricingConditionsDirectoryEntryInstanceReportRecord) {
    this.specialPricingConditionsDirectoryEntryInstanceReportRecord = specialPricingConditionsDirectoryEntryInstanceReportRecord;
  }


  /**
   * Get specialPricingConditionsDirectoryEntryInstanceAnalysis
   * @return specialPricingConditionsDirectoryEntryInstanceAnalysis
  **/

  public CRSpecialPricingConditionsDirectoryEntryRetrieveInputModelSpecialPricingConditionsDirectoryEntryInstanceAnalysis getSpecialPricingConditionsDirectoryEntryInstanceAnalysis() {
    return specialPricingConditionsDirectoryEntryInstanceAnalysis;
  }

  public void setSpecialPricingConditionsDirectoryEntryInstanceAnalysis(CRSpecialPricingConditionsDirectoryEntryRetrieveInputModelSpecialPricingConditionsDirectoryEntryInstanceAnalysis specialPricingConditionsDirectoryEntryInstanceAnalysis) {
    this.specialPricingConditionsDirectoryEntryInstanceAnalysis = specialPricingConditionsDirectoryEntryInstanceAnalysis;
  }


}

