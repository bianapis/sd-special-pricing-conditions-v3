package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPricingTermsRetrieveInputModelPricingTermsInstanceReport
 */
public class BQPricingTermsRetrieveInputModelPricingTermsInstanceReport   {
  private String pricingTermsInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return pricingTermsInstanceReportReference
  **/

  public String getPricingTermsInstanceReportReference() {
    return pricingTermsInstanceReportReference;
  }

  public void setPricingTermsInstanceReportReference(String pricingTermsInstanceReportReference) {
    this.pricingTermsInstanceReportReference = pricingTermsInstanceReportReference;
  }


}

