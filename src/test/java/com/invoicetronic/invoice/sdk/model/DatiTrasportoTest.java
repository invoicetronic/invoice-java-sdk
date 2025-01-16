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


package com.invoicetronic.invoice.sdk.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.invoicetronic.invoice.sdk.model.DatiAnagraficiVettore;
import com.invoicetronic.invoice.sdk.model.IndirizzoResa;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for DatiTrasporto
 */
public class DatiTrasportoTest {
    private final DatiTrasporto model = new DatiTrasporto();

    /**
     * Model tests for DatiTrasporto
     */
    @Test
    public void testDatiTrasporto() {
        // TODO: test DatiTrasporto
    }

    /**
     * Test the property 'datiAnagraficiVettore'
     */
    @Test
    public void datiAnagraficiVettoreTest() {
        // TODO: test datiAnagraficiVettore
    }

    /**
     * Test the property 'mezzoTrasporto'
     */
    @Test
    public void mezzoTrasportoTest() {
        // TODO: test mezzoTrasporto
    }

    /**
     * Test the property 'causaleTrasporto'
     */
    @Test
    public void causaleTrasportoTest() {
        // TODO: test causaleTrasporto
    }

    /**
     * Test the property 'numeroColli'
     */
    @Test
    public void numeroColliTest() {
        // TODO: test numeroColli
    }

    /**
     * Test the property 'descrizione'
     */
    @Test
    public void descrizioneTest() {
        // TODO: test descrizione
    }

    /**
     * Test the property 'unitaMisuraPeso'
     */
    @Test
    public void unitaMisuraPesoTest() {
        // TODO: test unitaMisuraPeso
    }

    /**
     * Test the property 'pesoLordo'
     */
    @Test
    public void pesoLordoTest() {
        // TODO: test pesoLordo
    }

    /**
     * Test the property 'pesoNetto'
     */
    @Test
    public void pesoNettoTest() {
        // TODO: test pesoNetto
    }

    /**
     * Test the property 'dataOraRitiro'
     */
    @Test
    public void dataOraRitiroTest() {
        // TODO: test dataOraRitiro
    }

    /**
     * Test the property 'dataInizioTrasporto'
     */
    @Test
    public void dataInizioTrasportoTest() {
        // TODO: test dataInizioTrasporto
    }

    /**
     * Test the property 'tipoResa'
     */
    @Test
    public void tipoResaTest() {
        // TODO: test tipoResa
    }

    /**
     * Test the property 'indirizzoResa'
     */
    @Test
    public void indirizzoResaTest() {
        // TODO: test indirizzoResa
    }

    /**
     * Test the property 'dataOraConsegna'
     */
    @Test
    public void dataOraConsegnaTest() {
        // TODO: test dataOraConsegna
    }

}
