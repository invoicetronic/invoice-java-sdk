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
import com.invoicetronic.invoice.sdk.model.DatiRiepilogo;
import com.invoicetronic.invoice.sdk.model.DettaglioLinee;
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
 * DatiBeniServizi
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-06T15:07:44.693101Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class DatiBeniServizi implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DETTAGLIO_LINEE = "dettaglio_linee";
  @SerializedName(SERIALIZED_NAME_DETTAGLIO_LINEE)
  @javax.annotation.Nullable
  private List<DettaglioLinee> dettaglioLinee;

  public static final String SERIALIZED_NAME_DATI_RIEPILOGO = "dati_riepilogo";
  @SerializedName(SERIALIZED_NAME_DATI_RIEPILOGO)
  @javax.annotation.Nullable
  private List<DatiRiepilogo> datiRiepilogo;

  public DatiBeniServizi() {
  }

  public DatiBeniServizi dettaglioLinee(@javax.annotation.Nullable List<DettaglioLinee> dettaglioLinee) {
    this.dettaglioLinee = dettaglioLinee;
    return this;
  }

  public DatiBeniServizi addDettaglioLineeItem(DettaglioLinee dettaglioLineeItem) {
    if (this.dettaglioLinee == null) {
      this.dettaglioLinee = new ArrayList<>();
    }
    this.dettaglioLinee.add(dettaglioLineeItem);
    return this;
  }

  /**
   * Get dettaglioLinee
   * @return dettaglioLinee
   */
  @javax.annotation.Nullable
  public List<DettaglioLinee> getDettaglioLinee() {
    return dettaglioLinee;
  }

  public void setDettaglioLinee(@javax.annotation.Nullable List<DettaglioLinee> dettaglioLinee) {
    this.dettaglioLinee = dettaglioLinee;
  }


  public DatiBeniServizi datiRiepilogo(@javax.annotation.Nullable List<DatiRiepilogo> datiRiepilogo) {
    this.datiRiepilogo = datiRiepilogo;
    return this;
  }

  public DatiBeniServizi addDatiRiepilogoItem(DatiRiepilogo datiRiepilogoItem) {
    if (this.datiRiepilogo == null) {
      this.datiRiepilogo = new ArrayList<>();
    }
    this.datiRiepilogo.add(datiRiepilogoItem);
    return this;
  }

  /**
   * Get datiRiepilogo
   * @return datiRiepilogo
   */
  @javax.annotation.Nullable
  public List<DatiRiepilogo> getDatiRiepilogo() {
    return datiRiepilogo;
  }

  public void setDatiRiepilogo(@javax.annotation.Nullable List<DatiRiepilogo> datiRiepilogo) {
    this.datiRiepilogo = datiRiepilogo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatiBeniServizi datiBeniServizi = (DatiBeniServizi) o;
    return Objects.equals(this.dettaglioLinee, datiBeniServizi.dettaglioLinee) &&
        Objects.equals(this.datiRiepilogo, datiBeniServizi.datiRiepilogo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dettaglioLinee, datiRiepilogo);
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
    sb.append("class DatiBeniServizi {\n");
    sb.append("    dettaglioLinee: ").append(toIndentedString(dettaglioLinee)).append("\n");
    sb.append("    datiRiepilogo: ").append(toIndentedString(datiRiepilogo)).append("\n");
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
    openapiFields.add("dettaglio_linee");
    openapiFields.add("dati_riepilogo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DatiBeniServizi
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DatiBeniServizi.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatiBeniServizi is not found in the empty JSON string", DatiBeniServizi.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DatiBeniServizi.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DatiBeniServizi` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("dettaglio_linee") != null && !jsonObj.get("dettaglio_linee").isJsonNull()) {
        JsonArray jsonArraydettaglioLinee = jsonObj.getAsJsonArray("dettaglio_linee");
        if (jsonArraydettaglioLinee != null) {
          // ensure the json data is an array
          if (!jsonObj.get("dettaglio_linee").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `dettaglio_linee` to be an array in the JSON string but got `%s`", jsonObj.get("dettaglio_linee").toString()));
          }

          // validate the optional field `dettaglio_linee` (array)
          for (int i = 0; i < jsonArraydettaglioLinee.size(); i++) {
            DettaglioLinee.validateJsonElement(jsonArraydettaglioLinee.get(i));
          };
        }
      }
      if (jsonObj.get("dati_riepilogo") != null && !jsonObj.get("dati_riepilogo").isJsonNull()) {
        JsonArray jsonArraydatiRiepilogo = jsonObj.getAsJsonArray("dati_riepilogo");
        if (jsonArraydatiRiepilogo != null) {
          // ensure the json data is an array
          if (!jsonObj.get("dati_riepilogo").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `dati_riepilogo` to be an array in the JSON string but got `%s`", jsonObj.get("dati_riepilogo").toString()));
          }

          // validate the optional field `dati_riepilogo` (array)
          for (int i = 0; i < jsonArraydatiRiepilogo.size(); i++) {
            DatiRiepilogo.validateJsonElement(jsonArraydatiRiepilogo.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatiBeniServizi.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatiBeniServizi' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatiBeniServizi> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatiBeniServizi.class));

       return (TypeAdapter<T>) new TypeAdapter<DatiBeniServizi>() {
           @Override
           public void write(JsonWriter out, DatiBeniServizi value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DatiBeniServizi read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DatiBeniServizi given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DatiBeniServizi
   * @throws IOException if the JSON string is invalid with respect to DatiBeniServizi
   */
  public static DatiBeniServizi fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatiBeniServizi.class);
  }

  /**
   * Convert an instance of DatiBeniServizi to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

