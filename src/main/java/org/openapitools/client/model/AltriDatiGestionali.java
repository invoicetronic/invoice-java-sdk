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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * AltriDatiGestionali
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-06T09:56:56.609426Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class AltriDatiGestionali {
  public static final String SERIALIZED_NAME_TIPO_DATO = "tipo_dato";
  @SerializedName(SERIALIZED_NAME_TIPO_DATO)
  @javax.annotation.Nullable
  private String tipoDato;

  public static final String SERIALIZED_NAME_RIFERIMENTO_TESTO = "riferimento_testo";
  @SerializedName(SERIALIZED_NAME_RIFERIMENTO_TESTO)
  @javax.annotation.Nullable
  private String riferimentoTesto;

  public static final String SERIALIZED_NAME_RIFERIMENTO_NUMERO = "riferimento_numero";
  @SerializedName(SERIALIZED_NAME_RIFERIMENTO_NUMERO)
  @javax.annotation.Nullable
  private Double riferimentoNumero;

  public static final String SERIALIZED_NAME_RIFERIMENTO_DATA = "riferimento_data";
  @SerializedName(SERIALIZED_NAME_RIFERIMENTO_DATA)
  @javax.annotation.Nullable
  private OffsetDateTime riferimentoData;

  public AltriDatiGestionali() {
  }

  public AltriDatiGestionali tipoDato(@javax.annotation.Nullable String tipoDato) {
    this.tipoDato = tipoDato;
    return this;
  }

  /**
   * Get tipoDato
   * @return tipoDato
   */
  @javax.annotation.Nullable
  public String getTipoDato() {
    return tipoDato;
  }

  public void setTipoDato(@javax.annotation.Nullable String tipoDato) {
    this.tipoDato = tipoDato;
  }


  public AltriDatiGestionali riferimentoTesto(@javax.annotation.Nullable String riferimentoTesto) {
    this.riferimentoTesto = riferimentoTesto;
    return this;
  }

  /**
   * Get riferimentoTesto
   * @return riferimentoTesto
   */
  @javax.annotation.Nullable
  public String getRiferimentoTesto() {
    return riferimentoTesto;
  }

  public void setRiferimentoTesto(@javax.annotation.Nullable String riferimentoTesto) {
    this.riferimentoTesto = riferimentoTesto;
  }


  public AltriDatiGestionali riferimentoNumero(@javax.annotation.Nullable Double riferimentoNumero) {
    this.riferimentoNumero = riferimentoNumero;
    return this;
  }

  /**
   * Get riferimentoNumero
   * @return riferimentoNumero
   */
  @javax.annotation.Nullable
  public Double getRiferimentoNumero() {
    return riferimentoNumero;
  }

  public void setRiferimentoNumero(@javax.annotation.Nullable Double riferimentoNumero) {
    this.riferimentoNumero = riferimentoNumero;
  }


  public AltriDatiGestionali riferimentoData(@javax.annotation.Nullable OffsetDateTime riferimentoData) {
    this.riferimentoData = riferimentoData;
    return this;
  }

  /**
   * Get riferimentoData
   * @return riferimentoData
   */
  @javax.annotation.Nullable
  public OffsetDateTime getRiferimentoData() {
    return riferimentoData;
  }

  public void setRiferimentoData(@javax.annotation.Nullable OffsetDateTime riferimentoData) {
    this.riferimentoData = riferimentoData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AltriDatiGestionali altriDatiGestionali = (AltriDatiGestionali) o;
    return Objects.equals(this.tipoDato, altriDatiGestionali.tipoDato) &&
        Objects.equals(this.riferimentoTesto, altriDatiGestionali.riferimentoTesto) &&
        Objects.equals(this.riferimentoNumero, altriDatiGestionali.riferimentoNumero) &&
        Objects.equals(this.riferimentoData, altriDatiGestionali.riferimentoData);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipoDato, riferimentoTesto, riferimentoNumero, riferimentoData);
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
    sb.append("class AltriDatiGestionali {\n");
    sb.append("    tipoDato: ").append(toIndentedString(tipoDato)).append("\n");
    sb.append("    riferimentoTesto: ").append(toIndentedString(riferimentoTesto)).append("\n");
    sb.append("    riferimentoNumero: ").append(toIndentedString(riferimentoNumero)).append("\n");
    sb.append("    riferimentoData: ").append(toIndentedString(riferimentoData)).append("\n");
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
    openapiFields.add("tipo_dato");
    openapiFields.add("riferimento_testo");
    openapiFields.add("riferimento_numero");
    openapiFields.add("riferimento_data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AltriDatiGestionali
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AltriDatiGestionali.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AltriDatiGestionali is not found in the empty JSON string", AltriDatiGestionali.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AltriDatiGestionali.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AltriDatiGestionali` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("tipo_dato") != null && !jsonObj.get("tipo_dato").isJsonNull()) && !jsonObj.get("tipo_dato").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tipo_dato` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tipo_dato").toString()));
      }
      if ((jsonObj.get("riferimento_testo") != null && !jsonObj.get("riferimento_testo").isJsonNull()) && !jsonObj.get("riferimento_testo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `riferimento_testo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("riferimento_testo").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AltriDatiGestionali.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AltriDatiGestionali' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AltriDatiGestionali> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AltriDatiGestionali.class));

       return (TypeAdapter<T>) new TypeAdapter<AltriDatiGestionali>() {
           @Override
           public void write(JsonWriter out, AltriDatiGestionali value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AltriDatiGestionali read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AltriDatiGestionali given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AltriDatiGestionali
   * @throws IOException if the JSON string is invalid with respect to AltriDatiGestionali
   */
  public static AltriDatiGestionali fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AltriDatiGestionali.class);
  }

  /**
   * Convert an instance of AltriDatiGestionali to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

