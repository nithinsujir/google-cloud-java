// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tasks/v2beta3/cloudtasks.proto

package com.google.cloud.tasks.v2beta3;

public final class CloudTasksProto {
  private CloudTasksProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_tasks_v2beta3_ListQueuesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta3_ListQueuesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_tasks_v2beta3_ListQueuesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta3_ListQueuesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_tasks_v2beta3_GetQueueRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta3_GetQueueRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_tasks_v2beta3_CreateQueueRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta3_CreateQueueRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_tasks_v2beta3_UpdateQueueRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta3_UpdateQueueRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_tasks_v2beta3_DeleteQueueRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta3_DeleteQueueRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_tasks_v2beta3_PurgeQueueRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta3_PurgeQueueRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_tasks_v2beta3_PauseQueueRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta3_PauseQueueRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_tasks_v2beta3_ResumeQueueRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta3_ResumeQueueRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_tasks_v2beta3_ListTasksRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta3_ListTasksRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_tasks_v2beta3_ListTasksResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta3_ListTasksResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_tasks_v2beta3_GetTaskRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta3_GetTaskRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_tasks_v2beta3_CreateTaskRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta3_CreateTaskRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_tasks_v2beta3_DeleteTaskRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta3_DeleteTaskRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_tasks_v2beta3_RunTaskRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta3_RunTaskRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/tasks/v2beta3/cloudtasks." +
      "proto\022\032google.cloud.tasks.v2beta3\032\034googl" +
      "e/api/annotations.proto\032&google/cloud/ta" +
      "sks/v2beta3/queue.proto\032%google/cloud/ta" +
      "sks/v2beta3/task.proto\032\036google/iam/v1/ia" +
      "m_policy.proto\032\032google/iam/v1/policy.pro" +
      "to\032\033google/protobuf/empty.proto\032 google/" +
      "protobuf/field_mask.proto\032\025google/rpc/co" +
      "de.proto\"Z\n\021ListQueuesRequest\022\016\n\006parent\030" +
      "\001 \001(\t\022\016\n\006filter\030\002 \001(\t\022\021\n\tpage_size\030\003 \001(\005",
      "\022\022\n\npage_token\030\004 \001(\t\"`\n\022ListQueuesRespon" +
      "se\0221\n\006queues\030\001 \003(\0132!.google.cloud.tasks." +
      "v2beta3.Queue\022\027\n\017next_page_token\030\002 \001(\t\"\037" +
      "\n\017GetQueueRequest\022\014\n\004name\030\001 \001(\t\"V\n\022Creat" +
      "eQueueRequest\022\016\n\006parent\030\001 \001(\t\0220\n\005queue\030\002" +
      " \001(\0132!.google.cloud.tasks.v2beta3.Queue\"" +
      "w\n\022UpdateQueueRequest\0220\n\005queue\030\001 \001(\0132!.g" +
      "oogle.cloud.tasks.v2beta3.Queue\022/\n\013updat" +
      "e_mask\030\002 \001(\0132\032.google.protobuf.FieldMask" +
      "\"\"\n\022DeleteQueueRequest\022\014\n\004name\030\001 \001(\t\"!\n\021",
      "PurgeQueueRequest\022\014\n\004name\030\001 \001(\t\"!\n\021Pause" +
      "QueueRequest\022\014\n\004name\030\001 \001(\t\"\"\n\022ResumeQueu" +
      "eRequest\022\014\n\004name\030\001 \001(\t\"\207\001\n\020ListTasksRequ" +
      "est\022\016\n\006parent\030\001 \001(\t\022<\n\rresponse_view\030\002 \001" +
      "(\0162%.google.cloud.tasks.v2beta3.Task.Vie" +
      "w\022\021\n\tpage_size\030\003 \001(\005\022\022\n\npage_token\030\004 \001(\t" +
      "\"]\n\021ListTasksResponse\022/\n\005tasks\030\001 \003(\0132 .g" +
      "oogle.cloud.tasks.v2beta3.Task\022\027\n\017next_p" +
      "age_token\030\002 \001(\t\"\\\n\016GetTaskRequest\022\014\n\004nam" +
      "e\030\001 \001(\t\022<\n\rresponse_view\030\002 \001(\0162%.google.",
      "cloud.tasks.v2beta3.Task.View\"\221\001\n\021Create" +
      "TaskRequest\022\016\n\006parent\030\001 \001(\t\022.\n\004task\030\002 \001(" +
      "\0132 .google.cloud.tasks.v2beta3.Task\022<\n\rr" +
      "esponse_view\030\003 \001(\0162%.google.cloud.tasks." +
      "v2beta3.Task.View\"!\n\021DeleteTaskRequest\022\014" +
      "\n\004name\030\001 \001(\t\"\\\n\016RunTaskRequest\022\014\n\004name\030\001" +
      " \001(\t\022<\n\rresponse_view\030\002 \001(\0162%.google.clo" +
      "ud.tasks.v2beta3.Task.View2\247\024\n\nCloudTask" +
      "s\022\244\001\n\nListQueues\022-.google.cloud.tasks.v2" +
      "beta3.ListQueuesRequest\032..google.cloud.t",
      "asks.v2beta3.ListQueuesResponse\"7\202\323\344\223\0021\022" +
      "//v2beta3/{parent=projects/*/locations/*" +
      "}/queues\022\223\001\n\010GetQueue\022+.google.cloud.tas" +
      "ks.v2beta3.GetQueueRequest\032!.google.clou" +
      "d.tasks.v2beta3.Queue\"7\202\323\344\223\0021\022//v2beta3/" +
      "{name=projects/*/locations/*/queues/*}\022\240" +
      "\001\n\013CreateQueue\022..google.cloud.tasks.v2be" +
      "ta3.CreateQueueRequest\032!.google.cloud.ta" +
      "sks.v2beta3.Queue\">\202\323\344\223\0028\"//v2beta3/{par" +
      "ent=projects/*/locations/*}/queues:\005queu",
      "e\022\246\001\n\013UpdateQueue\022..google.cloud.tasks.v" +
      "2beta3.UpdateQueueRequest\032!.google.cloud" +
      ".tasks.v2beta3.Queue\"D\202\323\344\223\002>25/v2beta3/{" +
      "queue.name=projects/*/locations/*/queues" +
      "/*}:\005queue\022\216\001\n\013DeleteQueue\022..google.clou" +
      "d.tasks.v2beta3.DeleteQueueRequest\032\026.goo" +
      "gle.protobuf.Empty\"7\202\323\344\223\0021*//v2beta3/{na" +
      "me=projects/*/locations/*/queues/*}\022\240\001\n\n" +
      "PurgeQueue\022-.google.cloud.tasks.v2beta3." +
      "PurgeQueueRequest\032!.google.cloud.tasks.v",
      "2beta3.Queue\"@\202\323\344\223\002:\"5/v2beta3/{name=pro" +
      "jects/*/locations/*/queues/*}:purge:\001*\022\240" +
      "\001\n\nPauseQueue\022-.google.cloud.tasks.v2bet" +
      "a3.PauseQueueRequest\032!.google.cloud.task" +
      "s.v2beta3.Queue\"@\202\323\344\223\002:\"5/v2beta3/{name=" +
      "projects/*/locations/*/queues/*}:pause:\001" +
      "*\022\243\001\n\013ResumeQueue\022..google.cloud.tasks.v" +
      "2beta3.ResumeQueueRequest\032!.google.cloud" +
      ".tasks.v2beta3.Queue\"A\202\323\344\223\002;\"6/v2beta3/{" +
      "name=projects/*/locations/*/queues/*}:re",
      "sume:\001*\022\226\001\n\014GetIamPolicy\022\".google.iam.v1" +
      ".GetIamPolicyRequest\032\025.google.iam.v1.Pol" +
      "icy\"K\202\323\344\223\002E\"@/v2beta3/{resource=projects" +
      "/*/locations/*/queues/*}:getIamPolicy:\001*" +
      "\022\226\001\n\014SetIamPolicy\022\".google.iam.v1.SetIam" +
      "PolicyRequest\032\025.google.iam.v1.Policy\"K\202\323" +
      "\344\223\002E\"@/v2beta3/{resource=projects/*/loca" +
      "tions/*/queues/*}:setIamPolicy:\001*\022\274\001\n\022Te" +
      "stIamPermissions\022(.google.iam.v1.TestIam" +
      "PermissionsRequest\032).google.iam.v1.TestI",
      "amPermissionsResponse\"Q\202\323\344\223\002K\"F/v2beta3/" +
      "{resource=projects/*/locations/*/queues/" +
      "*}:testIamPermissions:\001*\022\251\001\n\tListTasks\022," +
      ".google.cloud.tasks.v2beta3.ListTasksReq" +
      "uest\032-.google.cloud.tasks.v2beta3.ListTa" +
      "sksResponse\"?\202\323\344\223\0029\0227/v2beta3/{parent=pr" +
      "ojects/*/locations/*/queues/*}/tasks\022\230\001\n" +
      "\007GetTask\022*.google.cloud.tasks.v2beta3.Ge" +
      "tTaskRequest\032 .google.cloud.tasks.v2beta" +
      "3.Task\"?\202\323\344\223\0029\0227/v2beta3/{name=projects/",
      "*/locations/*/queues/*/tasks/*}\022\241\001\n\nCrea" +
      "teTask\022-.google.cloud.tasks.v2beta3.Crea" +
      "teTaskRequest\032 .google.cloud.tasks.v2bet" +
      "a3.Task\"B\202\323\344\223\002<\"7/v2beta3/{parent=projec" +
      "ts/*/locations/*/queues/*}/tasks:\001*\022\224\001\n\n" +
      "DeleteTask\022-.google.cloud.tasks.v2beta3." +
      "DeleteTaskRequest\032\026.google.protobuf.Empt" +
      "y\"?\202\323\344\223\0029*7/v2beta3/{name=projects/*/loc" +
      "ations/*/queues/*/tasks/*}\022\237\001\n\007RunTask\022*" +
      ".google.cloud.tasks.v2beta3.RunTaskReque",
      "st\032 .google.cloud.tasks.v2beta3.Task\"F\202\323" +
      "\344\223\002@\";/v2beta3/{name=projects/*/location" +
      "s/*/queues/*/tasks/*}:run:\001*B|\n\036com.goog" +
      "le.cloud.tasks.v2beta3B\017CloudTasksProtoP" +
      "\001Z?google.golang.org/genproto/googleapis" +
      "/cloud/tasks/v2beta3;tasks\242\002\005TASKSb\006prot" +
      "o3"
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
          com.google.cloud.tasks.v2beta3.QueueProto.getDescriptor(),
          com.google.cloud.tasks.v2beta3.TaskProto.getDescriptor(),
          com.google.iam.v1.IamPolicyProto.getDescriptor(),
          com.google.iam.v1.PolicyProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.CodeProto.getDescriptor(),
        }, assigner);
    internal_static_google_cloud_tasks_v2beta3_ListQueuesRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_tasks_v2beta3_ListQueuesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_tasks_v2beta3_ListQueuesRequest_descriptor,
        new java.lang.String[] { "Parent", "Filter", "PageSize", "PageToken", });
    internal_static_google_cloud_tasks_v2beta3_ListQueuesResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_tasks_v2beta3_ListQueuesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_tasks_v2beta3_ListQueuesResponse_descriptor,
        new java.lang.String[] { "Queues", "NextPageToken", });
    internal_static_google_cloud_tasks_v2beta3_GetQueueRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_tasks_v2beta3_GetQueueRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_tasks_v2beta3_GetQueueRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_tasks_v2beta3_CreateQueueRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_tasks_v2beta3_CreateQueueRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_tasks_v2beta3_CreateQueueRequest_descriptor,
        new java.lang.String[] { "Parent", "Queue", });
    internal_static_google_cloud_tasks_v2beta3_UpdateQueueRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_tasks_v2beta3_UpdateQueueRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_tasks_v2beta3_UpdateQueueRequest_descriptor,
        new java.lang.String[] { "Queue", "UpdateMask", });
    internal_static_google_cloud_tasks_v2beta3_DeleteQueueRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_tasks_v2beta3_DeleteQueueRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_tasks_v2beta3_DeleteQueueRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_tasks_v2beta3_PurgeQueueRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_tasks_v2beta3_PurgeQueueRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_tasks_v2beta3_PurgeQueueRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_tasks_v2beta3_PauseQueueRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_tasks_v2beta3_PauseQueueRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_tasks_v2beta3_PauseQueueRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_tasks_v2beta3_ResumeQueueRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_tasks_v2beta3_ResumeQueueRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_tasks_v2beta3_ResumeQueueRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_tasks_v2beta3_ListTasksRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_tasks_v2beta3_ListTasksRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_tasks_v2beta3_ListTasksRequest_descriptor,
        new java.lang.String[] { "Parent", "ResponseView", "PageSize", "PageToken", });
    internal_static_google_cloud_tasks_v2beta3_ListTasksResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_tasks_v2beta3_ListTasksResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_tasks_v2beta3_ListTasksResponse_descriptor,
        new java.lang.String[] { "Tasks", "NextPageToken", });
    internal_static_google_cloud_tasks_v2beta3_GetTaskRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_tasks_v2beta3_GetTaskRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_tasks_v2beta3_GetTaskRequest_descriptor,
        new java.lang.String[] { "Name", "ResponseView", });
    internal_static_google_cloud_tasks_v2beta3_CreateTaskRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_tasks_v2beta3_CreateTaskRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_tasks_v2beta3_CreateTaskRequest_descriptor,
        new java.lang.String[] { "Parent", "Task", "ResponseView", });
    internal_static_google_cloud_tasks_v2beta3_DeleteTaskRequest_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_tasks_v2beta3_DeleteTaskRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_tasks_v2beta3_DeleteTaskRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_tasks_v2beta3_RunTaskRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_tasks_v2beta3_RunTaskRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_tasks_v2beta3_RunTaskRequest_descriptor,
        new java.lang.String[] { "Name", "ResponseView", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.cloud.tasks.v2beta3.QueueProto.getDescriptor();
    com.google.cloud.tasks.v2beta3.TaskProto.getDescriptor();
    com.google.iam.v1.IamPolicyProto.getDescriptor();
    com.google.iam.v1.PolicyProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.CodeProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
