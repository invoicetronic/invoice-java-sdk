/*
 * Italian eInvoice API
 * The Italian eInvoice API is a RESTful API that allows you to send and receive invoices through the Italian [Servizio di Interscambio (SDI)][1], or Interchange Service. The API is designed by Invoicetronic to be simple and easy to use, abstracting away SDI complexity while providing complete control over the invoice send/receive process. The API also provides advanced features as encryption at rest, invoice validation, multiple upload formats, webhooks, event logging, client SDKs for commonly used languages, and CLI tools.  For more information, see  [Invoicetronic website][2]  [1]: https://www.fatturapa.gov.it/it/sistemainterscambio/cose-il-sdi/ [2]: https://invoicetronic.com/
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@invoicetronic.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.invoicetronic.invoice.sdk.api;

import com.invoicetronic.invoice.sdk.ApiException;
import java.time.OffsetDateTime;
import com.invoicetronic.invoice.sdk.model.ProblemHttpResult;
import com.invoicetronic.invoice.sdk.model.Update;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UpdateApi
 */
@Disabled
public class UpdateApiTest {

    private final UpdateApi api = new UpdateApi();

    /**
     * List updates
     *
     * Updates are notifications that are sent by the SDI about the status of sent invoices.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void invoiceV1UpdateGetTest() throws ApiException {
        Integer companyId = null;
        String identifier = null;
        Boolean unread = null;
        Integer sendId = null;
        String state = null;
        OffsetDateTime lastUpdateFrom = null;
        OffsetDateTime lastUpdateTo = null;
        OffsetDateTime dateSentFrom = null;
        OffsetDateTime dateSentTo = null;
        Integer page = null;
        Integer pageSize = null;
        List<Update> response = api.invoiceV1UpdateGet(companyId, identifier, unread, sendId, state, lastUpdateFrom, lastUpdateTo, dateSentFrom, dateSentTo, page, pageSize);
        // TODO: test validations
    }

    /**
     * Get an update by id
     *
     * Updates are notifications that are sent by the SDI about the status of sent invoices.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void invoiceV1UpdateIdGetTest() throws ApiException {
        Integer id = null;
        Update response = api.invoiceV1UpdateIdGet(id);
        // TODO: test validations
    }

}
