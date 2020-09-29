/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Catalog;

@BianRestController
public class SpecialPricingConditionsApiController {

	@Autowired
	SpecialPricingConditionsApiService service;
	
	@Catalog.Activate
	public BianResponse<SDSpecialPricingConditionsActivateOutputModel> activate(@RequestBody BianRequest<SDSpecialPricingConditionsActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Catalog.Configure
	public BianResponse<SDSpecialPricingConditionsConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDSpecialPricingConditionsConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Catalog.Control
	public BianResponse<CRSpecialPricingConditionsDirectoryEntryControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRSpecialPricingConditionsDirectoryEntryControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Catalog.Exchange
	public BianResponse<CRSpecialPricingConditionsDirectoryEntryExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRSpecialPricingConditionsDirectoryEntryExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Catalog.Execute
	public BianResponse<CRSpecialPricingConditionsDirectoryEntryExecuteOutputModel> execute(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRSpecialPricingConditionsDirectoryEntryExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.execute(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Catalog.Feedback
	public BianResponse<SDSpecialPricingConditionsFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDSpecialPricingConditionsFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Catalog.Initiate
	public BianResponse<CRSpecialPricingConditionsDirectoryEntryInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRSpecialPricingConditionsDirectoryEntryInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("pricingterms")
	@Catalog.Initiate
	public BianResponse<BQPricingTermsInitiateOutputModel> initiatePricingterms(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQPricingTermsInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiatePricingterms(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Catalog.Request
	public BianResponse<CRSpecialPricingConditionsDirectoryEntryRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRSpecialPricingConditionsDirectoryEntryRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Catalog.RetrieveSD
	public BianResponse<SDSpecialPricingConditionsRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Catalog.Retrieve
	public BianResponse<CRSpecialPricingConditionsDirectoryEntryRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Catalog.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Catalog.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("pricingterms")
	@Catalog.Retrieve
	public BianResponse<BQPricingTermsRetrieveOutputModel> retrievePricingterms(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrievePricingterms(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Catalog.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Catalog.Update
	public BianResponse<CRSpecialPricingConditionsDirectoryEntryUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRSpecialPricingConditionsDirectoryEntryUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("pricingterms")
	@Catalog.Update
	public BianResponse<BQPricingTermsUpdateOutputModel> updatePricingterms(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQPricingTermsUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updatePricingterms(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
