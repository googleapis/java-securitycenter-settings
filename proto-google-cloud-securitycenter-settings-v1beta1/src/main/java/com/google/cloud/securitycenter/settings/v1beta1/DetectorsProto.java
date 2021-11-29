/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/settings/v1beta1/detector.proto

package com.google.cloud.securitycenter.settings.v1beta1;

public final class DetectorsProto {
  private DetectorsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_settings_v1beta1_Detector_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_settings_v1beta1_Detector_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + ";google/cloud/securitycenter/settings/v1beta1/detector.proto\022,google.cloud.secu"
          + "ritycenter.settings.v1beta1\032\037google/api/field_behavior.proto\032Cgoogle/cloud/securitycenter/settings/v1beta1/billing_settings.proto\032\034google/api/annotations.proto\"\255\001\n"
          + "\010Detector\022\025\n"
          + "\010detector\030\001 \001(\tB\003\340A\003\022\026\n"
          + "\tcomponent\030\002 \001(\tB\003\340A\003\022T\n"
          + "\014billing_tier\030\003"
          + " \001(\01629.google.cloud.securitycenter.settings.v1beta1.BillingTierB\003\340A\003\022\034\n"
          + "\017detector_labels\030\004 \003(\tB\003\340A\003B\256\002\n"
          + "0com.google.cloud.securitycenter.settings.v1beta1B\016DetectorsP"
          + "rotoP\001ZTgoogle.golang.org/genproto/googleapis/cloud/securitycenter/settings/v1be"
          + "ta1;settings\370\001\001\252\002,Google.Cloud.SecurityC"
          + "enter.Settings.V1Beta1\312\002,Google\\Cloud\\Se"
          + "curityCenter\\Settings\\V1beta1\352\0020Google::"
          + "Cloud::SecurityCenter::Settings::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.securitycenter.settings.v1beta1.BillingSettingsProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_securitycenter_settings_v1beta1_Detector_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_settings_v1beta1_Detector_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_settings_v1beta1_Detector_descriptor,
            new java.lang.String[] {
              "Detector", "Component", "BillingTier", "DetectorLabels",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.securitycenter.settings.v1beta1.BillingSettingsProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
