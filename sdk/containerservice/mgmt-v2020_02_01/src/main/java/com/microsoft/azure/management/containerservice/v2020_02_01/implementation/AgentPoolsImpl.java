/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.containerservice.v2020_02_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.containerservice.v2020_02_01.AgentPools;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.containerservice.v2020_02_01.AgentPool;
import com.microsoft.azure.management.containerservice.v2020_02_01.AgentPoolUpgradeProfile;
import com.microsoft.azure.management.containerservice.v2020_02_01.AgentPoolAvailableVersions;

class AgentPoolsImpl extends WrapperImpl<AgentPoolsInner> implements AgentPools {
    private final ContainerServiceManager manager;

    AgentPoolsImpl(ContainerServiceManager manager) {
        super(manager.inner().agentPools());
        this.manager = manager;
    }

    public ContainerServiceManager manager() {
        return this.manager;
    }

    @Override
    public AgentPoolImpl define(String name) {
        return wrapModel(name);
    }

    private AgentPoolImpl wrapModel(AgentPoolInner inner) {
        return  new AgentPoolImpl(inner, manager());
    }

    private AgentPoolImpl wrapModel(String name) {
        return new AgentPoolImpl(name, this.manager());
    }

    @Override
    public Observable<AgentPool> listAsync(final String resourceGroupName, final String resourceName) {
        AgentPoolsInner client = this.inner();
        return client.listAsync(resourceGroupName, resourceName)
        .flatMapIterable(new Func1<Page<AgentPoolInner>, Iterable<AgentPoolInner>>() {
            @Override
            public Iterable<AgentPoolInner> call(Page<AgentPoolInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AgentPoolInner, AgentPool>() {
            @Override
            public AgentPool call(AgentPoolInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<AgentPool> getAsync(String resourceGroupName, String resourceName, String agentPoolName) {
        AgentPoolsInner client = this.inner();
        return client.getAsync(resourceGroupName, resourceName, agentPoolName)
        .flatMap(new Func1<AgentPoolInner, Observable<AgentPool>>() {
            @Override
            public Observable<AgentPool> call(AgentPoolInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((AgentPool)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String resourceName, String agentPoolName) {
        AgentPoolsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, resourceName, agentPoolName).toCompletable();
    }

    @Override
    public Observable<AgentPoolUpgradeProfile> getUpgradeProfileAsync(String resourceGroupName, String resourceName, String agentPoolName) {
        AgentPoolsInner client = this.inner();
        return client.getUpgradeProfileAsync(resourceGroupName, resourceName, agentPoolName)
        .map(new Func1<AgentPoolUpgradeProfileInner, AgentPoolUpgradeProfile>() {
            @Override
            public AgentPoolUpgradeProfile call(AgentPoolUpgradeProfileInner inner) {
                return new AgentPoolUpgradeProfileImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<AgentPoolAvailableVersions> getAvailableAgentPoolVersionsAsync(String resourceGroupName, String resourceName) {
        AgentPoolsInner client = this.inner();
        return client.getAvailableAgentPoolVersionsAsync(resourceGroupName, resourceName)
        .map(new Func1<AgentPoolAvailableVersionsInner, AgentPoolAvailableVersions>() {
            @Override
            public AgentPoolAvailableVersions call(AgentPoolAvailableVersionsInner inner) {
                return new AgentPoolAvailableVersionsImpl(inner, manager());
            }
        });
    }

}
