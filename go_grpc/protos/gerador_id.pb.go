// gerador_id.proto

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.1
// 	protoc        v3.20.3
// source: gerador_id.proto

package go_grpc

import (
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	emptypb "google.golang.org/protobuf/types/known/emptypb"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type IdReply struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	GoId int32 `protobuf:"varint,1,opt,name=goId,proto3" json:"goId,omitempty"`
}

func (x *IdReply) Reset() {
	*x = IdReply{}
	if protoimpl.UnsafeEnabled {
		mi := &file_gerador_id_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *IdReply) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*IdReply) ProtoMessage() {}

func (x *IdReply) ProtoReflect() protoreflect.Message {
	mi := &file_gerador_id_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use IdReply.ProtoReflect.Descriptor instead.
func (*IdReply) Descriptor() ([]byte, []int) {
	return file_gerador_id_proto_rawDescGZIP(), []int{0}
}

func (x *IdReply) GetGoId() int32 {
	if x != nil {
		return x.GoId
	}
	return 0
}

var File_gerador_id_proto protoreflect.FileDescriptor

var file_gerador_id_proto_rawDesc = []byte{
	0x0a, 0x10, 0x67, 0x65, 0x72, 0x61, 0x64, 0x6f, 0x72, 0x5f, 0x69, 0x64, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x12, 0x09, 0x67, 0x65, 0x72, 0x61, 0x64, 0x6f, 0x72, 0x69, 0x64, 0x1a, 0x1b, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x65,
	0x6d, 0x70, 0x74, 0x79, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x1d, 0x0a, 0x07, 0x49, 0x64,
	0x52, 0x65, 0x70, 0x6c, 0x79, 0x12, 0x12, 0x0a, 0x04, 0x67, 0x6f, 0x49, 0x64, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x05, 0x52, 0x04, 0x67, 0x6f, 0x49, 0x64, 0x32, 0x44, 0x0a, 0x09, 0x47, 0x65, 0x72,
	0x61, 0x64, 0x6f, 0x72, 0x49, 0x44, 0x12, 0x37, 0x0a, 0x07, 0x47, 0x65, 0x72, 0x61, 0x72, 0x49,
	0x64, 0x12, 0x16, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x62, 0x75, 0x66, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x1a, 0x12, 0x2e, 0x67, 0x65, 0x72, 0x61,
	0x64, 0x6f, 0x72, 0x69, 0x64, 0x2e, 0x49, 0x64, 0x52, 0x65, 0x70, 0x6c, 0x79, 0x22, 0x00, 0x42,
	0x28, 0x5a, 0x26, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x65, 0x61,
	0x72, 0x6d, 0x61, 0x72, 0x71, 0x75, 0x65, 0x73, 0x2f, 0x74, 0x63, 0x63, 0x5f, 0x67, 0x72, 0x70,
	0x63, 0x2f, 0x67, 0x6f, 0x5f, 0x67, 0x72, 0x70, 0x63, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x33,
}

var (
	file_gerador_id_proto_rawDescOnce sync.Once
	file_gerador_id_proto_rawDescData = file_gerador_id_proto_rawDesc
)

func file_gerador_id_proto_rawDescGZIP() []byte {
	file_gerador_id_proto_rawDescOnce.Do(func() {
		file_gerador_id_proto_rawDescData = protoimpl.X.CompressGZIP(file_gerador_id_proto_rawDescData)
	})
	return file_gerador_id_proto_rawDescData
}

var file_gerador_id_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_gerador_id_proto_goTypes = []interface{}{
	(*IdReply)(nil),       // 0: geradorid.IdReply
	(*emptypb.Empty)(nil), // 1: google.protobuf.Empty
}
var file_gerador_id_proto_depIdxs = []int32{
	1, // 0: geradorid.GeradorID.GerarId:input_type -> google.protobuf.Empty
	0, // 1: geradorid.GeradorID.GerarId:output_type -> geradorid.IdReply
	1, // [1:2] is the sub-list for method output_type
	0, // [0:1] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_gerador_id_proto_init() }
func file_gerador_id_proto_init() {
	if File_gerador_id_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_gerador_id_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*IdReply); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_gerador_id_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_gerador_id_proto_goTypes,
		DependencyIndexes: file_gerador_id_proto_depIdxs,
		MessageInfos:      file_gerador_id_proto_msgTypes,
	}.Build()
	File_gerador_id_proto = out.File
	file_gerador_id_proto_rawDesc = nil
	file_gerador_id_proto_goTypes = nil
	file_gerador_id_proto_depIdxs = nil
}
