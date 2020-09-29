package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSpecialPricingConditionsDirectoryEntryRequestOutputModel
 */
public class CRSpecialPricingConditionsDirectoryEntryRequestOutputModel   {
  private String specialPricingConditionsDirectoryEntrySchedule = null;

  private String specialPricingConditionsDirectoryEntryVersion = null;

  private String specialPricingConditionsDirectoryEntryStatus = null;

  private String specialPricingConditionsDirectoryEntryUsageLog = null;

  private String specialPricingConditionsDirectoryEntryUpdateLog = null;

  private String specialPricingConditionsDirectoryEntryServiceConfiguration = null;

  private String specialPricingConditionsDirectoryEntryRequestActionTaskReference = null;

  private Object specialPricingConditionsDirectoryEntryRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Special Pricing Conditions Directory Entry instance request service call 
   * @return specialPricingConditionsDirectoryEntryRequestActionTaskReference
  **/

  public String getSpecialPricingConditionsDirectoryEntryRequestActionTaskReference() {
    return specialPricingConditionsDirectoryEntryRequestActionTaskReference;
  }

  public void setSpecialPricingConditionsDirectoryEntryRequestActionTaskReference(String specialPricingConditionsDirectoryEntryRequestActionTaskReference) {
    this.specialPricingConditionsDirectoryEntryRequestActionTaskReference = specialPricingConditionsDirectoryEntryRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return specialPricingConditionsDirectoryEntryRequestActionTaskRecord
  **/

  public Object getSpecialPricingConditionsDirectoryEntryRequestActionTaskRecord() {
    return specialPricingConditionsDirectoryEntryRequestActionTaskRecord;
  }

  public void setSpecialPricingConditionsDirectoryEntryRequestActionTaskRecord(Object specialPricingConditionsDirectoryEntryRequestActionTaskRecord) {
    this.specialPricingConditionsDirectoryEntryRequestActionTaskRecord = specialPricingConditionsDirectoryEntryRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

