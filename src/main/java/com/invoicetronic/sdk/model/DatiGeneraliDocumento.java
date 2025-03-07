/*
 * Invoicetronic API
 * The [Invoicetronic API][2] is a RESTful service that allows you to send and receive invoices through the Italian [Servizio di Interscambio (SDI)][1], or Interchange Service. The API is designed to be simple and easy to use, abstracting away SDI complexity while providing complete control over the invoice send/receive process. It provides advanced features as encryption at rest, multi-language pre-flight invoice validation, multiple upload formats, webhooks, event logging, client SDKs, and CLI tools.  For more information, see  [Invoicetronic website][2]  [1]: https://www.fatturapa.gov.it/it/sistemainterscambio/cose-il-sdi/ [2]: https://invoicetronic.com/
 *
 * The version of the OpenAPI document: 1
 * Contact: support@invoicetronic.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.invoicetronic.sdk.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.invoicetronic.sdk.model.DatiBollo;
import com.invoicetronic.sdk.model.DatiCassaPrevidenziale;
import com.invoicetronic.sdk.model.DatiRitenuta;
import com.invoicetronic.sdk.model.ScontoMaggiorazione;
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

import com.invoicetronic.sdk.JSON;

/**
 * DatiGeneraliDocumento
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-07T10:29:38.811798Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class DatiGeneraliDocumento implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TIPO_DOCUMENTO = "tipo_documento";
  @SerializedName(SERIALIZED_NAME_TIPO_DOCUMENTO)
  @javax.annotation.Nullable
  private String tipoDocumento;

  public static final String SERIALIZED_NAME_DIVISA = "divisa";
  @SerializedName(SERIALIZED_NAME_DIVISA)
  @javax.annotation.Nullable
  private String divisa;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  @javax.annotation.Nullable
  private OffsetDateTime data;

  public static final String SERIALIZED_NAME_NUMERO = "numero";
  @SerializedName(SERIALIZED_NAME_NUMERO)
  @javax.annotation.Nullable
  private String numero;

  public static final String SERIALIZED_NAME_DATI_RITENUTA = "dati_ritenuta";
  @SerializedName(SERIALIZED_NAME_DATI_RITENUTA)
  @javax.annotation.Nullable
  private List<DatiRitenuta> datiRitenuta;

  public static final String SERIALIZED_NAME_DATI_BOLLO = "dati_bollo";
  @SerializedName(SERIALIZED_NAME_DATI_BOLLO)
  @javax.annotation.Nullable
  private DatiBollo datiBollo;

  public static final String SERIALIZED_NAME_DATI_CASSA_PREVIDENZIALE = "dati_cassa_previdenziale";
  @SerializedName(SERIALIZED_NAME_DATI_CASSA_PREVIDENZIALE)
  @javax.annotation.Nullable
  private List<DatiCassaPrevidenziale> datiCassaPrevidenziale;

  public static final String SERIALIZED_NAME_SCONTO_MAGGIORAZIONE = "sconto_maggiorazione";
  @SerializedName(SERIALIZED_NAME_SCONTO_MAGGIORAZIONE)
  @javax.annotation.Nullable
  private List<ScontoMaggiorazione> scontoMaggiorazione;

  public static final String SERIALIZED_NAME_IMPORTO_TOTALE_DOCUMENTO = "importo_totale_documento";
  @SerializedName(SERIALIZED_NAME_IMPORTO_TOTALE_DOCUMENTO)
  @javax.annotation.Nullable
  private Double importoTotaleDocumento;

  public static final String SERIALIZED_NAME_ARROTONDAMENTO = "arrotondamento";
  @SerializedName(SERIALIZED_NAME_ARROTONDAMENTO)
  @javax.annotation.Nullable
  private Double arrotondamento;

  public static final String SERIALIZED_NAME_CAUSALE = "causale";
  @SerializedName(SERIALIZED_NAME_CAUSALE)
  @javax.annotation.Nullable
  private List<String> causale;

  public static final String SERIALIZED_NAME_ART73 = "art73";
  @SerializedName(SERIALIZED_NAME_ART73)
  @javax.annotation.Nullable
  private String art73;

  public DatiGeneraliDocumento() {
  }

  public DatiGeneraliDocumento tipoDocumento(@javax.annotation.Nullable String tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
    return this;
  }

  /**
   * Get tipoDocumento
   * @return tipoDocumento
   */
  @javax.annotation.Nullable
  public String getTipoDocumento() {
    return tipoDocumento;
  }

  public void setTipoDocumento(@javax.annotation.Nullable String tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
  }


  public DatiGeneraliDocumento divisa(@javax.annotation.Nullable String divisa) {
    this.divisa = divisa;
    return this;
  }

  /**
   * Get divisa
   * @return divisa
   */
  @javax.annotation.Nullable
  public String getDivisa() {
    return divisa;
  }

  public void setDivisa(@javax.annotation.Nullable String divisa) {
    this.divisa = divisa;
  }


  public DatiGeneraliDocumento data(@javax.annotation.Nullable OffsetDateTime data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @javax.annotation.Nullable
  public OffsetDateTime getData() {
    return data;
  }

  public void setData(@javax.annotation.Nullable OffsetDateTime data) {
    this.data = data;
  }


  public DatiGeneraliDocumento numero(@javax.annotation.Nullable String numero) {
    this.numero = numero;
    return this;
  }

  /**
   * Get numero
   * @return numero
   */
  @javax.annotation.Nullable
  public String getNumero() {
    return numero;
  }

  public void setNumero(@javax.annotation.Nullable String numero) {
    this.numero = numero;
  }


  public DatiGeneraliDocumento datiRitenuta(@javax.annotation.Nullable List<DatiRitenuta> datiRitenuta) {
    this.datiRitenuta = datiRitenuta;
    return this;
  }

  public DatiGeneraliDocumento addDatiRitenutaItem(DatiRitenuta datiRitenutaItem) {
    if (this.datiRitenuta == null) {
      this.datiRitenuta = new ArrayList<>();
    }
    this.datiRitenuta.add(datiRitenutaItem);
    return this;
  }

  /**
   * Get datiRitenuta
   * @return datiRitenuta
   */
  @javax.annotation.Nullable
  public List<DatiRitenuta> getDatiRitenuta() {
    return datiRitenuta;
  }

  public void setDatiRitenuta(@javax.annotation.Nullable List<DatiRitenuta> datiRitenuta) {
    this.datiRitenuta = datiRitenuta;
  }


  public DatiGeneraliDocumento datiBollo(@javax.annotation.Nullable DatiBollo datiBollo) {
    this.datiBollo = datiBollo;
    return this;
  }

  /**
   * Get datiBollo
   * @return datiBollo
   */
  @javax.annotation.Nullable
  public DatiBollo getDatiBollo() {
    return datiBollo;
  }

  public void setDatiBollo(@javax.annotation.Nullable DatiBollo datiBollo) {
    this.datiBollo = datiBollo;
  }


  public DatiGeneraliDocumento datiCassaPrevidenziale(@javax.annotation.Nullable List<DatiCassaPrevidenziale> datiCassaPrevidenziale) {
    this.datiCassaPrevidenziale = datiCassaPrevidenziale;
    return this;
  }

  public DatiGeneraliDocumento addDatiCassaPrevidenzialeItem(DatiCassaPrevidenziale datiCassaPrevidenzialeItem) {
    if (this.datiCassaPrevidenziale == null) {
      this.datiCassaPrevidenziale = new ArrayList<>();
    }
    this.datiCassaPrevidenziale.add(datiCassaPrevidenzialeItem);
    return this;
  }

  /**
   * Get datiCassaPrevidenziale
   * @return datiCassaPrevidenziale
   */
  @javax.annotation.Nullable
  public List<DatiCassaPrevidenziale> getDatiCassaPrevidenziale() {
    return datiCassaPrevidenziale;
  }

  public void setDatiCassaPrevidenziale(@javax.annotation.Nullable List<DatiCassaPrevidenziale> datiCassaPrevidenziale) {
    this.datiCassaPrevidenziale = datiCassaPrevidenziale;
  }


  public DatiGeneraliDocumento scontoMaggiorazione(@javax.annotation.Nullable List<ScontoMaggiorazione> scontoMaggiorazione) {
    this.scontoMaggiorazione = scontoMaggiorazione;
    return this;
  }

  public DatiGeneraliDocumento addScontoMaggiorazioneItem(ScontoMaggiorazione scontoMaggiorazioneItem) {
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


  public DatiGeneraliDocumento importoTotaleDocumento(@javax.annotation.Nullable Double importoTotaleDocumento) {
    this.importoTotaleDocumento = importoTotaleDocumento;
    return this;
  }

  /**
   * Get importoTotaleDocumento
   * @return importoTotaleDocumento
   */
  @javax.annotation.Nullable
  public Double getImportoTotaleDocumento() {
    return importoTotaleDocumento;
  }

  public void setImportoTotaleDocumento(@javax.annotation.Nullable Double importoTotaleDocumento) {
    this.importoTotaleDocumento = importoTotaleDocumento;
  }


  public DatiGeneraliDocumento arrotondamento(@javax.annotation.Nullable Double arrotondamento) {
    this.arrotondamento = arrotondamento;
    return this;
  }

  /**
   * Get arrotondamento
   * @return arrotondamento
   */
  @javax.annotation.Nullable
  public Double getArrotondamento() {
    return arrotondamento;
  }

  public void setArrotondamento(@javax.annotation.Nullable Double arrotondamento) {
    this.arrotondamento = arrotondamento;
  }


  public DatiGeneraliDocumento causale(@javax.annotation.Nullable List<String> causale) {
    this.causale = causale;
    return this;
  }

  public DatiGeneraliDocumento addCausaleItem(String causaleItem) {
    if (this.causale == null) {
      this.causale = new ArrayList<>();
    }
    this.causale.add(causaleItem);
    return this;
  }

  /**
   * Get causale
   * @return causale
   */
  @javax.annotation.Nullable
  public List<String> getCausale() {
    return causale;
  }

  public void setCausale(@javax.annotation.Nullable List<String> causale) {
    this.causale = causale;
  }


  public DatiGeneraliDocumento art73(@javax.annotation.Nullable String art73) {
    this.art73 = art73;
    return this;
  }

  /**
   * Get art73
   * @return art73
   */
  @javax.annotation.Nullable
  public String getArt73() {
    return art73;
  }

  public void setArt73(@javax.annotation.Nullable String art73) {
    this.art73 = art73;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatiGeneraliDocumento datiGeneraliDocumento = (DatiGeneraliDocumento) o;
    return Objects.equals(this.tipoDocumento, datiGeneraliDocumento.tipoDocumento) &&
        Objects.equals(this.divisa, datiGeneraliDocumento.divisa) &&
        Objects.equals(this.data, datiGeneraliDocumento.data) &&
        Objects.equals(this.numero, datiGeneraliDocumento.numero) &&
        Objects.equals(this.datiRitenuta, datiGeneraliDocumento.datiRitenuta) &&
        Objects.equals(this.datiBollo, datiGeneraliDocumento.datiBollo) &&
        Objects.equals(this.datiCassaPrevidenziale, datiGeneraliDocumento.datiCassaPrevidenziale) &&
        Objects.equals(this.scontoMaggiorazione, datiGeneraliDocumento.scontoMaggiorazione) &&
        Objects.equals(this.importoTotaleDocumento, datiGeneraliDocumento.importoTotaleDocumento) &&
        Objects.equals(this.arrotondamento, datiGeneraliDocumento.arrotondamento) &&
        Objects.equals(this.causale, datiGeneraliDocumento.causale) &&
        Objects.equals(this.art73, datiGeneraliDocumento.art73);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipoDocumento, divisa, data, numero, datiRitenuta, datiBollo, datiCassaPrevidenziale, scontoMaggiorazione, importoTotaleDocumento, arrotondamento, causale, art73);
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
    sb.append("class DatiGeneraliDocumento {\n");
    sb.append("    tipoDocumento: ").append(toIndentedString(tipoDocumento)).append("\n");
    sb.append("    divisa: ").append(toIndentedString(divisa)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    datiRitenuta: ").append(toIndentedString(datiRitenuta)).append("\n");
    sb.append("    datiBollo: ").append(toIndentedString(datiBollo)).append("\n");
    sb.append("    datiCassaPrevidenziale: ").append(toIndentedString(datiCassaPrevidenziale)).append("\n");
    sb.append("    scontoMaggiorazione: ").append(toIndentedString(scontoMaggiorazione)).append("\n");
    sb.append("    importoTotaleDocumento: ").append(toIndentedString(importoTotaleDocumento)).append("\n");
    sb.append("    arrotondamento: ").append(toIndentedString(arrotondamento)).append("\n");
    sb.append("    causale: ").append(toIndentedString(causale)).append("\n");
    sb.append("    art73: ").append(toIndentedString(art73)).append("\n");
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
    openapiFields.add("tipo_documento");
    openapiFields.add("divisa");
    openapiFields.add("data");
    openapiFields.add("numero");
    openapiFields.add("dati_ritenuta");
    openapiFields.add("dati_bollo");
    openapiFields.add("dati_cassa_previdenziale");
    openapiFields.add("sconto_maggiorazione");
    openapiFields.add("importo_totale_documento");
    openapiFields.add("arrotondamento");
    openapiFields.add("causale");
    openapiFields.add("art73");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DatiGeneraliDocumento
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DatiGeneraliDocumento.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatiGeneraliDocumento is not found in the empty JSON string", DatiGeneraliDocumento.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DatiGeneraliDocumento.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DatiGeneraliDocumento` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("tipo_documento") != null && !jsonObj.get("tipo_documento").isJsonNull()) && !jsonObj.get("tipo_documento").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tipo_documento` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tipo_documento").toString()));
      }
      if ((jsonObj.get("divisa") != null && !jsonObj.get("divisa").isJsonNull()) && !jsonObj.get("divisa").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `divisa` to be a primitive type in the JSON string but got `%s`", jsonObj.get("divisa").toString()));
      }
      if ((jsonObj.get("numero") != null && !jsonObj.get("numero").isJsonNull()) && !jsonObj.get("numero").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `numero` to be a primitive type in the JSON string but got `%s`", jsonObj.get("numero").toString()));
      }
      if (jsonObj.get("dati_ritenuta") != null && !jsonObj.get("dati_ritenuta").isJsonNull()) {
        JsonArray jsonArraydatiRitenuta = jsonObj.getAsJsonArray("dati_ritenuta");
        if (jsonArraydatiRitenuta != null) {
          // ensure the json data is an array
          if (!jsonObj.get("dati_ritenuta").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `dati_ritenuta` to be an array in the JSON string but got `%s`", jsonObj.get("dati_ritenuta").toString()));
          }

          // validate the optional field `dati_ritenuta` (array)
          for (int i = 0; i < jsonArraydatiRitenuta.size(); i++) {
            DatiRitenuta.validateJsonElement(jsonArraydatiRitenuta.get(i));
          };
        }
      }
      // validate the optional field `dati_bollo`
      if (jsonObj.get("dati_bollo") != null && !jsonObj.get("dati_bollo").isJsonNull()) {
        DatiBollo.validateJsonElement(jsonObj.get("dati_bollo"));
      }
      if (jsonObj.get("dati_cassa_previdenziale") != null && !jsonObj.get("dati_cassa_previdenziale").isJsonNull()) {
        JsonArray jsonArraydatiCassaPrevidenziale = jsonObj.getAsJsonArray("dati_cassa_previdenziale");
        if (jsonArraydatiCassaPrevidenziale != null) {
          // ensure the json data is an array
          if (!jsonObj.get("dati_cassa_previdenziale").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `dati_cassa_previdenziale` to be an array in the JSON string but got `%s`", jsonObj.get("dati_cassa_previdenziale").toString()));
          }

          // validate the optional field `dati_cassa_previdenziale` (array)
          for (int i = 0; i < jsonArraydatiCassaPrevidenziale.size(); i++) {
            DatiCassaPrevidenziale.validateJsonElement(jsonArraydatiCassaPrevidenziale.get(i));
          };
        }
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
      // ensure the optional json data is an array if present
      if (jsonObj.get("causale") != null && !jsonObj.get("causale").isJsonNull() && !jsonObj.get("causale").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `causale` to be an array in the JSON string but got `%s`", jsonObj.get("causale").toString()));
      }
      if ((jsonObj.get("art73") != null && !jsonObj.get("art73").isJsonNull()) && !jsonObj.get("art73").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `art73` to be a primitive type in the JSON string but got `%s`", jsonObj.get("art73").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatiGeneraliDocumento.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatiGeneraliDocumento' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatiGeneraliDocumento> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatiGeneraliDocumento.class));

       return (TypeAdapter<T>) new TypeAdapter<DatiGeneraliDocumento>() {
           @Override
           public void write(JsonWriter out, DatiGeneraliDocumento value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DatiGeneraliDocumento read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DatiGeneraliDocumento given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DatiGeneraliDocumento
   * @throws IOException if the JSON string is invalid with respect to DatiGeneraliDocumento
   */
  public static DatiGeneraliDocumento fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatiGeneraliDocumento.class);
  }

  /**
   * Convert an instance of DatiGeneraliDocumento to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

