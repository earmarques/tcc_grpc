///
//  Generated code. Do not modify.
//  source: gerador_id.proto
//
// @dart = 2.12
// ignore_for_file: annotate_overrides,camel_case_types,constant_identifier_names,directives_ordering,library_prefixes,non_constant_identifier_names,prefer_final_fields,return_of_invalid_type,unnecessary_const,unnecessary_import,unnecessary_this,unused_import,unused_shown_name

import 'dart:async' as $async;

import 'dart:core' as $core;

import 'package:grpc/service_api.dart' as $grpc;
import 'google/protobuf/empty.pb.dart' as $1;
import 'gerador_id.pb.dart' as $2;
export 'gerador_id.pb.dart';

class GeradorIDClient extends $grpc.Client {
  static final _$gerarId = $grpc.ClientMethod<$1.Empty, $2.IdReply>(
      '/geradorid.GeradorID/GerarId',
      ($1.Empty value) => value.writeToBuffer(),
      ($core.List<$core.int> value) => $2.IdReply.fromBuffer(value));

  GeradorIDClient($grpc.ClientChannel channel,
      {$grpc.CallOptions? options,
      $core.Iterable<$grpc.ClientInterceptor>? interceptors})
      : super(channel, options: options, interceptors: interceptors);

  $grpc.ResponseFuture<$2.IdReply> gerarId($1.Empty request,
      {$grpc.CallOptions? options}) {
    return $createUnaryCall(_$gerarId, request, options: options);
  }
}

abstract class GeradorIDServiceBase extends $grpc.Service {
  $core.String get $name => 'geradorid.GeradorID';

  GeradorIDServiceBase() {
    $addMethod($grpc.ServiceMethod<$1.Empty, $2.IdReply>(
        'GerarId',
        gerarId_Pre,
        false,
        false,
        ($core.List<$core.int> value) => $1.Empty.fromBuffer(value),
        ($2.IdReply value) => value.writeToBuffer()));
  }

  $async.Future<$2.IdReply> gerarId_Pre(
      $grpc.ServiceCall call, $async.Future<$1.Empty> request) async {
    return gerarId(call, await request);
  }

  $async.Future<$2.IdReply> gerarId($grpc.ServiceCall call, $1.Empty request);
}
