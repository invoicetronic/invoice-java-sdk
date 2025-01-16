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
import com.invoicetronic.invoice.sdk.model.Error;
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
 * Update
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-16T16:05:53.420359Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class Update implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private Integer id;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  @javax.annotation.Nullable
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  @javax.annotation.Nullable
  private Integer version;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  @javax.annotation.Nullable
  private Integer userId;

  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  @javax.annotation.Nullable
  private Integer companyId;

  public static final String SERIALIZED_NAME_SEND_ID = "send_id";
  @SerializedName(SERIALIZED_NAME_SEND_ID)
  @javax.annotation.Nullable
  private Integer sendId;

  public static final String SERIALIZED_NAME_DATE_SENT = "date_sent";
  @SerializedName(SERIALIZED_NAME_DATE_SENT)
  @javax.annotation.Nullable
  private OffsetDateTime dateSent;

  public static final String SERIALIZED_NAME_LAST_UPDATE = "last_update";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATE)
  @javax.annotation.Nullable
  private OffsetDateTime lastUpdate;

  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  @javax.annotation.Nullable
  private String identifier;

  /**
   * State of the document. Theses are the possible values, as per the SDI documentation:
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    INVIATO("Inviato"),
    
    CONSEGNATO("Consegnato"),
    
    NON_CONSEGNATO("NonConsegnato"),
    
    SCARTATO("Scartato"),
    
    ACCETTATO_DAL_DESTINATARIO("AccettatoDalDestinatario"),
    
    RIFIUTATO_DAL_DESTINATARIO("RifiutatoDalDestinatario"),
    
    IMPOSSIBILIT_DI_RECAPITO("ImpossibilitàDiRecapito"),
    
    DECORRENZA_TERMINI("DecorrenzaTermini"),
    
    ATTESTAZIONE_TRASMISSIONE_FATTURA("AttestazioneTrasmissioneFattura");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StateEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  @javax.annotation.Nullable
  private StateEnum state;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_MESSAGE_ID = "message_id";
  @SerializedName(SERIALIZED_NAME_MESSAGE_ID)
  @javax.annotation.Nullable
  private String messageId;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  @javax.annotation.Nullable
  private List<Error> errors;

  public static final String SERIALIZED_NAME_IS_READ = "is_read";
  @SerializedName(SERIALIZED_NAME_IS_READ)
  @javax.annotation.Nullable
  private Boolean isRead;

  public Update() {
  }

  public Update id(@javax.annotation.Nullable Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier. Leave it at 0 for new records as it will be set automatically.
   * @return id
   */
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable Integer id) {
    this.id = id;
  }


  public Update created(@javax.annotation.Nullable OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Creation date. It is set automatically.
   * @return created
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(@javax.annotation.Nullable OffsetDateTime created) {
    this.created = created;
  }


  public Update version(@javax.annotation.Nullable Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Row version, for optimistic concurrency. It is set automatically.
   * @return version
   */
  @javax.annotation.Nullable
  public Integer getVersion() {
    return version;
  }

  public void setVersion(@javax.annotation.Nullable Integer version) {
    this.version = version;
  }


  public Update userId(@javax.annotation.Nullable Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * User id.
   * @return userId
   */
  @javax.annotation.Nullable
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(@javax.annotation.Nullable Integer userId) {
    this.userId = userId;
  }


  public Update companyId(@javax.annotation.Nullable Integer companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Company id.
   * @return companyId
   */
  @javax.annotation.Nullable
  public Integer getCompanyId() {
    return companyId;
  }

  public void setCompanyId(@javax.annotation.Nullable Integer companyId) {
    this.companyId = companyId;
  }


  public Update sendId(@javax.annotation.Nullable Integer sendId) {
    this.sendId = sendId;
    return this;
  }

  /**
   * Send id. This is the id of the sent invoice to which this update refers to.
   * @return sendId
   */
  @javax.annotation.Nullable
  public Integer getSendId() {
    return sendId;
  }

  public void setSendId(@javax.annotation.Nullable Integer sendId) {
    this.sendId = sendId;
  }


  public Update dateSent(@javax.annotation.Nullable OffsetDateTime dateSent) {
    this.dateSent = dateSent;
    return this;
  }

  /**
   * When the document was sent to the SDI.
   * @return dateSent
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDateSent() {
    return dateSent;
  }

  public void setDateSent(@javax.annotation.Nullable OffsetDateTime dateSent) {
    this.dateSent = dateSent;
  }


  public Update lastUpdate(@javax.annotation.Nullable OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  /**
   * Last update from SDI.
   * @return lastUpdate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(@javax.annotation.Nullable OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
  }


  public Update identifier(@javax.annotation.Nullable String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * SDI identifier. This is set by the SDI and it is unique within the SDI system.
   * @return identifier
   */
  @javax.annotation.Nullable
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(@javax.annotation.Nullable String identifier) {
    this.identifier = identifier;
  }


  public Update state(@javax.annotation.Nullable StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * State of the document. Theses are the possible values, as per the SDI documentation:
   * @return state
   */
  @javax.annotation.Nullable
  public StateEnum getState() {
    return state;
  }

  public void setState(@javax.annotation.Nullable StateEnum state) {
    this.state = state;
  }


  public Update description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Description for the state.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public Update messageId(@javax.annotation.Nullable String messageId) {
    this.messageId = messageId;
    return this;
  }

  /**
   * SDI message id.
   * @return messageId
   */
  @javax.annotation.Nullable
  public String getMessageId() {
    return messageId;
  }

  public void setMessageId(@javax.annotation.Nullable String messageId) {
    this.messageId = messageId;
  }


  public Update errors(@javax.annotation.Nullable List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public Update addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * SDI errors, if any.
   * @return errors
   */
  @javax.annotation.Nullable
  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(@javax.annotation.Nullable List<Error> errors) {
    this.errors = errors;
  }


  public Update isRead(@javax.annotation.Nullable Boolean isRead) {
    this.isRead = isRead;
    return this;
  }

  /**
   * Wether the item has been read at least once.
   * @return isRead
   */
  @javax.annotation.Nullable
  public Boolean getIsRead() {
    return isRead;
  }

  public void setIsRead(@javax.annotation.Nullable Boolean isRead) {
    this.isRead = isRead;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Update update = (Update) o;
    return Objects.equals(this.id, update.id) &&
        Objects.equals(this.created, update.created) &&
        Objects.equals(this.version, update.version) &&
        Objects.equals(this.userId, update.userId) &&
        Objects.equals(this.companyId, update.companyId) &&
        Objects.equals(this.sendId, update.sendId) &&
        Objects.equals(this.dateSent, update.dateSent) &&
        Objects.equals(this.lastUpdate, update.lastUpdate) &&
        Objects.equals(this.identifier, update.identifier) &&
        Objects.equals(this.state, update.state) &&
        Objects.equals(this.description, update.description) &&
        Objects.equals(this.messageId, update.messageId) &&
        Objects.equals(this.errors, update.errors) &&
        Objects.equals(this.isRead, update.isRead);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, version, userId, companyId, sendId, dateSent, lastUpdate, identifier, state, description, messageId, errors, isRead);
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
    sb.append("class Update {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    sendId: ").append(toIndentedString(sendId)).append("\n");
    sb.append("    dateSent: ").append(toIndentedString(dateSent)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    isRead: ").append(toIndentedString(isRead)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("created");
    openapiFields.add("version");
    openapiFields.add("user_id");
    openapiFields.add("company_id");
    openapiFields.add("send_id");
    openapiFields.add("date_sent");
    openapiFields.add("last_update");
    openapiFields.add("identifier");
    openapiFields.add("state");
    openapiFields.add("description");
    openapiFields.add("message_id");
    openapiFields.add("errors");
    openapiFields.add("is_read");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Update
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Update.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Update is not found in the empty JSON string", Update.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Update.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Update` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("identifier") != null && !jsonObj.get("identifier").isJsonNull()) && !jsonObj.get("identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identifier").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      // validate the optional field `state`
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) {
        StateEnum.validateJsonElement(jsonObj.get("state"));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("message_id") != null && !jsonObj.get("message_id").isJsonNull()) && !jsonObj.get("message_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message_id").toString()));
      }
      if (jsonObj.get("errors") != null && !jsonObj.get("errors").isJsonNull()) {
        JsonArray jsonArrayerrors = jsonObj.getAsJsonArray("errors");
        if (jsonArrayerrors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("errors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `errors` to be an array in the JSON string but got `%s`", jsonObj.get("errors").toString()));
          }

          // validate the optional field `errors` (array)
          for (int i = 0; i < jsonArrayerrors.size(); i++) {
            Error.validateJsonElement(jsonArrayerrors.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Update.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Update' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Update> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Update.class));

       return (TypeAdapter<T>) new TypeAdapter<Update>() {
           @Override
           public void write(JsonWriter out, Update value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Update read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Update given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Update
   * @throws IOException if the JSON string is invalid with respect to Update
   */
  public static Update fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Update.class);
  }

  /**
   * Convert an instance of Update to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

