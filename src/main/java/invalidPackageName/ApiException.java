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


package invalidPackageName;

import java.util.Map;
import java.util.List;


/**
 * <p>ApiException class.</p>
 */
@SuppressWarnings("serial")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-06T09:56:56.609426Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class ApiException extends Exception {
    private static final long serialVersionUID = 1L;

    private int code = 0;
    private Map<String, List<String>> responseHeaders = null;
    private String responseBody = null;

    /**
     * <p>Constructor for ApiException.</p>
     */
    public ApiException() {}

    /**
     * <p>Constructor for ApiException.</p>
     *
     * @param throwable a {@link java.lang.Throwable} object
     */
    public ApiException(Throwable throwable) {
        super(throwable);
    }

    /**
     * <p>Constructor for ApiException.</p>
     *
     * @param message the error message
     */
    public ApiException(String message) {
        super(message);
    }

    /**
     * <p>Constructor for ApiException.</p>
     *
     * @param message the error message
     * @param throwable a {@link java.lang.Throwable} object
     * @param code HTTP status code
     * @param responseHeaders a {@link java.util.Map} of HTTP response headers
     * @param responseBody the response body
     */
    public ApiException(String message, Throwable throwable, int code, Map<String, List<String>> responseHeaders, String responseBody) {
        super(message, throwable);
        this.code = code;
        this.responseHeaders = responseHeaders;
        this.responseBody = responseBody;
    }

    /**
     * <p>Constructor for ApiException.</p>
     *
     * @param message the error message
     * @param code HTTP status code
     * @param responseHeaders a {@link java.util.Map} of HTTP response headers
     * @param responseBody the response body
     */
    public ApiException(String message, int code, Map<String, List<String>> responseHeaders, String responseBody) {
        this(message, (Throwable) null, code, responseHeaders, responseBody);
    }

    /**
     * <p>Constructor for ApiException.</p>
     *
     * @param message the error message
     * @param throwable a {@link java.lang.Throwable} object
     * @param code HTTP status code
     * @param responseHeaders a {@link java.util.Map} of HTTP response headers
     */
    public ApiException(String message, Throwable throwable, int code, Map<String, List<String>> responseHeaders) {
        this(message, throwable, code, responseHeaders, null);
    }

    /**
     * <p>Constructor for ApiException.</p>
     *
     * @param code HTTP status code
     * @param responseHeaders a {@link java.util.Map} of HTTP response headers
     * @param responseBody the response body
     */
    public ApiException(int code, Map<String, List<String>> responseHeaders, String responseBody) {
        this("Response Code: " + code + " Response Body: " + responseBody, (Throwable) null, code, responseHeaders, responseBody);
    }

    /**
     * <p>Constructor for ApiException.</p>
     *
     * @param code HTTP status code
     * @param message a {@link java.lang.String} object
     */
    public ApiException(int code, String message) {
        super(message);
        this.code = code;
    }

    /**
     * <p>Constructor for ApiException.</p>
     *
     * @param code HTTP status code
     * @param message the error message
     * @param responseHeaders a {@link java.util.Map} of HTTP response headers
     * @param responseBody the response body
     */
    public ApiException(int code, String message, Map<String, List<String>> responseHeaders, String responseBody) {
        this(code, message);
        this.responseHeaders = responseHeaders;
        this.responseBody = responseBody;
    }

    /**
     * Get the HTTP status code.
     *
     * @return HTTP status code
     */
    public int getCode() {
        return code;
    }

    /**
     * Get the HTTP response headers.
     *
     * @return A map of list of string
     */
    public Map<String, List<String>> getResponseHeaders() {
        return responseHeaders;
    }

    /**
     * Get the HTTP response body.
     *
     * @return Response body in the form of string
     */
    public String getResponseBody() {
        return responseBody;
    }

    /**
     * Get the exception message including HTTP response data.
     *
     * @return The exception message
     */
    public String getMessage() {
        return String.format("Message: %s%nHTTP response code: %s%nHTTP response body: %s%nHTTP response headers: %s",
                super.getMessage(), this.getCode(), this.getResponseBody(), this.getResponseHeaders());
    }
}
