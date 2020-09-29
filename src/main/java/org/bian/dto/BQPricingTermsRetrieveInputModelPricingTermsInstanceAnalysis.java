package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPricingTermsRetrieveInputModelPricingTermsInstanceAnalysis
 */
public class BQPricingTermsRetrieveInputModelPricingTermsInstanceAnalysis   {
  private String pricingTermsInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return pricingTermsInstanceAnalysisReference
  **/

  public String getPricingTermsInstanceAnalysisReference() {
    return pricingTermsInstanceAnalysisReference;
  }

  public void setPricingTermsInstanceAnalysisReference(String pricingTermsInstanceAnalysisReference) {
    this.pricingTermsInstanceAnalysisReference = pricingTermsInstanceAnalysisReference;
  }


}

