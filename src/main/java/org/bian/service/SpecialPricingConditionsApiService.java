/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface SpecialPricingConditionsApiService {

	SDSpecialPricingConditionsActivateOutputModel activate(SDSpecialPricingConditionsActivateInputModel request);
	
	SDSpecialPricingConditionsConfigureOutputModel configure(String sdReferenceId, SDSpecialPricingConditionsConfigureInputModel request);
	
	CRSpecialPricingConditionsDirectoryEntryControlOutputModel control(String sdReferenceId, String crReferenceId, CRSpecialPricingConditionsDirectoryEntryControlInputModel request);
	
	CRSpecialPricingConditionsDirectoryEntryExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRSpecialPricingConditionsDirectoryEntryExchangeInputModel request);
	
	CRSpecialPricingConditionsDirectoryEntryExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRSpecialPricingConditionsDirectoryEntryExecuteInputModel request);
	
	SDSpecialPricingConditionsFeedbackOutputModel feedback(String sdReferenceId, SDSpecialPricingConditionsFeedbackInputModel request);
	
	CRSpecialPricingConditionsDirectoryEntryInitiateOutputModel initiate(String sdReferenceId, CRSpecialPricingConditionsDirectoryEntryInitiateInputModel request);
	
	BQPricingTermsInitiateOutputModel initiatePricingterms(String sdReferenceId, String crReferenceId, BQPricingTermsInitiateInputModel request);
	
	CRSpecialPricingConditionsDirectoryEntryRequestOutputModel request(String sdReferenceId, String crReferenceId, CRSpecialPricingConditionsDirectoryEntryRequestInputModel request);
	
	SDSpecialPricingConditionsRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRSpecialPricingConditionsDirectoryEntryRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQPricingTermsRetrieveOutputModel retrievePricingterms(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	CRSpecialPricingConditionsDirectoryEntryUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRSpecialPricingConditionsDirectoryEntryUpdateInputModel request);
	
	BQPricingTermsUpdateOutputModel updatePricingterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPricingTermsUpdateInputModel request);
	
}
