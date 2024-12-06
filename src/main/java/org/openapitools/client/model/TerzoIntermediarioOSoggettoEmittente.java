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


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.client.model.DatiAnagrafici;

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

import invalidPackageName.JSON;

/**
 * TerzoIntermediarioOSoggettoEmittente
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-06T09:56:56.609426Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class TerzoIntermediarioOSoggettoEmittente {
  public static final String SERIALIZED_NAME_DATI_ANAGRAFICI = "dati_anagrafici";
  @SerializedName(SERIALIZED_NAME_DATI_ANAGRAFICI)
  @javax.annotation.Nullable
  private DatiAnagrafici datiAnagrafici;

  public TerzoIntermediarioOSoggettoEmittente() {
  }

  public TerzoIntermediarioOSoggettoEmittente datiAnagrafici(@javax.annotation.Nullable DatiAnagrafici datiAnagrafici) {
    this.datiAnagrafici = datiAnagrafici;
    return this;
  }

  /**
   * Get datiAnagrafici
   * @return datiAnagrafici
   */
  @javax.annotation.Nullable
  public DatiAnagrafici getDatiAnagrafici() {
    return datiAnagrafici;
  }

  public void setDatiAnagrafici(@javax.annotation.Nullable DatiAnagrafici datiAnagrafici) {
    this.datiAnagrafici = datiAnagrafici;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerzoIntermediarioOSoggettoEmittente terzoIntermediarioOSoggettoEmittente = (TerzoIntermediarioOSoggettoEmittente) o;
    return Objects.equals(this.datiAnagrafici, terzoIntermediarioOSoggettoEmittente.datiAnagrafici);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datiAnagrafici);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerzoIntermediarioOSoggettoEmittente {\n");
    sb.append("    datiAnagrafici: ").append(toIndentedString(datiAnagrafici)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TerzoIntermediarioOSoggettoEmittente
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TerzoIntermediarioOSoggettoEmittente.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TerzoIntermediarioOSoggettoEmittente is not found in the empty JSON string", TerzoIntermediarioOSoggettoEmittente.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TerzoIntermediarioOSoggettoEmittente.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TerzoIntermediarioOSoggettoEmittente` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `dati_anagrafici`
      if (jsonObj.get("dati_anagrafici") != null && !jsonObj.get("dati_anagrafici").isJsonNull()) {
        DatiAnagrafici.validateJsonElement(jsonObj.get("dati_anagrafici"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TerzoIntermediarioOSoggettoEmittente.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TerzoIntermediarioOSoggettoEmittente' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TerzoIntermediarioOSoggettoEmittente> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TerzoIntermediarioOSoggettoEmittente.class));

       return (TypeAdapter<T>) new TypeAdapter<TerzoIntermediarioOSoggettoEmittente>() {
           @Override
           public void write(JsonWriter out, TerzoIntermediarioOSoggettoEmittente value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TerzoIntermediarioOSoggettoEmittente read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TerzoIntermediarioOSoggettoEmittente given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TerzoIntermediarioOSoggettoEmittente
   * @throws IOException if the JSON string is invalid with respect to TerzoIntermediarioOSoggettoEmittente
   */
  public static TerzoIntermediarioOSoggettoEmittente fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TerzoIntermediarioOSoggettoEmittente.class);
  }

  /**
   * Convert an instance of TerzoIntermediarioOSoggettoEmittente to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

