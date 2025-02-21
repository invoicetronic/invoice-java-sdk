/*
 * Italian eInvoice API v1
 * The [Italian eInvoice API][2] is a RESTful API that allows you to send and receive invoices through the Italian [Servizio di Interscambio (SDI)][1], or Interchange Service. The API is designed by Invoicetronic to be simple and easy to use, abstracting away SDI complexity while providing complete control over the invoice send/receive process. The API also provides advanced features as encryption at rest, invoice validation, multiple upload formats, webhooks, event logging, client SDKs for commonly used languages, and CLI tools.  For more information, see  [Invoicetronic website][2]  [1]: https://www.fatturapa.gov.it/it/sistemainterscambio/cose-il-sdi/ [2]: https://invoicetronic.com/
 *
 * The version of the OpenAPI document: 1
 * Contact: support@invoicetronic.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.invoicetronic.invoice.sdk.api;

import com.invoicetronic.invoice.sdk.ApiException;
import com.invoicetronic.invoice.sdk.model.ProblemHttpResult;
import com.invoicetronic.invoice.sdk.model.WebHook;
import com.invoicetronic.invoice.sdk.model.WebHookHistory;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WebhookApi
 */
@Disabled
public class WebhookApiTest {

    private final WebhookApi api = new WebhookApi();

    /**
     * List webhooks
     *
     * Webhooks are used to notify external services about write events that occur in the API. You can subscribe to specific events and receive a notification when they occur.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void webhookGetTest() throws ApiException {
        Integer page = null;
        Integer pageSize = null;
        String sort = null;
        List<WebHook> response = api.webhookGet(page, pageSize, sort);
        // TODO: test validations
    }

    /**
     * Delete a webhook by id
     *
     * Webhooks are used to notify external services about write events that occur in the API. You can subscribe to specific events and receive a notification when they occur.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void webhookIdDeleteTest() throws ApiException {
        Integer id = null;
        WebHook response = api.webhookIdDelete(id);
        // TODO: test validations
    }

    /**
     * Get a webhook by id
     *
     * Webhooks are used to notify external services about write events that occur in the API. You can subscribe to specific events and receive a notification when they occur.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void webhookIdGetTest() throws ApiException {
        Integer id = null;
        WebHook response = api.webhookIdGet(id);
        // TODO: test validations
    }

    /**
     * Add a webhook
     *
     * Webhooks are used to notify external services about write events that occur in the API. You can subscribe to specific events and receive a notification when they occur.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void webhookPostTest() throws ApiException {
        WebHook webHook = null;
        WebHook response = api.webhookPost(webHook);
        // TODO: test validations
    }

    /**
     * Update a webhook
     *
     * Webhooks are used to notify external services about write events that occur in the API. You can subscribe to specific events and receive a notification when they occur.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void webhookPutTest() throws ApiException {
        WebHook webHook = null;
        WebHook response = api.webhookPut(webHook);
        // TODO: test validations
    }

    /**
     * List webhook history items
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void webhookhistoryGetTest() throws ApiException {
        Integer page = null;
        Integer pageSize = null;
        String sort = null;
        List<WebHookHistory> response = api.webhookhistoryGet(page, pageSize, sort);
        // TODO: test validations
    }

    /**
     * Get a webhook history item by id
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void webhookhistoryIdGetTest() throws ApiException {
        Integer id = null;
        WebHookHistory response = api.webhookhistoryIdGet(id);
        // TODO: test validations
    }

}
