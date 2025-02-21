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


package com.invoicetronic.invoice.sdk.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.invoicetronic.invoice.sdk.model.AltriDatiGestionali;
import com.invoicetronic.invoice.sdk.model.CodiceArticolo;
import com.invoicetronic.invoice.sdk.model.ScontoMaggiorazione;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for DettaglioLinee
 */
public class DettaglioLineeTest {
    private final DettaglioLinee model = new DettaglioLinee();

    /**
     * Model tests for DettaglioLinee
     */
    @Test
    public void testDettaglioLinee() {
        // TODO: test DettaglioLinee
    }

    /**
     * Test the property 'numeroLinea'
     */
    @Test
    public void numeroLineaTest() {
        // TODO: test numeroLinea
    }

    /**
     * Test the property 'tipoCessionePrestazione'
     */
    @Test
    public void tipoCessionePrestazioneTest() {
        // TODO: test tipoCessionePrestazione
    }

    /**
     * Test the property 'codiceArticolo'
     */
    @Test
    public void codiceArticoloTest() {
        // TODO: test codiceArticolo
    }

    /**
     * Test the property 'descrizione'
     */
    @Test
    public void descrizioneTest() {
        // TODO: test descrizione
    }

    /**
     * Test the property 'quantita'
     */
    @Test
    public void quantitaTest() {
        // TODO: test quantita
    }

    /**
     * Test the property 'unitaMisura'
     */
    @Test
    public void unitaMisuraTest() {
        // TODO: test unitaMisura
    }

    /**
     * Test the property 'dataInizioPeriodo'
     */
    @Test
    public void dataInizioPeriodoTest() {
        // TODO: test dataInizioPeriodo
    }

    /**
     * Test the property 'dataFinePeriodo'
     */
    @Test
    public void dataFinePeriodoTest() {
        // TODO: test dataFinePeriodo
    }

    /**
     * Test the property 'prezzoUnitario'
     */
    @Test
    public void prezzoUnitarioTest() {
        // TODO: test prezzoUnitario
    }

    /**
     * Test the property 'scontoMaggiorazione'
     */
    @Test
    public void scontoMaggiorazioneTest() {
        // TODO: test scontoMaggiorazione
    }

    /**
     * Test the property 'prezzoTotale'
     */
    @Test
    public void prezzoTotaleTest() {
        // TODO: test prezzoTotale
    }

    /**
     * Test the property 'aliquotaIva'
     */
    @Test
    public void aliquotaIvaTest() {
        // TODO: test aliquotaIva
    }

    /**
     * Test the property 'ritenuta'
     */
    @Test
    public void ritenutaTest() {
        // TODO: test ritenuta
    }

    /**
     * Test the property 'natura'
     */
    @Test
    public void naturaTest() {
        // TODO: test natura
    }

    /**
     * Test the property 'riferimentoAmministrazione'
     */
    @Test
    public void riferimentoAmministrazioneTest() {
        // TODO: test riferimentoAmministrazione
    }

    /**
     * Test the property 'altriDatiGestionali'
     */
    @Test
    public void altriDatiGestionaliTest() {
        // TODO: test altriDatiGestionali
    }

}
