# Java SDK for the Italian eInvoice API

The Italian eInvoice API is a RESTful API that allows you to send and receive invoices through the
Italian [Servizio di Interscambio (SDI)][1], or Interchange Service. The API is designed by Invoicetronic to be simple
and easy to use, abstracting away SDI complexity while providing complete control over the
invoice send/receive process. The API also provides advanced features as encryption at rest, invoice validation,
multiple upload formats, webhooks, event logging, client SDKs for commonly used languages, and CLI tools.

For more information, see  [Invoicetronic website][2]

[1]: https://www.fatturapa.gov.it/it/sistemainterscambio/cose-il-sdi/
[2]: https://invoicetronic.com/

- API version: 1.0.0

- Build date: 2025-01-16T16:10:21.843557Z[Etc/UTC]

- Generator version: 7.10.0

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.invoicetronic.invoice</groupId>
  <artifactId>invoice-java-sdk</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'invoice-java-sdk' jar has been published to maven central.
    mavenLocal()       // Needed if the 'invoice-java-sdk' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.invoicetronic.invoice:invoice-java-sdk:1.0.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/invoice-java-sdk-1.0.0.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.invoicetronic.invoice.sdk.*;
import com.invoicetronic.invoice.sdk.auth.*;
import com.invoicetronic.invoice.sdk.model.*;
import com.invoicetronic.invoice.sdk.api.CompanyApi;

public class CompanyApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP basic authorization: Basic
        HttpBasicAuth Basic = (HttpBasicAuth) defaultClient.getAuthentication("Basic");
        Basic.setUsername("YOUR USERNAME");
        Basic.setPassword("YOUR PASSWORD");

        CompanyApi apiInstance = new CompanyApi(defaultClient);
        Integer page = 1; // Integer | Page number. Defaults to 1.
        Integer pageSize = 100; // Integer | Items per page. Defaults to 50. Cannot be greater than 200.
        try {
            List<Company> result = apiInstance.invoiceV1CompanyGet(page, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompanyApi#invoiceV1CompanyGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CompanyApi* | [**invoiceV1CompanyGet**](docs/CompanyApi.md#invoiceV1CompanyGet) | **GET** /invoice/v1/company | List companies
*CompanyApi* | [**invoiceV1CompanyIdDelete**](docs/CompanyApi.md#invoiceV1CompanyIdDelete) | **DELETE** /invoice/v1/company/{id} | Delete a company
*CompanyApi* | [**invoiceV1CompanyIdGet**](docs/CompanyApi.md#invoiceV1CompanyIdGet) | **GET** /invoice/v1/company/{id} | Get a company by id
*CompanyApi* | [**invoiceV1CompanyPost**](docs/CompanyApi.md#invoiceV1CompanyPost) | **POST** /invoice/v1/company | Add a company
*CompanyApi* | [**invoiceV1CompanyPut**](docs/CompanyApi.md#invoiceV1CompanyPut) | **PUT** /invoice/v1/company | Update a company
*LogApi* | [**invoiceV1LogGet**](docs/LogApi.md#invoiceV1LogGet) | **GET** /invoice/v1/log | List events
*LogApi* | [**invoiceV1LogIdGet**](docs/LogApi.md#invoiceV1LogIdGet) | **GET** /invoice/v1/log/{id} | Get an event by id
*ReceiveApi* | [**invoiceV1ReceiveGet**](docs/ReceiveApi.md#invoiceV1ReceiveGet) | **GET** /invoice/v1/receive | List incoming invoices
*ReceiveApi* | [**invoiceV1ReceiveIdDelete**](docs/ReceiveApi.md#invoiceV1ReceiveIdDelete) | **DELETE** /invoice/v1/receive/{id} | Delete an incoming invoice by id
*ReceiveApi* | [**invoiceV1ReceiveIdGet**](docs/ReceiveApi.md#invoiceV1ReceiveIdGet) | **GET** /invoice/v1/receive/{id} | Get an incoming invoice by id
*SendApi* | [**invoiceV1SendFilesPost**](docs/SendApi.md#invoiceV1SendFilesPost) | **POST** /invoice/v1/send/files | Add an invoice by file
*SendApi* | [**invoiceV1SendGet**](docs/SendApi.md#invoiceV1SendGet) | **GET** /invoice/v1/send | List invoices
*SendApi* | [**invoiceV1SendIdGet**](docs/SendApi.md#invoiceV1SendIdGet) | **GET** /invoice/v1/send/{id} | Get a invoice by id
*SendApi* | [**invoiceV1SendJsonPost**](docs/SendApi.md#invoiceV1SendJsonPost) | **POST** /invoice/v1/send/json | Add an invoice by json
*SendApi* | [**invoiceV1SendPost**](docs/SendApi.md#invoiceV1SendPost) | **POST** /invoice/v1/send | Add an invoice
*SendApi* | [**invoiceV1SendValidateFilesPost**](docs/SendApi.md#invoiceV1SendValidateFilesPost) | **POST** /invoice/v1/send/validate/files | Validate an invoice by file
*SendApi* | [**invoiceV1SendValidateJsonPost**](docs/SendApi.md#invoiceV1SendValidateJsonPost) | **POST** /invoice/v1/send/validate/json | Validate an invoice by json
*SendApi* | [**invoiceV1SendValidatePost**](docs/SendApi.md#invoiceV1SendValidatePost) | **POST** /invoice/v1/send/validate | Validate an invoice
*SendApi* | [**invoiceV1SendValidateXmlPost**](docs/SendApi.md#invoiceV1SendValidateXmlPost) | **POST** /invoice/v1/send/validate/xml | Validate an invoice by xml
*SendApi* | [**invoiceV1SendXmlPost**](docs/SendApi.md#invoiceV1SendXmlPost) | **POST** /invoice/v1/send/xml | Add an invoice by xml
*UpdateApi* | [**invoiceV1UpdateGet**](docs/UpdateApi.md#invoiceV1UpdateGet) | **GET** /invoice/v1/update | List updates
*UpdateApi* | [**invoiceV1UpdateIdGet**](docs/UpdateApi.md#invoiceV1UpdateIdGet) | **GET** /invoice/v1/update/{id} | Get an update by id
*WebhookApi* | [**invoiceV1WebhookGet**](docs/WebhookApi.md#invoiceV1WebhookGet) | **GET** /invoice/v1/webhook | List webhooks
*WebhookApi* | [**invoiceV1WebhookIdDelete**](docs/WebhookApi.md#invoiceV1WebhookIdDelete) | **DELETE** /invoice/v1/webhook/{id} | Delete a webhook by id
*WebhookApi* | [**invoiceV1WebhookIdGet**](docs/WebhookApi.md#invoiceV1WebhookIdGet) | **GET** /invoice/v1/webhook/{id} | Get a webhook by id
*WebhookApi* | [**invoiceV1WebhookPost**](docs/WebhookApi.md#invoiceV1WebhookPost) | **POST** /invoice/v1/webhook | Add a webhook
*WebhookApi* | [**invoiceV1WebhookPut**](docs/WebhookApi.md#invoiceV1WebhookPut) | **PUT** /invoice/v1/webhook | Update a webhook
*WebhookApi* | [**invoiceV1WebhookhistoryGet**](docs/WebhookApi.md#invoiceV1WebhookhistoryGet) | **GET** /invoice/v1/webhookhistory | List webhook history items
*WebhookApi* | [**invoiceV1WebhookhistoryIdGet**](docs/WebhookApi.md#invoiceV1WebhookhistoryIdGet) | **GET** /invoice/v1/webhookhistory/{id} | Get a webhook history item by id


## Documentation for Models

 - [Allegati](docs/Allegati.md)
 - [AltriDatiGestionali](docs/AltriDatiGestionali.md)
 - [Anagrafica](docs/Anagrafica.md)
 - [CedentePrestatore](docs/CedentePrestatore.md)
 - [CessionarioCommittente](docs/CessionarioCommittente.md)
 - [CodiceArticolo](docs/CodiceArticolo.md)
 - [Company](docs/Company.md)
 - [Contatti](docs/Contatti.md)
 - [ContattiTrasmittente](docs/ContattiTrasmittente.md)
 - [DatiAnagrafici](docs/DatiAnagrafici.md)
 - [DatiAnagraficiCedentePrestatore](docs/DatiAnagraficiCedentePrestatore.md)
 - [DatiAnagraficiCessionarioCommittente](docs/DatiAnagraficiCessionarioCommittente.md)
 - [DatiAnagraficiVettore](docs/DatiAnagraficiVettore.md)
 - [DatiBeniServizi](docs/DatiBeniServizi.md)
 - [DatiBollo](docs/DatiBollo.md)
 - [DatiCassaPrevidenziale](docs/DatiCassaPrevidenziale.md)
 - [DatiContratto](docs/DatiContratto.md)
 - [DatiConvenzione](docs/DatiConvenzione.md)
 - [DatiDDT](docs/DatiDDT.md)
 - [DatiFattureCollegate](docs/DatiFattureCollegate.md)
 - [DatiGenerali](docs/DatiGenerali.md)
 - [DatiGeneraliDocumento](docs/DatiGeneraliDocumento.md)
 - [DatiOrdineAcquisto](docs/DatiOrdineAcquisto.md)
 - [DatiPagamento](docs/DatiPagamento.md)
 - [DatiRicezione](docs/DatiRicezione.md)
 - [DatiRiepilogo](docs/DatiRiepilogo.md)
 - [DatiRitenuta](docs/DatiRitenuta.md)
 - [DatiSAL](docs/DatiSAL.md)
 - [DatiTrasmissione](docs/DatiTrasmissione.md)
 - [DatiTrasporto](docs/DatiTrasporto.md)
 - [DatiVeicoli](docs/DatiVeicoli.md)
 - [DettaglioLinee](docs/DettaglioLinee.md)
 - [DettaglioPagamento](docs/DettaglioPagamento.md)
 - [DocumentData](docs/DocumentData.md)
 - [Error](docs/Error.md)
 - [Event](docs/Event.md)
 - [FatturaElettronicaBody](docs/FatturaElettronicaBody.md)
 - [FatturaElettronicaHeader](docs/FatturaElettronicaHeader.md)
 - [FatturaOrdinaria](docs/FatturaOrdinaria.md)
 - [FatturaPrincipale](docs/FatturaPrincipale.md)
 - [IdFiscaleIVA](docs/IdFiscaleIVA.md)
 - [IdTrasmittente](docs/IdTrasmittente.md)
 - [IndirizzoResa](docs/IndirizzoResa.md)
 - [IscrizioneREA](docs/IscrizioneREA.md)
 - [ProblemDetails](docs/ProblemDetails.md)
 - [ProblemHttpResult](docs/ProblemHttpResult.md)
 - [RappresentanteFiscale](docs/RappresentanteFiscale.md)
 - [RappresentanteFiscaleCessionarioCommittente](docs/RappresentanteFiscaleCessionarioCommittente.md)
 - [Receive](docs/Receive.md)
 - [ScontoMaggiorazione](docs/ScontoMaggiorazione.md)
 - [SedeCedentePrestatore](docs/SedeCedentePrestatore.md)
 - [SedeCessionarioCommittente](docs/SedeCessionarioCommittente.md)
 - [Send](docs/Send.md)
 - [StabileOrganizzazione](docs/StabileOrganizzazione.md)
 - [TerzoIntermediarioOSoggettoEmittente](docs/TerzoIntermediarioOSoggettoEmittente.md)
 - [Update](docs/Update.md)
 - [WebHook](docs/WebHook.md)
 - [WebHookHistory](docs/WebHookHistory.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="Basic"></a>
### Basic


- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@invoicetronic.com

