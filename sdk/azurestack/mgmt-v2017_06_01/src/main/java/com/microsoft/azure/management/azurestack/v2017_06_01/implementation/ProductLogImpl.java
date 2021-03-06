/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azurestack.v2017_06_01.implementation;

import com.microsoft.azure.management.azurestack.v2017_06_01.ProductLog;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class ProductLogImpl extends WrapperImpl<ProductLogInner> implements ProductLog {
    private final AzureStackManager manager;
    ProductLogImpl(ProductLogInner inner, AzureStackManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public AzureStackManager manager() {
        return this.manager;
    }

    @Override
    public String details() {
        return this.inner().details();
    }

    @Override
    public String endDate() {
        return this.inner().endDate();
    }

    @Override
    public String error() {
        return this.inner().error();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String operation() {
        return this.inner().operation();
    }

    @Override
    public String productId() {
        return this.inner().productId();
    }

    @Override
    public String registrationName() {
        return this.inner().registrationName();
    }

    @Override
    public String resourceGroupName() {
        return this.inner().resourceGroupName();
    }

    @Override
    public String startDate() {
        return this.inner().startDate();
    }

    @Override
    public String status() {
        return this.inner().status();
    }

    @Override
    public String subscriptionId() {
        return this.inner().subscriptionId();
    }

}
