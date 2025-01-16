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
import com.invoicetronic.invoice.sdk.model.DatiAnagraficiCessionarioCommittente;
import com.invoicetronic.invoice.sdk.model.RappresentanteFiscaleCessionarioCommittente;
import com.invoicetronic.invoice.sdk.model.SedeCessionarioCommittente;
import com.invoicetronic.invoice.sdk.model.StabileOrganizzazione;
import java.io.IOException;
import java.util.Arrays;
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
 * CessionarioCommittente
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-16T15:13:35.846436Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class CessionarioCommittente implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DATI_ANAGRAFICI = "dati_anagrafici";
  @SerializedName(SERIALIZED_NAME_DATI_ANAGRAFICI)
  @javax.annotation.Nullable
  private DatiAnagraficiCessionarioCommittente datiAnagrafici;

  public static final String SERIALIZED_NAME_SEDE = "sede";
  @SerializedName(SERIALIZED_NAME_SEDE)
  @javax.annotation.Nullable
  private SedeCessionarioCommittente sede;

  public static final String SERIALIZED_NAME_STABILE_ORGANIZZAZIONE = "stabile_organizzazione";
  @SerializedName(SERIALIZED_NAME_STABILE_ORGANIZZAZIONE)
  @javax.annotation.Nullable
  private StabileOrganizzazione stabileOrganizzazione;

  public static final String SERIALIZED_NAME_RAPPRESENTANTE_FISCALE = "rappresentante_fiscale";
  @SerializedName(SERIALIZED_NAME_RAPPRESENTANTE_FISCALE)
  @javax.annotation.Nullable
  private RappresentanteFiscaleCessionarioCommittente rappresentanteFiscale;

  public CessionarioCommittente() {
  }

  public CessionarioCommittente datiAnagrafici(@javax.annotation.Nullable DatiAnagraficiCessionarioCommittente datiAnagrafici) {
    this.datiAnagrafici = datiAnagrafici;
    return this;
  }

  /**
   * Get datiAnagrafici
   * @return datiAnagrafici
   */
  @javax.annotation.Nullable
  public DatiAnagraficiCessionarioCommittente getDatiAnagrafici() {
    return datiAnagrafici;
  }

  public void setDatiAnagrafici(@javax.annotation.Nullable DatiAnagraficiCessionarioCommittente datiAnagrafici) {
    this.datiAnagrafici = datiAnagrafici;
  }


  public CessionarioCommittente sede(@javax.annotation.Nullable SedeCessionarioCommittente sede) {
    this.sede = sede;
    return this;
  }

  /**
   * Get sede
   * @return sede
   */
  @javax.annotation.Nullable
  public SedeCessionarioCommittente getSede() {
    return sede;
  }

  public void setSede(@javax.annotation.Nullable SedeCessionarioCommittente sede) {
    this.sede = sede;
  }


  public CessionarioCommittente stabileOrganizzazione(@javax.annotation.Nullable StabileOrganizzazione stabileOrganizzazione) {
    this.stabileOrganizzazione = stabileOrganizzazione;
    return this;
  }

  /**
   * Get stabileOrganizzazione
   * @return stabileOrganizzazione
   */
  @javax.annotation.Nullable
  public StabileOrganizzazione getStabileOrganizzazione() {
    return stabileOrganizzazione;
  }

  public void setStabileOrganizzazione(@javax.annotation.Nullable StabileOrganizzazione stabileOrganizzazione) {
    this.stabileOrganizzazione = stabileOrganizzazione;
  }


  public CessionarioCommittente rappresentanteFiscale(@javax.annotation.Nullable RappresentanteFiscaleCessionarioCommittente rappresentanteFiscale) {
    this.rappresentanteFiscale = rappresentanteFiscale;
    return this;
  }

  /**
   * Get rappresentanteFiscale
   * @return rappresentanteFiscale
   */
  @javax.annotation.Nullable
  public RappresentanteFiscaleCessionarioCommittente getRappresentanteFiscale() {
    return rappresentanteFiscale;
  }

  public void setRappresentanteFiscale(@javax.annotation.Nullable RappresentanteFiscaleCessionarioCommittente rappresentanteFiscale) {
    this.rappresentanteFiscale = rappresentanteFiscale;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CessionarioCommittente cessionarioCommittente = (CessionarioCommittente) o;
    return Objects.equals(this.datiAnagrafici, cessionarioCommittente.datiAnagrafici) &&
        Objects.equals(this.sede, cessionarioCommittente.sede) &&
        Objects.equals(this.stabileOrganizzazione, cessionarioCommittente.stabileOrganizzazione) &&
        Objects.equals(this.rappresentanteFiscale, cessionarioCommittente.rappresentanteFiscale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datiAnagrafici, sede, stabileOrganizzazione, rappresentanteFiscale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CessionarioCommittente {\n");
    sb.append("    datiAnagrafici: ").append(toIndentedString(datiAnagrafici)).append("\n");
    sb.append("    sede: ").append(toIndentedString(sede)).append("\n");
    sb.append("    stabileOrganizzazione: ").append(toIndentedString(stabileOrganizzazione)).append("\n");
    sb.append("    rappresentanteFiscale: ").append(toIndentedString(rappresentanteFiscale)).append("\n");
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
    openapiFields.add("dati_anagrafici");
    openapiFields.add("sede");
    openapiFields.add("stabile_organizzazione");
    openapiFields.add("rappresentante_fiscale");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CessionarioCommittente
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CessionarioCommittente.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CessionarioCommittente is not found in the empty JSON string", CessionarioCommittente.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CessionarioCommittente.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CessionarioCommittente` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `dati_anagrafici`
      if (jsonObj.get("dati_anagrafici") != null && !jsonObj.get("dati_anagrafici").isJsonNull()) {
        DatiAnagraficiCessionarioCommittente.validateJsonElement(jsonObj.get("dati_anagrafici"));
      }
      // validate the optional field `sede`
      if (jsonObj.get("sede") != null && !jsonObj.get("sede").isJsonNull()) {
        SedeCessionarioCommittente.validateJsonElement(jsonObj.get("sede"));
      }
      // validate the optional field `stabile_organizzazione`
      if (jsonObj.get("stabile_organizzazione") != null && !jsonObj.get("stabile_organizzazione").isJsonNull()) {
        StabileOrganizzazione.validateJsonElement(jsonObj.get("stabile_organizzazione"));
      }
      // validate the optional field `rappresentante_fiscale`
      if (jsonObj.get("rappresentante_fiscale") != null && !jsonObj.get("rappresentante_fiscale").isJsonNull()) {
        RappresentanteFiscaleCessionarioCommittente.validateJsonElement(jsonObj.get("rappresentante_fiscale"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CessionarioCommittente.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CessionarioCommittente' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CessionarioCommittente> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CessionarioCommittente.class));

       return (TypeAdapter<T>) new TypeAdapter<CessionarioCommittente>() {
           @Override
           public void write(JsonWriter out, CessionarioCommittente value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CessionarioCommittente read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CessionarioCommittente given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CessionarioCommittente
   * @throws IOException if the JSON string is invalid with respect to CessionarioCommittente
   */
  public static CessionarioCommittente fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CessionarioCommittente.class);
  }

  /**
   * Convert an instance of CessionarioCommittente to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

