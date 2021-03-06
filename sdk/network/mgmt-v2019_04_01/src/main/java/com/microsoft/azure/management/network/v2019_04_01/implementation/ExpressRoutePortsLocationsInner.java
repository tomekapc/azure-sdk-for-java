/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_04_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ExpressRoutePortsLocations.
 */
public class ExpressRoutePortsLocationsInner {
    /** The Retrofit service to perform REST calls. */
    private ExpressRoutePortsLocationsService service;
    /** The service client containing this operation class. */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of ExpressRoutePortsLocationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ExpressRoutePortsLocationsInner(Retrofit retrofit, NetworkManagementClientImpl client) {
        this.service = retrofit.create(ExpressRoutePortsLocationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ExpressRoutePortsLocations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ExpressRoutePortsLocationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2019_04_01.ExpressRoutePortsLocations list" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Network/ExpressRoutePortsLocations")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2019_04_01.ExpressRoutePortsLocations get" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Network/ExpressRoutePortsLocations/{locationName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("locationName") String locationName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2019_04_01.ExpressRoutePortsLocations listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Retrieves all ExpressRoutePort peering locations. Does not return available bandwidths for each location. Available bandwidths can only be obtained when retrieving a specific peering location.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ExpressRoutePortsLocationInner&gt; object if successful.
     */
    public PagedList<ExpressRoutePortsLocationInner> list() {
        ServiceResponse<Page<ExpressRoutePortsLocationInner>> response = listSinglePageAsync().toBlocking().single();
        return new PagedList<ExpressRoutePortsLocationInner>(response.body()) {
            @Override
            public Page<ExpressRoutePortsLocationInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Retrieves all ExpressRoutePort peering locations. Does not return available bandwidths for each location. Available bandwidths can only be obtained when retrieving a specific peering location.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ExpressRoutePortsLocationInner>> listAsync(final ListOperationCallback<ExpressRoutePortsLocationInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(),
            new Func1<String, Observable<ServiceResponse<Page<ExpressRoutePortsLocationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ExpressRoutePortsLocationInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Retrieves all ExpressRoutePort peering locations. Does not return available bandwidths for each location. Available bandwidths can only be obtained when retrieving a specific peering location.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ExpressRoutePortsLocationInner&gt; object
     */
    public Observable<Page<ExpressRoutePortsLocationInner>> listAsync() {
        return listWithServiceResponseAsync()
            .map(new Func1<ServiceResponse<Page<ExpressRoutePortsLocationInner>>, Page<ExpressRoutePortsLocationInner>>() {
                @Override
                public Page<ExpressRoutePortsLocationInner> call(ServiceResponse<Page<ExpressRoutePortsLocationInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Retrieves all ExpressRoutePort peering locations. Does not return available bandwidths for each location. Available bandwidths can only be obtained when retrieving a specific peering location.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ExpressRoutePortsLocationInner&gt; object
     */
    public Observable<ServiceResponse<Page<ExpressRoutePortsLocationInner>>> listWithServiceResponseAsync() {
        return listSinglePageAsync()
            .concatMap(new Func1<ServiceResponse<Page<ExpressRoutePortsLocationInner>>, Observable<ServiceResponse<Page<ExpressRoutePortsLocationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ExpressRoutePortsLocationInner>>> call(ServiceResponse<Page<ExpressRoutePortsLocationInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Retrieves all ExpressRoutePort peering locations. Does not return available bandwidths for each location. Available bandwidths can only be obtained when retrieving a specific peering location.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ExpressRoutePortsLocationInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ExpressRoutePortsLocationInner>>> listSinglePageAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2019-04-01";
        return service.list(this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ExpressRoutePortsLocationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ExpressRoutePortsLocationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ExpressRoutePortsLocationInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ExpressRoutePortsLocationInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ExpressRoutePortsLocationInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ExpressRoutePortsLocationInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ExpressRoutePortsLocationInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Retrieves a single ExpressRoutePort peering location, including the list of available bandwidths available at said peering location.
     *
     * @param locationName Name of the requested ExpressRoutePort peering location.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ExpressRoutePortsLocationInner object if successful.
     */
    public ExpressRoutePortsLocationInner get(String locationName) {
        return getWithServiceResponseAsync(locationName).toBlocking().single().body();
    }

    /**
     * Retrieves a single ExpressRoutePort peering location, including the list of available bandwidths available at said peering location.
     *
     * @param locationName Name of the requested ExpressRoutePort peering location.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ExpressRoutePortsLocationInner> getAsync(String locationName, final ServiceCallback<ExpressRoutePortsLocationInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(locationName), serviceCallback);
    }

    /**
     * Retrieves a single ExpressRoutePort peering location, including the list of available bandwidths available at said peering location.
     *
     * @param locationName Name of the requested ExpressRoutePort peering location.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ExpressRoutePortsLocationInner object
     */
    public Observable<ExpressRoutePortsLocationInner> getAsync(String locationName) {
        return getWithServiceResponseAsync(locationName).map(new Func1<ServiceResponse<ExpressRoutePortsLocationInner>, ExpressRoutePortsLocationInner>() {
            @Override
            public ExpressRoutePortsLocationInner call(ServiceResponse<ExpressRoutePortsLocationInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Retrieves a single ExpressRoutePort peering location, including the list of available bandwidths available at said peering location.
     *
     * @param locationName Name of the requested ExpressRoutePort peering location.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ExpressRoutePortsLocationInner object
     */
    public Observable<ServiceResponse<ExpressRoutePortsLocationInner>> getWithServiceResponseAsync(String locationName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (locationName == null) {
            throw new IllegalArgumentException("Parameter locationName is required and cannot be null.");
        }
        final String apiVersion = "2019-04-01";
        return service.get(this.client.subscriptionId(), locationName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ExpressRoutePortsLocationInner>>>() {
                @Override
                public Observable<ServiceResponse<ExpressRoutePortsLocationInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ExpressRoutePortsLocationInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ExpressRoutePortsLocationInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ExpressRoutePortsLocationInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ExpressRoutePortsLocationInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Retrieves all ExpressRoutePort peering locations. Does not return available bandwidths for each location. Available bandwidths can only be obtained when retrieving a specific peering location.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ExpressRoutePortsLocationInner&gt; object if successful.
     */
    public PagedList<ExpressRoutePortsLocationInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<ExpressRoutePortsLocationInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<ExpressRoutePortsLocationInner>(response.body()) {
            @Override
            public Page<ExpressRoutePortsLocationInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Retrieves all ExpressRoutePort peering locations. Does not return available bandwidths for each location. Available bandwidths can only be obtained when retrieving a specific peering location.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ExpressRoutePortsLocationInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<ExpressRoutePortsLocationInner>> serviceFuture, final ListOperationCallback<ExpressRoutePortsLocationInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<ExpressRoutePortsLocationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ExpressRoutePortsLocationInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Retrieves all ExpressRoutePort peering locations. Does not return available bandwidths for each location. Available bandwidths can only be obtained when retrieving a specific peering location.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ExpressRoutePortsLocationInner&gt; object
     */
    public Observable<Page<ExpressRoutePortsLocationInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<ExpressRoutePortsLocationInner>>, Page<ExpressRoutePortsLocationInner>>() {
                @Override
                public Page<ExpressRoutePortsLocationInner> call(ServiceResponse<Page<ExpressRoutePortsLocationInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Retrieves all ExpressRoutePort peering locations. Does not return available bandwidths for each location. Available bandwidths can only be obtained when retrieving a specific peering location.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ExpressRoutePortsLocationInner&gt; object
     */
    public Observable<ServiceResponse<Page<ExpressRoutePortsLocationInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<ExpressRoutePortsLocationInner>>, Observable<ServiceResponse<Page<ExpressRoutePortsLocationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ExpressRoutePortsLocationInner>>> call(ServiceResponse<Page<ExpressRoutePortsLocationInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Retrieves all ExpressRoutePort peering locations. Does not return available bandwidths for each location. Available bandwidths can only be obtained when retrieving a specific peering location.
     *
    ServiceResponse<PageImpl<ExpressRoutePortsLocationInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ExpressRoutePortsLocationInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ExpressRoutePortsLocationInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ExpressRoutePortsLocationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ExpressRoutePortsLocationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ExpressRoutePortsLocationInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ExpressRoutePortsLocationInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ExpressRoutePortsLocationInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ExpressRoutePortsLocationInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ExpressRoutePortsLocationInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
