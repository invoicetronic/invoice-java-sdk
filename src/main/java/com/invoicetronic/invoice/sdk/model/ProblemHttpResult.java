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
import com.invoicetronic.invoice.sdk.model.ProblemDetails;
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
 * ProblemHttpResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-11T15:05:08.862696Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class ProblemHttpResult implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PROBLEM_DETAILS = "problem_details";
  @SerializedName(SERIALIZED_NAME_PROBLEM_DETAILS)
  @javax.annotation.Nullable
  private ProblemDetails problemDetails;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "content_type";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  @javax.annotation.Nullable
  private String contentType;

  public static final String SERIALIZED_NAME_STATUS_CODE = "status_code";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  @javax.annotation.Nullable
  private Integer statusCode;

  public ProblemHttpResult() {
  }

  public ProblemHttpResult(
     String contentType, 
     Integer statusCode
  ) {
    this();
    this.contentType = contentType;
    this.statusCode = statusCode;
  }

  public ProblemHttpResult problemDetails(@javax.annotation.Nullable ProblemDetails problemDetails) {
    this.problemDetails = problemDetails;
    return this;
  }

  /**
   * Get problemDetails
   * @return problemDetails
   */
  @javax.annotation.Nullable
  public ProblemDetails getProblemDetails() {
    return problemDetails;
  }

  public void setProblemDetails(@javax.annotation.Nullable ProblemDetails problemDetails) {
    this.problemDetails = problemDetails;
  }


  /**
   * Get contentType
   * @return contentType
   */
  @javax.annotation.Nullable
  public String getContentType() {
    return contentType;
  }



  /**
   * Get statusCode
   * @return statusCode
   */
  @javax.annotation.Nullable
  public Integer getStatusCode() {
    return statusCode;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProblemHttpResult problemHttpResult = (ProblemHttpResult) o;
    return Objects.equals(this.problemDetails, problemHttpResult.problemDetails) &&
        Objects.equals(this.contentType, problemHttpResult.contentType) &&
        Objects.equals(this.statusCode, problemHttpResult.statusCode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(problemDetails, contentType, statusCode);
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
    sb.append("class ProblemHttpResult {\n");
    sb.append("    problemDetails: ").append(toIndentedString(problemDetails)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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
    openapiFields.add("problem_details");
    openapiFields.add("content_type");
    openapiFields.add("status_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProblemHttpResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProblemHttpResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProblemHttpResult is not found in the empty JSON string", ProblemHttpResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProblemHttpResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProblemHttpResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("content_type") != null && !jsonObj.get("content_type").isJsonNull()) && !jsonObj.get("content_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProblemHttpResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProblemHttpResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProblemHttpResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProblemHttpResult.class));

       return (TypeAdapter<T>) new TypeAdapter<ProblemHttpResult>() {
           @Override
           public void write(JsonWriter out, ProblemHttpResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProblemHttpResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ProblemHttpResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProblemHttpResult
   * @throws IOException if the JSON string is invalid with respect to ProblemHttpResult
   */
  public static ProblemHttpResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProblemHttpResult.class);
  }

  /**
   * Convert an instance of ProblemHttpResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

