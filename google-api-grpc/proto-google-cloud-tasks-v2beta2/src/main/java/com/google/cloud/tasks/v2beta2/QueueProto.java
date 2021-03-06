// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tasks/v2beta2/queue.proto

package com.google.cloud.tasks.v2beta2;

public final class QueueProto {
  private QueueProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_tasks_v2beta2_Queue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta2_Queue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_tasks_v2beta2_RateLimits_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta2_RateLimits_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_tasks_v2beta2_RetryConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta2_RetryConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&google/cloud/tasks/v2beta2/queue.proto" +
      "\022\032google.cloud.tasks.v2beta2\032\034google/api" +
      "/annotations.proto\032\'google/cloud/tasks/v" +
      "2beta2/target.proto\032\036google/protobuf/dur" +
      "ation.proto\032\037google/protobuf/timestamp.p" +
      "roto\"\341\003\n\005Queue\022\014\n\004name\030\001 \001(\t\022Q\n\026app_engi" +
      "ne_http_target\030\003 \001(\0132/.google.cloud.task" +
      "s.v2beta2.AppEngineHttpTargetH\000\022=\n\013pull_" +
      "target\030\004 \001(\0132&.google.cloud.tasks.v2beta" +
      "2.PullTargetH\000\022;\n\013rate_limits\030\005 \001(\0132&.go",
      "ogle.cloud.tasks.v2beta2.RateLimits\022=\n\014r" +
      "etry_config\030\006 \001(\0132\'.google.cloud.tasks.v" +
      "2beta2.RetryConfig\0226\n\005state\030\007 \001(\0162\'.goog" +
      "le.cloud.tasks.v2beta2.Queue.State\022.\n\npu" +
      "rge_time\030\010 \001(\0132\032.google.protobuf.Timesta" +
      "mp\"E\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\013\n\007RU" +
      "NNING\020\001\022\n\n\006PAUSED\020\002\022\014\n\010DISABLED\020\003B\r\n\013tar" +
      "get_type\"k\n\nRateLimits\022\'\n\037max_tasks_disp" +
      "atched_per_second\030\001 \001(\001\022\026\n\016max_burst_siz" +
      "e\030\002 \001(\005\022\034\n\024max_concurrent_tasks\030\003 \001(\005\"\201\002",
      "\n\013RetryConfig\022\026\n\014max_attempts\030\001 \001(\005H\000\022\034\n" +
      "\022unlimited_attempts\030\002 \001(\010H\000\0225\n\022max_retry" +
      "_duration\030\003 \001(\0132\031.google.protobuf.Durati" +
      "on\022.\n\013min_backoff\030\004 \001(\0132\031.google.protobu" +
      "f.Duration\022.\n\013max_backoff\030\005 \001(\0132\031.google" +
      ".protobuf.Duration\022\025\n\rmax_doublings\030\006 \001(" +
      "\005B\016\n\014num_attemptsBo\n\036com.google.cloud.ta" +
      "sks.v2beta2B\nQueueProtoP\001Z?google.golang" +
      ".org/genproto/googleapis/cloud/tasks/v2b" +
      "eta2;tasksb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.cloud.tasks.v2beta2.TargetProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        }, assigner);
    internal_static_google_cloud_tasks_v2beta2_Queue_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_tasks_v2beta2_Queue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_tasks_v2beta2_Queue_descriptor,
        new java.lang.String[] { "Name", "AppEngineHttpTarget", "PullTarget", "RateLimits", "RetryConfig", "State", "PurgeTime", "TargetType", });
    internal_static_google_cloud_tasks_v2beta2_RateLimits_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_tasks_v2beta2_RateLimits_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_tasks_v2beta2_RateLimits_descriptor,
        new java.lang.String[] { "MaxTasksDispatchedPerSecond", "MaxBurstSize", "MaxConcurrentTasks", });
    internal_static_google_cloud_tasks_v2beta2_RetryConfig_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_tasks_v2beta2_RetryConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_tasks_v2beta2_RetryConfig_descriptor,
        new java.lang.String[] { "MaxAttempts", "UnlimitedAttempts", "MaxRetryDuration", "MinBackoff", "MaxBackoff", "MaxDoublings", "NumAttempts", });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.cloud.tasks.v2beta2.TargetProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
