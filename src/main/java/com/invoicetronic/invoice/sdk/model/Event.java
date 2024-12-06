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
 * Event
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-06T11:08:47.068644Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class Event implements Serializable {
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

  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  @javax.annotation.Nullable
  private Integer companyId;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  @javax.annotation.Nullable
  private String method;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  @javax.annotation.Nullable
  private String query;

  public static final String SERIALIZED_NAME_ENDPOINT = "endpoint";
  @SerializedName(SERIALIZED_NAME_ENDPOINT)
  @javax.annotation.Nullable
  private String endpoint;

  public static final String SERIALIZED_NAME_API_VERSION = "api_version";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  @javax.annotation.Nullable
  private Integer apiVersion;

  public static final String SERIALIZED_NAME_STATUS_CODE = "status_code";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  @javax.annotation.Nullable
  private Integer statusCode;

  public static final String SERIALIZED_NAME_DATE_TIME = "date_time";
  @SerializedName(SERIALIZED_NAME_DATE_TIME)
  @javax.annotation.Nullable
  private OffsetDateTime dateTime;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  @javax.annotation.Nullable
  private String error;

  public static final String SERIALIZED_NAME_REQUEST_BODY = "request_body";
  @SerializedName(SERIALIZED_NAME_REQUEST_BODY)
  @javax.annotation.Nullable
  private String requestBody;

  public static final String SERIALIZED_NAME_RESPONSE_BODY = "response_body";
  @SerializedName(SERIALIZED_NAME_RESPONSE_BODY)
  @javax.annotation.Nullable
  private String responseBody;

  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  @javax.annotation.Nullable
  private Boolean success;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  @javax.annotation.Nullable
  private Integer userId;

  public static final String SERIALIZED_NAME_API_KEY_ID = "api_key_id";
  @SerializedName(SERIALIZED_NAME_API_KEY_ID)
  @javax.annotation.Nullable
  private Integer apiKeyId;

  public Event() {
  }

  public Event(
     Boolean success
  ) {
    this();
    this.success = success;
  }

  public Event id(@javax.annotation.Nullable Integer id) {
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


  public Event created(@javax.annotation.Nullable OffsetDateTime created) {
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


  public Event version(@javax.annotation.Nullable Integer version) {
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


  public Event companyId(@javax.annotation.Nullable Integer companyId) {
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


  public Event method(@javax.annotation.Nullable String method) {
    this.method = method;
    return this;
  }

  /**
   * Request method.
   * @return method
   */
  @javax.annotation.Nullable
  public String getMethod() {
    return method;
  }

  public void setMethod(@javax.annotation.Nullable String method) {
    this.method = method;
  }


  public Event query(@javax.annotation.Nullable String query) {
    this.query = query;
    return this;
  }

  /**
   * Request query.
   * @return query
   */
  @javax.annotation.Nullable
  public String getQuery() {
    return query;
  }

  public void setQuery(@javax.annotation.Nullable String query) {
    this.query = query;
  }


  public Event endpoint(@javax.annotation.Nullable String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  /**
   * API endpoint.
   * @return endpoint
   */
  @javax.annotation.Nullable
  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(@javax.annotation.Nullable String endpoint) {
    this.endpoint = endpoint;
  }


  public Event apiVersion(@javax.annotation.Nullable Integer apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Api version.
   * @return apiVersion
   */
  @javax.annotation.Nullable
  public Integer getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(@javax.annotation.Nullable Integer apiVersion) {
    this.apiVersion = apiVersion;
  }


  public Event statusCode(@javax.annotation.Nullable Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * Status code returned by the API.
   * @return statusCode
   */
  @javax.annotation.Nullable
  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(@javax.annotation.Nullable Integer statusCode) {
    this.statusCode = statusCode;
  }


  public Event dateTime(@javax.annotation.Nullable OffsetDateTime dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * Date and time of the request.
   * @return dateTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDateTime() {
    return dateTime;
  }

  public void setDateTime(@javax.annotation.Nullable OffsetDateTime dateTime) {
    this.dateTime = dateTime;
  }


  public Event error(@javax.annotation.Nullable String error) {
    this.error = error;
    return this;
  }

  /**
   * Response error.
   * @return error
   */
  @javax.annotation.Nullable
  public String getError() {
    return error;
  }

  public void setError(@javax.annotation.Nullable String error) {
    this.error = error;
  }


  public Event requestBody(@javax.annotation.Nullable String requestBody) {
    this.requestBody = requestBody;
    return this;
  }

  /**
   * Request payload. It is guaranteed to be cyphered at rest.
   * @return requestBody
   */
  @javax.annotation.Nullable
  public String getRequestBody() {
    return requestBody;
  }

  public void setRequestBody(@javax.annotation.Nullable String requestBody) {
    this.requestBody = requestBody;
  }


  public Event responseBody(@javax.annotation.Nullable String responseBody) {
    this.responseBody = responseBody;
    return this;
  }

  /**
   * Response payload. It is guaranteed to be cyphered at rest.
   * @return responseBody
   */
  @javax.annotation.Nullable
  public String getResponseBody() {
    return responseBody;
  }

  public void setResponseBody(@javax.annotation.Nullable String responseBody) {
    this.responseBody = responseBody;
  }


  /**
   * Wether the request was successful.
   * @return success
   */
  @javax.annotation.Nullable
  public Boolean getSuccess() {
    return success;
  }



  public Event userId(@javax.annotation.Nullable Integer userId) {
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


  public Event apiKeyId(@javax.annotation.Nullable Integer apiKeyId) {
    this.apiKeyId = apiKeyId;
    return this;
  }

  /**
   * Api key id.
   * @return apiKeyId
   */
  @javax.annotation.Nullable
  public Integer getApiKeyId() {
    return apiKeyId;
  }

  public void setApiKeyId(@javax.annotation.Nullable Integer apiKeyId) {
    this.apiKeyId = apiKeyId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.id, event.id) &&
        Objects.equals(this.created, event.created) &&
        Objects.equals(this.version, event.version) &&
        Objects.equals(this.companyId, event.companyId) &&
        Objects.equals(this.method, event.method) &&
        Objects.equals(this.query, event.query) &&
        Objects.equals(this.endpoint, event.endpoint) &&
        Objects.equals(this.apiVersion, event.apiVersion) &&
        Objects.equals(this.statusCode, event.statusCode) &&
        Objects.equals(this.dateTime, event.dateTime) &&
        Objects.equals(this.error, event.error) &&
        Objects.equals(this.requestBody, event.requestBody) &&
        Objects.equals(this.responseBody, event.responseBody) &&
        Objects.equals(this.success, event.success) &&
        Objects.equals(this.userId, event.userId) &&
        Objects.equals(this.apiKeyId, event.apiKeyId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, version, companyId, method, query, endpoint, apiVersion, statusCode, dateTime, error, requestBody, responseBody, success, userId, apiKeyId);
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
    sb.append("class Event {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    requestBody: ").append(toIndentedString(requestBody)).append("\n");
    sb.append("    responseBody: ").append(toIndentedString(responseBody)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    apiKeyId: ").append(toIndentedString(apiKeyId)).append("\n");
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
    openapiFields.add("company_id");
    openapiFields.add("method");
    openapiFields.add("query");
    openapiFields.add("endpoint");
    openapiFields.add("api_version");
    openapiFields.add("status_code");
    openapiFields.add("date_time");
    openapiFields.add("error");
    openapiFields.add("request_body");
    openapiFields.add("response_body");
    openapiFields.add("success");
    openapiFields.add("user_id");
    openapiFields.add("api_key_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Event
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Event.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Event is not found in the empty JSON string", Event.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Event.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Event` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("method") != null && !jsonObj.get("method").isJsonNull()) && !jsonObj.get("method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("method").toString()));
      }
      if ((jsonObj.get("query") != null && !jsonObj.get("query").isJsonNull()) && !jsonObj.get("query").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `query` to be a primitive type in the JSON string but got `%s`", jsonObj.get("query").toString()));
      }
      if ((jsonObj.get("endpoint") != null && !jsonObj.get("endpoint").isJsonNull()) && !jsonObj.get("endpoint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endpoint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endpoint").toString()));
      }
      if ((jsonObj.get("error") != null && !jsonObj.get("error").isJsonNull()) && !jsonObj.get("error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error").toString()));
      }
      if ((jsonObj.get("request_body") != null && !jsonObj.get("request_body").isJsonNull()) && !jsonObj.get("request_body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `request_body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("request_body").toString()));
      }
      if ((jsonObj.get("response_body") != null && !jsonObj.get("response_body").isJsonNull()) && !jsonObj.get("response_body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `response_body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("response_body").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Event.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Event' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Event> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Event.class));

       return (TypeAdapter<T>) new TypeAdapter<Event>() {
           @Override
           public void write(JsonWriter out, Event value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Event read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Event given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Event
   * @throws IOException if the JSON string is invalid with respect to Event
   */
  public static Event fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Event.class);
  }

  /**
   * Convert an instance of Event to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

