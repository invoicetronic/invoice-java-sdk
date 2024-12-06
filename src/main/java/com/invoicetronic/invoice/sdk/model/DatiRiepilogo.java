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
 * DatiRiepilogo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-06T15:07:44.693101Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class DatiRiepilogo implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ALIQUOTA_IVA = "aliquota_iva";
  @SerializedName(SERIALIZED_NAME_ALIQUOTA_IVA)
  @javax.annotation.Nullable
  private Double aliquotaIva;

  public static final String SERIALIZED_NAME_NATURA = "natura";
  @SerializedName(SERIALIZED_NAME_NATURA)
  @javax.annotation.Nullable
  private String natura;

  public static final String SERIALIZED_NAME_SPESE_ACCESSORIE = "spese_accessorie";
  @SerializedName(SERIALIZED_NAME_SPESE_ACCESSORIE)
  @javax.annotation.Nullable
  private Double speseAccessorie;

  public static final String SERIALIZED_NAME_ARROTONDAMENTO = "arrotondamento";
  @SerializedName(SERIALIZED_NAME_ARROTONDAMENTO)
  @javax.annotation.Nullable
  private Double arrotondamento;

  public static final String SERIALIZED_NAME_IMPONIBILE_IMPORTO = "imponibile_importo";
  @SerializedName(SERIALIZED_NAME_IMPONIBILE_IMPORTO)
  @javax.annotation.Nullable
  private Double imponibileImporto;

  public static final String SERIALIZED_NAME_IMPOSTA = "imposta";
  @SerializedName(SERIALIZED_NAME_IMPOSTA)
  @javax.annotation.Nullable
  private Double imposta;

  public static final String SERIALIZED_NAME_ESIGIBILITA_IVA = "esigibilita_iva";
  @SerializedName(SERIALIZED_NAME_ESIGIBILITA_IVA)
  @javax.annotation.Nullable
  private String esigibilitaIva;

  public static final String SERIALIZED_NAME_RIFERIMENTO_NORMATIVO = "riferimento_normativo";
  @SerializedName(SERIALIZED_NAME_RIFERIMENTO_NORMATIVO)
  @javax.annotation.Nullable
  private String riferimentoNormativo;

  public DatiRiepilogo() {
  }

  public DatiRiepilogo aliquotaIva(@javax.annotation.Nullable Double aliquotaIva) {
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


  public DatiRiepilogo natura(@javax.annotation.Nullable String natura) {
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


  public DatiRiepilogo speseAccessorie(@javax.annotation.Nullable Double speseAccessorie) {
    this.speseAccessorie = speseAccessorie;
    return this;
  }

  /**
   * Get speseAccessorie
   * @return speseAccessorie
   */
  @javax.annotation.Nullable
  public Double getSpeseAccessorie() {
    return speseAccessorie;
  }

  public void setSpeseAccessorie(@javax.annotation.Nullable Double speseAccessorie) {
    this.speseAccessorie = speseAccessorie;
  }


  public DatiRiepilogo arrotondamento(@javax.annotation.Nullable Double arrotondamento) {
    this.arrotondamento = arrotondamento;
    return this;
  }

  /**
   * Get arrotondamento
   * @return arrotondamento
   */
  @javax.annotation.Nullable
  public Double getArrotondamento() {
    return arrotondamento;
  }

  public void setArrotondamento(@javax.annotation.Nullable Double arrotondamento) {
    this.arrotondamento = arrotondamento;
  }


  public DatiRiepilogo imponibileImporto(@javax.annotation.Nullable Double imponibileImporto) {
    this.imponibileImporto = imponibileImporto;
    return this;
  }

  /**
   * Get imponibileImporto
   * @return imponibileImporto
   */
  @javax.annotation.Nullable
  public Double getImponibileImporto() {
    return imponibileImporto;
  }

  public void setImponibileImporto(@javax.annotation.Nullable Double imponibileImporto) {
    this.imponibileImporto = imponibileImporto;
  }


  public DatiRiepilogo imposta(@javax.annotation.Nullable Double imposta) {
    this.imposta = imposta;
    return this;
  }

  /**
   * Get imposta
   * @return imposta
   */
  @javax.annotation.Nullable
  public Double getImposta() {
    return imposta;
  }

  public void setImposta(@javax.annotation.Nullable Double imposta) {
    this.imposta = imposta;
  }


  public DatiRiepilogo esigibilitaIva(@javax.annotation.Nullable String esigibilitaIva) {
    this.esigibilitaIva = esigibilitaIva;
    return this;
  }

  /**
   * Get esigibilitaIva
   * @return esigibilitaIva
   */
  @javax.annotation.Nullable
  public String getEsigibilitaIva() {
    return esigibilitaIva;
  }

  public void setEsigibilitaIva(@javax.annotation.Nullable String esigibilitaIva) {
    this.esigibilitaIva = esigibilitaIva;
  }


  public DatiRiepilogo riferimentoNormativo(@javax.annotation.Nullable String riferimentoNormativo) {
    this.riferimentoNormativo = riferimentoNormativo;
    return this;
  }

  /**
   * Get riferimentoNormativo
   * @return riferimentoNormativo
   */
  @javax.annotation.Nullable
  public String getRiferimentoNormativo() {
    return riferimentoNormativo;
  }

  public void setRiferimentoNormativo(@javax.annotation.Nullable String riferimentoNormativo) {
    this.riferimentoNormativo = riferimentoNormativo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatiRiepilogo datiRiepilogo = (DatiRiepilogo) o;
    return Objects.equals(this.aliquotaIva, datiRiepilogo.aliquotaIva) &&
        Objects.equals(this.natura, datiRiepilogo.natura) &&
        Objects.equals(this.speseAccessorie, datiRiepilogo.speseAccessorie) &&
        Objects.equals(this.arrotondamento, datiRiepilogo.arrotondamento) &&
        Objects.equals(this.imponibileImporto, datiRiepilogo.imponibileImporto) &&
        Objects.equals(this.imposta, datiRiepilogo.imposta) &&
        Objects.equals(this.esigibilitaIva, datiRiepilogo.esigibilitaIva) &&
        Objects.equals(this.riferimentoNormativo, datiRiepilogo.riferimentoNormativo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(aliquotaIva, natura, speseAccessorie, arrotondamento, imponibileImporto, imposta, esigibilitaIva, riferimentoNormativo);
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
    sb.append("class DatiRiepilogo {\n");
    sb.append("    aliquotaIva: ").append(toIndentedString(aliquotaIva)).append("\n");
    sb.append("    natura: ").append(toIndentedString(natura)).append("\n");
    sb.append("    speseAccessorie: ").append(toIndentedString(speseAccessorie)).append("\n");
    sb.append("    arrotondamento: ").append(toIndentedString(arrotondamento)).append("\n");
    sb.append("    imponibileImporto: ").append(toIndentedString(imponibileImporto)).append("\n");
    sb.append("    imposta: ").append(toIndentedString(imposta)).append("\n");
    sb.append("    esigibilitaIva: ").append(toIndentedString(esigibilitaIva)).append("\n");
    sb.append("    riferimentoNormativo: ").append(toIndentedString(riferimentoNormativo)).append("\n");
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
    openapiFields.add("aliquota_iva");
    openapiFields.add("natura");
    openapiFields.add("spese_accessorie");
    openapiFields.add("arrotondamento");
    openapiFields.add("imponibile_importo");
    openapiFields.add("imposta");
    openapiFields.add("esigibilita_iva");
    openapiFields.add("riferimento_normativo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DatiRiepilogo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DatiRiepilogo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatiRiepilogo is not found in the empty JSON string", DatiRiepilogo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DatiRiepilogo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DatiRiepilogo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("natura") != null && !jsonObj.get("natura").isJsonNull()) && !jsonObj.get("natura").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `natura` to be a primitive type in the JSON string but got `%s`", jsonObj.get("natura").toString()));
      }
      if ((jsonObj.get("esigibilita_iva") != null && !jsonObj.get("esigibilita_iva").isJsonNull()) && !jsonObj.get("esigibilita_iva").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `esigibilita_iva` to be a primitive type in the JSON string but got `%s`", jsonObj.get("esigibilita_iva").toString()));
      }
      if ((jsonObj.get("riferimento_normativo") != null && !jsonObj.get("riferimento_normativo").isJsonNull()) && !jsonObj.get("riferimento_normativo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `riferimento_normativo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("riferimento_normativo").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatiRiepilogo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatiRiepilogo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatiRiepilogo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatiRiepilogo.class));

       return (TypeAdapter<T>) new TypeAdapter<DatiRiepilogo>() {
           @Override
           public void write(JsonWriter out, DatiRiepilogo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DatiRiepilogo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DatiRiepilogo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DatiRiepilogo
   * @throws IOException if the JSON string is invalid with respect to DatiRiepilogo
   */
  public static DatiRiepilogo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatiRiepilogo.class);
  }

  /**
   * Convert an instance of DatiRiepilogo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

