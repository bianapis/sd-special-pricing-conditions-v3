package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSpecialPricingConditionsActivateOutputModelSpecialPricingConditionsServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDSpecialPricingConditionsActivateOutputModel
 */
public class SDSpecialPricingConditionsActivateOutputModel   {
  private String specialPricingConditionsActivationActionTaskReference = null;

  private Object specialPricingConditionsActivationActionTaskRecord = null;

  private String specialPricingConditionsServicingSessionReference = null;

  private Object specialPricingConditionsServicingSessionRecord = null;

  private SDSpecialPricingConditionsActivateOutputModelSpecialPricingConditionsServiceConfigurationRecord specialPricingConditionsServiceConfigurationRecord = null;

  private String specialPricingConditionsServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return specialPricingConditionsActivationActionTaskReference
  **/

  public String getSpecialPricingConditionsActivationActionTaskReference() {
    return specialPricingConditionsActivationActionTaskReference;
  }

  public void setSpecialPricingConditionsActivationActionTaskReference(String specialPricingConditionsActivationActionTaskReference) {
    this.specialPricingConditionsActivationActionTaskReference = specialPricingConditionsActivationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return specialPricingConditionsActivationActionTaskRecord
  **/

  public Object getSpecialPricingConditionsActivationActionTaskRecord() {
    return specialPricingConditionsActivationActionTaskRecord;
  }

  public void setSpecialPricingConditionsActivationActionTaskRecord(Object specialPricingConditionsActivationActionTaskRecord) {
    this.specialPricingConditionsActivationActionTaskRecord = specialPricingConditionsActivationActionTaskRecord;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return specialPricingConditionsServicingSessionRecord
  **/

  public Object getSpecialPricingConditionsServicingSessionRecord() {
    return specialPricingConditionsServicingSessionRecord;
  }

  public void setSpecialPricingConditionsServicingSessionRecord(Object specialPricingConditionsServicingSessionRecord) {
    this.specialPricingConditionsServicingSessionRecord = specialPricingConditionsServicingSessionRecord;
  }


  /**
   * Get specialPricingConditionsServiceConfigurationRecord
   * @return specialPricingConditionsServiceConfigurationRecord
  **/

  public SDSpecialPricingConditionsActivateOutputModelSpecialPricingConditionsServiceConfigurationRecord getSpecialPricingConditionsServiceConfigurationRecord() {
    return specialPricingConditionsServiceConfigurationRecord;
  }

  public void setSpecialPricingConditionsServiceConfigurationRecord(SDSpecialPricingConditionsActivateOutputModelSpecialPricingConditionsServiceConfigurationRecord specialPricingConditionsServiceConfigurationRecord) {
    this.specialPricingConditionsServiceConfigurationRecord = specialPricingConditionsServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return specialPricingConditionsServicingSessionStatus
  **/

  public String getSpecialPricingConditionsServicingSessionStatus() {
    return specialPricingConditionsServicingSessionStatus;
  }

  public void setSpecialPricingConditionsServicingSessionStatus(String specialPricingConditionsServicingSessionStatus) {
    this.specialPricingConditionsServicingSessionStatus = specialPricingConditionsServicingSessionStatus;
  }


}

