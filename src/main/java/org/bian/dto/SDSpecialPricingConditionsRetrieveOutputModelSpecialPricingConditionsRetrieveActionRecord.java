package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSpecialPricingConditionsRetrieveOutputModelSpecialPricingConditionsRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDSpecialPricingConditionsRetrieveOutputModelSpecialPricingConditionsRetrieveActionRecordSpecialPricingConditionsActivityAnalysis;
import org.bian.dto.SDSpecialPricingConditionsRetrieveOutputModelSpecialPricingConditionsRetrieveActionRecordSpecialPricingConditionsPerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDSpecialPricingConditionsRetrieveOutputModelSpecialPricingConditionsRetrieveActionRecord
 */
public class SDSpecialPricingConditionsRetrieveOutputModelSpecialPricingConditionsRetrieveActionRecord   {
  private SDSpecialPricingConditionsRetrieveOutputModelSpecialPricingConditionsRetrieveActionRecordSpecialPricingConditionsActivityAnalysis specialPricingConditionsActivityAnalysis = null;

  private SDSpecialPricingConditionsRetrieveOutputModelSpecialPricingConditionsRetrieveActionRecordSpecialPricingConditionsPerformanceAnalysis specialPricingConditionsPerformanceAnalysis = null;

  private SDSpecialPricingConditionsRetrieveOutputModelSpecialPricingConditionsRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get specialPricingConditionsActivityAnalysis
   * @return specialPricingConditionsActivityAnalysis
  **/

  public SDSpecialPricingConditionsRetrieveOutputModelSpecialPricingConditionsRetrieveActionRecordSpecialPricingConditionsActivityAnalysis getSpecialPricingConditionsActivityAnalysis() {
    return specialPricingConditionsActivityAnalysis;
  }

  public void setSpecialPricingConditionsActivityAnalysis(SDSpecialPricingConditionsRetrieveOutputModelSpecialPricingConditionsRetrieveActionRecordSpecialPricingConditionsActivityAnalysis specialPricingConditionsActivityAnalysis) {
    this.specialPricingConditionsActivityAnalysis = specialPricingConditionsActivityAnalysis;
  }


  /**
   * Get specialPricingConditionsPerformanceAnalysis
   * @return specialPricingConditionsPerformanceAnalysis
  **/

  public SDSpecialPricingConditionsRetrieveOutputModelSpecialPricingConditionsRetrieveActionRecordSpecialPricingConditionsPerformanceAnalysis getSpecialPricingConditionsPerformanceAnalysis() {
    return specialPricingConditionsPerformanceAnalysis;
  }

  public void setSpecialPricingConditionsPerformanceAnalysis(SDSpecialPricingConditionsRetrieveOutputModelSpecialPricingConditionsRetrieveActionRecordSpecialPricingConditionsPerformanceAnalysis specialPricingConditionsPerformanceAnalysis) {
    this.specialPricingConditionsPerformanceAnalysis = specialPricingConditionsPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDSpecialPricingConditionsRetrieveOutputModelSpecialPricingConditionsRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDSpecialPricingConditionsRetrieveOutputModelSpecialPricingConditionsRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

