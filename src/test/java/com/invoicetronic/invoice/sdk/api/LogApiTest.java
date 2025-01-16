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
import com.invoicetronic.invoice.sdk.model.Event;
import java.time.OffsetDateTime;
import com.invoicetronic.invoice.sdk.model.ProblemHttpResult;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LogApi
 */
@Disabled
public class LogApiTest {

    private final LogApi api = new LogApi();

    /**
     * List events
     *
     * Every API operation is logged and can be retrieved here.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void invoiceV1LogGetTest() throws ApiException {
        Integer companyId = null;
        String endpoint = null;
        String method = null;
        Integer apiVerion = null;
        Integer statusCode = null;
        OffsetDateTime dateCreatedFrom = null;
        OffsetDateTime dateCreatedTo = null;
        Integer page = null;
        Integer pageSize = null;
        List<Event> response = api.invoiceV1LogGet(companyId, endpoint, method, apiVerion, statusCode, dateCreatedFrom, dateCreatedTo, page, pageSize);
        // TODO: test validations
    }

    /**
     * Get an event by id
     *
     * Every API operation is logged and can be retrieved here.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void invoiceV1LogIdGetTest() throws ApiException {
        Integer id = null;
        Event response = api.invoiceV1LogIdGet(id);
        // TODO: test validations
    }

}
