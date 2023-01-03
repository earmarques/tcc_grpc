///
//  Generated code. Do not modify.
//  source: aluno.proto
//
// @dart = 2.12
// ignore_for_file: annotate_overrides,camel_case_types,constant_identifier_names,deprecated_member_use_from_same_package,directives_ordering,library_prefixes,non_constant_identifier_names,prefer_final_fields,return_of_invalid_type,unnecessary_const,unnecessary_import,unnecessary_this,unused_import,unused_shown_name

import 'dart:core' as $core;
import 'dart:convert' as $convert;
import 'dart:typed_data' as $typed_data;
@$core.Deprecated('Use alunoIdDescriptor instead')
const AlunoId$json = const {
  '1': 'AlunoId',
  '2': const [
    const {'1': 'id', '3': 1, '4': 1, '5': 5, '10': 'id'},
  ],
};

/// Descriptor for `AlunoId`. Decode as a `google.protobuf.DescriptorProto`.
final $typed_data.Uint8List alunoIdDescriptor = $convert.base64Decode('CgdBbHVub0lkEg4KAmlkGAEgASgFUgJpZA==');
@$core.Deprecated('Use alunoDescriptor instead')
const Aluno$json = const {
  '1': 'Aluno',
  '2': const [
    const {'1': 'id', '3': 1, '4': 1, '5': 5, '10': 'id'},
    const {'1': 'nome', '3': 2, '4': 1, '5': 9, '10': 'nome'},
  ],
};

/// Descriptor for `Aluno`. Decode as a `google.protobuf.DescriptorProto`.
final $typed_data.Uint8List alunoDescriptor = $convert.base64Decode('CgVBbHVubxIOCgJpZBgBIAEoBVICaWQSEgoEbm9tZRgCIAEoCVIEbm9tZQ==');
@$core.Deprecated('Use alunosDescriptor instead')
const Alunos$json = const {
  '1': 'Alunos',
  '2': const [
    const {'1': 'alunos', '3': 1, '4': 3, '5': 11, '6': '.Aluno', '10': 'alunos'},
  ],
};

/// Descriptor for `Alunos`. Decode as a `google.protobuf.DescriptorProto`.
final $typed_data.Uint8List alunosDescriptor = $convert.base64Decode('CgZBbHVub3MSHgoGYWx1bm9zGAEgAygLMgYuQWx1bm9SBmFsdW5vcw==');
