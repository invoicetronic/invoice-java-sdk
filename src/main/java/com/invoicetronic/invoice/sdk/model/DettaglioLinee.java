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

import java.util.Objects;
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
 * DettaglioLinee
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-17T08:54:18.254081Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class DettaglioLinee implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NUMERO_LINEA = "numero_linea";
  @SerializedName(SERIALIZED_NAME_NUMERO_LINEA)
  @javax.annotation.Nullable
  private Integer numeroLinea;

  public static final String SERIALIZED_NAME_TIPO_CESSIONE_PRESTAZIONE = "tipo_cessione_prestazione";
  @SerializedName(SERIALIZED_NAME_TIPO_CESSIONE_PRESTAZIONE)
  @javax.annotation.Nullable
  private String tipoCessionePrestazione;

  public static final String SERIALIZED_NAME_CODICE_ARTICOLO = "codice_articolo";
  @SerializedName(SERIALIZED_NAME_CODICE_ARTICOLO)
  @javax.annotation.Nullable
  private List<CodiceArticolo> codiceArticolo;

  public static final String SERIALIZED_NAME_DESCRIZIONE = "descrizione";
  @SerializedName(SERIALIZED_NAME_DESCRIZIONE)
  @javax.annotation.Nullable
  private String descrizione;

  public static final String SERIALIZED_NAME_QUANTITA = "quantita";
  @SerializedName(SERIALIZED_NAME_QUANTITA)
  @javax.annotation.Nullable
  private Double quantita;

  public static final String SERIALIZED_NAME_UNITA_MISURA = "unita_misura";
  @SerializedName(SERIALIZED_NAME_UNITA_MISURA)
  @javax.annotation.Nullable
  private String unitaMisura;

  public static final String SERIALIZED_NAME_DATA_INIZIO_PERIODO = "data_inizio_periodo";
  @SerializedName(SERIALIZED_NAME_DATA_INIZIO_PERIODO)
  @javax.annotation.Nullable
  private OffsetDateTime dataInizioPeriodo;

  public static final String SERIALIZED_NAME_DATA_FINE_PERIODO = "data_fine_periodo";
  @SerializedName(SERIALIZED_NAME_DATA_FINE_PERIODO)
  @javax.annotation.Nullable
  private OffsetDateTime dataFinePeriodo;

  public static final String SERIALIZED_NAME_PREZZO_UNITARIO = "prezzo_unitario";
  @SerializedName(SERIALIZED_NAME_PREZZO_UNITARIO)
  @javax.annotation.Nullable
  private Double prezzoUnitario;

  public static final String SERIALIZED_NAME_SCONTO_MAGGIORAZIONE = "sconto_maggiorazione";
  @SerializedName(SERIALIZED_NAME_SCONTO_MAGGIORAZIONE)
  @javax.annotation.Nullable
  private List<ScontoMaggiorazione> scontoMaggiorazione;

  public static final String SERIALIZED_NAME_PREZZO_TOTALE = "prezzo_totale";
  @SerializedName(SERIALIZED_NAME_PREZZO_TOTALE)
  @javax.annotation.Nullable
  private Double prezzoTotale;

  public static final String SERIALIZED_NAME_ALIQUOTA_IVA = "aliquota_iva";
  @SerializedName(SERIALIZED_NAME_ALIQUOTA_IVA)
  @javax.annotation.Nullable
  private Double aliquotaIva;

  public static final String SERIALIZED_NAME_RITENUTA = "ritenuta";
  @SerializedName(SERIALIZED_NAME_RITENUTA)
  @javax.annotation.Nullable
  private String ritenuta;

  public static final String SERIALIZED_NAME_NATURA = "natura";
  @SerializedName(SERIALIZED_NAME_NATURA)
  @javax.annotation.Nullable
  private String natura;

  public static final String SERIALIZED_NAME_RIFERIMENTO_AMMINISTRAZIONE = "riferimento_amministrazione";
  @SerializedName(SERIALIZED_NAME_RIFERIMENTO_AMMINISTRAZIONE)
  @javax.annotation.Nullable
  private String riferimentoAmministrazione;

  public static final String SERIALIZED_NAME_ALTRI_DATI_GESTIONALI = "altri_dati_gestionali";
  @SerializedName(SERIALIZED_NAME_ALTRI_DATI_GESTIONALI)
  @javax.annotation.Nullable
  private List<AltriDatiGestionali> altriDatiGestionali;

  public DettaglioLinee() {
  }

  public DettaglioLinee numeroLinea(@javax.annotation.Nullable Integer numeroLinea) {
    this.numeroLinea = numeroLinea;
    return this;
  }

  /**
   * Get numeroLinea
   * @return numeroLinea
   */
  @javax.annotation.Nullable
  public Integer getNumeroLinea() {
    return numeroLinea;
  }

  public void setNumeroLinea(@javax.annotation.Nullable Integer numeroLinea) {
    this.numeroLinea = numeroLinea;
  }


  public DettaglioLinee tipoCessionePrestazione(@javax.annotation.Nullable String tipoCessionePrestazione) {
    this.tipoCessionePrestazione = tipoCessionePrestazione;
    return this;
  }

  /**
   * Get tipoCessionePrestazione
   * @return tipoCessionePrestazione
   */
  @javax.annotation.Nullable
  public String getTipoCessionePrestazione() {
    return tipoCessionePrestazione;
  }

  public void setTipoCessionePrestazione(@javax.annotation.Nullable String tipoCessionePrestazione) {
    this.tipoCessionePrestazione = tipoCessionePrestazione;
  }


  public DettaglioLinee codiceArticolo(@javax.annotation.Nullable List<CodiceArticolo> codiceArticolo) {
    this.codiceArticolo = codiceArticolo;
    return this;
  }

  public DettaglioLinee addCodiceArticoloItem(CodiceArticolo codiceArticoloItem) {
    if (this.codiceArticolo == null) {
      this.codiceArticolo = new ArrayList<>();
    }
    this.codiceArticolo.add(codiceArticoloItem);
    return this;
  }

  /**
   * Get codiceArticolo
   * @return codiceArticolo
   */
  @javax.annotation.Nullable
  public List<CodiceArticolo> getCodiceArticolo() {
    return codiceArticolo;
  }

  public void setCodiceArticolo(@javax.annotation.Nullable List<CodiceArticolo> codiceArticolo) {
    this.codiceArticolo = codiceArticolo;
  }


  public DettaglioLinee descrizione(@javax.annotation.Nullable String descrizione) {
    this.descrizione = descrizione;
    return this;
  }

  /**
   * Get descrizione
   * @return descrizione
   */
  @javax.annotation.Nullable
  public String getDescrizione() {
    return descrizione;
  }

  public void setDescrizione(@javax.annotation.Nullable String descrizione) {
    this.descrizione = descrizione;
  }


  public DettaglioLinee quantita(@javax.annotation.Nullable Double quantita) {
    this.quantita = quantita;
    return this;
  }

  /**
   * Get quantita
   * @return quantita
   */
  @javax.annotation.Nullable
  public Double getQuantita() {
    return quantita;
  }

  public void setQuantita(@javax.annotation.Nullable Double quantita) {
    this.quantita = quantita;
  }


  public DettaglioLinee unitaMisura(@javax.annotation.Nullable String unitaMisura) {
    this.unitaMisura = unitaMisura;
    return this;
  }

  /**
   * Get unitaMisura
   * @return unitaMisura
   */
  @javax.annotation.Nullable
  public String getUnitaMisura() {
    return unitaMisura;
  }

  public void setUnitaMisura(@javax.annotation.Nullable String unitaMisura) {
    this.unitaMisura = unitaMisura;
  }


  public DettaglioLinee dataInizioPeriodo(@javax.annotation.Nullable OffsetDateTime dataInizioPeriodo) {
    this.dataInizioPeriodo = dataInizioPeriodo;
    return this;
  }

  /**
   * Get dataInizioPeriodo
   * @return dataInizioPeriodo
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDataInizioPeriodo() {
    return dataInizioPeriodo;
  }

  public void setDataInizioPeriodo(@javax.annotation.Nullable OffsetDateTime dataInizioPeriodo) {
    this.dataInizioPeriodo = dataInizioPeriodo;
  }


  public DettaglioLinee dataFinePeriodo(@javax.annotation.Nullable OffsetDateTime dataFinePeriodo) {
    this.dataFinePeriodo = dataFinePeriodo;
    return this;
  }

  /**
   * Get dataFinePeriodo
   * @return dataFinePeriodo
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDataFinePeriodo() {
    return dataFinePeriodo;
  }

  public void setDataFinePeriodo(@javax.annotation.Nullable OffsetDateTime dataFinePeriodo) {
    this.dataFinePeriodo = dataFinePeriodo;
  }


  public DettaglioLinee prezzoUnitario(@javax.annotation.Nullable Double prezzoUnitario) {
    this.prezzoUnitario = prezzoUnitario;
    return this;
  }

  /**
   * Get prezzoUnitario
   * @return prezzoUnitario
   */
  @javax.annotation.Nullable
  public Double getPrezzoUnitario() {
    return prezzoUnitario;
  }

  public void setPrezzoUnitario(@javax.annotation.Nullable Double prezzoUnitario) {
    this.prezzoUnitario = prezzoUnitario;
  }


  public DettaglioLinee scontoMaggiorazione(@javax.annotation.Nullable List<ScontoMaggiorazione> scontoMaggiorazione) {
    this.scontoMaggiorazione = scontoMaggiorazione;
    return this;
  }

  public DettaglioLinee addScontoMaggiorazioneItem(ScontoMaggiorazione scontoMaggiorazioneItem) {
    if (this.scontoMaggiorazione == null) {
      this.scontoMaggiorazione = new ArrayList<>();
    }
    this.scontoMaggiorazione.add(scontoMaggiorazioneItem);
    return this;
  }

  /**
   * Get scontoMaggiorazione
   * @return scontoMaggiorazione
   */
  @javax.annotation.Nullable
  public List<ScontoMaggiorazione> getScontoMaggiorazione() {
    return scontoMaggiorazione;
  }

  public void setScontoMaggiorazione(@javax.annotation.Nullable List<ScontoMaggiorazione> scontoMaggiorazione) {
    this.scontoMaggiorazione = scontoMaggiorazione;
  }


  public DettaglioLinee prezzoTotale(@javax.annotation.Nullable Double prezzoTotale) {
    this.prezzoTotale = prezzoTotale;
    return this;
  }

  /**
   * Get prezzoTotale
   * @return prezzoTotale
   */
  @javax.annotation.Nullable
  public Double getPrezzoTotale() {
    return prezzoTotale;
  }

  public void setPrezzoTotale(@javax.annotation.Nullable Double prezzoTotale) {
    this.prezzoTotale = prezzoTotale;
  }


  public DettaglioLinee aliquotaIva(@javax.annotation.Nullable Double aliquotaIva) {
    this.aliquotaIva = aliquotaIva;
    return this;
  }

  /**
   * Get aliquotaIva
   * @return aliquotaIva
   */
  @javax.annotation.Nullable
  public Double getAliquotaIva() {
    return aliquotaIva;
  }

  public void setAliquotaIva(@javax.annotation.Nullable Double aliquotaIva) {
    this.aliquotaIva = aliquotaIva;
  }


  public DettaglioLinee ritenuta(@javax.annotation.Nullable String ritenuta) {
    this.ritenuta = ritenuta;
    return this;
  }

  /**
   * Get ritenuta
   * @return ritenuta
   */
  @javax.annotation.Nullable
  public String getRitenuta() {
    return ritenuta;
  }

  public void setRitenuta(@javax.annotation.Nullable String ritenuta) {
    this.ritenuta = ritenuta;
  }


  public DettaglioLinee natura(@javax.annotation.Nullable String natura) {
    this.natura = natura;
    return this;
  }

  /**
   * Get natura
   * @return natura
   */
  @javax.annotation.Nullable
  public String getNatura() {
    return natura;
  }

  public void setNatura(@javax.annotation.Nullable String natura) {
    this.natura = natura;
  }


  public DettaglioLinee riferimentoAmministrazione(@javax.annotation.Nullable String riferimentoAmministrazione) {
    this.riferimentoAmministrazione = riferimentoAmministrazione;
    return this;
  }

  /**
   * Get riferimentoAmministrazione
   * @return riferimentoAmministrazione
   */
  @javax.annotation.Nullable
  public String getRiferimentoAmministrazione() {
    return riferimentoAmministrazione;
  }

  public void setRiferimentoAmministrazione(@javax.annotation.Nullable String riferimentoAmministrazione) {
    this.riferimentoAmministrazione = riferimentoAmministrazione;
  }


  public DettaglioLinee altriDatiGestionali(@javax.annotation.Nullable List<AltriDatiGestionali> altriDatiGestionali) {
    this.altriDatiGestionali = altriDatiGestionali;
    return this;
  }

  public DettaglioLinee addAltriDatiGestionaliItem(AltriDatiGestionali altriDatiGestionaliItem) {
    if (this.altriDatiGestionali == null) {
      this.altriDatiGestionali = new ArrayList<>();
    }
    this.altriDatiGestionali.add(altriDatiGestionaliItem);
    return this;
  }

  /**
   * Get altriDatiGestionali
   * @return altriDatiGestionali
   */
  @javax.annotation.Nullable
  public List<AltriDatiGestionali> getAltriDatiGestionali() {
    return altriDatiGestionali;
  }

  public void setAltriDatiGestionali(@javax.annotation.Nullable List<AltriDatiGestionali> altriDatiGestionali) {
    this.altriDatiGestionali = altriDatiGestionali;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DettaglioLinee dettaglioLinee = (DettaglioLinee) o;
    return Objects.equals(this.numeroLinea, dettaglioLinee.numeroLinea) &&
        Objects.equals(this.tipoCessionePrestazione, dettaglioLinee.tipoCessionePrestazione) &&
        Objects.equals(this.codiceArticolo, dettaglioLinee.codiceArticolo) &&
        Objects.equals(this.descrizione, dettaglioLinee.descrizione) &&
        Objects.equals(this.quantita, dettaglioLinee.quantita) &&
        Objects.equals(this.unitaMisura, dettaglioLinee.unitaMisura) &&
        Objects.equals(this.dataInizioPeriodo, dettaglioLinee.dataInizioPeriodo) &&
        Objects.equals(this.dataFinePeriodo, dettaglioLinee.dataFinePeriodo) &&
        Objects.equals(this.prezzoUnitario, dettaglioLinee.prezzoUnitario) &&
        Objects.equals(this.scontoMaggiorazione, dettaglioLinee.scontoMaggiorazione) &&
        Objects.equals(this.prezzoTotale, dettaglioLinee.prezzoTotale) &&
        Objects.equals(this.aliquotaIva, dettaglioLinee.aliquotaIva) &&
        Objects.equals(this.ritenuta, dettaglioLinee.ritenuta) &&
        Objects.equals(this.natura, dettaglioLinee.natura) &&
        Objects.equals(this.riferimentoAmministrazione, dettaglioLinee.riferimentoAmministrazione) &&
        Objects.equals(this.altriDatiGestionali, dettaglioLinee.altriDatiGestionali);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(numeroLinea, tipoCessionePrestazione, codiceArticolo, descrizione, quantita, unitaMisura, dataInizioPeriodo, dataFinePeriodo, prezzoUnitario, scontoMaggiorazione, prezzoTotale, aliquotaIva, ritenuta, natura, riferimentoAmministrazione, altriDatiGestionali);
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
    sb.append("class DettaglioLinee {\n");
    sb.append("    numeroLinea: ").append(toIndentedString(numeroLinea)).append("\n");
    sb.append("    tipoCessionePrestazione: ").append(toIndentedString(tipoCessionePrestazione)).append("\n");
    sb.append("    codiceArticolo: ").append(toIndentedString(codiceArticolo)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
    sb.append("    quantita: ").append(toIndentedString(quantita)).append("\n");
    sb.append("    unitaMisura: ").append(toIndentedString(unitaMisura)).append("\n");
    sb.append("    dataInizioPeriodo: ").append(toIndentedString(dataInizioPeriodo)).append("\n");
    sb.append("    dataFinePeriodo: ").append(toIndentedString(dataFinePeriodo)).append("\n");
    sb.append("    prezzoUnitario: ").append(toIndentedString(prezzoUnitario)).append("\n");
    sb.append("    scontoMaggiorazione: ").append(toIndentedString(scontoMaggiorazione)).append("\n");
    sb.append("    prezzoTotale: ").append(toIndentedString(prezzoTotale)).append("\n");
    sb.append("    aliquotaIva: ").append(toIndentedString(aliquotaIva)).append("\n");
    sb.append("    ritenuta: ").append(toIndentedString(ritenuta)).append("\n");
    sb.append("    natura: ").append(toIndentedString(natura)).append("\n");
    sb.append("    riferimentoAmministrazione: ").append(toIndentedString(riferimentoAmministrazione)).append("\n");
    sb.append("    altriDatiGestionali: ").append(toIndentedString(altriDatiGestionali)).append("\n");
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
    openapiFields.add("numero_linea");
    openapiFields.add("tipo_cessione_prestazione");
    openapiFields.add("codice_articolo");
    openapiFields.add("descrizione");
    openapiFields.add("quantita");
    openapiFields.add("unita_misura");
    openapiFields.add("data_inizio_periodo");
    openapiFields.add("data_fine_periodo");
    openapiFields.add("prezzo_unitario");
    openapiFields.add("sconto_maggiorazione");
    openapiFields.add("prezzo_totale");
    openapiFields.add("aliquota_iva");
    openapiFields.add("ritenuta");
    openapiFields.add("natura");
    openapiFields.add("riferimento_amministrazione");
    openapiFields.add("altri_dati_gestionali");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DettaglioLinee
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DettaglioLinee.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DettaglioLinee is not found in the empty JSON string", DettaglioLinee.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DettaglioLinee.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DettaglioLinee` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("tipo_cessione_prestazione") != null && !jsonObj.get("tipo_cessione_prestazione").isJsonNull()) && !jsonObj.get("tipo_cessione_prestazione").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tipo_cessione_prestazione` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tipo_cessione_prestazione").toString()));
      }
      if (jsonObj.get("codice_articolo") != null && !jsonObj.get("codice_articolo").isJsonNull()) {
        JsonArray jsonArraycodiceArticolo = jsonObj.getAsJsonArray("codice_articolo");
        if (jsonArraycodiceArticolo != null) {
          // ensure the json data is an array
          if (!jsonObj.get("codice_articolo").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `codice_articolo` to be an array in the JSON string but got `%s`", jsonObj.get("codice_articolo").toString()));
          }

          // validate the optional field `codice_articolo` (array)
          for (int i = 0; i < jsonArraycodiceArticolo.size(); i++) {
            CodiceArticolo.validateJsonElement(jsonArraycodiceArticolo.get(i));
          };
        }
      }
      if ((jsonObj.get("descrizione") != null && !jsonObj.get("descrizione").isJsonNull()) && !jsonObj.get("descrizione").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `descrizione` to be a primitive type in the JSON string but got `%s`", jsonObj.get("descrizione").toString()));
      }
      if ((jsonObj.get("unita_misura") != null && !jsonObj.get("unita_misura").isJsonNull()) && !jsonObj.get("unita_misura").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unita_misura` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unita_misura").toString()));
      }
      if (jsonObj.get("sconto_maggiorazione") != null && !jsonObj.get("sconto_maggiorazione").isJsonNull()) {
        JsonArray jsonArrayscontoMaggiorazione = jsonObj.getAsJsonArray("sconto_maggiorazione");
        if (jsonArrayscontoMaggiorazione != null) {
          // ensure the json data is an array
          if (!jsonObj.get("sconto_maggiorazione").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `sconto_maggiorazione` to be an array in the JSON string but got `%s`", jsonObj.get("sconto_maggiorazione").toString()));
          }

          // validate the optional field `sconto_maggiorazione` (array)
          for (int i = 0; i < jsonArrayscontoMaggiorazione.size(); i++) {
            ScontoMaggiorazione.validateJsonElement(jsonArrayscontoMaggiorazione.get(i));
          };
        }
      }
      if ((jsonObj.get("ritenuta") != null && !jsonObj.get("ritenuta").isJsonNull()) && !jsonObj.get("ritenuta").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ritenuta` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ritenuta").toString()));
      }
      if ((jsonObj.get("natura") != null && !jsonObj.get("natura").isJsonNull()) && !jsonObj.get("natura").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `natura` to be a primitive type in the JSON string but got `%s`", jsonObj.get("natura").toString()));
      }
      if ((jsonObj.get("riferimento_amministrazione") != null && !jsonObj.get("riferimento_amministrazione").isJsonNull()) && !jsonObj.get("riferimento_amministrazione").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `riferimento_amministrazione` to be a primitive type in the JSON string but got `%s`", jsonObj.get("riferimento_amministrazione").toString()));
      }
      if (jsonObj.get("altri_dati_gestionali") != null && !jsonObj.get("altri_dati_gestionali").isJsonNull()) {
        JsonArray jsonArrayaltriDatiGestionali = jsonObj.getAsJsonArray("altri_dati_gestionali");
        if (jsonArrayaltriDatiGestionali != null) {
          // ensure the json data is an array
          if (!jsonObj.get("altri_dati_gestionali").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `altri_dati_gestionali` to be an array in the JSON string but got `%s`", jsonObj.get("altri_dati_gestionali").toString()));
          }

          // validate the optional field `altri_dati_gestionali` (array)
          for (int i = 0; i < jsonArrayaltriDatiGestionali.size(); i++) {
            AltriDatiGestionali.validateJsonElement(jsonArrayaltriDatiGestionali.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DettaglioLinee.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DettaglioLinee' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DettaglioLinee> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DettaglioLinee.class));

       return (TypeAdapter<T>) new TypeAdapter<DettaglioLinee>() {
           @Override
           public void write(JsonWriter out, DettaglioLinee value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DettaglioLinee read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DettaglioLinee given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DettaglioLinee
   * @throws IOException if the JSON string is invalid with respect to DettaglioLinee
   */
  public static DettaglioLinee fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DettaglioLinee.class);
  }

  /**
   * Convert an instance of DettaglioLinee to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

