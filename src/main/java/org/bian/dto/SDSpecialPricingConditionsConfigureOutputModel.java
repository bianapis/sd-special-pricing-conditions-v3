package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSpecialPricingConditionsConfigureOutputModelSpecialPricingConditionsServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDSpecialPricingConditionsConfigureOutputModel
 */
public class SDSpecialPricingConditionsConfigureOutputModel   {
  private String specialPricingConditionsConfigurationActionTaskReference = null;

  private Object specialPricingConditionsConfigurationActionTaskRecord = null;

  private SDSpecialPricingConditionsConfigureOutputModelSpecialPricingConditionsServiceConfigurationRecord specialPricingConditionsServiceConfigurationRecord = null;

  private String specialPricingConditionsServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return specialPricingConditionsConfigurationActionTaskReference
  **/

  public String getSpecialPricingConditionsConfigurationActionTaskReference() {
    return specialPricingConditionsConfigurationActionTaskReference;
  }

  public void setSpecialPricingConditionsConfigurationActionTaskReference(String specialPricingConditionsConfigurationActionTaskReference) {
    this.specialPricingConditionsConfigurationActionTaskReference = specialPricingConditionsConfigurationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return specialPricingConditionsConfigurationActionTaskRecord
  **/

  public Object getSpecialPricingConditionsConfigurationActionTaskRecord() {
    return specialPricingConditionsConfigurationActionTaskRecord;
  }

  public void setSpecialPricingConditionsConfigurationActionTaskRecord(Object specialPricingConditionsConfigurationActionTaskRecord) {
    this.specialPricingConditionsConfigurationActionTaskRecord = specialPricingConditionsConfigurationActionTaskRecord;
  }


  /**
   * Get specialPricingConditionsServiceConfigurationRecord
   * @return specialPricingConditionsServiceConfigurationRecord
  **/

  public SDSpecialPricingConditionsConfigureOutputModelSpecialPricingConditionsServiceConfigurationRecord getSpecialPricingConditionsServiceConfigurationRecord() {
    return specialPricingConditionsServiceConfigurationRecord;
  }

  public void setSpecialPricingConditionsServiceConfigurationRecord(SDSpecialPricingConditionsConfigureOutputModelSpecialPricingConditionsServiceConfigurationRecord specialPricingConditionsServiceConfigurationRecord) {
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

