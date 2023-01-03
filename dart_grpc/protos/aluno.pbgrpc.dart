///
//  Generated code. Do not modify.
//  source: aluno.proto
//
// @dart = 2.12
// ignore_for_file: annotate_overrides,camel_case_types,constant_identifier_names,directives_ordering,library_prefixes,non_constant_identifier_names,prefer_final_fields,return_of_invalid_type,unnecessary_const,unnecessary_import,unnecessary_this,unused_import,unused_shown_name

import 'dart:async' as $async;

import 'dart:core' as $core;

import 'package:grpc/service_api.dart' as $grpc;
import 'aluno.pb.dart' as $0;
import 'google/protobuf/empty.pb.dart' as $1;
export 'aluno.pb.dart';

class CrudAlunoServiceClient extends $grpc.Client {
  static final _$createAluno = $grpc.ClientMethod<$0.Aluno, $0.Aluno>(
      '/CrudAlunoService/CreateAluno',
      ($0.Aluno value) => value.writeToBuffer(),
      ($core.List<$core.int> value) => $0.Aluno.fromBuffer(value));
  static final _$getAllAlunos = $grpc.ClientMethod<$1.Empty, $0.Alunos>(
      '/CrudAlunoService/GetAllAlunos',
      ($1.Empty value) => value.writeToBuffer(),
      ($core.List<$core.int> value) => $0.Alunos.fromBuffer(value));
  static final _$getAluno = $grpc.ClientMethod<$0.AlunoId, $0.Aluno>(
      '/CrudAlunoService/GetAluno',
      ($0.AlunoId value) => value.writeToBuffer(),
      ($core.List<$core.int> value) => $0.Aluno.fromBuffer(value));
  static final _$deleteAluno = $grpc.ClientMethod<$0.AlunoId, $1.Empty>(
      '/CrudAlunoService/DeleteAluno',
      ($0.AlunoId value) => value.writeToBuffer(),
      ($core.List<$core.int> value) => $1.Empty.fromBuffer(value));
  static final _$editAluno = $grpc.ClientMethod<$0.Aluno, $0.Aluno>(
      '/CrudAlunoService/EditAluno',
      ($0.Aluno value) => value.writeToBuffer(),
      ($core.List<$core.int> value) => $0.Aluno.fromBuffer(value));

  CrudAlunoServiceClient($grpc.ClientChannel channel,
      {$grpc.CallOptions? options,
      $core.Iterable<$grpc.ClientInterceptor>? interceptors})
      : super(channel, options: options, interceptors: interceptors);

  $grpc.ResponseFuture<$0.Aluno> createAluno($0.Aluno request,
      {$grpc.CallOptions? options}) {
    return $createUnaryCall(_$createAluno, request, options: options);
  }

  $grpc.ResponseFuture<$0.Alunos> getAllAlunos($1.Empty request,
      {$grpc.CallOptions? options}) {
    return $createUnaryCall(_$getAllAlunos, request, options: options);
  }

  $grpc.ResponseFuture<$0.Aluno> getAluno($0.AlunoId request,
      {$grpc.CallOptions? options}) {
    return $createUnaryCall(_$getAluno, request, options: options);
  }

  $grpc.ResponseFuture<$1.Empty> deleteAluno($0.AlunoId request,
      {$grpc.CallOptions? options}) {
    return $createUnaryCall(_$deleteAluno, request, options: options);
  }

  $grpc.ResponseFuture<$0.Aluno> editAluno($0.Aluno request,
      {$grpc.CallOptions? options}) {
    return $createUnaryCall(_$editAluno, request, options: options);
  }
}

abstract class CrudAlunoServiceBase extends $grpc.Service {
  $core.String get $name => 'CrudAlunoService';

  CrudAlunoServiceBase() {
    $addMethod($grpc.ServiceMethod<$0.Aluno, $0.Aluno>(
        'CreateAluno',
        createAluno_Pre,
        false,
        false,
        ($core.List<$core.int> value) => $0.Aluno.fromBuffer(value),
        ($0.Aluno value) => value.writeToBuffer()));
    $addMethod($grpc.ServiceMethod<$1.Empty, $0.Alunos>(
        'GetAllAlunos',
        getAllAlunos_Pre,
        false,
        false,
        ($core.List<$core.int> value) => $1.Empty.fromBuffer(value),
        ($0.Alunos value) => value.writeToBuffer()));
    $addMethod($grpc.ServiceMethod<$0.AlunoId, $0.Aluno>(
        'GetAluno',
        getAluno_Pre,
        false,
        false,
        ($core.List<$core.int> value) => $0.AlunoId.fromBuffer(value),
        ($0.Aluno value) => value.writeToBuffer()));
    $addMethod($grpc.ServiceMethod<$0.AlunoId, $1.Empty>(
        'DeleteAluno',
        deleteAluno_Pre,
        false,
        false,
        ($core.List<$core.int> value) => $0.AlunoId.fromBuffer(value),
        ($1.Empty value) => value.writeToBuffer()));
    $addMethod($grpc.ServiceMethod<$0.Aluno, $0.Aluno>(
        'EditAluno',
        editAluno_Pre,
        false,
        false,
        ($core.List<$core.int> value) => $0.Aluno.fromBuffer(value),
        ($0.Aluno value) => value.writeToBuffer()));
  }

  $async.Future<$0.Aluno> createAluno_Pre(
      $grpc.ServiceCall call, $async.Future<$0.Aluno> request) async {
    return createAluno(call, await request);
  }

  $async.Future<$0.Alunos> getAllAlunos_Pre(
      $grpc.ServiceCall call, $async.Future<$1.Empty> request) async {
    return getAllAlunos(call, await request);
  }

  $async.Future<$0.Aluno> getAluno_Pre(
      $grpc.ServiceCall call, $async.Future<$0.AlunoId> request) async {
    return getAluno(call, await request);
  }

  $async.Future<$1.Empty> deleteAluno_Pre(
      $grpc.ServiceCall call, $async.Future<$0.AlunoId> request) async {
    return deleteAluno(call, await request);
  }

  $async.Future<$0.Aluno> editAluno_Pre(
      $grpc.ServiceCall call, $async.Future<$0.Aluno> request) async {
    return editAluno(call, await request);
  }

  $async.Future<$0.Aluno> createAluno($grpc.ServiceCall call, $0.Aluno request);
  $async.Future<$0.Alunos> getAllAlunos(
      $grpc.ServiceCall call, $1.Empty request);
  $async.Future<$0.Aluno> getAluno($grpc.ServiceCall call, $0.AlunoId request);
  $async.Future<$1.Empty> deleteAluno(
      $grpc.ServiceCall call, $0.AlunoId request);
  $async.Future<$0.Aluno> editAluno($grpc.ServiceCall call, $0.Aluno request);
}
