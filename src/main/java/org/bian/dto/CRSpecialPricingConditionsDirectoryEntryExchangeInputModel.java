package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSpecialPricingConditionsDirectoryEntryExchangeInputModelSpecialPricingConditionsDirectoryEntryExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRSpecialPricingConditionsDirectoryEntryExchangeInputModel
 */
public class CRSpecialPricingConditionsDirectoryEntryExchangeInputModel   {
  private String specialPricingConditionsServicingSessionReference = null;

  private String specialPricingConditionsDirectoryEntryInstanceReference = null;

  private String specialPricingConditionsDirectoryEntryDescription = null;

  private String specialPricingConditionsDirectoryEntrySchedule = null;

  private String specialPricingConditionsDirectoryEntryVersion = null;

  private String specialPricingConditionsDirectoryEntryStatus = null;

  private String specialPricingConditionsDirectoryEntryUsageLog = null;

  private String specialPricingConditionsDirectoryEntryUpdateLog = null;

  private String specialPricingConditionsDirectoryEntryServiceConfiguration = null;

  private Object specialPricingConditionsDirectoryEntryExchangeActionTaskRecord = null;

  private CRSpecialPricingConditionsDirectoryEntryExchangeInputModelSpecialPricingConditionsDirectoryEntryExchangeActionRequest specialPricingConditionsDirectoryEntryExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return specialPricingConditionsServicingSessionReference
  **/

  public String getSpecialPricingConditionsServicingSessionReference() {
    return specialPricingConditionsServicingSessionReference;
  }

  public void setSpecialPricingConditionsServicingSessionReference(String specialPricingConditionsServicingSessionReference) {
    this.specialPricingConditionsServicingSessionReference = specialPricingConditionsServicingSessionReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return specialPricingConditionsDirectoryEntryExchangeActionTaskRecord
  **/

  public Object getSpecialPricingConditionsDirectoryEntryExchangeActionTaskRecord() {
    return specialPricingConditionsDirectoryEntryExchangeActionTaskRecord;
  }

  public void setSpecialPricingConditionsDirectoryEntryExchangeActionTaskRecord(Object specialPricingConditionsDirectoryEntryExchangeActionTaskRecord) {
    this.specialPricingConditionsDirectoryEntryExchangeActionTaskRecord = specialPricingConditionsDirectoryEntryExchangeActionTaskRecord;
  }


  /**
   * Get specialPricingConditionsDirectoryEntryExchangeActionRequest
   * @return specialPricingConditionsDirectoryEntryExchangeActionRequest
  **/

  public CRSpecialPricingConditionsDirectoryEntryExchangeInputModelSpecialPricingConditionsDirectoryEntryExchangeActionRequest getSpecialPricingConditionsDirectoryEntryExchangeActionRequest() {
    return specialPricingConditionsDirectoryEntryExchangeActionRequest;
  }

  public void setSpecialPricingConditionsDirectoryEntryExchangeActionRequest(CRSpecialPricingConditionsDirectoryEntryExchangeInputModelSpecialPricingConditionsDirectoryEntryExchangeActionRequest specialPricingConditionsDirectoryEntryExchangeActionRequest) {
    this.specialPricingConditionsDirectoryEntryExchangeActionRequest = specialPricingConditionsDirectoryEntryExchangeActionRequest;
  }


}

