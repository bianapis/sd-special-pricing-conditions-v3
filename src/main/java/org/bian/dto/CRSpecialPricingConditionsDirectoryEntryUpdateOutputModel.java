package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSpecialPricingConditionsDirectoryEntryUpdateOutputModel
 */
public class CRSpecialPricingConditionsDirectoryEntryUpdateOutputModel   {
  private String specialPricingConditionsDirectoryEntrySchedule = null;

  private String specialPricingConditionsDirectoryEntryVersion = null;

  private String specialPricingConditionsDirectoryEntryStatus = null;

  private String specialPricingConditionsDirectoryEntryUsageLog = null;

  private String specialPricingConditionsDirectoryEntryUpdateLog = null;

  private String specialPricingConditionsDirectoryEntryServiceConfiguration = null;

  private String specialPricingConditionsDirectoryEntryUpdateActionTaskReference = null;

  private Object specialPricingConditionsDirectoryEntryUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return specialPricingConditionsDirectoryEntryUpdateActionTaskReference
  **/

  public String getSpecialPricingConditionsDirectoryEntryUpdateActionTaskReference() {
    return specialPricingConditionsDirectoryEntryUpdateActionTaskReference;
  }

  public void setSpecialPricingConditionsDirectoryEntryUpdateActionTaskReference(String specialPricingConditionsDirectoryEntryUpdateActionTaskReference) {
    this.specialPricingConditionsDirectoryEntryUpdateActionTaskReference = specialPricingConditionsDirectoryEntryUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return specialPricingConditionsDirectoryEntryUpdateActionTaskRecord
  **/

  public Object getSpecialPricingConditionsDirectoryEntryUpdateActionTaskRecord() {
    return specialPricingConditionsDirectoryEntryUpdateActionTaskRecord;
  }

  public void setSpecialPricingConditionsDirectoryEntryUpdateActionTaskRecord(Object specialPricingConditionsDirectoryEntryUpdateActionTaskRecord) {
    this.specialPricingConditionsDirectoryEntryUpdateActionTaskRecord = specialPricingConditionsDirectoryEntryUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

