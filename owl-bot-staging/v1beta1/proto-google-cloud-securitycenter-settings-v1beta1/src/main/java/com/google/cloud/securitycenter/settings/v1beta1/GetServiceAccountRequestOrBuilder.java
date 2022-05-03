// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/settings/v1beta1/securitycenter_settings_service.proto

package com.google.cloud.securitycenter.settings.v1beta1;

public interface GetServiceAccountRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.settings.v1beta1.GetServiceAccountRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The relative resource name of the service account resource.
   * Format:
   *  * `organizations/{organization}/serviceAccount`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The relative resource name of the service account resource.
   * Format:
   *  * `organizations/{organization}/serviceAccount`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
