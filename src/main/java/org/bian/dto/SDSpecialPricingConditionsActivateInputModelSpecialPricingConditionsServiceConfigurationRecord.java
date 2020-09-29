package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSpecialPricingConditionsActivateInputModelSpecialPricingConditionsServiceConfigurationRecordSpecialPricingConditionsServiceConfigurationSetup;

import javax.validation.Valid;
  
/**
 * SDSpecialPricingConditionsActivateInputModelSpecialPricingConditionsServiceConfigurationRecord
 */
public class SDSpecialPricingConditionsActivateInputModelSpecialPricingConditionsServiceConfigurationRecord   {
  private String specialPricingConditionsServiceConfigurationSettingReference = null;

  private String specialPricingConditionsServiceConfigurationSettingType = null;

  private SDSpecialPricingConditionsActivateInputModelSpecialPricingConditionsServiceConfigurationRecordSpecialPricingConditionsServiceConfigurationSetup specialPricingConditionsServiceConfigurationSetup = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return specialPricingConditionsServiceConfigurationSettingReference
  **/

  public String getSpecialPricingConditionsServiceConfigurationSettingReference() {
    return specialPricingConditionsServiceConfigurationSettingReference;
  }

  public void setSpecialPricingConditionsServiceConfigurationSettingReference(String specialPricingConditionsServiceConfigurationSettingReference) {
    this.specialPricingConditionsServiceConfigurationSettingReference = specialPricingConditionsServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return specialPricingConditionsServiceConfigurationSettingType
  **/

  public String getSpecialPricingConditionsServiceConfigurationSettingType() {
    return specialPricingConditionsServiceConfigurationSettingType;
  }

  public void setSpecialPricingConditionsServiceConfigurationSettingType(String specialPricingConditionsServiceConfigurationSettingType) {
    this.specialPricingConditionsServiceConfigurationSettingType = specialPricingConditionsServiceConfigurationSettingType;
  }


  /**
   * Get specialPricingConditionsServiceConfigurationSetup
   * @return specialPricingConditionsServiceConfigurationSetup
  **/

  public SDSpecialPricingConditionsActivateInputModelSpecialPricingConditionsServiceConfigurationRecordSpecialPricingConditionsServiceConfigurationSetup getSpecialPricingConditionsServiceConfigurationSetup() {
    return specialPricingConditionsServiceConfigurationSetup;
  }

  public void setSpecialPricingConditionsServiceConfigurationSetup(SDSpecialPricingConditionsActivateInputModelSpecialPricingConditionsServiceConfigurationRecordSpecialPricingConditionsServiceConfigurationSetup specialPricingConditionsServiceConfigurationSetup) {
    this.specialPricingConditionsServiceConfigurationSetup = specialPricingConditionsServiceConfigurationSetup;
  }


}

