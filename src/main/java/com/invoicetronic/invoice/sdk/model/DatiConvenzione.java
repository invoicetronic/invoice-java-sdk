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
 * DatiConvenzione
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T15:05:08.862696Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class DatiConvenzione implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_RIFERIMENTO_NUMERO_LINEA = "riferimento_numero_linea";
  @SerializedName(SERIALIZED_NAME_RIFERIMENTO_NUMERO_LINEA)
  @javax.annotation.Nullable
  private List<Integer> riferimentoNumeroLinea;

  public static final String SERIALIZED_NAME_ID_DOCUMENTO = "id_documento";
  @SerializedName(SERIALIZED_NAME_ID_DOCUMENTO)
  @javax.annotation.Nullable
  private String idDocumento;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  @javax.annotation.Nullable
  private OffsetDateTime data;

  public static final String SERIALIZED_NAME_NUM_ITEM = "num_item";
  @SerializedName(SERIALIZED_NAME_NUM_ITEM)
  @javax.annotation.Nullable
  private String numItem;

  public static final String SERIALIZED_NAME_CODICE_COMMESSA_CONVENZIONE = "codice_commessa_convenzione";
  @SerializedName(SERIALIZED_NAME_CODICE_COMMESSA_CONVENZIONE)
  @javax.annotation.Nullable
  private String codiceCommessaConvenzione;

  public static final String SERIALIZED_NAME_CODICE_CUP = "codice_cup";
  @SerializedName(SERIALIZED_NAME_CODICE_CUP)
  @javax.annotation.Nullable
  private String codiceCup;

  public static final String SERIALIZED_NAME_CODICE_CIG = "codice_cig";
  @SerializedName(SERIALIZED_NAME_CODICE_CIG)
  @javax.annotation.Nullable
  private String codiceCig;

  public DatiConvenzione() {
  }

  public DatiConvenzione riferimentoNumeroLinea(@javax.annotation.Nullable List<Integer> riferimentoNumeroLinea) {
    this.riferimentoNumeroLinea = riferimentoNumeroLinea;
    return this;
  }

  public DatiConvenzione addRiferimentoNumeroLineaItem(Integer riferimentoNumeroLineaItem) {
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


  public DatiConvenzione idDocumento(@javax.annotation.Nullable String idDocumento) {
    this.idDocumento = idDocumento;
    return this;
  }

  /**
   * Get idDocumento
   * @return idDocumento
   */
  @javax.annotation.Nullable
  public String getIdDocumento() {
    return idDocumento;
  }

  public void setIdDocumento(@javax.annotation.Nullable String idDocumento) {
    this.idDocumento = idDocumento;
  }


  public DatiConvenzione data(@javax.annotation.Nullable OffsetDateTime data) {
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


  public DatiConvenzione numItem(@javax.annotation.Nullable String numItem) {
    this.numItem = numItem;
    return this;
  }

  /**
   * Get numItem
   * @return numItem
   */
  @javax.annotation.Nullable
  public String getNumItem() {
    return numItem;
  }

  public void setNumItem(@javax.annotation.Nullable String numItem) {
    this.numItem = numItem;
  }


  public DatiConvenzione codiceCommessaConvenzione(@javax.annotation.Nullable String codiceCommessaConvenzione) {
    this.codiceCommessaConvenzione = codiceCommessaConvenzione;
    return this;
  }

  /**
   * Get codiceCommessaConvenzione
   * @return codiceCommessaConvenzione
   */
  @javax.annotation.Nullable
  public String getCodiceCommessaConvenzione() {
    return codiceCommessaConvenzione;
  }

  public void setCodiceCommessaConvenzione(@javax.annotation.Nullable String codiceCommessaConvenzione) {
    this.codiceCommessaConvenzione = codiceCommessaConvenzione;
  }


  public DatiConvenzione codiceCup(@javax.annotation.Nullable String codiceCup) {
    this.codiceCup = codiceCup;
    return this;
  }

  /**
   * Get codiceCup
   * @return codiceCup
   */
  @javax.annotation.Nullable
  public String getCodiceCup() {
    return codiceCup;
  }

  public void setCodiceCup(@javax.annotation.Nullable String codiceCup) {
    this.codiceCup = codiceCup;
  }


  public DatiConvenzione codiceCig(@javax.annotation.Nullable String codiceCig) {
    this.codiceCig = codiceCig;
    return this;
  }

  /**
   * Get codiceCig
   * @return codiceCig
   */
  @javax.annotation.Nullable
  public String getCodiceCig() {
    return codiceCig;
  }

  public void setCodiceCig(@javax.annotation.Nullable String codiceCig) {
    this.codiceCig = codiceCig;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatiConvenzione datiConvenzione = (DatiConvenzione) o;
    return Objects.equals(this.riferimentoNumeroLinea, datiConvenzione.riferimentoNumeroLinea) &&
        Objects.equals(this.idDocumento, datiConvenzione.idDocumento) &&
        Objects.equals(this.data, datiConvenzione.data) &&
        Objects.equals(this.numItem, datiConvenzione.numItem) &&
        Objects.equals(this.codiceCommessaConvenzione, datiConvenzione.codiceCommessaConvenzione) &&
        Objects.equals(this.codiceCup, datiConvenzione.codiceCup) &&
        Objects.equals(this.codiceCig, datiConvenzione.codiceCig);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(riferimentoNumeroLinea, idDocumento, data, numItem, codiceCommessaConvenzione, codiceCup, codiceCig);
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
    sb.append("class DatiConvenzione {\n");
    sb.append("    riferimentoNumeroLinea: ").append(toIndentedString(riferimentoNumeroLinea)).append("\n");
    sb.append("    idDocumento: ").append(toIndentedString(idDocumento)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    numItem: ").append(toIndentedString(numItem)).append("\n");
    sb.append("    codiceCommessaConvenzione: ").append(toIndentedString(codiceCommessaConvenzione)).append("\n");
    sb.append("    codiceCup: ").append(toIndentedString(codiceCup)).append("\n");
    sb.append("    codiceCig: ").append(toIndentedString(codiceCig)).append("\n");
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
    openapiFields.add("riferimento_numero_linea");
    openapiFields.add("id_documento");
    openapiFields.add("data");
    openapiFields.add("num_item");
    openapiFields.add("codice_commessa_convenzione");
    openapiFields.add("codice_cup");
    openapiFields.add("codice_cig");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DatiConvenzione
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DatiConvenzione.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatiConvenzione is not found in the empty JSON string", DatiConvenzione.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DatiConvenzione.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DatiConvenzione` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("riferimento_numero_linea") != null && !jsonObj.get("riferimento_numero_linea").isJsonNull() && !jsonObj.get("riferimento_numero_linea").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `riferimento_numero_linea` to be an array in the JSON string but got `%s`", jsonObj.get("riferimento_numero_linea").toString()));
      }
      if ((jsonObj.get("id_documento") != null && !jsonObj.get("id_documento").isJsonNull()) && !jsonObj.get("id_documento").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id_documento` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id_documento").toString()));
      }
      if ((jsonObj.get("num_item") != null && !jsonObj.get("num_item").isJsonNull()) && !jsonObj.get("num_item").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `num_item` to be a primitive type in the JSON string but got `%s`", jsonObj.get("num_item").toString()));
      }
      if ((jsonObj.get("codice_commessa_convenzione") != null && !jsonObj.get("codice_commessa_convenzione").isJsonNull()) && !jsonObj.get("codice_commessa_convenzione").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `codice_commessa_convenzione` to be a primitive type in the JSON string but got `%s`", jsonObj.get("codice_commessa_convenzione").toString()));
      }
      if ((jsonObj.get("codice_cup") != null && !jsonObj.get("codice_cup").isJsonNull()) && !jsonObj.get("codice_cup").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `codice_cup` to be a primitive type in the JSON string but got `%s`", jsonObj.get("codice_cup").toString()));
      }
      if ((jsonObj.get("codice_cig") != null && !jsonObj.get("codice_cig").isJsonNull()) && !jsonObj.get("codice_cig").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `codice_cig` to be a primitive type in the JSON string but got `%s`", jsonObj.get("codice_cig").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatiConvenzione.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatiConvenzione' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatiConvenzione> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatiConvenzione.class));

       return (TypeAdapter<T>) new TypeAdapter<DatiConvenzione>() {
           @Override
           public void write(JsonWriter out, DatiConvenzione value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DatiConvenzione read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DatiConvenzione given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DatiConvenzione
   * @throws IOException if the JSON string is invalid with respect to DatiConvenzione
   */
  public static DatiConvenzione fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatiConvenzione.class);
  }

  /**
   * Convert an instance of DatiConvenzione to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

