/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2019_05_01.implementation;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * Initializes a new instance of the AzureNetAppFilesManagementClientImpl class.
 */
public class AzureNetAppFilesManagementClientImpl extends AzureServiceClient {
    /** The Retrofit service to perform REST calls. */
    private AzureNetAppFilesManagementClientService service;
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** Subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call. */
    private String subscriptionId;

    /**
     * Gets Subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets Subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public AzureNetAppFilesManagementClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** Version of the API to be used with the client request. */
    private String apiVersion;

    /**
     * Gets Version of the API to be used with the client request.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /** The preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets The preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets The preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public AzureNetAppFilesManagementClientImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** The retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public AzureNetAppFilesManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public AzureNetAppFilesManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The OperationsInner object to access its operations.
     */
    private OperationsInner operations;

    /**
     * Gets the OperationsInner object to access its operations.
     * @return the OperationsInner object.
     */
    public OperationsInner operations() {
        return this.operations;
    }

    /**
     * The AccountsInner object to access its operations.
     */
    private AccountsInner accounts;

    /**
     * Gets the AccountsInner object to access its operations.
     * @return the AccountsInner object.
     */
    public AccountsInner accounts() {
        return this.accounts;
    }

    /**
     * The PoolsInner object to access its operations.
     */
    private PoolsInner pools;

    /**
     * Gets the PoolsInner object to access its operations.
     * @return the PoolsInner object.
     */
    public PoolsInner pools() {
        return this.pools;
    }

    /**
     * The VolumesInner object to access its operations.
     */
    private VolumesInner volumes;

    /**
     * Gets the VolumesInner object to access its operations.
     * @return the VolumesInner object.
     */
    public VolumesInner volumes() {
        return this.volumes;
    }

    /**
     * The MountTargetsInner object to access its operations.
     */
    private MountTargetsInner mountTargets;

    /**
     * Gets the MountTargetsInner object to access its operations.
     * @return the MountTargetsInner object.
     */
    public MountTargetsInner mountTargets() {
        return this.mountTargets;
    }

    /**
     * The SnapshotsInner object to access its operations.
     */
    private SnapshotsInner snapshots;

    /**
     * Gets the SnapshotsInner object to access its operations.
     * @return the SnapshotsInner object.
     */
    public SnapshotsInner snapshots() {
        return this.snapshots;
    }

    /**
     * Initializes an instance of AzureNetAppFilesManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public AzureNetAppFilesManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of AzureNetAppFilesManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public AzureNetAppFilesManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of AzureNetAppFilesManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public AzureNetAppFilesManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2019-05-01";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.accounts = new AccountsInner(restClient().retrofit(), this);
        this.pools = new PoolsInner(restClient().retrofit(), this);
        this.volumes = new VolumesInner(restClient().retrofit(), this);
        this.mountTargets = new MountTargetsInner(restClient().retrofit(), this);
        this.snapshots = new SnapshotsInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
        initializeService();
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s, auto-generated)", super.userAgent(), "AzureNetAppFilesManagementClient", "2019-05-01");
    }

    private void initializeService() {
        service = restClient().retrofit().create(AzureNetAppFilesManagementClientService.class);
    }

    /**
     * The interface defining all the services for AzureNetAppFilesManagementClient to be
     * used by Retrofit to perform actually REST calls.
     */
    interface AzureNetAppFilesManagementClientService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.netapp.v2019_05_01.AzureNetAppFilesManagementClient checkNameAvailability" })
        @POST("subscriptions/{subscriptionId}/providers/Microsoft.NetApp/locations/{location}/checkNameAvailability")
        Observable<Response<ResponseBody>> checkNameAvailability(@Path("subscriptionId") String subscriptionId, @Path("location") String location, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.netapp.v2019_05_01.AzureNetAppFilesManagementClient checkFilePathAvailability" })
        @POST("subscriptions/{subscriptionId}/providers/Microsoft.NetApp/locations/{location}/checkFilePathAvailability")
        Observable<Response<ResponseBody>> checkFilePathAvailability(@Path("subscriptionId") String subscriptionId, @Path("location") String location, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Check resource name availability.
     * Check if a resource name is available.
     *
     * @param location The location
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceNameAvailabilityInner object if successful.
     */
    public ResourceNameAvailabilityInner checkNameAvailability(String location) {
        return checkNameAvailabilityWithServiceResponseAsync(location).toBlocking().single().body();
    }

    /**
     * Check resource name availability.
     * Check if a resource name is available.
     *
     * @param location The location
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceNameAvailabilityInner> checkNameAvailabilityAsync(String location, final ServiceCallback<ResourceNameAvailabilityInner> serviceCallback) {
        return ServiceFuture.fromResponse(checkNameAvailabilityWithServiceResponseAsync(location), serviceCallback);
    }

    /**
     * Check resource name availability.
     * Check if a resource name is available.
     *
     * @param location The location
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceNameAvailabilityInner object
     */
    public Observable<ResourceNameAvailabilityInner> checkNameAvailabilityAsync(String location) {
        return checkNameAvailabilityWithServiceResponseAsync(location).map(new Func1<ServiceResponse<ResourceNameAvailabilityInner>, ResourceNameAvailabilityInner>() {
            @Override
            public ResourceNameAvailabilityInner call(ServiceResponse<ResourceNameAvailabilityInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Check resource name availability.
     * Check if a resource name is available.
     *
     * @param location The location
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceNameAvailabilityInner object
     */
    public Observable<ServiceResponse<ResourceNameAvailabilityInner>> checkNameAvailabilityWithServiceResponseAsync(String location) {
        if (this.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.subscriptionId() is required and cannot be null.");
        }
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (this.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.apiVersion() is required and cannot be null.");
        }
        return service.checkNameAvailability(this.subscriptionId(), location, this.apiVersion(), this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceNameAvailabilityInner>>>() {
                @Override
                public Observable<ServiceResponse<ResourceNameAvailabilityInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceNameAvailabilityInner> clientResponse = checkNameAvailabilityDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceNameAvailabilityInner> checkNameAvailabilityDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<ResourceNameAvailabilityInner, CloudException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceNameAvailabilityInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Check file path availability.
     * Check if a file path is available.
     *
     * @param location The location
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceNameAvailabilityInner object if successful.
     */
    public ResourceNameAvailabilityInner checkFilePathAvailability(String location) {
        return checkFilePathAvailabilityWithServiceResponseAsync(location).toBlocking().single().body();
    }

    /**
     * Check file path availability.
     * Check if a file path is available.
     *
     * @param location The location
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceNameAvailabilityInner> checkFilePathAvailabilityAsync(String location, final ServiceCallback<ResourceNameAvailabilityInner> serviceCallback) {
        return ServiceFuture.fromResponse(checkFilePathAvailabilityWithServiceResponseAsync(location), serviceCallback);
    }

    /**
     * Check file path availability.
     * Check if a file path is available.
     *
     * @param location The location
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceNameAvailabilityInner object
     */
    public Observable<ResourceNameAvailabilityInner> checkFilePathAvailabilityAsync(String location) {
        return checkFilePathAvailabilityWithServiceResponseAsync(location).map(new Func1<ServiceResponse<ResourceNameAvailabilityInner>, ResourceNameAvailabilityInner>() {
            @Override
            public ResourceNameAvailabilityInner call(ServiceResponse<ResourceNameAvailabilityInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Check file path availability.
     * Check if a file path is available.
     *
     * @param location The location
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceNameAvailabilityInner object
     */
    public Observable<ServiceResponse<ResourceNameAvailabilityInner>> checkFilePathAvailabilityWithServiceResponseAsync(String location) {
        if (this.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.subscriptionId() is required and cannot be null.");
        }
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (this.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.apiVersion() is required and cannot be null.");
        }
        return service.checkFilePathAvailability(this.subscriptionId(), location, this.apiVersion(), this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceNameAvailabilityInner>>>() {
                @Override
                public Observable<ServiceResponse<ResourceNameAvailabilityInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceNameAvailabilityInner> clientResponse = checkFilePathAvailabilityDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceNameAvailabilityInner> checkFilePathAvailabilityDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<ResourceNameAvailabilityInner, CloudException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ResourceNameAvailabilityInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
