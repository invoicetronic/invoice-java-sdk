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
import com.invoicetronic.invoice.sdk.model.FatturaElettronicaBody;
import com.invoicetronic.invoice.sdk.model.FatturaElettronicaHeader;
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
 * FatturaOrdinaria
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-06T11:12:43.180218Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class FatturaOrdinaria implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_SISTEMA_EMITTENTE = "sistema_emittente";
  @SerializedName(SERIALIZED_NAME_SISTEMA_EMITTENTE)
  @javax.annotation.Nullable
  private String sistemaEmittente;

  public static final String SERIALIZED_NAME_FATTURA_ELETTRONICA_HEADER = "fattura_elettronica_header";
  @SerializedName(SERIALIZED_NAME_FATTURA_ELETTRONICA_HEADER)
  @javax.annotation.Nullable
  private FatturaElettronicaHeader fatturaElettronicaHeader;

  public static final String SERIALIZED_NAME_FATTURA_ELETTRONICA_BODY = "fattura_elettronica_body";
  @SerializedName(SERIALIZED_NAME_FATTURA_ELETTRONICA_BODY)
  @javax.annotation.Nullable
  private List<FatturaElettronicaBody> fatturaElettronicaBody;

  public FatturaOrdinaria() {
  }

  public FatturaOrdinaria sistemaEmittente(@javax.annotation.Nullable String sistemaEmittente) {
    this.sistemaEmittente = sistemaEmittente;
    return this;
  }

  /**
   * Get sistemaEmittente
   * @return sistemaEmittente
   */
  @javax.annotation.Nullable
  public String getSistemaEmittente() {
    return sistemaEmittente;
  }

  public void setSistemaEmittente(@javax.annotation.Nullable String sistemaEmittente) {
    this.sistemaEmittente = sistemaEmittente;
  }


  public FatturaOrdinaria fatturaElettronicaHeader(@javax.annotation.Nullable FatturaElettronicaHeader fatturaElettronicaHeader) {
    this.fatturaElettronicaHeader = fatturaElettronicaHeader;
    return this;
  }

  /**
   * Get fatturaElettronicaHeader
   * @return fatturaElettronicaHeader
   */
  @javax.annotation.Nullable
  public FatturaElettronicaHeader getFatturaElettronicaHeader() {
    return fatturaElettronicaHeader;
  }

  public void setFatturaElettronicaHeader(@javax.annotation.Nullable FatturaElettronicaHeader fatturaElettronicaHeader) {
    this.fatturaElettronicaHeader = fatturaElettronicaHeader;
  }


  public FatturaOrdinaria fatturaElettronicaBody(@javax.annotation.Nullable List<FatturaElettronicaBody> fatturaElettronicaBody) {
    this.fatturaElettronicaBody = fatturaElettronicaBody;
    return this;
  }

  public FatturaOrdinaria addFatturaElettronicaBodyItem(FatturaElettronicaBody fatturaElettronicaBodyItem) {
    if (this.fatturaElettronicaBody == null) {
      this.fatturaElettronicaBody = new ArrayList<>();
    }
    this.fatturaElettronicaBody.add(fatturaElettronicaBodyItem);
    return this;
  }

  /**
   * Get fatturaElettronicaBody
   * @return fatturaElettronicaBody
   */
  @javax.annotation.Nullable
  public List<FatturaElettronicaBody> getFatturaElettronicaBody() {
    return fatturaElettronicaBody;
  }

  public void setFatturaElettronicaBody(@javax.annotation.Nullable List<FatturaElettronicaBody> fatturaElettronicaBody) {
    this.fatturaElettronicaBody = fatturaElettronicaBody;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FatturaOrdinaria fatturaOrdinaria = (FatturaOrdinaria) o;
    return Objects.equals(this.sistemaEmittente, fatturaOrdinaria.sistemaEmittente) &&
        Objects.equals(this.fatturaElettronicaHeader, fatturaOrdinaria.fatturaElettronicaHeader) &&
        Objects.equals(this.fatturaElettronicaBody, fatturaOrdinaria.fatturaElettronicaBody);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(sistemaEmittente, fatturaElettronicaHeader, fatturaElettronicaBody);
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
    sb.append("class FatturaOrdinaria {\n");
    sb.append("    sistemaEmittente: ").append(toIndentedString(sistemaEmittente)).append("\n");
    sb.append("    fatturaElettronicaHeader: ").append(toIndentedString(fatturaElettronicaHeader)).append("\n");
    sb.append("    fatturaElettronicaBody: ").append(toIndentedString(fatturaElettronicaBody)).append("\n");
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
    openapiFields.add("sistema_emittente");
    openapiFields.add("fattura_elettronica_header");
    openapiFields.add("fattura_elettronica_body");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FatturaOrdinaria
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FatturaOrdinaria.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FatturaOrdinaria is not found in the empty JSON string", FatturaOrdinaria.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FatturaOrdinaria.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FatturaOrdinaria` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("sistema_emittente") != null && !jsonObj.get("sistema_emittente").isJsonNull()) && !jsonObj.get("sistema_emittente").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sistema_emittente` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sistema_emittente").toString()));
      }
      // validate the optional field `fattura_elettronica_header`
      if (jsonObj.get("fattura_elettronica_header") != null && !jsonObj.get("fattura_elettronica_header").isJsonNull()) {
        FatturaElettronicaHeader.validateJsonElement(jsonObj.get("fattura_elettronica_header"));
      }
      if (jsonObj.get("fattura_elettronica_body") != null && !jsonObj.get("fattura_elettronica_body").isJsonNull()) {
        JsonArray jsonArrayfatturaElettronicaBody = jsonObj.getAsJsonArray("fattura_elettronica_body");
        if (jsonArrayfatturaElettronicaBody != null) {
          // ensure the json data is an array
          if (!jsonObj.get("fattura_elettronica_body").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `fattura_elettronica_body` to be an array in the JSON string but got `%s`", jsonObj.get("fattura_elettronica_body").toString()));
          }

          // validate the optional field `fattura_elettronica_body` (array)
          for (int i = 0; i < jsonArrayfatturaElettronicaBody.size(); i++) {
            FatturaElettronicaBody.validateJsonElement(jsonArrayfatturaElettronicaBody.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FatturaOrdinaria.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FatturaOrdinaria' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FatturaOrdinaria> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FatturaOrdinaria.class));

       return (TypeAdapter<T>) new TypeAdapter<FatturaOrdinaria>() {
           @Override
           public void write(JsonWriter out, FatturaOrdinaria value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FatturaOrdinaria read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FatturaOrdinaria given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FatturaOrdinaria
   * @throws IOException if the JSON string is invalid with respect to FatturaOrdinaria
   */
  public static FatturaOrdinaria fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FatturaOrdinaria.class);
  }

  /**
   * Convert an instance of FatturaOrdinaria to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

