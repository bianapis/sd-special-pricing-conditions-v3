package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSpecialPricingConditionsActivateInputModelSpecialPricingConditionsServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDSpecialPricingConditionsActivateInputModel
 */
public class SDSpecialPricingConditionsActivateInputModel   {
  private Object specialPricingConditionsActivationActionTaskRecord = null;

  private String specialPricingConditionsCenterReference = null;

  private String specialPricingConditionsServiceReference = null;

  private SDSpecialPricingConditionsActivateInputModelSpecialPricingConditionsServiceConfigurationRecord specialPricingConditionsServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return specialPricingConditionsCenterReference
  **/

  public String getSpecialPricingConditionsCenterReference() {
    return specialPricingConditionsCenterReference;
  }

  public void setSpecialPricingConditionsCenterReference(String specialPricingConditionsCenterReference) {
    this.specialPricingConditionsCenterReference = specialPricingConditionsCenterReference;
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

  public SDSpecialPricingConditionsActivateInputModelSpecialPricingConditionsServiceConfigurationRecord getSpecialPricingConditionsServiceConfigurationRecord() {
    return specialPricingConditionsServiceConfigurationRecord;
  }

  public void setSpecialPricingConditionsServiceConfigurationRecord(SDSpecialPricingConditionsActivateInputModelSpecialPricingConditionsServiceConfigurationRecord specialPricingConditionsServiceConfigurationRecord) {
    this.specialPricingConditionsServiceConfigurationRecord = specialPricingConditionsServiceConfigurationRecord;
  }


}

