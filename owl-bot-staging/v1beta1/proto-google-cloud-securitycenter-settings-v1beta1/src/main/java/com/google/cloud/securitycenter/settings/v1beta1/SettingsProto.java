// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/settings/v1beta1/settings.proto

package com.google.cloud.securitycenter.settings.v1beta1;

public final class SettingsProto {
  private SettingsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_securitycenter_settings_v1beta1_Settings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_settings_v1beta1_Settings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_securitycenter_settings_v1beta1_Settings_DetectorGroupSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_settings_v1beta1_Settings_DetectorGroupSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_securitycenter_settings_v1beta1_Settings_ComponentSettingsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_settings_v1beta1_Settings_ComponentSettingsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_securitycenter_settings_v1beta1_Settings_DetectorGroupSettingsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_settings_v1beta1_Settings_DetectorGroupSettingsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;google/cloud/securitycenter/settings/v" +
      "1beta1/settings.proto\022,google.cloud.secu" +
      "ritycenter.settings.v1beta1\032\037google/api/" +
      "field_behavior.proto\032\031google/api/resourc" +
      "e.proto\032Cgoogle/cloud/securitycenter/set" +
      "tings/v1beta1/billing_settings.proto\032Ego" +
      "ogle/cloud/securitycenter/settings/v1bet" +
      "a1/component_settings.proto\032@google/clou" +
      "d/securitycenter/settings/v1beta1/sink_s" +
      "ettings.proto\032\037google/protobuf/timestamp" +
      ".proto\032\034google/api/annotations.proto\"\341\013\n" +
      "\010Settings\022\014\n\004name\030\001 \001(\t\022W\n\020billing_setti" +
      "ngs\030\002 \001(\0132=.google.cloud.securitycenter." +
      "settings.v1beta1.BillingSettings\022U\n\005stat" +
      "e\030\003 \001(\0162F.google.cloud.securitycenter.se" +
      "ttings.v1beta1.Settings.OnboardingState\022" +
      " \n\023org_service_account\030\005 \001(\tB\003\340A\003\022Q\n\rsin" +
      "k_settings\030\006 \001(\0132:.google.cloud.security" +
      "center.settings.v1beta1.SinkSettings\022i\n\022" +
      "component_settings\030\007 \003(\0132M.google.cloud." +
      "securitycenter.settings.v1beta1.Settings" +
      ".ComponentSettingsEntry\022r\n\027detector_grou" +
      "p_settings\030\010 \003(\0132Q.google.cloud.security" +
      "center.settings.v1beta1.Settings.Detecto" +
      "rGroupSettingsEntry\022\014\n\004etag\030\t \001(\t\0224\n\013upd" +
      "ate_time\030\n \001(\0132\032.google.protobuf.Timesta" +
      "mpB\003\340A\003\032n\n\025DetectorGroupSettings\022U\n\005stat" +
      "e\030\001 \001(\0162F.google.cloud.securitycenter.se" +
      "ttings.v1beta1.ComponentEnablementState\032" +
      "y\n\026ComponentSettingsEntry\022\013\n\003key\030\001 \001(\t\022N" +
      "\n\005value\030\002 \001(\0132?.google.cloud.securitycen" +
      "ter.settings.v1beta1.ComponentSettings:\002" +
      "8\001\032\212\001\n\032DetectorGroupSettingsEntry\022\013\n\003key" +
      "\030\001 \001(\t\022[\n\005value\030\002 \001(\0132L.google.cloud.sec" +
      "uritycenter.settings.v1beta1.Settings.De" +
      "tectorGroupSettings:\0028\001\"\265\001\n\017OnboardingSt" +
      "ate\022 \n\034ONBOARDING_STATE_UNSPECIFIED\020\000\022\013\n" +
      "\007ENABLED\020\001\022\014\n\010DISABLED\020\002\022\024\n\020BILLING_SELE" +
      "CTED\020\003\022\026\n\022PROVIDERS_SELECTED\020\004\022\026\n\022RESOUR" +
      "CES_SELECTED\020\005\022\037\n\033ORG_SERVICE_ACCOUNT_CR" +
      "EATED\020\006:\316\002\352A\312\002\n&securitycenter.googleapi" +
      "s.com/Settings\022%organizations/{organizat" +
      "ion}/settings\022\031folders/{folder}/settings" +
      "\022\033projects/{project}/settings\022Cprojects/" +
      "{project}/locations/{location}/clusters/" +
      "{cluster}/settings\022?projects/{project}/r" +
      "egions/{region}/clusters/{cluster}/setti" +
      "ngs\022;projects/{project}/zones/{zone}/clu" +
      "sters/{cluster}/settingsB\255\002\n0com.google." +
      "cloud.securitycenter.settings.v1beta1B\rS" +
      "ettingsProtoP\001ZTgoogle.golang.org/genpro" +
      "to/googleapis/cloud/securitycenter/setti" +
      "ngs/v1beta1;settings\370\001\001\252\002,Google.Cloud.S" +
      "ecurityCenter.Settings.V1Beta1\312\002,Google\\" +
      "Cloud\\SecurityCenter\\Settings\\V1beta1\352\0020" +
      "Google::Cloud::SecurityCenter::Settings:" +
      ":V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.securitycenter.settings.v1beta1.BillingSettingsProto.getDescriptor(),
          com.google.cloud.securitycenter.settings.v1beta1.ComponentSettingsProto.getDescriptor(),
          com.google.cloud.securitycenter.settings.v1beta1.SinkProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_securitycenter_settings_v1beta1_Settings_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_settings_v1beta1_Settings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_securitycenter_settings_v1beta1_Settings_descriptor,
        new java.lang.String[] { "Name", "BillingSettings", "State", "OrgServiceAccount", "SinkSettings", "ComponentSettings", "DetectorGroupSettings", "Etag", "UpdateTime", });
    internal_static_google_cloud_securitycenter_settings_v1beta1_Settings_DetectorGroupSettings_descriptor =
      internal_static_google_cloud_securitycenter_settings_v1beta1_Settings_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_securitycenter_settings_v1beta1_Settings_DetectorGroupSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_securitycenter_settings_v1beta1_Settings_DetectorGroupSettings_descriptor,
        new java.lang.String[] { "State", });
    internal_static_google_cloud_securitycenter_settings_v1beta1_Settings_ComponentSettingsEntry_descriptor =
      internal_static_google_cloud_securitycenter_settings_v1beta1_Settings_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_securitycenter_settings_v1beta1_Settings_ComponentSettingsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_securitycenter_settings_v1beta1_Settings_ComponentSettingsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_securitycenter_settings_v1beta1_Settings_DetectorGroupSettingsEntry_descriptor =
      internal_static_google_cloud_securitycenter_settings_v1beta1_Settings_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_securitycenter_settings_v1beta1_Settings_DetectorGroupSettingsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_securitycenter_settings_v1beta1_Settings_DetectorGroupSettingsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.securitycenter.settings.v1beta1.BillingSettingsProto.getDescriptor();
    com.google.cloud.securitycenter.settings.v1beta1.ComponentSettingsProto.getDescriptor();
    com.google.cloud.securitycenter.settings.v1beta1.SinkProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
