/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.timeseriesinsights.v2017_11_15;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Parameters supplied to the Create or Update Event Source operation for an
 * EventHub event source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind", defaultImpl = EventHubEventSourceCreateOrUpdateParameters.class)
@JsonTypeName("Microsoft.EventHub")
@JsonFlatten
public class EventHubEventSourceCreateOrUpdateParameters extends EventSourceCreateOrUpdateParameters {
    /**
     * Provisioning state of the resource. Possible values include: 'Accepted',
     * 'Creating', 'Updating', 'Succeeded', 'Failed', 'Deleting'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private ProvisioningState provisioningState;

    /**
     * The time the resource was created.
     */
    @JsonProperty(value = "properties.creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime creationTime;

    /**
     * The event property that will be used as the event source's timestamp. If
     * a value isn't specified for timestampPropertyName, or if null or
     * empty-string is specified, the event creation time will be used.
     */
    @JsonProperty(value = "properties.timestampPropertyName")
    private String timestampPropertyName;

    /**
     * The resource id of the event source in Azure Resource Manager.
     */
    @JsonProperty(value = "properties.eventSourceResourceId", required = true)
    private String eventSourceResourceId;

    /**
     * The name of the service bus that contains the event hub.
     */
    @JsonProperty(value = "properties.serviceBusNamespace", required = true)
    private String serviceBusNamespace;

    /**
     * The name of the event hub.
     */
    @JsonProperty(value = "properties.eventHubName", required = true)
    private String eventHubName;

    /**
     * The name of the event hub's consumer group that holds the partitions
     * from which events will be read.
     */
    @JsonProperty(value = "properties.consumerGroupName", required = true)
    private String consumerGroupName;

    /**
     * The name of the SAS key that grants the Time Series Insights service
     * access to the event hub. The shared access policies for this key must
     * grant 'Listen' permissions to the event hub.
     */
    @JsonProperty(value = "properties.keyName", required = true)
    private String keyName;

    /**
     * The value of the shared access key that grants the Time Series Insights
     * service read access to the event hub. This property is not shown in
     * event source responses.
     */
    @JsonProperty(value = "properties.sharedAccessKey", required = true)
    private String sharedAccessKey;

    /**
     * Get provisioning state of the resource. Possible values include: 'Accepted', 'Creating', 'Updating', 'Succeeded', 'Failed', 'Deleting'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set provisioning state of the resource. Possible values include: 'Accepted', 'Creating', 'Updating', 'Succeeded', 'Failed', 'Deleting'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the EventHubEventSourceCreateOrUpdateParameters object itself.
     */
    public EventHubEventSourceCreateOrUpdateParameters withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the time the resource was created.
     *
     * @return the creationTime value
     */
    public DateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Get the event property that will be used as the event source's timestamp. If a value isn't specified for timestampPropertyName, or if null or empty-string is specified, the event creation time will be used.
     *
     * @return the timestampPropertyName value
     */
    public String timestampPropertyName() {
        return this.timestampPropertyName;
    }

    /**
     * Set the event property that will be used as the event source's timestamp. If a value isn't specified for timestampPropertyName, or if null or empty-string is specified, the event creation time will be used.
     *
     * @param timestampPropertyName the timestampPropertyName value to set
     * @return the EventHubEventSourceCreateOrUpdateParameters object itself.
     */
    public EventHubEventSourceCreateOrUpdateParameters withTimestampPropertyName(String timestampPropertyName) {
        this.timestampPropertyName = timestampPropertyName;
        return this;
    }

    /**
     * Get the resource id of the event source in Azure Resource Manager.
     *
     * @return the eventSourceResourceId value
     */
    public String eventSourceResourceId() {
        return this.eventSourceResourceId;
    }

    /**
     * Set the resource id of the event source in Azure Resource Manager.
     *
     * @param eventSourceResourceId the eventSourceResourceId value to set
     * @return the EventHubEventSourceCreateOrUpdateParameters object itself.
     */
    public EventHubEventSourceCreateOrUpdateParameters withEventSourceResourceId(String eventSourceResourceId) {
        this.eventSourceResourceId = eventSourceResourceId;
        return this;
    }

    /**
     * Get the name of the service bus that contains the event hub.
     *
     * @return the serviceBusNamespace value
     */
    public String serviceBusNamespace() {
        return this.serviceBusNamespace;
    }

    /**
     * Set the name of the service bus that contains the event hub.
     *
     * @param serviceBusNamespace the serviceBusNamespace value to set
     * @return the EventHubEventSourceCreateOrUpdateParameters object itself.
     */
    public EventHubEventSourceCreateOrUpdateParameters withServiceBusNamespace(String serviceBusNamespace) {
        this.serviceBusNamespace = serviceBusNamespace;
        return this;
    }

    /**
     * Get the name of the event hub.
     *
     * @return the eventHubName value
     */
    public String eventHubName() {
        return this.eventHubName;
    }

    /**
     * Set the name of the event hub.
     *
     * @param eventHubName the eventHubName value to set
     * @return the EventHubEventSourceCreateOrUpdateParameters object itself.
     */
    public EventHubEventSourceCreateOrUpdateParameters withEventHubName(String eventHubName) {
        this.eventHubName = eventHubName;
        return this;
    }

    /**
     * Get the name of the event hub's consumer group that holds the partitions from which events will be read.
     *
     * @return the consumerGroupName value
     */
    public String consumerGroupName() {
        return this.consumerGroupName;
    }

    /**
     * Set the name of the event hub's consumer group that holds the partitions from which events will be read.
     *
     * @param consumerGroupName the consumerGroupName value to set
     * @return the EventHubEventSourceCreateOrUpdateParameters object itself.
     */
    public EventHubEventSourceCreateOrUpdateParameters withConsumerGroupName(String consumerGroupName) {
        this.consumerGroupName = consumerGroupName;
        return this;
    }

    /**
     * Get the name of the SAS key that grants the Time Series Insights service access to the event hub. The shared access policies for this key must grant 'Listen' permissions to the event hub.
     *
     * @return the keyName value
     */
    public String keyName() {
        return this.keyName;
    }

    /**
     * Set the name of the SAS key that grants the Time Series Insights service access to the event hub. The shared access policies for this key must grant 'Listen' permissions to the event hub.
     *
     * @param keyName the keyName value to set
     * @return the EventHubEventSourceCreateOrUpdateParameters object itself.
     */
    public EventHubEventSourceCreateOrUpdateParameters withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * Get the value of the shared access key that grants the Time Series Insights service read access to the event hub. This property is not shown in event source responses.
     *
     * @return the sharedAccessKey value
     */
    public String sharedAccessKey() {
        return this.sharedAccessKey;
    }

    /**
     * Set the value of the shared access key that grants the Time Series Insights service read access to the event hub. This property is not shown in event source responses.
     *
     * @param sharedAccessKey the sharedAccessKey value to set
     * @return the EventHubEventSourceCreateOrUpdateParameters object itself.
     */
    public EventHubEventSourceCreateOrUpdateParameters withSharedAccessKey(String sharedAccessKey) {
        this.sharedAccessKey = sharedAccessKey;
        return this;
    }

}
