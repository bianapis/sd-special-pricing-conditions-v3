package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSpecialPricingConditionsDirectoryEntryRetrieveOutputModelSpecialPricingConditionsDirectoryEntryInstanceAnalysis;
import org.bian.dto.CRSpecialPricingConditionsDirectoryEntryRetrieveOutputModelSpecialPricingConditionsDirectoryEntryInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRSpecialPricingConditionsDirectoryEntryRetrieveOutputModel
 */
public class CRSpecialPricingConditionsDirectoryEntryRetrieveOutputModel   {
  private String specialPricingConditionsDirectoryEntryDescription = null;

  private String specialPricingConditionsDirectoryEntrySchedule = null;

  private String specialPricingConditionsDirectoryEntryVersion = null;

  private String specialPricingConditionsDirectoryEntryStatus = null;

  private String specialPricingConditionsDirectoryEntryUsageLog = null;

  private String specialPricingConditionsDirectoryEntryUpdateLog = null;

  private String specialPricingConditionsDirectoryEntryServiceConfiguration = null;

  private String specialPricingConditionsDirectoryEntryRetrieveActionTaskReference = null;

  private Object specialPricingConditionsDirectoryEntryRetrieveActionTaskRecord = null;

  private String specialPricingConditionsDirectoryEntryRetrieveActionResponse = null;

  private CRSpecialPricingConditionsDirectoryEntryRetrieveOutputModelSpecialPricingConditionsDirectoryEntryInstanceReportRecord specialPricingConditionsDirectoryEntryInstanceReportRecord = null;

  private CRSpecialPricingConditionsDirectoryEntryRetrieveOutputModelSpecialPricingConditionsDirectoryEntryInstanceAnalysis specialPricingConditionsDirectoryEntryInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation of Special Pricing Conditions Directory Entry 
   * @return specialPricingConditionsDirectoryEntryDescription
  **/

  public String getSpecialPricingConditionsDirectoryEntryDescription() {
    return specialPricingConditionsDirectoryEntryDescription;
  }

  public void setSpecialPricingConditionsDirectoryEntryDescription(String specialPricingConditionsDirectoryEntryDescription) {
    this.specialPricingConditionsDirectoryEntryDescription = specialPricingConditionsDirectoryEntryDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timetable of Special Pricing Conditions Directory Entry 
   * @return specialPricingConditionsDirectoryEntrySchedule
  **/

  public String getSpecialPricingConditionsDirectoryEntrySchedule() {
    return specialPricingConditionsDirectoryEntrySchedule;
  }

  public void setSpecialPricingConditionsDirectoryEntrySchedule(String specialPricingConditionsDirectoryEntrySchedule) {
    this.specialPricingConditionsDirectoryEntrySchedule = specialPricingConditionsDirectoryEntrySchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version of Special Pricing Conditions Directory Entry 
   * @return specialPricingConditionsDirectoryEntryVersion
  **/

  public String getSpecialPricingConditionsDirectoryEntryVersion() {
    return specialPricingConditionsDirectoryEntryVersion;
  }

  public void setSpecialPricingConditionsDirectoryEntryVersion(String specialPricingConditionsDirectoryEntryVersion) {
    this.specialPricingConditionsDirectoryEntryVersion = specialPricingConditionsDirectoryEntryVersion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of Special Pricing Conditions Directory Entry 
   * @return specialPricingConditionsDirectoryEntryStatus
  **/

  public String getSpecialPricingConditionsDirectoryEntryStatus() {
    return specialPricingConditionsDirectoryEntryStatus;
  }

  public void setSpecialPricingConditionsDirectoryEntryStatus(String specialPricingConditionsDirectoryEntryStatus) {
    this.specialPricingConditionsDirectoryEntryStatus = specialPricingConditionsDirectoryEntryStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the log of (usage) ativities/events of Special Pricing Conditions Directory Entry 
   * @return specialPricingConditionsDirectoryEntryUsageLog
  **/

  public String getSpecialPricingConditionsDirectoryEntryUsageLog() {
    return specialPricingConditionsDirectoryEntryUsageLog;
  }

  public void setSpecialPricingConditionsDirectoryEntryUsageLog(String specialPricingConditionsDirectoryEntryUsageLog) {
    this.specialPricingConditionsDirectoryEntryUsageLog = specialPricingConditionsDirectoryEntryUsageLog;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the log of (update) ativities/events of Special Pricing Conditions Directory Entry 
   * @return specialPricingConditionsDirectoryEntryUpdateLog
  **/

  public String getSpecialPricingConditionsDirectoryEntryUpdateLog() {
    return specialPricingConditionsDirectoryEntryUpdateLog;
  }

  public void setSpecialPricingConditionsDirectoryEntryUpdateLog(String specialPricingConditionsDirectoryEntryUpdateLog) {
    this.specialPricingConditionsDirectoryEntryUpdateLog = specialPricingConditionsDirectoryEntryUpdateLog;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The configuration of Special Pricing Conditions Directory Entry 
   * @return specialPricingConditionsDirectoryEntryServiceConfiguration
  **/

  public String getSpecialPricingConditionsDirectoryEntryServiceConfiguration() {
    return specialPricingConditionsDirectoryEntryServiceConfiguration;
  }

  public void setSpecialPricingConditionsDirectoryEntryServiceConfiguration(String specialPricingConditionsDirectoryEntryServiceConfiguration) {
    this.specialPricingConditionsDirectoryEntryServiceConfiguration = specialPricingConditionsDirectoryEntryServiceConfiguration;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Special Pricing Conditions Directory Entry instance retrieve service call 
   * @return specialPricingConditionsDirectoryEntryRetrieveActionTaskReference
  **/

  public String getSpecialPricingConditionsDirectoryEntryRetrieveActionTaskReference() {
    return specialPricingConditionsDirectoryEntryRetrieveActionTaskReference;
  }

  public void setSpecialPricingConditionsDirectoryEntryRetrieveActionTaskReference(String specialPricingConditionsDirectoryEntryRetrieveActionTaskReference) {
    this.specialPricingConditionsDirectoryEntryRetrieveActionTaskReference = specialPricingConditionsDirectoryEntryRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return specialPricingConditionsDirectoryEntryRetrieveActionResponse
  **/

  public String getSpecialPricingConditionsDirectoryEntryRetrieveActionResponse() {
    return specialPricingConditionsDirectoryEntryRetrieveActionResponse;
  }

  public void setSpecialPricingConditionsDirectoryEntryRetrieveActionResponse(String specialPricingConditionsDirectoryEntryRetrieveActionResponse) {
    this.specialPricingConditionsDirectoryEntryRetrieveActionResponse = specialPricingConditionsDirectoryEntryRetrieveActionResponse;
  }


  /**
   * Get specialPricingConditionsDirectoryEntryInstanceReportRecord
   * @return specialPricingConditionsDirectoryEntryInstanceReportRecord
  **/

  public CRSpecialPricingConditionsDirectoryEntryRetrieveOutputModelSpecialPricingConditionsDirectoryEntryInstanceReportRecord getSpecialPricingConditionsDirectoryEntryInstanceReportRecord() {
    return specialPricingConditionsDirectoryEntryInstanceReportRecord;
  }

  public void setSpecialPricingConditionsDirectoryEntryInstanceReportRecord(CRSpecialPricingConditionsDirectoryEntryRetrieveOutputModelSpecialPricingConditionsDirectoryEntryInstanceReportRecord specialPricingConditionsDirectoryEntryInstanceReportRecord) {
    this.specialPricingConditionsDirectoryEntryInstanceReportRecord = specialPricingConditionsDirectoryEntryInstanceReportRecord;
  }


  /**
   * Get specialPricingConditionsDirectoryEntryInstanceAnalysis
   * @return specialPricingConditionsDirectoryEntryInstanceAnalysis
  **/

  public CRSpecialPricingConditionsDirectoryEntryRetrieveOutputModelSpecialPricingConditionsDirectoryEntryInstanceAnalysis getSpecialPricingConditionsDirectoryEntryInstanceAnalysis() {
    return specialPricingConditionsDirectoryEntryInstanceAnalysis;
  }

  public void setSpecialPricingConditionsDirectoryEntryInstanceAnalysis(CRSpecialPricingConditionsDirectoryEntryRetrieveOutputModelSpecialPricingConditionsDirectoryEntryInstanceAnalysis specialPricingConditionsDirectoryEntryInstanceAnalysis) {
    this.specialPricingConditionsDirectoryEntryInstanceAnalysis = specialPricingConditionsDirectoryEntryInstanceAnalysis;
  }


}

