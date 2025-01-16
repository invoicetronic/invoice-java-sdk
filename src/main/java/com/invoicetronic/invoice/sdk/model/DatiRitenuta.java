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
 * DatiRitenuta
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-16T16:05:53.420359Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class DatiRitenuta implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TIPO_RITENUTA = "tipo_ritenuta";
  @SerializedName(SERIALIZED_NAME_TIPO_RITENUTA)
  @javax.annotation.Nullable
  private String tipoRitenuta;

  public static final String SERIALIZED_NAME_IMPORTO_RITENUTA = "importo_ritenuta";
  @SerializedName(SERIALIZED_NAME_IMPORTO_RITENUTA)
  @javax.annotation.Nullable
  private Double importoRitenuta;

  public static final String SERIALIZED_NAME_ALIQUOTA_RITENUTA = "aliquota_ritenuta";
  @SerializedName(SERIALIZED_NAME_ALIQUOTA_RITENUTA)
  @javax.annotation.Nullable
  private Double aliquotaRitenuta;

  public static final String SERIALIZED_NAME_CAUSALE_PAGAMENTO = "causale_pagamento";
  @SerializedName(SERIALIZED_NAME_CAUSALE_PAGAMENTO)
  @javax.annotation.Nullable
  private String causalePagamento;

  public DatiRitenuta() {
  }

  public DatiRitenuta tipoRitenuta(@javax.annotation.Nullable String tipoRitenuta) {
    this.tipoRitenuta = tipoRitenuta;
    return this;
  }

  /**
   * Get tipoRitenuta
   * @return tipoRitenuta
   */
  @javax.annotation.Nullable
  public String getTipoRitenuta() {
    return tipoRitenuta;
  }

  public void setTipoRitenuta(@javax.annotation.Nullable String tipoRitenuta) {
    this.tipoRitenuta = tipoRitenuta;
  }


  public DatiRitenuta importoRitenuta(@javax.annotation.Nullable Double importoRitenuta) {
    this.importoRitenuta = importoRitenuta;
    return this;
  }

  /**
   * Get importoRitenuta
   * @return importoRitenuta
   */
  @javax.annotation.Nullable
  public Double getImportoRitenuta() {
    return importoRitenuta;
  }

  public void setImportoRitenuta(@javax.annotation.Nullable Double importoRitenuta) {
    this.importoRitenuta = importoRitenuta;
  }


  public DatiRitenuta aliquotaRitenuta(@javax.annotation.Nullable Double aliquotaRitenuta) {
    this.aliquotaRitenuta = aliquotaRitenuta;
    return this;
  }

  /**
   * Get aliquotaRitenuta
   * @return aliquotaRitenuta
   */
  @javax.annotation.Nullable
  public Double getAliquotaRitenuta() {
    return aliquotaRitenuta;
  }

  public void setAliquotaRitenuta(@javax.annotation.Nullable Double aliquotaRitenuta) {
    this.aliquotaRitenuta = aliquotaRitenuta;
  }


  public DatiRitenuta causalePagamento(@javax.annotation.Nullable String causalePagamento) {
    this.causalePagamento = causalePagamento;
    return this;
  }

  /**
   * Get causalePagamento
   * @return causalePagamento
   */
  @javax.annotation.Nullable
  public String getCausalePagamento() {
    return causalePagamento;
  }

  public void setCausalePagamento(@javax.annotation.Nullable String causalePagamento) {
    this.causalePagamento = causalePagamento;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatiRitenuta datiRitenuta = (DatiRitenuta) o;
    return Objects.equals(this.tipoRitenuta, datiRitenuta.tipoRitenuta) &&
        Objects.equals(this.importoRitenuta, datiRitenuta.importoRitenuta) &&
        Objects.equals(this.aliquotaRitenuta, datiRitenuta.aliquotaRitenuta) &&
        Objects.equals(this.causalePagamento, datiRitenuta.causalePagamento);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipoRitenuta, importoRitenuta, aliquotaRitenuta, causalePagamento);
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
    sb.append("class DatiRitenuta {\n");
    sb.append("    tipoRitenuta: ").append(toIndentedString(tipoRitenuta)).append("\n");
    sb.append("    importoRitenuta: ").append(toIndentedString(importoRitenuta)).append("\n");
    sb.append("    aliquotaRitenuta: ").append(toIndentedString(aliquotaRitenuta)).append("\n");
    sb.append("    causalePagamento: ").append(toIndentedString(causalePagamento)).append("\n");
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
    openapiFields.add("tipo_ritenuta");
    openapiFields.add("importo_ritenuta");
    openapiFields.add("aliquota_ritenuta");
    openapiFields.add("causale_pagamento");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DatiRitenuta
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DatiRitenuta.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatiRitenuta is not found in the empty JSON string", DatiRitenuta.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DatiRitenuta.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DatiRitenuta` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("tipo_ritenuta") != null && !jsonObj.get("tipo_ritenuta").isJsonNull()) && !jsonObj.get("tipo_ritenuta").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tipo_ritenuta` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tipo_ritenuta").toString()));
      }
      if ((jsonObj.get("causale_pagamento") != null && !jsonObj.get("causale_pagamento").isJsonNull()) && !jsonObj.get("causale_pagamento").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `causale_pagamento` to be a primitive type in the JSON string but got `%s`", jsonObj.get("causale_pagamento").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatiRitenuta.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatiRitenuta' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatiRitenuta> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatiRitenuta.class));

       return (TypeAdapter<T>) new TypeAdapter<DatiRitenuta>() {
           @Override
           public void write(JsonWriter out, DatiRitenuta value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DatiRitenuta read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DatiRitenuta given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DatiRitenuta
   * @throws IOException if the JSON string is invalid with respect to DatiRitenuta
   */
  public static DatiRitenuta fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatiRitenuta.class);
  }

  /**
   * Convert an instance of DatiRitenuta to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

