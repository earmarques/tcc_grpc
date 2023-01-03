///
//  Generated code. Do not modify.
//  source: gerador_id.proto
//
// @dart = 2.12
// ignore_for_file: annotate_overrides,camel_case_types,constant_identifier_names,directives_ordering,library_prefixes,non_constant_identifier_names,prefer_final_fields,return_of_invalid_type,unnecessary_const,unnecessary_import,unnecessary_this,unused_import,unused_shown_name

import 'dart:core' as $core;

import 'package:protobuf/protobuf.dart' as $pb;

class IdReply extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = $pb.BuilderInfo(const $core.bool.fromEnvironment('protobuf.omit_message_names') ? '' : 'IdReply', package: const $pb.PackageName(const $core.bool.fromEnvironment('protobuf.omit_message_names') ? '' : 'geradorid'), createEmptyInstance: create)
    ..a<$core.int>(1, const $core.bool.fromEnvironment('protobuf.omit_field_names') ? '' : 'goId', $pb.PbFieldType.O3, protoName: 'goId')
    ..hasRequiredFields = false
  ;

  IdReply._() : super();
  factory IdReply({
    $core.int? goId,
  }) {
    final _result = create();
    if (goId != null) {
      _result.goId = goId;
    }
    return _result;
  }
  factory IdReply.fromBuffer($core.List<$core.int> i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromBuffer(i, r);
  factory IdReply.fromJson($core.String i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) => create()..mergeFromJson(i, r);
  @$core.Deprecated(
  'Using this can add significant overhead to your binary. '
  'Use [GeneratedMessageGenericExtensions.deepCopy] instead. '
  'Will be removed in next major version')
  IdReply clone() => IdReply()..mergeFromMessage(this);
  @$core.Deprecated(
  'Using this can add significant overhead to your binary. '
  'Use [GeneratedMessageGenericExtensions.rebuild] instead. '
  'Will be removed in next major version')
  IdReply copyWith(void Function(IdReply) updates) => super.copyWith((message) => updates(message as IdReply)) as IdReply; // ignore: deprecated_member_use
  $pb.BuilderInfo get info_ => _i;
  @$core.pragma('dart2js:noInline')
  static IdReply create() => IdReply._();
  IdReply createEmptyInstance() => create();
  static $pb.PbList<IdReply> createRepeated() => $pb.PbList<IdReply>();
  @$core.pragma('dart2js:noInline')
  static IdReply getDefault() => _defaultInstance ??= $pb.GeneratedMessage.$_defaultFor<IdReply>(create);
  static IdReply? _defaultInstance;

  @$pb.TagNumber(1)
  $core.int get goId => $_getIZ(0);
  @$pb.TagNumber(1)
  set goId($core.int v) { $_setSignedInt32(0, v); }
  @$pb.TagNumber(1)
  $core.bool hasGoId() => $_has(0);
  @$pb.TagNumber(1)
  void clearGoId() => clearField(1);
}

