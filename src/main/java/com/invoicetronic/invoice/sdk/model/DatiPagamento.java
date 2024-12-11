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
import com.invoicetronic.invoice.sdk.model.DettaglioPagamento;
import java.io.IOException;
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
 * DatiPagamento
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T15:05:08.862696Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class DatiPagamento implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CONDIZIONI_PAGAMENTO = "condizioni_pagamento";
  @SerializedName(SERIALIZED_NAME_CONDIZIONI_PAGAMENTO)
  @javax.annotation.Nullable
  private String condizioniPagamento;

  public static final String SERIALIZED_NAME_DETTAGLIO_PAGAMENTO = "dettaglio_pagamento";
  @SerializedName(SERIALIZED_NAME_DETTAGLIO_PAGAMENTO)
  @javax.annotation.Nullable
  private List<DettaglioPagamento> dettaglioPagamento;

  public DatiPagamento() {
  }

  public DatiPagamento condizioniPagamento(@javax.annotation.Nullable String condizioniPagamento) {
    this.condizioniPagamento = condizioniPagamento;
    return this;
  }

  /**
   * Get condizioniPagamento
   * @return condizioniPagamento
   */
  @javax.annotation.Nullable
  public String getCondizioniPagamento() {
    return condizioniPagamento;
  }

  public void setCondizioniPagamento(@javax.annotation.Nullable String condizioniPagamento) {
    this.condizioniPagamento = condizioniPagamento;
  }


  public DatiPagamento dettaglioPagamento(@javax.annotation.Nullable List<DettaglioPagamento> dettaglioPagamento) {
    this.dettaglioPagamento = dettaglioPagamento;
    return this;
  }

  public DatiPagamento addDettaglioPagamentoItem(DettaglioPagamento dettaglioPagamentoItem) {
    if (this.dettaglioPagamento == null) {
      this.dettaglioPagamento = new ArrayList<>();
    }
    this.dettaglioPagamento.add(dettaglioPagamentoItem);
    return this;
  }

  /**
   * Get dettaglioPagamento
   * @return dettaglioPagamento
   */
  @javax.annotation.Nullable
  public List<DettaglioPagamento> getDettaglioPagamento() {
    return dettaglioPagamento;
  }

  public void setDettaglioPagamento(@javax.annotation.Nullable List<DettaglioPagamento> dettaglioPagamento) {
    this.dettaglioPagamento = dettaglioPagamento;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatiPagamento datiPagamento = (DatiPagamento) o;
    return Objects.equals(this.condizioniPagamento, datiPagamento.condizioniPagamento) &&
        Objects.equals(this.dettaglioPagamento, datiPagamento.dettaglioPagamento);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(condizioniPagamento, dettaglioPagamento);
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
    sb.append("class DatiPagamento {\n");
    sb.append("    condizioniPagamento: ").append(toIndentedString(condizioniPagamento)).append("\n");
    sb.append("    dettaglioPagamento: ").append(toIndentedString(dettaglioPagamento)).append("\n");
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
    openapiFields.add("condizioni_pagamento");
    openapiFields.add("dettaglio_pagamento");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DatiPagamento
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DatiPagamento.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatiPagamento is not found in the empty JSON string", DatiPagamento.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DatiPagamento.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DatiPagamento` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("condizioni_pagamento") != null && !jsonObj.get("condizioni_pagamento").isJsonNull()) && !jsonObj.get("condizioni_pagamento").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `condizioni_pagamento` to be a primitive type in the JSON string but got `%s`", jsonObj.get("condizioni_pagamento").toString()));
      }
      if (jsonObj.get("dettaglio_pagamento") != null && !jsonObj.get("dettaglio_pagamento").isJsonNull()) {
        JsonArray jsonArraydettaglioPagamento = jsonObj.getAsJsonArray("dettaglio_pagamento");
        if (jsonArraydettaglioPagamento != null) {
          // ensure the json data is an array
          if (!jsonObj.get("dettaglio_pagamento").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `dettaglio_pagamento` to be an array in the JSON string but got `%s`", jsonObj.get("dettaglio_pagamento").toString()));
          }

          // validate the optional field `dettaglio_pagamento` (array)
          for (int i = 0; i < jsonArraydettaglioPagamento.size(); i++) {
            DettaglioPagamento.validateJsonElement(jsonArraydettaglioPagamento.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatiPagamento.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatiPagamento' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatiPagamento> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatiPagamento.class));

       return (TypeAdapter<T>) new TypeAdapter<DatiPagamento>() {
           @Override
           public void write(JsonWriter out, DatiPagamento value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DatiPagamento read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DatiPagamento given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DatiPagamento
   * @throws IOException if the JSON string is invalid with respect to DatiPagamento
   */
  public static DatiPagamento fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatiPagamento.class);
  }

  /**
   * Convert an instance of DatiPagamento to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

