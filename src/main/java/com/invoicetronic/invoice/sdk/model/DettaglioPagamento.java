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


package com.invoicetronic.invoice.sdk.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.invoicetronic.invoice.sdk.JSON;

/**
 * DettaglioPagamento
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-06T11:08:47.068644Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class DettaglioPagamento implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_BENEFICIARIO = "beneficiario";
  @SerializedName(SERIALIZED_NAME_BENEFICIARIO)
  @javax.annotation.Nullable
  private String beneficiario;

  public static final String SERIALIZED_NAME_MODALITA_PAGAMENTO = "modalita_pagamento";
  @SerializedName(SERIALIZED_NAME_MODALITA_PAGAMENTO)
  @javax.annotation.Nullable
  private String modalitaPagamento;

  public static final String SERIALIZED_NAME_DATA_RIFERIMENTO_TERMINI_PAGAMENTO = "data_riferimento_termini_pagamento";
  @SerializedName(SERIALIZED_NAME_DATA_RIFERIMENTO_TERMINI_PAGAMENTO)
  @javax.annotation.Nullable
  private OffsetDateTime dataRiferimentoTerminiPagamento;

  public static final String SERIALIZED_NAME_GIORNI_TERMINI_PAGAMENTO = "giorni_termini_pagamento";
  @SerializedName(SERIALIZED_NAME_GIORNI_TERMINI_PAGAMENTO)
  @javax.annotation.Nullable
  private Integer giorniTerminiPagamento;

  public static final String SERIALIZED_NAME_DATA_SCADENZA_PAGAMENTO = "data_scadenza_pagamento";
  @SerializedName(SERIALIZED_NAME_DATA_SCADENZA_PAGAMENTO)
  @javax.annotation.Nullable
  private OffsetDateTime dataScadenzaPagamento;

  public static final String SERIALIZED_NAME_IMPORTO_PAGAMENTO = "importo_pagamento";
  @SerializedName(SERIALIZED_NAME_IMPORTO_PAGAMENTO)
  @javax.annotation.Nullable
  private Double importoPagamento;

  public static final String SERIALIZED_NAME_COD_UFFICIO_POSTALE = "cod_ufficio_postale";
  @SerializedName(SERIALIZED_NAME_COD_UFFICIO_POSTALE)
  @javax.annotation.Nullable
  private String codUfficioPostale;

  public static final String SERIALIZED_NAME_COGNOME_QUIETANZANTE = "cognome_quietanzante";
  @SerializedName(SERIALIZED_NAME_COGNOME_QUIETANZANTE)
  @javax.annotation.Nullable
  private String cognomeQuietanzante;

  public static final String SERIALIZED_NAME_NOME_QUIETANZANTE = "nome_quietanzante";
  @SerializedName(SERIALIZED_NAME_NOME_QUIETANZANTE)
  @javax.annotation.Nullable
  private String nomeQuietanzante;

  public static final String SERIALIZED_NAME_CF_QUIETANZANTE = "cf_quietanzante";
  @SerializedName(SERIALIZED_NAME_CF_QUIETANZANTE)
  @javax.annotation.Nullable
  private String cfQuietanzante;

  public static final String SERIALIZED_NAME_TITOLO_QUIETANZANTE = "titolo_quietanzante";
  @SerializedName(SERIALIZED_NAME_TITOLO_QUIETANZANTE)
  @javax.annotation.Nullable
  private String titoloQuietanzante;

  public static final String SERIALIZED_NAME_ISTITUTO_FINANZIARIO = "istituto_finanziario";
  @SerializedName(SERIALIZED_NAME_ISTITUTO_FINANZIARIO)
  @javax.annotation.Nullable
  private String istitutoFinanziario;

  public static final String SERIALIZED_NAME_IBAN = "iban";
  @SerializedName(SERIALIZED_NAME_IBAN)
  @javax.annotation.Nullable
  private String iban;

  public static final String SERIALIZED_NAME_ABI = "abi";
  @SerializedName(SERIALIZED_NAME_ABI)
  @javax.annotation.Nullable
  private String abi;

  public static final String SERIALIZED_NAME_CAB = "cab";
  @SerializedName(SERIALIZED_NAME_CAB)
  @javax.annotation.Nullable
  private String cab;

  public static final String SERIALIZED_NAME_BIC = "bic";
  @SerializedName(SERIALIZED_NAME_BIC)
  @javax.annotation.Nullable
  private String bic;

  public static final String SERIALIZED_NAME_SCONTO_PAGAMENTO_ANTICIPATO = "sconto_pagamento_anticipato";
  @SerializedName(SERIALIZED_NAME_SCONTO_PAGAMENTO_ANTICIPATO)
  @javax.annotation.Nullable
  private Double scontoPagamentoAnticipato;

  public static final String SERIALIZED_NAME_DATA_LIMITE_PAGAMENTO_ANTICIPATO = "data_limite_pagamento_anticipato";
  @SerializedName(SERIALIZED_NAME_DATA_LIMITE_PAGAMENTO_ANTICIPATO)
  @javax.annotation.Nullable
  private OffsetDateTime dataLimitePagamentoAnticipato;

  public static final String SERIALIZED_NAME_PENALITA_PAGAMENTI_RITARDATI = "penalita_pagamenti_ritardati";
  @SerializedName(SERIALIZED_NAME_PENALITA_PAGAMENTI_RITARDATI)
  @javax.annotation.Nullable
  private Double penalitaPagamentiRitardati;

  public static final String SERIALIZED_NAME_DATA_DECORRENZA_PENALE = "data_decorrenza_penale";
  @SerializedName(SERIALIZED_NAME_DATA_DECORRENZA_PENALE)
  @javax.annotation.Nullable
  private OffsetDateTime dataDecorrenzaPenale;

  public static final String SERIALIZED_NAME_CODICE_PAGAMENTO = "codice_pagamento";
  @SerializedName(SERIALIZED_NAME_CODICE_PAGAMENTO)
  @javax.annotation.Nullable
  private String codicePagamento;

  public DettaglioPagamento() {
  }

  public DettaglioPagamento beneficiario(@javax.annotation.Nullable String beneficiario) {
    this.beneficiario = beneficiario;
    return this;
  }

  /**
   * Get beneficiario
   * @return beneficiario
   */
  @javax.annotation.Nullable
  public String getBeneficiario() {
    return beneficiario;
  }

  public void setBeneficiario(@javax.annotation.Nullable String beneficiario) {
    this.beneficiario = beneficiario;
  }


  public DettaglioPagamento modalitaPagamento(@javax.annotation.Nullable String modalitaPagamento) {
    this.modalitaPagamento = modalitaPagamento;
    return this;
  }

  /**
   * Get modalitaPagamento
   * @return modalitaPagamento
   */
  @javax.annotation.Nullable
  public String getModalitaPagamento() {
    return modalitaPagamento;
  }

  public void setModalitaPagamento(@javax.annotation.Nullable String modalitaPagamento) {
    this.modalitaPagamento = modalitaPagamento;
  }


  public DettaglioPagamento dataRiferimentoTerminiPagamento(@javax.annotation.Nullable OffsetDateTime dataRiferimentoTerminiPagamento) {
    this.dataRiferimentoTerminiPagamento = dataRiferimentoTerminiPagamento;
    return this;
  }

  /**
   * Get dataRiferimentoTerminiPagamento
   * @return dataRiferimentoTerminiPagamento
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDataRiferimentoTerminiPagamento() {
    return dataRiferimentoTerminiPagamento;
  }

  public void setDataRiferimentoTerminiPagamento(@javax.annotation.Nullable OffsetDateTime dataRiferimentoTerminiPagamento) {
    this.dataRiferimentoTerminiPagamento = dataRiferimentoTerminiPagamento;
  }


  public DettaglioPagamento giorniTerminiPagamento(@javax.annotation.Nullable Integer giorniTerminiPagamento) {
    this.giorniTerminiPagamento = giorniTerminiPagamento;
    return this;
  }

  /**
   * Get giorniTerminiPagamento
   * @return giorniTerminiPagamento
   */
  @javax.annotation.Nullable
  public Integer getGiorniTerminiPagamento() {
    return giorniTerminiPagamento;
  }

  public void setGiorniTerminiPagamento(@javax.annotation.Nullable Integer giorniTerminiPagamento) {
    this.giorniTerminiPagamento = giorniTerminiPagamento;
  }


  public DettaglioPagamento dataScadenzaPagamento(@javax.annotation.Nullable OffsetDateTime dataScadenzaPagamento) {
    this.dataScadenzaPagamento = dataScadenzaPagamento;
    return this;
  }

  /**
   * Get dataScadenzaPagamento
   * @return dataScadenzaPagamento
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDataScadenzaPagamento() {
    return dataScadenzaPagamento;
  }

  public void setDataScadenzaPagamento(@javax.annotation.Nullable OffsetDateTime dataScadenzaPagamento) {
    this.dataScadenzaPagamento = dataScadenzaPagamento;
  }


  public DettaglioPagamento importoPagamento(@javax.annotation.Nullable Double importoPagamento) {
    this.importoPagamento = importoPagamento;
    return this;
  }

  /**
   * Get importoPagamento
   * @return importoPagamento
   */
  @javax.annotation.Nullable
  public Double getImportoPagamento() {
    return importoPagamento;
  }

  public void setImportoPagamento(@javax.annotation.Nullable Double importoPagamento) {
    this.importoPagamento = importoPagamento;
  }


  public DettaglioPagamento codUfficioPostale(@javax.annotation.Nullable String codUfficioPostale) {
    this.codUfficioPostale = codUfficioPostale;
    return this;
  }

  /**
   * Get codUfficioPostale
   * @return codUfficioPostale
   */
  @javax.annotation.Nullable
  public String getCodUfficioPostale() {
    return codUfficioPostale;
  }

  public void setCodUfficioPostale(@javax.annotation.Nullable String codUfficioPostale) {
    this.codUfficioPostale = codUfficioPostale;
  }


  public DettaglioPagamento cognomeQuietanzante(@javax.annotation.Nullable String cognomeQuietanzante) {
    this.cognomeQuietanzante = cognomeQuietanzante;
    return this;
  }

  /**
   * Get cognomeQuietanzante
   * @return cognomeQuietanzante
   */
  @javax.annotation.Nullable
  public String getCognomeQuietanzante() {
    return cognomeQuietanzante;
  }

  public void setCognomeQuietanzante(@javax.annotation.Nullable String cognomeQuietanzante) {
    this.cognomeQuietanzante = cognomeQuietanzante;
  }


  public DettaglioPagamento nomeQuietanzante(@javax.annotation.Nullable String nomeQuietanzante) {
    this.nomeQuietanzante = nomeQuietanzante;
    return this;
  }

  /**
   * Get nomeQuietanzante
   * @return nomeQuietanzante
   */
  @javax.annotation.Nullable
  public String getNomeQuietanzante() {
    return nomeQuietanzante;
  }

  public void setNomeQuietanzante(@javax.annotation.Nullable String nomeQuietanzante) {
    this.nomeQuietanzante = nomeQuietanzante;
  }


  public DettaglioPagamento cfQuietanzante(@javax.annotation.Nullable String cfQuietanzante) {
    this.cfQuietanzante = cfQuietanzante;
    return this;
  }

  /**
   * Get cfQuietanzante
   * @return cfQuietanzante
   */
  @javax.annotation.Nullable
  public String getCfQuietanzante() {
    return cfQuietanzante;
  }

  public void setCfQuietanzante(@javax.annotation.Nullable String cfQuietanzante) {
    this.cfQuietanzante = cfQuietanzante;
  }


  public DettaglioPagamento titoloQuietanzante(@javax.annotation.Nullable String titoloQuietanzante) {
    this.titoloQuietanzante = titoloQuietanzante;
    return this;
  }

  /**
   * Get titoloQuietanzante
   * @return titoloQuietanzante
   */
  @javax.annotation.Nullable
  public String getTitoloQuietanzante() {
    return titoloQuietanzante;
  }

  public void setTitoloQuietanzante(@javax.annotation.Nullable String titoloQuietanzante) {
    this.titoloQuietanzante = titoloQuietanzante;
  }


  public DettaglioPagamento istitutoFinanziario(@javax.annotation.Nullable String istitutoFinanziario) {
    this.istitutoFinanziario = istitutoFinanziario;
    return this;
  }

  /**
   * Get istitutoFinanziario
   * @return istitutoFinanziario
   */
  @javax.annotation.Nullable
  public String getIstitutoFinanziario() {
    return istitutoFinanziario;
  }

  public void setIstitutoFinanziario(@javax.annotation.Nullable String istitutoFinanziario) {
    this.istitutoFinanziario = istitutoFinanziario;
  }


  public DettaglioPagamento iban(@javax.annotation.Nullable String iban) {
    this.iban = iban;
    return this;
  }

  /**
   * Get iban
   * @return iban
   */
  @javax.annotation.Nullable
  public String getIban() {
    return iban;
  }

  public void setIban(@javax.annotation.Nullable String iban) {
    this.iban = iban;
  }


  public DettaglioPagamento abi(@javax.annotation.Nullable String abi) {
    this.abi = abi;
    return this;
  }

  /**
   * Get abi
   * @return abi
   */
  @javax.annotation.Nullable
  public String getAbi() {
    return abi;
  }

  public void setAbi(@javax.annotation.Nullable String abi) {
    this.abi = abi;
  }


  public DettaglioPagamento cab(@javax.annotation.Nullable String cab) {
    this.cab = cab;
    return this;
  }

  /**
   * Get cab
   * @return cab
   */
  @javax.annotation.Nullable
  public String getCab() {
    return cab;
  }

  public void setCab(@javax.annotation.Nullable String cab) {
    this.cab = cab;
  }


  public DettaglioPagamento bic(@javax.annotation.Nullable String bic) {
    this.bic = bic;
    return this;
  }

  /**
   * Get bic
   * @return bic
   */
  @javax.annotation.Nullable
  public String getBic() {
    return bic;
  }

  public void setBic(@javax.annotation.Nullable String bic) {
    this.bic = bic;
  }


  public DettaglioPagamento scontoPagamentoAnticipato(@javax.annotation.Nullable Double scontoPagamentoAnticipato) {
    this.scontoPagamentoAnticipato = scontoPagamentoAnticipato;
    return this;
  }

  /**
   * Get scontoPagamentoAnticipato
   * @return scontoPagamentoAnticipato
   */
  @javax.annotation.Nullable
  public Double getScontoPagamentoAnticipato() {
    return scontoPagamentoAnticipato;
  }

  public void setScontoPagamentoAnticipato(@javax.annotation.Nullable Double scontoPagamentoAnticipato) {
    this.scontoPagamentoAnticipato = scontoPagamentoAnticipato;
  }


  public DettaglioPagamento dataLimitePagamentoAnticipato(@javax.annotation.Nullable OffsetDateTime dataLimitePagamentoAnticipato) {
    this.dataLimitePagamentoAnticipato = dataLimitePagamentoAnticipato;
    return this;
  }

  /**
   * Get dataLimitePagamentoAnticipato
   * @return dataLimitePagamentoAnticipato
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDataLimitePagamentoAnticipato() {
    return dataLimitePagamentoAnticipato;
  }

  public void setDataLimitePagamentoAnticipato(@javax.annotation.Nullable OffsetDateTime dataLimitePagamentoAnticipato) {
    this.dataLimitePagamentoAnticipato = dataLimitePagamentoAnticipato;
  }


  public DettaglioPagamento penalitaPagamentiRitardati(@javax.annotation.Nullable Double penalitaPagamentiRitardati) {
    this.penalitaPagamentiRitardati = penalitaPagamentiRitardati;
    return this;
  }

  /**
   * Get penalitaPagamentiRitardati
   * @return penalitaPagamentiRitardati
   */
  @javax.annotation.Nullable
  public Double getPenalitaPagamentiRitardati() {
    return penalitaPagamentiRitardati;
  }

  public void setPenalitaPagamentiRitardati(@javax.annotation.Nullable Double penalitaPagamentiRitardati) {
    this.penalitaPagamentiRitardati = penalitaPagamentiRitardati;
  }


  public DettaglioPagamento dataDecorrenzaPenale(@javax.annotation.Nullable OffsetDateTime dataDecorrenzaPenale) {
    this.dataDecorrenzaPenale = dataDecorrenzaPenale;
    return this;
  }

  /**
   * Get dataDecorrenzaPenale
   * @return dataDecorrenzaPenale
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDataDecorrenzaPenale() {
    return dataDecorrenzaPenale;
  }

  public void setDataDecorrenzaPenale(@javax.annotation.Nullable OffsetDateTime dataDecorrenzaPenale) {
    this.dataDecorrenzaPenale = dataDecorrenzaPenale;
  }


  public DettaglioPagamento codicePagamento(@javax.annotation.Nullable String codicePagamento) {
    this.codicePagamento = codicePagamento;
    return this;
  }

  /**
   * Get codicePagamento
   * @return codicePagamento
   */
  @javax.annotation.Nullable
  public String getCodicePagamento() {
    return codicePagamento;
  }

  public void setCodicePagamento(@javax.annotation.Nullable String codicePagamento) {
    this.codicePagamento = codicePagamento;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DettaglioPagamento dettaglioPagamento = (DettaglioPagamento) o;
    return Objects.equals(this.beneficiario, dettaglioPagamento.beneficiario) &&
        Objects.equals(this.modalitaPagamento, dettaglioPagamento.modalitaPagamento) &&
        Objects.equals(this.dataRiferimentoTerminiPagamento, dettaglioPagamento.dataRiferimentoTerminiPagamento) &&
        Objects.equals(this.giorniTerminiPagamento, dettaglioPagamento.giorniTerminiPagamento) &&
        Objects.equals(this.dataScadenzaPagamento, dettaglioPagamento.dataScadenzaPagamento) &&
        Objects.equals(this.importoPagamento, dettaglioPagamento.importoPagamento) &&
        Objects.equals(this.codUfficioPostale, dettaglioPagamento.codUfficioPostale) &&
        Objects.equals(this.cognomeQuietanzante, dettaglioPagamento.cognomeQuietanzante) &&
        Objects.equals(this.nomeQuietanzante, dettaglioPagamento.nomeQuietanzante) &&
        Objects.equals(this.cfQuietanzante, dettaglioPagamento.cfQuietanzante) &&
        Objects.equals(this.titoloQuietanzante, dettaglioPagamento.titoloQuietanzante) &&
        Objects.equals(this.istitutoFinanziario, dettaglioPagamento.istitutoFinanziario) &&
        Objects.equals(this.iban, dettaglioPagamento.iban) &&
        Objects.equals(this.abi, dettaglioPagamento.abi) &&
        Objects.equals(this.cab, dettaglioPagamento.cab) &&
        Objects.equals(this.bic, dettaglioPagamento.bic) &&
        Objects.equals(this.scontoPagamentoAnticipato, dettaglioPagamento.scontoPagamentoAnticipato) &&
        Objects.equals(this.dataLimitePagamentoAnticipato, dettaglioPagamento.dataLimitePagamentoAnticipato) &&
        Objects.equals(this.penalitaPagamentiRitardati, dettaglioPagamento.penalitaPagamentiRitardati) &&
        Objects.equals(this.dataDecorrenzaPenale, dettaglioPagamento.dataDecorrenzaPenale) &&
        Objects.equals(this.codicePagamento, dettaglioPagamento.codicePagamento);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(beneficiario, modalitaPagamento, dataRiferimentoTerminiPagamento, giorniTerminiPagamento, dataScadenzaPagamento, importoPagamento, codUfficioPostale, cognomeQuietanzante, nomeQuietanzante, cfQuietanzante, titoloQuietanzante, istitutoFinanziario, iban, abi, cab, bic, scontoPagamentoAnticipato, dataLimitePagamentoAnticipato, penalitaPagamentiRitardati, dataDecorrenzaPenale, codicePagamento);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DettaglioPagamento {\n");
    sb.append("    beneficiario: ").append(toIndentedString(beneficiario)).append("\n");
    sb.append("    modalitaPagamento: ").append(toIndentedString(modalitaPagamento)).append("\n");
    sb.append("    dataRiferimentoTerminiPagamento: ").append(toIndentedString(dataRiferimentoTerminiPagamento)).append("\n");
    sb.append("    giorniTerminiPagamento: ").append(toIndentedString(giorniTerminiPagamento)).append("\n");
    sb.append("    dataScadenzaPagamento: ").append(toIndentedString(dataScadenzaPagamento)).append("\n");
    sb.append("    importoPagamento: ").append(toIndentedString(importoPagamento)).append("\n");
    sb.append("    codUfficioPostale: ").append(toIndentedString(codUfficioPostale)).append("\n");
    sb.append("    cognomeQuietanzante: ").append(toIndentedString(cognomeQuietanzante)).append("\n");
    sb.append("    nomeQuietanzante: ").append(toIndentedString(nomeQuietanzante)).append("\n");
    sb.append("    cfQuietanzante: ").append(toIndentedString(cfQuietanzante)).append("\n");
    sb.append("    titoloQuietanzante: ").append(toIndentedString(titoloQuietanzante)).append("\n");
    sb.append("    istitutoFinanziario: ").append(toIndentedString(istitutoFinanziario)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    abi: ").append(toIndentedString(abi)).append("\n");
    sb.append("    cab: ").append(toIndentedString(cab)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    scontoPagamentoAnticipato: ").append(toIndentedString(scontoPagamentoAnticipato)).append("\n");
    sb.append("    dataLimitePagamentoAnticipato: ").append(toIndentedString(dataLimitePagamentoAnticipato)).append("\n");
    sb.append("    penalitaPagamentiRitardati: ").append(toIndentedString(penalitaPagamentiRitardati)).append("\n");
    sb.append("    dataDecorrenzaPenale: ").append(toIndentedString(dataDecorrenzaPenale)).append("\n");
    sb.append("    codicePagamento: ").append(toIndentedString(codicePagamento)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("beneficiario");
    openapiFields.add("modalita_pagamento");
    openapiFields.add("data_riferimento_termini_pagamento");
    openapiFields.add("giorni_termini_pagamento");
    openapiFields.add("data_scadenza_pagamento");
    openapiFields.add("importo_pagamento");
    openapiFields.add("cod_ufficio_postale");
    openapiFields.add("cognome_quietanzante");
    openapiFields.add("nome_quietanzante");
    openapiFields.add("cf_quietanzante");
    openapiFields.add("titolo_quietanzante");
    openapiFields.add("istituto_finanziario");
    openapiFields.add("iban");
    openapiFields.add("abi");
    openapiFields.add("cab");
    openapiFields.add("bic");
    openapiFields.add("sconto_pagamento_anticipato");
    openapiFields.add("data_limite_pagamento_anticipato");
    openapiFields.add("penalita_pagamenti_ritardati");
    openapiFields.add("data_decorrenza_penale");
    openapiFields.add("codice_pagamento");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DettaglioPagamento
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DettaglioPagamento.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DettaglioPagamento is not found in the empty JSON string", DettaglioPagamento.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DettaglioPagamento.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DettaglioPagamento` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("beneficiario") != null && !jsonObj.get("beneficiario").isJsonNull()) && !jsonObj.get("beneficiario").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beneficiario` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beneficiario").toString()));
      }
      if ((jsonObj.get("modalita_pagamento") != null && !jsonObj.get("modalita_pagamento").isJsonNull()) && !jsonObj.get("modalita_pagamento").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modalita_pagamento` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modalita_pagamento").toString()));
      }
      if ((jsonObj.get("cod_ufficio_postale") != null && !jsonObj.get("cod_ufficio_postale").isJsonNull()) && !jsonObj.get("cod_ufficio_postale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cod_ufficio_postale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cod_ufficio_postale").toString()));
      }
      if ((jsonObj.get("cognome_quietanzante") != null && !jsonObj.get("cognome_quietanzante").isJsonNull()) && !jsonObj.get("cognome_quietanzante").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cognome_quietanzante` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cognome_quietanzante").toString()));
      }
      if ((jsonObj.get("nome_quietanzante") != null && !jsonObj.get("nome_quietanzante").isJsonNull()) && !jsonObj.get("nome_quietanzante").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nome_quietanzante` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nome_quietanzante").toString()));
      }
      if ((jsonObj.get("cf_quietanzante") != null && !jsonObj.get("cf_quietanzante").isJsonNull()) && !jsonObj.get("cf_quietanzante").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_quietanzante` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_quietanzante").toString()));
      }
      if ((jsonObj.get("titolo_quietanzante") != null && !jsonObj.get("titolo_quietanzante").isJsonNull()) && !jsonObj.get("titolo_quietanzante").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `titolo_quietanzante` to be a primitive type in the JSON string but got `%s`", jsonObj.get("titolo_quietanzante").toString()));
      }
      if ((jsonObj.get("istituto_finanziario") != null && !jsonObj.get("istituto_finanziario").isJsonNull()) && !jsonObj.get("istituto_finanziario").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `istituto_finanziario` to be a primitive type in the JSON string but got `%s`", jsonObj.get("istituto_finanziario").toString()));
      }
      if ((jsonObj.get("iban") != null && !jsonObj.get("iban").isJsonNull()) && !jsonObj.get("iban").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iban` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iban").toString()));
      }
      if ((jsonObj.get("abi") != null && !jsonObj.get("abi").isJsonNull()) && !jsonObj.get("abi").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `abi` to be a primitive type in the JSON string but got `%s`", jsonObj.get("abi").toString()));
      }
      if ((jsonObj.get("cab") != null && !jsonObj.get("cab").isJsonNull()) && !jsonObj.get("cab").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cab` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cab").toString()));
      }
      if ((jsonObj.get("bic") != null && !jsonObj.get("bic").isJsonNull()) && !jsonObj.get("bic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bic").toString()));
      }
      if ((jsonObj.get("codice_pagamento") != null && !jsonObj.get("codice_pagamento").isJsonNull()) && !jsonObj.get("codice_pagamento").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `codice_pagamento` to be a primitive type in the JSON string but got `%s`", jsonObj.get("codice_pagamento").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DettaglioPagamento.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DettaglioPagamento' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DettaglioPagamento> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DettaglioPagamento.class));

       return (TypeAdapter<T>) new TypeAdapter<DettaglioPagamento>() {
           @Override
           public void write(JsonWriter out, DettaglioPagamento value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DettaglioPagamento read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DettaglioPagamento given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DettaglioPagamento
   * @throws IOException if the JSON string is invalid with respect to DettaglioPagamento
   */
  public static DettaglioPagamento fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DettaglioPagamento.class);
  }

  /**
   * Convert an instance of DettaglioPagamento to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

