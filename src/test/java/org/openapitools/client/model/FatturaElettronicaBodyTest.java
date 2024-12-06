/*
 * Italian eInvoice API
 * The Italian eInvoice API is a RESTful API that allows you to send and receive invoices through the Italian [Servizio di Interscambio (SDI)][1], or Interchange Service. The API is designed by Invoicetronic to be simple and easy to use, abstracting away SDI complexity while still providing complete control over the invoice send/receive process. The API also provides advanced features and a rich toolchain, such as invoice validation, multiple upload methods, webhooks, event logs, CORS support, client SDKs for commonly used languages, and CLI tools.  For more information, see  [Invoicetronic website][2]  [1]: https://www.fatturapa.gov.it/it/sistemainterscambio/cose-il-sdi/ [2]: https://invoicetronic.com/
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@invoicetronic.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Allegati;
import org.openapitools.client.model.DatiBeniServizi;
import org.openapitools.client.model.DatiGenerali;
import org.openapitools.client.model.DatiPagamento;
import org.openapitools.client.model.DatiVeicoli;
import org.openapitools.jackson.nullable.JsonNullable;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for FatturaElettronicaBody
 */
public class FatturaElettronicaBodyTest {
    private final FatturaElettronicaBody model = new FatturaElettronicaBody();

    /**
     * Model tests for FatturaElettronicaBody
     */
    @Test
    public void testFatturaElettronicaBody() {
        // TODO: test FatturaElettronicaBody
    }

    /**
     * Test the property 'datiGenerali'
     */
    @Test
    public void datiGeneraliTest() {
        // TODO: test datiGenerali
    }

    /**
     * Test the property 'datiBeniServizi'
     */
    @Test
    public void datiBeniServiziTest() {
        // TODO: test datiBeniServizi
    }

    /**
     * Test the property 'datiVeicoli'
     */
    @Test
    public void datiVeicoliTest() {
        // TODO: test datiVeicoli
    }

    /**
     * Test the property 'datiPagamento'
     */
    @Test
    public void datiPagamentoTest() {
        // TODO: test datiPagamento
    }

    /**
     * Test the property 'allegati'
     */
    @Test
    public void allegatiTest() {
        // TODO: test allegati
    }

}
