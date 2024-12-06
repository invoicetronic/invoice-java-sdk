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
 * ScontoMaggiorazione
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-06T11:26:35.749414Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class ScontoMaggiorazione implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TIPO = "tipo";
  @SerializedName(SERIALIZED_NAME_TIPO)
  @javax.annotation.Nullable
  private String tipo;

  public static final String SERIALIZED_NAME_PERCENTUALE = "percentuale";
  @SerializedName(SERIALIZED_NAME_PERCENTUALE)
  @javax.annotation.Nullable
  private Double percentuale;

  public static final String SERIALIZED_NAME_IMPORTO = "importo";
  @SerializedName(SERIALIZED_NAME_IMPORTO)
  @javax.annotation.Nullable
  private Double importo;

  public ScontoMaggiorazione() {
  }

  public ScontoMaggiorazione tipo(@javax.annotation.Nullable String tipo) {
    this.tipo = tipo;
    return this;
  }

  /**
   * Get tipo
   * @return tipo
   */
  @javax.annotation.Nullable
  public String getTipo() {
    return tipo;
  }

  public void setTipo(@javax.annotation.Nullable String tipo) {
    this.tipo = tipo;
  }


  public ScontoMaggiorazione percentuale(@javax.annotation.Nullable Double percentuale) {
    this.percentuale = percentuale;
    return this;
  }

  /**
   * Get percentuale
   * @return percentuale
   */
  @javax.annotation.Nullable
  public Double getPercentuale() {
    return percentuale;
  }

  public void setPercentuale(@javax.annotation.Nullable Double percentuale) {
    this.percentuale = percentuale;
  }


  public ScontoMaggiorazione importo(@javax.annotation.Nullable Double importo) {
    this.importo = importo;
    return this;
  }

  /**
   * Get importo
   * @return importo
   */
  @javax.annotation.Nullable
  public Double getImporto() {
    return importo;
  }

  public void setImporto(@javax.annotation.Nullable Double importo) {
    this.importo = importo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScontoMaggiorazione scontoMaggiorazione = (ScontoMaggiorazione) o;
    return Objects.equals(this.tipo, scontoMaggiorazione.tipo) &&
        Objects.equals(this.percentuale, scontoMaggiorazione.percentuale) &&
        Objects.equals(this.importo, scontoMaggiorazione.importo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipo, percentuale, importo);
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
    sb.append("class ScontoMaggiorazione {\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    percentuale: ").append(toIndentedString(percentuale)).append("\n");
    sb.append("    importo: ").append(toIndentedString(importo)).append("\n");
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
    openapiFields.add("tipo");
    openapiFields.add("percentuale");
    openapiFields.add("importo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ScontoMaggiorazione
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ScontoMaggiorazione.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ScontoMaggiorazione is not found in the empty JSON string", ScontoMaggiorazione.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ScontoMaggiorazione.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ScontoMaggiorazione` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("tipo") != null && !jsonObj.get("tipo").isJsonNull()) && !jsonObj.get("tipo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tipo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tipo").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ScontoMaggiorazione.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ScontoMaggiorazione' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ScontoMaggiorazione> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ScontoMaggiorazione.class));

       return (TypeAdapter<T>) new TypeAdapter<ScontoMaggiorazione>() {
           @Override
           public void write(JsonWriter out, ScontoMaggiorazione value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ScontoMaggiorazione read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ScontoMaggiorazione given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ScontoMaggiorazione
   * @throws IOException if the JSON string is invalid with respect to ScontoMaggiorazione
   */
  public static ScontoMaggiorazione fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ScontoMaggiorazione.class);
  }

  /**
   * Convert an instance of ScontoMaggiorazione to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

