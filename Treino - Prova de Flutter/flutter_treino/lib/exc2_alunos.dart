import 'package:flutter/material.dart';

class AlunoScreen extends StatefulWidget {
  const AlunoScreen({super.key});

  @override
  State<AlunoScreen> createState() => _AlunoScreenState();
}

class _AlunoScreenState extends State<AlunoScreen> {
  TextEditingController nomeController = TextEditingController();
  TextEditingController cursoController = TextEditingController();
  TextEditingController semestreController = TextEditingController();
  String resultado = "";

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: getAppBar(),
      body: Column(
        children: [
          getTextField("Nome", nomeController),
          getTextField("Curso", cursoController),
          getTextField("Semestre", semestreController),
          Padding(
            padding: const EdgeInsets.all(10.0),
            child: getButton("Matricular", processarDados),
          ),
          Text(resultado)
        ],
      ),
    );
  }

  Widget getTextField(String label, TextEditingController controller){
      return TextField(
        controller: controller,
        decoration: InputDecoration(
          labelText: label
        ),
      );
  }

  Widget getButton(String label, Function() onPressed){
    return 
    SizedBox(
      width: double.infinity,
      child: FloatingActionButton(onPressed: onPressed, 
      child: Text(label)
      ),
    );
  }

  void processarDados(){
    String nome = nomeController.text;
    String curso = cursoController.text;
    String semestre = semestreController.text;

    setState(() {
       resultado = "Nome: $nome\nCurso: $curso\nSemestre: $semestre";
    });
  }

  AppBar getAppBar(){
    return AppBar(
      backgroundColor: Colors.deepOrange,
      foregroundColor: Colors.white,
      title: Center(child: Text("Cadastro de Alunos")),
    );
  }
}