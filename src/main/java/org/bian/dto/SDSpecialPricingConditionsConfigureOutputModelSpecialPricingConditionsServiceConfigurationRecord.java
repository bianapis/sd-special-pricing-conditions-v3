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
 * SDSpecialPricingConditionsConfigureOutputModelSpecialPricingConditionsServiceConfigurationRecord
 */
public class SDSpecialPricingConditionsConfigureOutputModelSpecialPricingConditionsServiceConfigurationRecord   {
  private String specialPricingConditionsServiceConfigurationSettingDescription = null;

  private SDSpecialPricingConditionsConfigureInputModelSpecialPricingConditionsServiceConfigurationRecordSpecialPricingConditionsServiceConfigurationSetup specialPricingConditionsServiceConfigurationSetup = null;

  private SDSpecialPricingConditionsConfigureInputModelSpecialPricingConditionsServiceConfigurationRecordSpecialPricingConditionsServiceSubscription specialPricingConditionsServiceSubscription = null;

  private SDSpecialPricingConditionsConfigureInputModelSpecialPricingConditionsServiceConfigurationRecordSpecialPricingConditionsServiceAgreement specialPricingConditionsServiceAgreement = null;

  private String specialPricingConditionsServiceStatus = null;


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

