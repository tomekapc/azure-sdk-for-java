/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01.implementation;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Connection information for encrypting the on-premises data source
 * credentials.
 */
public class IntegrationRuntimeConnectionInfoInner {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * The token generated in service. Callers use this token to authenticate
     * to integration runtime.
     */
    @JsonProperty(value = "serviceToken", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceToken;

    /**
     * The integration runtime SSL certificate thumbprint. Click-Once
     * application uses it to do server validation.
     */
    @JsonProperty(value = "identityCertThumbprint", access = JsonProperty.Access.WRITE_ONLY)
    private String identityCertThumbprint;

    /**
     * The on-premises integration runtime host URL.
     */
    @JsonProperty(value = "hostServiceUri", access = JsonProperty.Access.WRITE_ONLY)
    private String hostServiceUri;

    /**
     * The integration runtime version.
     */
    @JsonProperty(value = "version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /**
     * The public key for encrypting a credential when transferring the
     * credential to the integration runtime.
     */
    @JsonProperty(value = "publicKey", access = JsonProperty.Access.WRITE_ONLY)
    private String publicKey;

    /**
     * Whether the identity certificate is expired.
     */
    @JsonProperty(value = "isIdentityCertExprired", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isIdentityCertExprired;

    /**
     * Get unmatched properties from the message are deserialized this collection.
     *
     * @return the additionalProperties value
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set unmatched properties from the message are deserialized this collection.
     *
     * @param additionalProperties the additionalProperties value to set
     * @return the IntegrationRuntimeConnectionInfoInner object itself.
     */
    public IntegrationRuntimeConnectionInfoInner withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get the token generated in service. Callers use this token to authenticate to integration runtime.
     *
     * @return the serviceToken value
     */
    public String serviceToken() {
        return this.serviceToken;
    }

    /**
     * Get the integration runtime SSL certificate thumbprint. Click-Once application uses it to do server validation.
     *
     * @return the identityCertThumbprint value
     */
    public String identityCertThumbprint() {
        return this.identityCertThumbprint;
    }

    /**
     * Get the on-premises integration runtime host URL.
     *
     * @return the hostServiceUri value
     */
    public String hostServiceUri() {
        return this.hostServiceUri;
    }

    /**
     * Get the integration runtime version.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

    /**
     * Get the public key for encrypting a credential when transferring the credential to the integration runtime.
     *
     * @return the publicKey value
     */
    public String publicKey() {
        return this.publicKey;
    }

    /**
     * Get whether the identity certificate is expired.
     *
     * @return the isIdentityCertExprired value
     */
    public Boolean isIdentityCertExprired() {
        return this.isIdentityCertExprired;
    }

}
