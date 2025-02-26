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
import com.invoicetronic.invoice.sdk.model.Company;
import com.invoicetronic.invoice.sdk.model.ProblemHttpResult;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CompanyApi
 */
@Disabled
public class CompanyApiTest {

    private final CompanyApi api = new CompanyApi();

    /**
     * List companies
     *
     * Companies are the entities that send and receive invoices. As you send invoices, companies are added as needed. **You can only receive invoices for existing companies**.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void companyGetTest() throws ApiException {
        Integer page = null;
        Integer pageSize = null;
        String sort = null;
        List<Company> response = api.companyGet(page, pageSize, sort);
        // TODO: test validations
    }

    /**
     * Delete a company
     *
     * Companies are the entities that send and receive invoices. As you send invoices, companies are added as needed. **You can only receive invoices for existing companies**.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void companyIdDeleteTest() throws ApiException {
        Integer id = null;
        Company response = api.companyIdDelete(id);
        // TODO: test validations
    }

    /**
     * Get a company by id
     *
     * Companies are the entities that send and receive invoices. As you send invoices, companies are added as needed. **You can only receive invoices for existing companies**.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void companyIdGetTest() throws ApiException {
        Integer id = null;
        Company response = api.companyIdGet(id);
        // TODO: test validations
    }

    /**
     * Add a company
     *
     * Companies are the entities that send and receive invoices. As you send invoices, companies are added as needed. **You can only receive invoices for existing companies**.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void companyPostTest() throws ApiException {
        Company company = null;
        Company response = api.companyPost(company);
        // TODO: test validations
    }

    /**
     * Update a company
     *
     * Companies are the entities that send and receive invoices. As you send invoices, companies are added as needed. **You can only receive invoices for existing companies**.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void companyPutTest() throws ApiException {
        Company company = null;
        Company response = api.companyPut(company);
        // TODO: test validations
    }

}
