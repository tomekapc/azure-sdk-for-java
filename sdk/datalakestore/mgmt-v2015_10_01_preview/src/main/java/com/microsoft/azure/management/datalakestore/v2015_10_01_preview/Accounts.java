/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalakestore.v2015_10_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import rx.Completable;
import com.microsoft.azure.management.datalakestore.v2015_10_01_preview.implementation.AccountsInner;
import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.datalakestore.v2015_10_01_preview.FirewallRule;

/**
 * Type representing Accounts.
 */
public interface Accounts extends SupportsCreating<DataLakeStoreAccount.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<DataLakeStoreAccount>, SupportsListingByResourceGroup<DataLakeStoreAccount>, SupportsListing<DataLakeStoreAccount>, HasInner<AccountsInner> {
    /**
     * Begins definition for a new FirewallRule resource.
     * @param name resource name.
     * @return the first stage of the new FirewallRule definition.
     */
    FirewallRule.DefinitionStages.Blank defineFirewallRule(String name);

    /**
     * Attempts to enable a user managed key vault for encryption of the specified Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Store account.
     * @param accountName The name of the Data Lake Store account to attempt to enable the Key Vault for.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable enableKeyVaultAsync(String resourceGroupName, String accountName);

    /**
     * Gets the specified Data Lake Store firewall rule.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Store account.
     * @param accountName The name of the Data Lake Store account from which to get the firewall rule.
     * @param firewallRuleName The name of the firewall rule to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<FirewallRule> getFirewallRuleAsync(String resourceGroupName, String accountName, String firewallRuleName);

    /**
     * Lists the Data Lake Store firewall rules within the specified Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Store account.
     * @param accountName The name of the Data Lake Store account from which to get the firewall rules.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<FirewallRule> listFirewallRulesAsync(final String resourceGroupName, final String accountName);

    /**
     * Deletes the specified firewall rule from the specified Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Store account.
     * @param accountName The name of the Data Lake Store account from which to delete the firewall rule.
     * @param firewallRuleName The name of the firewall rule to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteFirewallRuleAsync(String resourceGroupName, String accountName, String firewallRuleName);

}
