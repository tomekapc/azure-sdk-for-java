/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalakeanalytics.v2016_11_01;

import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.datalakeanalytics.v2016_11_01.implementation.StorageAccountsInner;
import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.datalakeanalytics.v2016_11_01.StorageContainer;

/**
 * Type representing StorageAccounts.
 */
public interface StorageAccounts extends HasInner<StorageAccountsInner> {
    /**
     * Updates the Data Lake Analytics account to replace Azure Storage blob account details, such as the access key and/or suffix.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param storageAccountName The Azure Storage account to modify
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable updateAsync(String resourceGroupName, String accountName, String storageAccountName);

    /**
     * Gets the specified Azure Storage account linked to the given Data Lake Analytics account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param storageAccountName The name of the Azure Storage account for which to retrieve the details.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<StorageAccountInformation> getAsync(String resourceGroupName, String accountName, String storageAccountName);

    /**
     * Gets the first page of Azure Storage accounts, if any, linked to the specified Data Lake Analytics account. The response includes a link to the next page, if any.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<StorageAccountInformation> listByAccountAsync(final String resourceGroupName, final String accountName);

    /**
     * Updates the specified Data Lake Analytics account to remove an Azure Storage account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param storageAccountName The name of the Azure Storage account to remove
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String accountName, String storageAccountName);

    /**
     * Updates the specified Data Lake Analytics account to add an Azure Storage account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param storageAccountName The name of the Azure Storage account to add
     * @param parameters The parameters containing the access key and optional suffix for the Azure Storage Account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable addAsync(String resourceGroupName, String accountName, String storageAccountName, AddStorageAccountParameters parameters);

    /**
     * Gets the specified Azure Storage container associated with the given Data Lake Analytics and Azure Storage accounts.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param storageAccountName The name of the Azure storage account from which to retrieve the blob container.
     * @param containerName The name of the Azure storage container to retrieve
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<StorageContainer> getStorageContainerAsync(String resourceGroupName, String accountName, String storageAccountName, String containerName);

    /**
     * Lists the Azure Storage containers, if any, associated with the specified Data Lake Analytics and Azure Storage account combination. The response includes a link to the next page of results, if any.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param storageAccountName The name of the Azure storage account from which to list blob containers.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<StorageContainer> listStorageContainersAsync(final String resourceGroupName, final String accountName, final String storageAccountName);

    /**
     * Gets the SAS token associated with the specified Data Lake Analytics and Azure Storage account and container combination.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param storageAccountName The name of the Azure storage account for which the SAS token is being requested.
     * @param containerName The name of the Azure storage container for which the SAS token is being requested.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SasTokenInformation> listSasTokensAsync(final String resourceGroupName, final String accountName, final String storageAccountName, final String containerName);

}
