package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSpecialPricingConditionsConfigureInputModelSpecialPricingConditionsServiceConfigurationRecordSpecialPricingConditionsServiceAgreement;
import org.bian.dto.SDSpecialPricingConditionsConfigureInputModelSpecialPricingConditionsServiceConfigurationRecordSpecialPricingConditionsServiceConfigurationSetup;
import org.bian.dto.SDSpecialPricingConditionsConfigureInputModelSpecialPricingConditionsServiceConfigurationRecordSpecialPricingConditionsServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDSpecialPricingConditionsConfigureInputModelSpecialPricingConditionsServiceConfigurationRecord
 */
public class SDSpecialPricingConditionsConfigureInputModelSpecialPricingConditionsServiceConfigurationRecord   {
  private String specialPricingConditionsServiceConfigurationSettingReference = null;

  private String specialPricingConditionsServiceConfigurationSettingType = null;

  private SDSpecialPricingConditionsConfigureInputModelSpecialPricingConditionsServiceConfigurationRecordSpecialPricingConditionsServiceConfigurationSetup specialPricingConditionsServiceConfigurationSetup = null;

  private SDSpecialPricingConditionsConfigureInputModelSpecialPricingConditionsServiceConfigurationRecordSpecialPricingConditionsServiceSubscription specialPricingConditionsServiceSubscription = null;

  private SDSpecialPricingConditionsConfigureInputModelSpecialPricingConditionsServiceConfigurationRecordSpecialPricingConditionsServiceAgreement specialPricingConditionsServiceAgreement = null;


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

  public SDSpecialPricingConditionsConfigureInputModelSpecialPricingConditionsServiceConfigurationRecordSpecialPricingConditionsServiceConfigurationSetup getSpecialPricingConditionsServiceConfigurationSetup() {
    return specialPricingConditionsServiceConfigurationSetup;
  }

  public void setSpecialPricingConditionsServiceConfigurationSetup(SDSpecialPricingConditionsConfigureInputModelSpecialPricingConditionsServiceConfigurationRecordSpecialPricingConditionsServiceConfigurationSetup specialPricingConditionsServiceConfigurationSetup) {
    this.specialPricingConditionsServiceConfigurationSetup = specialPricingConditionsServiceConfigurationSetup;
  }


  /**
   * Get specialPricingConditionsServiceSubscription
   * @return specialPricingConditionsServiceSubscription
  **/

  public SDSpecialPricingConditionsConfigureInputModelSpecialPricingConditionsServiceConfigurationRecordSpecialPricingConditionsServiceSubscription getSpecialPricingConditionsServiceSubscription() {
    return specialPricingConditionsServiceSubscription;
  }

  public void setSpecialPricingConditionsServiceSubscription(SDSpecialPricingConditionsConfigureInputModelSpecialPricingConditionsServiceConfigurationRecordSpecialPricingConditionsServiceSubscription specialPricingConditionsServiceSubscription) {
    this.specialPricingConditionsServiceSubscription = specialPricingConditionsServiceSubscription;
  }


  /**
   * Get specialPricingConditionsServiceAgreement
   * @return specialPricingConditionsServiceAgreement
  **/

  public SDSpecialPricingConditionsConfigureInputModelSpecialPricingConditionsServiceConfigurationRecordSpecialPricingConditionsServiceAgreement getSpecialPricingConditionsServiceAgreement() {
    return specialPricingConditionsServiceAgreement;
  }

  public void setSpecialPricingConditionsServiceAgreement(SDSpecialPricingConditionsConfigureInputModelSpecialPricingConditionsServiceConfigurationRecordSpecialPricingConditionsServiceAgreement specialPricingConditionsServiceAgreement) {
    this.specialPricingConditionsServiceAgreement = specialPricingConditionsServiceAgreement;
  }


}

