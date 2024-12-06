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
import org.openapitools.client.model.DatiAnagraficiVettore;
import org.openapitools.client.model.IndirizzoResa;
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
 * DatiTrasporto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-06T09:56:56.609426Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class DatiTrasporto {
  public static final String SERIALIZED_NAME_DATI_ANAGRAFICI_VETTORE = "dati_anagrafici_vettore";
  @SerializedName(SERIALIZED_NAME_DATI_ANAGRAFICI_VETTORE)
  @javax.annotation.Nullable
  private DatiAnagraficiVettore datiAnagraficiVettore;

  public static final String SERIALIZED_NAME_MEZZO_TRASPORTO = "mezzo_trasporto";
  @SerializedName(SERIALIZED_NAME_MEZZO_TRASPORTO)
  @javax.annotation.Nullable
  private String mezzoTrasporto;

  public static final String SERIALIZED_NAME_CAUSALE_TRASPORTO = "causale_trasporto";
  @SerializedName(SERIALIZED_NAME_CAUSALE_TRASPORTO)
  @javax.annotation.Nullable
  private String causaleTrasporto;

  public static final String SERIALIZED_NAME_NUMERO_COLLI = "numero_colli";
  @SerializedName(SERIALIZED_NAME_NUMERO_COLLI)
  @javax.annotation.Nullable
  private Integer numeroColli;

  public static final String SERIALIZED_NAME_DESCRIZIONE = "descrizione";
  @SerializedName(SERIALIZED_NAME_DESCRIZIONE)
  @javax.annotation.Nullable
  private String descrizione;

  public static final String SERIALIZED_NAME_UNITA_MISURA_PESO = "unita_misura_peso";
  @SerializedName(SERIALIZED_NAME_UNITA_MISURA_PESO)
  @javax.annotation.Nullable
  private String unitaMisuraPeso;

  public static final String SERIALIZED_NAME_PESO_LORDO = "peso_lordo";
  @SerializedName(SERIALIZED_NAME_PESO_LORDO)
  @javax.annotation.Nullable
  private Double pesoLordo;

  public static final String SERIALIZED_NAME_PESO_NETTO = "peso_netto";
  @SerializedName(SERIALIZED_NAME_PESO_NETTO)
  @javax.annotation.Nullable
  private Double pesoNetto;

  public static final String SERIALIZED_NAME_DATA_ORA_RITIRO = "data_ora_ritiro";
  @SerializedName(SERIALIZED_NAME_DATA_ORA_RITIRO)
  @javax.annotation.Nullable
  private OffsetDateTime dataOraRitiro;

  public static final String SERIALIZED_NAME_DATA_INIZIO_TRASPORTO = "data_inizio_trasporto";
  @SerializedName(SERIALIZED_NAME_DATA_INIZIO_TRASPORTO)
  @javax.annotation.Nullable
  private OffsetDateTime dataInizioTrasporto;

  public static final String SERIALIZED_NAME_TIPO_RESA = "tipo_resa";
  @SerializedName(SERIALIZED_NAME_TIPO_RESA)
  @javax.annotation.Nullable
  private String tipoResa;

  public static final String SERIALIZED_NAME_INDIRIZZO_RESA = "indirizzo_resa";
  @SerializedName(SERIALIZED_NAME_INDIRIZZO_RESA)
  @javax.annotation.Nullable
  private IndirizzoResa indirizzoResa;

  public static final String SERIALIZED_NAME_DATA_ORA_CONSEGNA = "data_ora_consegna";
  @SerializedName(SERIALIZED_NAME_DATA_ORA_CONSEGNA)
  @javax.annotation.Nullable
  private OffsetDateTime dataOraConsegna;

  public DatiTrasporto() {
  }

  public DatiTrasporto datiAnagraficiVettore(@javax.annotation.Nullable DatiAnagraficiVettore datiAnagraficiVettore) {
    this.datiAnagraficiVettore = datiAnagraficiVettore;
    return this;
  }

  /**
   * Get datiAnagraficiVettore
   * @return datiAnagraficiVettore
   */
  @javax.annotation.Nullable
  public DatiAnagraficiVettore getDatiAnagraficiVettore() {
    return datiAnagraficiVettore;
  }

  public void setDatiAnagraficiVettore(@javax.annotation.Nullable DatiAnagraficiVettore datiAnagraficiVettore) {
    this.datiAnagraficiVettore = datiAnagraficiVettore;
  }


  public DatiTrasporto mezzoTrasporto(@javax.annotation.Nullable String mezzoTrasporto) {
    this.mezzoTrasporto = mezzoTrasporto;
    return this;
  }

  /**
   * Get mezzoTrasporto
   * @return mezzoTrasporto
   */
  @javax.annotation.Nullable
  public String getMezzoTrasporto() {
    return mezzoTrasporto;
  }

  public void setMezzoTrasporto(@javax.annotation.Nullable String mezzoTrasporto) {
    this.mezzoTrasporto = mezzoTrasporto;
  }


  public DatiTrasporto causaleTrasporto(@javax.annotation.Nullable String causaleTrasporto) {
    this.causaleTrasporto = causaleTrasporto;
    return this;
  }

  /**
   * Get causaleTrasporto
   * @return causaleTrasporto
   */
  @javax.annotation.Nullable
  public String getCausaleTrasporto() {
    return causaleTrasporto;
  }

  public void setCausaleTrasporto(@javax.annotation.Nullable String causaleTrasporto) {
    this.causaleTrasporto = causaleTrasporto;
  }


  public DatiTrasporto numeroColli(@javax.annotation.Nullable Integer numeroColli) {
    this.numeroColli = numeroColli;
    return this;
  }

  /**
   * Get numeroColli
   * @return numeroColli
   */
  @javax.annotation.Nullable
  public Integer getNumeroColli() {
    return numeroColli;
  }

  public void setNumeroColli(@javax.annotation.Nullable Integer numeroColli) {
    this.numeroColli = numeroColli;
  }


  public DatiTrasporto descrizione(@javax.annotation.Nullable String descrizione) {
    this.descrizione = descrizione;
    return this;
  }

  /**
   * Get descrizione
   * @return descrizione
   */
  @javax.annotation.Nullable
  public String getDescrizione() {
    return descrizione;
  }

  public void setDescrizione(@javax.annotation.Nullable String descrizione) {
    this.descrizione = descrizione;
  }


  public DatiTrasporto unitaMisuraPeso(@javax.annotation.Nullable String unitaMisuraPeso) {
    this.unitaMisuraPeso = unitaMisuraPeso;
    return this;
  }

  /**
   * Get unitaMisuraPeso
   * @return unitaMisuraPeso
   */
  @javax.annotation.Nullable
  public String getUnitaMisuraPeso() {
    return unitaMisuraPeso;
  }

  public void setUnitaMisuraPeso(@javax.annotation.Nullable String unitaMisuraPeso) {
    this.unitaMisuraPeso = unitaMisuraPeso;
  }


  public DatiTrasporto pesoLordo(@javax.annotation.Nullable Double pesoLordo) {
    this.pesoLordo = pesoLordo;
    return this;
  }

  /**
   * Get pesoLordo
   * @return pesoLordo
   */
  @javax.annotation.Nullable
  public Double getPesoLordo() {
    return pesoLordo;
  }

  public void setPesoLordo(@javax.annotation.Nullable Double pesoLordo) {
    this.pesoLordo = pesoLordo;
  }


  public DatiTrasporto pesoNetto(@javax.annotation.Nullable Double pesoNetto) {
    this.pesoNetto = pesoNetto;
    return this;
  }

  /**
   * Get pesoNetto
   * @return pesoNetto
   */
  @javax.annotation.Nullable
  public Double getPesoNetto() {
    return pesoNetto;
  }

  public void setPesoNetto(@javax.annotation.Nullable Double pesoNetto) {
    this.pesoNetto = pesoNetto;
  }


  public DatiTrasporto dataOraRitiro(@javax.annotation.Nullable OffsetDateTime dataOraRitiro) {
    this.dataOraRitiro = dataOraRitiro;
    return this;
  }

  /**
   * Get dataOraRitiro
   * @return dataOraRitiro
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDataOraRitiro() {
    return dataOraRitiro;
  }

  public void setDataOraRitiro(@javax.annotation.Nullable OffsetDateTime dataOraRitiro) {
    this.dataOraRitiro = dataOraRitiro;
  }


  public DatiTrasporto dataInizioTrasporto(@javax.annotation.Nullable OffsetDateTime dataInizioTrasporto) {
    this.dataInizioTrasporto = dataInizioTrasporto;
    return this;
  }

  /**
   * Get dataInizioTrasporto
   * @return dataInizioTrasporto
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDataInizioTrasporto() {
    return dataInizioTrasporto;
  }

  public void setDataInizioTrasporto(@javax.annotation.Nullable OffsetDateTime dataInizioTrasporto) {
    this.dataInizioTrasporto = dataInizioTrasporto;
  }


  public DatiTrasporto tipoResa(@javax.annotation.Nullable String tipoResa) {
    this.tipoResa = tipoResa;
    return this;
  }

  /**
   * Get tipoResa
   * @return tipoResa
   */
  @javax.annotation.Nullable
  public String getTipoResa() {
    return tipoResa;
  }

  public void setTipoResa(@javax.annotation.Nullable String tipoResa) {
    this.tipoResa = tipoResa;
  }


  public DatiTrasporto indirizzoResa(@javax.annotation.Nullable IndirizzoResa indirizzoResa) {
    this.indirizzoResa = indirizzoResa;
    return this;
  }

  /**
   * Get indirizzoResa
   * @return indirizzoResa
   */
  @javax.annotation.Nullable
  public IndirizzoResa getIndirizzoResa() {
    return indirizzoResa;
  }

  public void setIndirizzoResa(@javax.annotation.Nullable IndirizzoResa indirizzoResa) {
    this.indirizzoResa = indirizzoResa;
  }


  public DatiTrasporto dataOraConsegna(@javax.annotation.Nullable OffsetDateTime dataOraConsegna) {
    this.dataOraConsegna = dataOraConsegna;
    return this;
  }

  /**
   * Get dataOraConsegna
   * @return dataOraConsegna
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDataOraConsegna() {
    return dataOraConsegna;
  }

  public void setDataOraConsegna(@javax.annotation.Nullable OffsetDateTime dataOraConsegna) {
    this.dataOraConsegna = dataOraConsegna;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatiTrasporto datiTrasporto = (DatiTrasporto) o;
    return Objects.equals(this.datiAnagraficiVettore, datiTrasporto.datiAnagraficiVettore) &&
        Objects.equals(this.mezzoTrasporto, datiTrasporto.mezzoTrasporto) &&
        Objects.equals(this.causaleTrasporto, datiTrasporto.causaleTrasporto) &&
        Objects.equals(this.numeroColli, datiTrasporto.numeroColli) &&
        Objects.equals(this.descrizione, datiTrasporto.descrizione) &&
        Objects.equals(this.unitaMisuraPeso, datiTrasporto.unitaMisuraPeso) &&
        Objects.equals(this.pesoLordo, datiTrasporto.pesoLordo) &&
        Objects.equals(this.pesoNetto, datiTrasporto.pesoNetto) &&
        Objects.equals(this.dataOraRitiro, datiTrasporto.dataOraRitiro) &&
        Objects.equals(this.dataInizioTrasporto, datiTrasporto.dataInizioTrasporto) &&
        Objects.equals(this.tipoResa, datiTrasporto.tipoResa) &&
        Objects.equals(this.indirizzoResa, datiTrasporto.indirizzoResa) &&
        Objects.equals(this.dataOraConsegna, datiTrasporto.dataOraConsegna);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(datiAnagraficiVettore, mezzoTrasporto, causaleTrasporto, numeroColli, descrizione, unitaMisuraPeso, pesoLordo, pesoNetto, dataOraRitiro, dataInizioTrasporto, tipoResa, indirizzoResa, dataOraConsegna);
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
    sb.append("class DatiTrasporto {\n");
    sb.append("    datiAnagraficiVettore: ").append(toIndentedString(datiAnagraficiVettore)).append("\n");
    sb.append("    mezzoTrasporto: ").append(toIndentedString(mezzoTrasporto)).append("\n");
    sb.append("    causaleTrasporto: ").append(toIndentedString(causaleTrasporto)).append("\n");
    sb.append("    numeroColli: ").append(toIndentedString(numeroColli)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
    sb.append("    unitaMisuraPeso: ").append(toIndentedString(unitaMisuraPeso)).append("\n");
    sb.append("    pesoLordo: ").append(toIndentedString(pesoLordo)).append("\n");
    sb.append("    pesoNetto: ").append(toIndentedString(pesoNetto)).append("\n");
    sb.append("    dataOraRitiro: ").append(toIndentedString(dataOraRitiro)).append("\n");
    sb.append("    dataInizioTrasporto: ").append(toIndentedString(dataInizioTrasporto)).append("\n");
    sb.append("    tipoResa: ").append(toIndentedString(tipoResa)).append("\n");
    sb.append("    indirizzoResa: ").append(toIndentedString(indirizzoResa)).append("\n");
    sb.append("    dataOraConsegna: ").append(toIndentedString(dataOraConsegna)).append("\n");
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
    openapiFields.add("dati_anagrafici_vettore");
    openapiFields.add("mezzo_trasporto");
    openapiFields.add("causale_trasporto");
    openapiFields.add("numero_colli");
    openapiFields.add("descrizione");
    openapiFields.add("unita_misura_peso");
    openapiFields.add("peso_lordo");
    openapiFields.add("peso_netto");
    openapiFields.add("data_ora_ritiro");
    openapiFields.add("data_inizio_trasporto");
    openapiFields.add("tipo_resa");
    openapiFields.add("indirizzo_resa");
    openapiFields.add("data_ora_consegna");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DatiTrasporto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DatiTrasporto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatiTrasporto is not found in the empty JSON string", DatiTrasporto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DatiTrasporto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DatiTrasporto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `dati_anagrafici_vettore`
      if (jsonObj.get("dati_anagrafici_vettore") != null && !jsonObj.get("dati_anagrafici_vettore").isJsonNull()) {
        DatiAnagraficiVettore.validateJsonElement(jsonObj.get("dati_anagrafici_vettore"));
      }
      if ((jsonObj.get("mezzo_trasporto") != null && !jsonObj.get("mezzo_trasporto").isJsonNull()) && !jsonObj.get("mezzo_trasporto").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mezzo_trasporto` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mezzo_trasporto").toString()));
      }
      if ((jsonObj.get("causale_trasporto") != null && !jsonObj.get("causale_trasporto").isJsonNull()) && !jsonObj.get("causale_trasporto").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `causale_trasporto` to be a primitive type in the JSON string but got `%s`", jsonObj.get("causale_trasporto").toString()));
      }
      if ((jsonObj.get("descrizione") != null && !jsonObj.get("descrizione").isJsonNull()) && !jsonObj.get("descrizione").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `descrizione` to be a primitive type in the JSON string but got `%s`", jsonObj.get("descrizione").toString()));
      }
      if ((jsonObj.get("unita_misura_peso") != null && !jsonObj.get("unita_misura_peso").isJsonNull()) && !jsonObj.get("unita_misura_peso").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unita_misura_peso` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unita_misura_peso").toString()));
      }
      if ((jsonObj.get("tipo_resa") != null && !jsonObj.get("tipo_resa").isJsonNull()) && !jsonObj.get("tipo_resa").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tipo_resa` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tipo_resa").toString()));
      }
      // validate the optional field `indirizzo_resa`
      if (jsonObj.get("indirizzo_resa") != null && !jsonObj.get("indirizzo_resa").isJsonNull()) {
        IndirizzoResa.validateJsonElement(jsonObj.get("indirizzo_resa"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatiTrasporto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatiTrasporto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatiTrasporto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatiTrasporto.class));

       return (TypeAdapter<T>) new TypeAdapter<DatiTrasporto>() {
           @Override
           public void write(JsonWriter out, DatiTrasporto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DatiTrasporto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DatiTrasporto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DatiTrasporto
   * @throws IOException if the JSON string is invalid with respect to DatiTrasporto
   */
  public static DatiTrasporto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatiTrasporto.class);
  }

  /**
   * Convert an instance of DatiTrasporto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

