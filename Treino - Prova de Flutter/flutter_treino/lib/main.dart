import 'package:flutter/material.dart';
import 'package:flutter_treino/exc1_pecas.dart';
import 'package:flutter_treino/exc2_alunos.dart';
import 'package:flutter_treino/exc3_livros.dart';
import 'package:flutter_treino/exc4_voo.dart';
import 'package:flutter_treino/exc5_restaurante.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        colorScheme: .fromSeed(seedColor: Colors.deepPurple),
      ),
      home: RestauranteScreen(),
    );
  }
}