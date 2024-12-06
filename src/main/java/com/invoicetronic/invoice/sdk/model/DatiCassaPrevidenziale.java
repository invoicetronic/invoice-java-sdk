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
 * DatiCassaPrevidenziale
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-06T10:33:08.241248Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class DatiCassaPrevidenziale implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TIPO_CASSA = "tipo_cassa";
  @SerializedName(SERIALIZED_NAME_TIPO_CASSA)
  @javax.annotation.Nullable
  private String tipoCassa;

  public static final String SERIALIZED_NAME_AL_CASSA = "al_cassa";
  @SerializedName(SERIALIZED_NAME_AL_CASSA)
  @javax.annotation.Nullable
  private Double alCassa;

  public static final String SERIALIZED_NAME_IMPORTO_CONTRIBUTO_CASSA = "importo_contributo_cassa";
  @SerializedName(SERIALIZED_NAME_IMPORTO_CONTRIBUTO_CASSA)
  @javax.annotation.Nullable
  private Double importoContributoCassa;

  public static final String SERIALIZED_NAME_IMPONIBILE_CASSA = "imponibile_cassa";
  @SerializedName(SERIALIZED_NAME_IMPONIBILE_CASSA)
  @javax.annotation.Nullable
  private Double imponibileCassa;

  public static final String SERIALIZED_NAME_ALIQUOTA_IVA = "aliquota_iva";
  @SerializedName(SERIALIZED_NAME_ALIQUOTA_IVA)
  @javax.annotation.Nullable
  private Double aliquotaIva;

  public static final String SERIALIZED_NAME_RITENUTA = "ritenuta";
  @SerializedName(SERIALIZED_NAME_RITENUTA)
  @javax.annotation.Nullable
  private String ritenuta;

  public static final String SERIALIZED_NAME_NATURA = "natura";
  @SerializedName(SERIALIZED_NAME_NATURA)
  @javax.annotation.Nullable
  private String natura;

  public static final String SERIALIZED_NAME_RIFERIMENTO_AMMINISTRAZIONE = "riferimento_amministrazione";
  @SerializedName(SERIALIZED_NAME_RIFERIMENTO_AMMINISTRAZIONE)
  @javax.annotation.Nullable
  private String riferimentoAmministrazione;

  public DatiCassaPrevidenziale() {
  }

  public DatiCassaPrevidenziale tipoCassa(@javax.annotation.Nullable String tipoCassa) {
    this.tipoCassa = tipoCassa;
    return this;
  }

  /**
   * Get tipoCassa
   * @return tipoCassa
   */
  @javax.annotation.Nullable
  public String getTipoCassa() {
    return tipoCassa;
  }

  public void setTipoCassa(@javax.annotation.Nullable String tipoCassa) {
    this.tipoCassa = tipoCassa;
  }


  public DatiCassaPrevidenziale alCassa(@javax.annotation.Nullable Double alCassa) {
    this.alCassa = alCassa;
    return this;
  }

  /**
   * Get alCassa
   * @return alCassa
   */
  @javax.annotation.Nullable
  public Double getAlCassa() {
    return alCassa;
  }

  public void setAlCassa(@javax.annotation.Nullable Double alCassa) {
    this.alCassa = alCassa;
  }


  public DatiCassaPrevidenziale importoContributoCassa(@javax.annotation.Nullable Double importoContributoCassa) {
    this.importoContributoCassa = importoContributoCassa;
    return this;
  }

  /**
   * Get importoContributoCassa
   * @return importoContributoCassa
   */
  @javax.annotation.Nullable
  public Double getImportoContributoCassa() {
    return importoContributoCassa;
  }

  public void setImportoContributoCassa(@javax.annotation.Nullable Double importoContributoCassa) {
    this.importoContributoCassa = importoContributoCassa;
  }


  public DatiCassaPrevidenziale imponibileCassa(@javax.annotation.Nullable Double imponibileCassa) {
    this.imponibileCassa = imponibileCassa;
    return this;
  }

  /**
   * Get imponibileCassa
   * @return imponibileCassa
   */
  @javax.annotation.Nullable
  public Double getImponibileCassa() {
    return imponibileCassa;
  }

  public void setImponibileCassa(@javax.annotation.Nullable Double imponibileCassa) {
    this.imponibileCassa = imponibileCassa;
  }


  public DatiCassaPrevidenziale aliquotaIva(@javax.annotation.Nullable Double aliquotaIva) {
    this.aliquotaIva = aliquotaIva;
    return this;
  }

  /**
   * Get aliquotaIva
   * @return aliquotaIva
   */
  @javax.annotation.Nullable
  public Double getAliquotaIva() {
    return aliquotaIva;
  }

  public void setAliquotaIva(@javax.annotation.Nullable Double aliquotaIva) {
    this.aliquotaIva = aliquotaIva;
  }


  public DatiCassaPrevidenziale ritenuta(@javax.annotation.Nullable String ritenuta) {
    this.ritenuta = ritenuta;
    return this;
  }

  /**
   * Get ritenuta
   * @return ritenuta
   */
  @javax.annotation.Nullable
  public String getRitenuta() {
    return ritenuta;
  }

  public void setRitenuta(@javax.annotation.Nullable String ritenuta) {
    this.ritenuta = ritenuta;
  }


  public DatiCassaPrevidenziale natura(@javax.annotation.Nullable String natura) {
    this.natura = natura;
    return this;
  }

  /**
   * Get natura
   * @return natura
   */
  @javax.annotation.Nullable
  public String getNatura() {
    return natura;
  }

  public void setNatura(@javax.annotation.Nullable String natura) {
    this.natura = natura;
  }


  public DatiCassaPrevidenziale riferimentoAmministrazione(@javax.annotation.Nullable String riferimentoAmministrazione) {
    this.riferimentoAmministrazione = riferimentoAmministrazione;
    return this;
  }

  /**
   * Get riferimentoAmministrazione
   * @return riferimentoAmministrazione
   */
  @javax.annotation.Nullable
  public String getRiferimentoAmministrazione() {
    return riferimentoAmministrazione;
  }

  public void setRiferimentoAmministrazione(@javax.annotation.Nullable String riferimentoAmministrazione) {
    this.riferimentoAmministrazione = riferimentoAmministrazione;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatiCassaPrevidenziale datiCassaPrevidenziale = (DatiCassaPrevidenziale) o;
    return Objects.equals(this.tipoCassa, datiCassaPrevidenziale.tipoCassa) &&
        Objects.equals(this.alCassa, datiCassaPrevidenziale.alCassa) &&
        Objects.equals(this.importoContributoCassa, datiCassaPrevidenziale.importoContributoCassa) &&
        Objects.equals(this.imponibileCassa, datiCassaPrevidenziale.imponibileCassa) &&
        Objects.equals(this.aliquotaIva, datiCassaPrevidenziale.aliquotaIva) &&
        Objects.equals(this.ritenuta, datiCassaPrevidenziale.ritenuta) &&
        Objects.equals(this.natura, datiCassaPrevidenziale.natura) &&
        Objects.equals(this.riferimentoAmministrazione, datiCassaPrevidenziale.riferimentoAmministrazione);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipoCassa, alCassa, importoContributoCassa, imponibileCassa, aliquotaIva, ritenuta, natura, riferimentoAmministrazione);
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
    sb.append("class DatiCassaPrevidenziale {\n");
    sb.append("    tipoCassa: ").append(toIndentedString(tipoCassa)).append("\n");
    sb.append("    alCassa: ").append(toIndentedString(alCassa)).append("\n");
    sb.append("    importoContributoCassa: ").append(toIndentedString(importoContributoCassa)).append("\n");
    sb.append("    imponibileCassa: ").append(toIndentedString(imponibileCassa)).append("\n");
    sb.append("    aliquotaIva: ").append(toIndentedString(aliquotaIva)).append("\n");
    sb.append("    ritenuta: ").append(toIndentedString(ritenuta)).append("\n");
    sb.append("    natura: ").append(toIndentedString(natura)).append("\n");
    sb.append("    riferimentoAmministrazione: ").append(toIndentedString(riferimentoAmministrazione)).append("\n");
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
    openapiFields.add("tipo_cassa");
    openapiFields.add("al_cassa");
    openapiFields.add("importo_contributo_cassa");
    openapiFields.add("imponibile_cassa");
    openapiFields.add("aliquota_iva");
    openapiFields.add("ritenuta");
    openapiFields.add("natura");
    openapiFields.add("riferimento_amministrazione");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DatiCassaPrevidenziale
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DatiCassaPrevidenziale.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatiCassaPrevidenziale is not found in the empty JSON string", DatiCassaPrevidenziale.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DatiCassaPrevidenziale.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DatiCassaPrevidenziale` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("tipo_cassa") != null && !jsonObj.get("tipo_cassa").isJsonNull()) && !jsonObj.get("tipo_cassa").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tipo_cassa` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tipo_cassa").toString()));
      }
      if ((jsonObj.get("ritenuta") != null && !jsonObj.get("ritenuta").isJsonNull()) && !jsonObj.get("ritenuta").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ritenuta` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ritenuta").toString()));
      }
      if ((jsonObj.get("natura") != null && !jsonObj.get("natura").isJsonNull()) && !jsonObj.get("natura").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `natura` to be a primitive type in the JSON string but got `%s`", jsonObj.get("natura").toString()));
      }
      if ((jsonObj.get("riferimento_amministrazione") != null && !jsonObj.get("riferimento_amministrazione").isJsonNull()) && !jsonObj.get("riferimento_amministrazione").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `riferimento_amministrazione` to be a primitive type in the JSON string but got `%s`", jsonObj.get("riferimento_amministrazione").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatiCassaPrevidenziale.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatiCassaPrevidenziale' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatiCassaPrevidenziale> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatiCassaPrevidenziale.class));

       return (TypeAdapter<T>) new TypeAdapter<DatiCassaPrevidenziale>() {
           @Override
           public void write(JsonWriter out, DatiCassaPrevidenziale value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DatiCassaPrevidenziale read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DatiCassaPrevidenziale given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DatiCassaPrevidenziale
   * @throws IOException if the JSON string is invalid with respect to DatiCassaPrevidenziale
   */
  public static DatiCassaPrevidenziale fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatiCassaPrevidenziale.class);
  }

  /**
   * Convert an instance of DatiCassaPrevidenziale to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

