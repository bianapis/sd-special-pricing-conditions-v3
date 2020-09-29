package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSpecialPricingConditionsDirectoryEntryInitiateOutputModel
 */
public class CRSpecialPricingConditionsDirectoryEntryInitiateOutputModel   {
  private String specialPricingConditionsDirectoryEntryInstanceReference = null;

  private String specialPricingConditionsDirectoryEntryInitiateActionReference = null;

  private Object specialPricingConditionsDirectoryEntryInitiateActionRecord = null;

  private String specialPricingConditionsDirectoryEntryInstanceStatus = null;

  private String specialPricingConditionsDirectoryEntrySchedule = null;

  private String specialPricingConditionsDirectoryEntryVersion = null;

  private String specialPricingConditionsDirectoryEntryStatus = null;

  private String specialPricingConditionsDirectoryEntryUsageLog = null;

  private String specialPricingConditionsDirectoryEntryUpdateLog = null;

  private String specialPricingConditionsDirectoryEntryServiceConfiguration = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Special Pricing Conditions Directory Entry instance 
   * @return specialPricingConditionsDirectoryEntryInstanceReference
  **/

  public String getSpecialPricingConditionsDirectoryEntryInstanceReference() {
    return specialPricingConditionsDirectoryEntryInstanceReference;
  }

  public void setSpecialPricingConditionsDirectoryEntryInstanceReference(String specialPricingConditionsDirectoryEntryInstanceReference) {
    this.specialPricingConditionsDirectoryEntryInstanceReference = specialPricingConditionsDirectoryEntryInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return specialPricingConditionsDirectoryEntryInitiateActionReference
  **/

  public String getSpecialPricingConditionsDirectoryEntryInitiateActionReference() {
    return specialPricingConditionsDirectoryEntryInitiateActionReference;
  }

  public void setSpecialPricingConditionsDirectoryEntryInitiateActionReference(String specialPricingConditionsDirectoryEntryInitiateActionReference) {
    this.specialPricingConditionsDirectoryEntryInitiateActionReference = specialPricingConditionsDirectoryEntryInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return specialPricingConditionsDirectoryEntryInitiateActionRecord
  **/

  public Object getSpecialPricingConditionsDirectoryEntryInitiateActionRecord() {
    return specialPricingConditionsDirectoryEntryInitiateActionRecord;
  }

  public void setSpecialPricingConditionsDirectoryEntryInitiateActionRecord(Object specialPricingConditionsDirectoryEntryInitiateActionRecord) {
    this.specialPricingConditionsDirectoryEntryInitiateActionRecord = specialPricingConditionsDirectoryEntryInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Special Pricing Conditions Directory Entry instance (e.g. initialised, pending, active) 
   * @return specialPricingConditionsDirectoryEntryInstanceStatus
  **/

  public String getSpecialPricingConditionsDirectoryEntryInstanceStatus() {
    return specialPricingConditionsDirectoryEntryInstanceStatus;
  }

  public void setSpecialPricingConditionsDirectoryEntryInstanceStatus(String specialPricingConditionsDirectoryEntryInstanceStatus) {
    this.specialPricingConditionsDirectoryEntryInstanceStatus = specialPricingConditionsDirectoryEntryInstanceStatus;
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


}

