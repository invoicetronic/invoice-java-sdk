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
import com.invoicetronic.invoice.sdk.model.Contatti;
import com.invoicetronic.invoice.sdk.model.DatiAnagraficiCedentePrestatore;
import com.invoicetronic.invoice.sdk.model.IscrizioneREA;
import com.invoicetronic.invoice.sdk.model.SedeCedentePrestatore;
import com.invoicetronic.invoice.sdk.model.StabileOrganizzazione;
import java.io.IOException;
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
 * CedentePrestatore
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-16T07:50:13.390706Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class CedentePrestatore implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DATI_ANAGRAFICI = "dati_anagrafici";
  @SerializedName(SERIALIZED_NAME_DATI_ANAGRAFICI)
  @javax.annotation.Nullable
  private DatiAnagraficiCedentePrestatore datiAnagrafici;

  public static final String SERIALIZED_NAME_SEDE = "sede";
  @SerializedName(SERIALIZED_NAME_SEDE)
  @javax.annotation.Nullable
  private SedeCedentePrestatore sede;

  public static final String SERIALIZED_NAME_STABILE_ORGANIZZAZIONE = "stabile_organizzazione";
  @SerializedName(SERIALIZED_NAME_STABILE_ORGANIZZAZIONE)
  @javax.annotation.Nullable
  private StabileOrganizzazione stabileOrganizzazione;

  public static final String SERIALIZED_NAME_ISCRIZIONE_REA = "iscrizione_rea";
  @SerializedName(SERIALIZED_NAME_ISCRIZIONE_REA)
  @javax.annotation.Nullable
  private IscrizioneREA iscrizioneRea;

  public static final String SERIALIZED_NAME_CONTATTI = "contatti";
  @SerializedName(SERIALIZED_NAME_CONTATTI)
  @javax.annotation.Nullable
  private Contatti contatti;

  public static final String SERIALIZED_NAME_RIFERIMENTO_AMMINISTRAZIONE = "riferimento_amministrazione";
  @SerializedName(SERIALIZED_NAME_RIFERIMENTO_AMMINISTRAZIONE)
  @javax.annotation.Nullable
  private String riferimentoAmministrazione;

  public CedentePrestatore() {
  }

  public CedentePrestatore datiAnagrafici(@javax.annotation.Nullable DatiAnagraficiCedentePrestatore datiAnagrafici) {
    this.datiAnagrafici = datiAnagrafici;
    return this;
  }

  /**
   * Get datiAnagrafici
   * @return datiAnagrafici
   */
  @javax.annotation.Nullable
  public DatiAnagraficiCedentePrestatore getDatiAnagrafici() {
    return datiAnagrafici;
  }

  public void setDatiAnagrafici(@javax.annotation.Nullable DatiAnagraficiCedentePrestatore datiAnagrafici) {
    this.datiAnagrafici = datiAnagrafici;
  }


  public CedentePrestatore sede(@javax.annotation.Nullable SedeCedentePrestatore sede) {
    this.sede = sede;
    return this;
  }

  /**
   * Get sede
   * @return sede
   */
  @javax.annotation.Nullable
  public SedeCedentePrestatore getSede() {
    return sede;
  }

  public void setSede(@javax.annotation.Nullable SedeCedentePrestatore sede) {
    this.sede = sede;
  }


  public CedentePrestatore stabileOrganizzazione(@javax.annotation.Nullable StabileOrganizzazione stabileOrganizzazione) {
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


  public CedentePrestatore iscrizioneRea(@javax.annotation.Nullable IscrizioneREA iscrizioneRea) {
    this.iscrizioneRea = iscrizioneRea;
    return this;
  }

  /**
   * Get iscrizioneRea
   * @return iscrizioneRea
   */
  @javax.annotation.Nullable
  public IscrizioneREA getIscrizioneRea() {
    return iscrizioneRea;
  }

  public void setIscrizioneRea(@javax.annotation.Nullable IscrizioneREA iscrizioneRea) {
    this.iscrizioneRea = iscrizioneRea;
  }


  public CedentePrestatore contatti(@javax.annotation.Nullable Contatti contatti) {
    this.contatti = contatti;
    return this;
  }

  /**
   * Get contatti
   * @return contatti
   */
  @javax.annotation.Nullable
  public Contatti getContatti() {
    return contatti;
  }

  public void setContatti(@javax.annotation.Nullable Contatti contatti) {
    this.contatti = contatti;
  }


  public CedentePrestatore riferimentoAmministrazione(@javax.annotation.Nullable String riferimentoAmministrazione) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CedentePrestatore cedentePrestatore = (CedentePrestatore) o;
    return Objects.equals(this.datiAnagrafici, cedentePrestatore.datiAnagrafici) &&
        Objects.equals(this.sede, cedentePrestatore.sede) &&
        Objects.equals(this.stabileOrganizzazione, cedentePrestatore.stabileOrganizzazione) &&
        Objects.equals(this.iscrizioneRea, cedentePrestatore.iscrizioneRea) &&
        Objects.equals(this.contatti, cedentePrestatore.contatti) &&
        Objects.equals(this.riferimentoAmministrazione, cedentePrestatore.riferimentoAmministrazione);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(datiAnagrafici, sede, stabileOrganizzazione, iscrizioneRea, contatti, riferimentoAmministrazione);
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
    sb.append("class CedentePrestatore {\n");
    sb.append("    datiAnagrafici: ").append(toIndentedString(datiAnagrafici)).append("\n");
    sb.append("    sede: ").append(toIndentedString(sede)).append("\n");
    sb.append("    stabileOrganizzazione: ").append(toIndentedString(stabileOrganizzazione)).append("\n");
    sb.append("    iscrizioneRea: ").append(toIndentedString(iscrizioneRea)).append("\n");
    sb.append("    contatti: ").append(toIndentedString(contatti)).append("\n");
    sb.append("    riferimentoAmministrazione: ").append(toIndentedString(riferimentoAmministrazione)).append("\n");
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
    openapiFields.add("iscrizione_rea");
    openapiFields.add("contatti");
    openapiFields.add("riferimento_amministrazione");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CedentePrestatore
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CedentePrestatore.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CedentePrestatore is not found in the empty JSON string", CedentePrestatore.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CedentePrestatore.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CedentePrestatore` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `dati_anagrafici`
      if (jsonObj.get("dati_anagrafici") != null && !jsonObj.get("dati_anagrafici").isJsonNull()) {
        DatiAnagraficiCedentePrestatore.validateJsonElement(jsonObj.get("dati_anagrafici"));
      }
      // validate the optional field `sede`
      if (jsonObj.get("sede") != null && !jsonObj.get("sede").isJsonNull()) {
        SedeCedentePrestatore.validateJsonElement(jsonObj.get("sede"));
      }
      // validate the optional field `stabile_organizzazione`
      if (jsonObj.get("stabile_organizzazione") != null && !jsonObj.get("stabile_organizzazione").isJsonNull()) {
        StabileOrganizzazione.validateJsonElement(jsonObj.get("stabile_organizzazione"));
      }
      // validate the optional field `iscrizione_rea`
      if (jsonObj.get("iscrizione_rea") != null && !jsonObj.get("iscrizione_rea").isJsonNull()) {
        IscrizioneREA.validateJsonElement(jsonObj.get("iscrizione_rea"));
      }
      // validate the optional field `contatti`
      if (jsonObj.get("contatti") != null && !jsonObj.get("contatti").isJsonNull()) {
        Contatti.validateJsonElement(jsonObj.get("contatti"));
      }
      if ((jsonObj.get("riferimento_amministrazione") != null && !jsonObj.get("riferimento_amministrazione").isJsonNull()) && !jsonObj.get("riferimento_amministrazione").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `riferimento_amministrazione` to be a primitive type in the JSON string but got `%s`", jsonObj.get("riferimento_amministrazione").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CedentePrestatore.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CedentePrestatore' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CedentePrestatore> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CedentePrestatore.class));

       return (TypeAdapter<T>) new TypeAdapter<CedentePrestatore>() {
           @Override
           public void write(JsonWriter out, CedentePrestatore value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CedentePrestatore read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CedentePrestatore given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CedentePrestatore
   * @throws IOException if the JSON string is invalid with respect to CedentePrestatore
   */
  public static CedentePrestatore fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CedentePrestatore.class);
  }

  /**
   * Convert an instance of CedentePrestatore to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

