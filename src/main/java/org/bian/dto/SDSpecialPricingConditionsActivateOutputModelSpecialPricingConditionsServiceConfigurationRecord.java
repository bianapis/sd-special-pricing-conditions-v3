package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSpecialPricingConditionsActivateInputModelSpecialPricingConditionsServiceConfigurationRecordSpecialPricingConditionsServiceConfigurationSetup;
import org.bian.dto.SDSpecialPricingConditionsActivateOutputModelSpecialPricingConditionsServiceConfigurationRecordSpecialPricingConditionsServiceAgreement;
import org.bian.dto.SDSpecialPricingConditionsActivateOutputModelSpecialPricingConditionsServiceConfigurationRecordSpecialPricingConditionsServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDSpecialPricingConditionsActivateOutputModelSpecialPricingConditionsServiceConfigurationRecord
 */
public class SDSpecialPricingConditionsActivateOutputModelSpecialPricingConditionsServiceConfigurationRecord   {
  private String specialPricingConditionsServiceConfigurationSettingReference = null;

  private String specialPricingConditionsServiceConfigurationSettingDescription = null;

  private SDSpecialPricingConditionsActivateInputModelSpecialPricingConditionsServiceConfigurationRecordSpecialPricingConditionsServiceConfigurationSetup specialPricingConditionsServiceConfigurationSetup = null;

  private SDSpecialPricingConditionsActivateOutputModelSpecialPricingConditionsServiceConfigurationRecordSpecialPricingConditionsServiceSubscription specialPricingConditionsServiceSubscription = null;

  private SDSpecialPricingConditionsActivateOutputModelSpecialPricingConditionsServiceConfigurationRecordSpecialPricingConditionsServiceAgreement specialPricingConditionsServiceAgreement = null;

  private String specialPricingConditionsServiceStatus = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return specialPricingConditionsServiceConfigurationSettingDescription
  **/

  public String getSpecialPricingConditionsServiceConfigurationSettingDescription() {
    return specialPricingConditionsServiceConfigurationSettingDescription;
  }

  public void setSpecialPricingConditionsServiceConfigurationSettingDescription(String specialPricingConditionsServiceConfigurationSettingDescription) {
    this.specialPricingConditionsServiceConfigurationSettingDescription = specialPricingConditionsServiceConfigurationSettingDescription;
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


  /**
   * Get specialPricingConditionsServiceSubscription
   * @return specialPricingConditionsServiceSubscription
  **/

  public SDSpecialPricingConditionsActivateOutputModelSpecialPricingConditionsServiceConfigurationRecordSpecialPricingConditionsServiceSubscription getSpecialPricingConditionsServiceSubscription() {
    return specialPricingConditionsServiceSubscription;
  }

  public void setSpecialPricingConditionsServiceSubscription(SDSpecialPricingConditionsActivateOutputModelSpecialPricingConditionsServiceConfigurationRecordSpecialPricingConditionsServiceSubscription specialPricingConditionsServiceSubscription) {
    this.specialPricingConditionsServiceSubscription = specialPricingConditionsServiceSubscription;
  }


  /**
   * Get specialPricingConditionsServiceAgreement
   * @return specialPricingConditionsServiceAgreement
  **/

  public SDSpecialPricingConditionsActivateOutputModelSpecialPricingConditionsServiceConfigurationRecordSpecialPricingConditionsServiceAgreement getSpecialPricingConditionsServiceAgreement() {
    return specialPricingConditionsServiceAgreement;
  }

  public void setSpecialPricingConditionsServiceAgreement(SDSpecialPricingConditionsActivateOutputModelSpecialPricingConditionsServiceConfigurationRecordSpecialPricingConditionsServiceAgreement specialPricingConditionsServiceAgreement) {
    this.specialPricingConditionsServiceAgreement = specialPricingConditionsServiceAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return specialPricingConditionsServiceStatus
  **/

  public String getSpecialPricingConditionsServiceStatus() {
    return specialPricingConditionsServiceStatus;
  }

  public void setSpecialPricingConditionsServiceStatus(String specialPricingConditionsServiceStatus) {
    this.specialPricingConditionsServiceStatus = specialPricingConditionsServiceStatus;
  }


}

