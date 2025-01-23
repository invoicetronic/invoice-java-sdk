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
 * CodiceArticolo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T10:00:36.842213Z[Etc/UTC]", comments = "Generator version: 7.11.0")
public class CodiceArticolo implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CODICE_TIPO = "codice_tipo";
  @SerializedName(SERIALIZED_NAME_CODICE_TIPO)
  @javax.annotation.Nullable
  private String codiceTipo;

  public static final String SERIALIZED_NAME_CODICE_VALORE = "codice_valore";
  @SerializedName(SERIALIZED_NAME_CODICE_VALORE)
  @javax.annotation.Nullable
  private String codiceValore;

  public CodiceArticolo() {
  }

  public CodiceArticolo codiceTipo(@javax.annotation.Nullable String codiceTipo) {
    this.codiceTipo = codiceTipo;
    return this;
  }

  /**
   * Get codiceTipo
   * @return codiceTipo
   */
  @javax.annotation.Nullable
  public String getCodiceTipo() {
    return codiceTipo;
  }

  public void setCodiceTipo(@javax.annotation.Nullable String codiceTipo) {
    this.codiceTipo = codiceTipo;
  }


  public CodiceArticolo codiceValore(@javax.annotation.Nullable String codiceValore) {
    this.codiceValore = codiceValore;
    return this;
  }

  /**
   * Get codiceValore
   * @return codiceValore
   */
  @javax.annotation.Nullable
  public String getCodiceValore() {
    return codiceValore;
  }

  public void setCodiceValore(@javax.annotation.Nullable String codiceValore) {
    this.codiceValore = codiceValore;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CodiceArticolo codiceArticolo = (CodiceArticolo) o;
    return Objects.equals(this.codiceTipo, codiceArticolo.codiceTipo) &&
        Objects.equals(this.codiceValore, codiceArticolo.codiceValore);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiceTipo, codiceValore);
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
    sb.append("class CodiceArticolo {\n");
    sb.append("    codiceTipo: ").append(toIndentedString(codiceTipo)).append("\n");
    sb.append("    codiceValore: ").append(toIndentedString(codiceValore)).append("\n");
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
    openapiFields.add("codice_tipo");
    openapiFields.add("codice_valore");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CodiceArticolo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CodiceArticolo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CodiceArticolo is not found in the empty JSON string", CodiceArticolo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CodiceArticolo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CodiceArticolo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("codice_tipo") != null && !jsonObj.get("codice_tipo").isJsonNull()) && !jsonObj.get("codice_tipo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `codice_tipo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("codice_tipo").toString()));
      }
      if ((jsonObj.get("codice_valore") != null && !jsonObj.get("codice_valore").isJsonNull()) && !jsonObj.get("codice_valore").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `codice_valore` to be a primitive type in the JSON string but got `%s`", jsonObj.get("codice_valore").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CodiceArticolo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CodiceArticolo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CodiceArticolo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CodiceArticolo.class));

       return (TypeAdapter<T>) new TypeAdapter<CodiceArticolo>() {
           @Override
           public void write(JsonWriter out, CodiceArticolo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CodiceArticolo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CodiceArticolo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CodiceArticolo
   * @throws IOException if the JSON string is invalid with respect to CodiceArticolo
   */
  public static CodiceArticolo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CodiceArticolo.class);
  }

  /**
   * Convert an instance of CodiceArticolo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

