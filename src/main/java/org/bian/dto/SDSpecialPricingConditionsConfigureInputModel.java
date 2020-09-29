package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSpecialPricingConditionsConfigureInputModelSpecialPricingConditionsServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDSpecialPricingConditionsConfigureInputModel
 */
public class SDSpecialPricingConditionsConfigureInputModel   {
  private Object specialPricingConditionsConfigurationActionTaskRecord = null;

  private String specialPricingConditionsServicingSessionReference = null;

  private String specialPricingConditionsServiceReference = null;

  private SDSpecialPricingConditionsConfigureInputModelSpecialPricingConditionsServiceConfigurationRecord specialPricingConditionsServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return specialPricingConditionsServiceReference
  **/

  public String getSpecialPricingConditionsServiceReference() {
    return specialPricingConditionsServiceReference;
  }

  public void setSpecialPricingConditionsServiceReference(String specialPricingConditionsServiceReference) {
    this.specialPricingConditionsServiceReference = specialPricingConditionsServiceReference;
  }


  /**
   * Get specialPricingConditionsServiceConfigurationRecord
   * @return specialPricingConditionsServiceConfigurationRecord
  **/

  public SDSpecialPricingConditionsConfigureInputModelSpecialPricingConditionsServiceConfigurationRecord getSpecialPricingConditionsServiceConfigurationRecord() {
    return specialPricingConditionsServiceConfigurationRecord;
  }

  public void setSpecialPricingConditionsServiceConfigurationRecord(SDSpecialPricingConditionsConfigureInputModelSpecialPricingConditionsServiceConfigurationRecord specialPricingConditionsServiceConfigurationRecord) {
    this.specialPricingConditionsServiceConfigurationRecord = specialPricingConditionsServiceConfigurationRecord;
  }


}

