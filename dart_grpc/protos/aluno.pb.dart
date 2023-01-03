///
//  Generated code. Do not modify.
//  source: aluno.proto
//
// @dart = 2.12
// ignore_for_file: annotate_overrides,camel_case_types,constant_identifier_names,directives_ordering,library_prefixes,non_constant_identifier_names,prefer_final_fields,return_of_invalid_type,unnecessary_const,unnecessary_import,unnecessary_this,unused_import,unused_shown_name

import 'dart:core' as $core;

import 'package:protobuf/protobuf.dart' as $pb;

class AlunoId extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = $pb.BuilderInfo(const $core.bool.fromEnvironment('protobuf.omit_message_names') ? '' : 'AlunoId', createEmptyInstance: create)
    ..a<$core.int>(1, const $core.bool.fromEnvironment('protobuf.omit_field_names') ? '' : 'id', $pb.PbFieldType.O3)
    ..hasRequiredFields = false
  ;

  AlunoId._() : super();
  factory AlunoId({
    $core.int? id,
  }) {
    final _result = create();
    if (id != null) {
      _result.id = id;
    }
    return _result;
  }
  factory AlunoId.fromBuffer($core.List<$core.int> i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromBuffer(i, r);
  factory AlunoId.fromJson($core.String i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromJson(i, r);
  @$core.Deprecated(
  'Using this can add significant overhead to your binary. '
  'Use [GeneratedMessageGenericExtensions.deepCopy] instead. '
  'Will be removed in next major version')
  AlunoId clone() => AlunoId()..mergeFromMessage(this);
  @$core.Deprecated(
  'Using this can add significant overhead to your binary. '
  'Use [GeneratedMessageGenericExtensions.rebuild] instead. '
  'Will be removed in next major version')
  AlunoId copyWith(void Function(AlunoId) updates) => super.copyWith((message) => updates(message as AlunoId)) as AlunoId; // ignore: deprecated_member_use
  $pb.BuilderInfo get info_ => _i;
  @$core.pragma('dart2js:noInline')
  static AlunoId create() => AlunoId._();
  AlunoId createEmptyInstance() => create();
  static $pb.PbList<AlunoId> createRepeated() => $pb.PbList<AlunoId>();
  @$core.pragma('dart2js:noInline')
  static AlunoId getDefault() => _defaultInstance ??= $pb.GeneratedMessage.$_defaultFor<AlunoId>(create);
  static AlunoId? _defaultInstance;

  @$pb.TagNumber(1)
  $core.int get id => $_getIZ(0);
  @$pb.TagNumber(1)
  set id($core.int v) { $_setSignedInt32(0, v); }
  @$pb.TagNumber(1)
  $core.bool hasId() => $_has(0);
  @$pb.TagNumber(1)
  void clearId() => clearField(1);
}

class Aluno extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = $pb.BuilderInfo(const $core.bool.fromEnvironment('protobuf.omit_message_names') ? '' : 'Aluno', createEmptyInstance: create)
    ..a<$core.int>(1, const $core.bool.fromEnvironment('protobuf.omit_field_names') ? '' : 'id', $pb.PbFieldType.O3)
    ..aOS(2, const $core.bool.fromEnvironment('protobuf.omit_field_names') ? '' : 'nome')
    ..hasRequiredFields = false
  ;

  Aluno._() : super();
  factory Aluno({
    $core.int? id,
    $core.String? nome,
  }) {
    final _result = create();
    if (id != null) {
      _result.id = id;
    }
    if (nome != null) {
      _result.nome = nome;
    }
    return _result;
  }
  factory Aluno.fromBuffer($core.List<$core.int> i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromBuffer(i, r);
  factory Aluno.fromJson($core.String i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromJson(i, r);
  @$core.Deprecated(
  'Using this can add significant overhead to your binary. '
  'Use [GeneratedMessageGenericExtensions.deepCopy] instead. '
  'Will be removed in next major version')
  Aluno clone() => Aluno()..mergeFromMessage(this);
  @$core.Deprecated(
  'Using this can add significant overhead to your binary. '
  'Use [GeneratedMessageGenericExtensions.rebuild] instead. '
  'Will be removed in next major version')
  Aluno copyWith(void Function(Aluno) updates) => super.copyWith((message) => updates(message as Aluno)) as Aluno; // ignore: deprecated_member_use
  $pb.BuilderInfo get info_ => _i;
  @$core.pragma('dart2js:noInline')
  static Aluno create() => Aluno._();
  Aluno createEmptyInstance() => create();
  static $pb.PbList<Aluno> createRepeated() => $pb.PbList<Aluno>();
  @$core.pragma('dart2js:noInline')
  static Aluno getDefault() => _defaultInstance ??= $pb.GeneratedMessage.$_defaultFor<Aluno>(create);
  static Aluno? _defaultInstance;

  @$pb.TagNumber(1)
  $core.int get id => $_getIZ(0);
  @$pb.TagNumber(1)
  set id($core.int v) { $_setSignedInt32(0, v); }
  @$pb.TagNumber(1)
  $core.bool hasId() => $_has(0);
  @$pb.TagNumber(1)
  void clearId() => clearField(1);

  @$pb.TagNumber(2)
  $core.String get nome => $_getSZ(1);
  @$pb.TagNumber(2)
  set nome($core.String v) { $_setString(1, v); }
  @$pb.TagNumber(2)
  $core.bool hasNome() => $_has(1);
  @$pb.TagNumber(2)
  void clearNome() => clearField(2);
}

class Alunos extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = $pb.BuilderInfo(const $core.bool.fromEnvironment('protobuf.omit_message_names') ? '' : 'Alunos', createEmptyInstance: create)
    ..pc<Aluno>(1, const $core.bool.fromEnvironment('protobuf.omit_field_names') ? '' : 'alunos', $pb.PbFieldType.PM, subBuilder: Aluno.create)
    ..hasRequiredFields = false
  ;

  Alunos._() : super();
  factory Alunos({
    $core.Iterable<Aluno>? alunos,
  }) {
    final _result = create();
    if (alunos != null) {
      _result.alunos.addAll(alunos);
    }
    return _result;
  }
  factory Alunos.fromBuffer($core.List<$core.int> i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromBuffer(i, r);
  factory Alunos.fromJson($core.String i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromJson(i, r);
  @$core.Deprecated(
  'Using this can add significant overhead to your binary. '
  'Use [GeneratedMessageGenericExtensions.deepCopy] instead. '
  'Will be removed in next major version')
  Alunos clone() => Alunos()..mergeFromMessage(this);
  @$core.Deprecated(
  'Using this can add significant overhead to your binary. '
  'Use [GeneratedMessageGenericExtensions.rebuild] instead. '
  'Will be removed in next major version')
  Alunos copyWith(void Function(Alunos) updates) => super.copyWith((message) => updates(message as Alunos)) as Alunos; // ignore: deprecated_member_use
  $pb.BuilderInfo get info_ => _i;
  @$core.pragma('dart2js:noInline')
  static Alunos create() => Alunos._();
  Alunos createEmptyInstance() => create();
  static $pb.PbList<Alunos> createRepeated() => $pb.PbList<Alunos>();
  @$core.pragma('dart2js:noInline')
  static Alunos getDefault() => _defaultInstance ??= $pb.GeneratedMessage.$_defaultFor<Alunos>(create);
  static Alunos? _defaultInstance;

  @$pb.TagNumber(1)
  $core.List<Aluno> get alunos => $_getList(0);
}

