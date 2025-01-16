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

import com.invoicetronic.invoice.sdk.JSON;

/**
 * DatiDDT
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-16T16:10:21.843557Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class DatiDDT implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NUMERO_DDT = "numero_ddt";
  @SerializedName(SERIALIZED_NAME_NUMERO_DDT)
  @javax.annotation.Nullable
  private String numeroDdt;

  public static final String SERIALIZED_NAME_DATA_DDT = "data_ddt";
  @SerializedName(SERIALIZED_NAME_DATA_DDT)
  @javax.annotation.Nullable
  private OffsetDateTime dataDdt;

  public static final String SERIALIZED_NAME_RIFERIMENTO_NUMERO_LINEA = "riferimento_numero_linea";
  @SerializedName(SERIALIZED_NAME_RIFERIMENTO_NUMERO_LINEA)
  @javax.annotation.Nullable
  private List<Integer> riferimentoNumeroLinea;

  public DatiDDT() {
  }

  public DatiDDT numeroDdt(@javax.annotation.Nullable String numeroDdt) {
    this.numeroDdt = numeroDdt;
    return this;
  }

  /**
   * Get numeroDdt
   * @return numeroDdt
   */
  @javax.annotation.Nullable
  public String getNumeroDdt() {
    return numeroDdt;
  }

  public void setNumeroDdt(@javax.annotation.Nullable String numeroDdt) {
    this.numeroDdt = numeroDdt;
  }


  public DatiDDT dataDdt(@javax.annotation.Nullable OffsetDateTime dataDdt) {
    this.dataDdt = dataDdt;
    return this;
  }

  /**
   * Get dataDdt
   * @return dataDdt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDataDdt() {
    return dataDdt;
  }

  public void setDataDdt(@javax.annotation.Nullable OffsetDateTime dataDdt) {
    this.dataDdt = dataDdt;
  }


  public DatiDDT riferimentoNumeroLinea(@javax.annotation.Nullable List<Integer> riferimentoNumeroLinea) {
    this.riferimentoNumeroLinea = riferimentoNumeroLinea;
    return this;
  }

  public DatiDDT addRiferimentoNumeroLineaItem(Integer riferimentoNumeroLineaItem) {
    if (this.riferimentoNumeroLinea == null) {
      this.riferimentoNumeroLinea = new ArrayList<>();
    }
    this.riferimentoNumeroLinea.add(riferimentoNumeroLineaItem);
    return this;
  }

  /**
   * Get riferimentoNumeroLinea
   * @return riferimentoNumeroLinea
   */
  @javax.annotation.Nullable
  public List<Integer> getRiferimentoNumeroLinea() {
    return riferimentoNumeroLinea;
  }

  public void setRiferimentoNumeroLinea(@javax.annotation.Nullable List<Integer> riferimentoNumeroLinea) {
    this.riferimentoNumeroLinea = riferimentoNumeroLinea;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatiDDT datiDDT = (DatiDDT) o;
    return Objects.equals(this.numeroDdt, datiDDT.numeroDdt) &&
        Objects.equals(this.dataDdt, datiDDT.dataDdt) &&
        Objects.equals(this.riferimentoNumeroLinea, datiDDT.riferimentoNumeroLinea);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(numeroDdt, dataDdt, riferimentoNumeroLinea);
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
    sb.append("class DatiDDT {\n");
    sb.append("    numeroDdt: ").append(toIndentedString(numeroDdt)).append("\n");
    sb.append("    dataDdt: ").append(toIndentedString(dataDdt)).append("\n");
    sb.append("    riferimentoNumeroLinea: ").append(toIndentedString(riferimentoNumeroLinea)).append("\n");
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
    openapiFields.add("numero_ddt");
    openapiFields.add("data_ddt");
    openapiFields.add("riferimento_numero_linea");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DatiDDT
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DatiDDT.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatiDDT is not found in the empty JSON string", DatiDDT.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DatiDDT.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DatiDDT` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("numero_ddt") != null && !jsonObj.get("numero_ddt").isJsonNull()) && !jsonObj.get("numero_ddt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `numero_ddt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("numero_ddt").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("riferimento_numero_linea") != null && !jsonObj.get("riferimento_numero_linea").isJsonNull() && !jsonObj.get("riferimento_numero_linea").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `riferimento_numero_linea` to be an array in the JSON string but got `%s`", jsonObj.get("riferimento_numero_linea").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatiDDT.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatiDDT' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatiDDT> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatiDDT.class));

       return (TypeAdapter<T>) new TypeAdapter<DatiDDT>() {
           @Override
           public void write(JsonWriter out, DatiDDT value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DatiDDT read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DatiDDT given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DatiDDT
   * @throws IOException if the JSON string is invalid with respect to DatiDDT
   */
  public static DatiDDT fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatiDDT.class);
  }

  /**
   * Convert an instance of DatiDDT to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

