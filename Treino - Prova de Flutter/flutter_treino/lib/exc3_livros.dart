import 'package:flutter/material.dart';

class LivroScreen extends StatefulWidget {
  const LivroScreen({super.key});

  @override
  State<LivroScreen> createState() => _LivroScreenState();
}

class _LivroScreenState extends State<LivroScreen> {
  TextEditingController tituloController = TextEditingController();
  TextEditingController autorController = TextEditingController();
  TextEditingController anoController = TextEditingController();
  String resultado = "";

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: getAppBar(),
      body: Column(
        children: [
          getTextField("Titulo", tituloController),
          getTextField("Autor", autorController),
          getTextField("Ano", anoController),
          Padding(
            padding: const EdgeInsets.all(10.0),
            child: getButton("Salvar Livro", processarDados),
          ),
          Text(resultado)
        ],
      ),
    );
  }

  AppBar getAppBar(){
    return AppBar(
      backgroundColor: Colors.amberAccent,
      foregroundColor: Colors.black,
      title: Center(child: Text("Cadastro de Livros")),
    );
  }

  Widget getTextField(String label, controller){
    return TextField(
      controller: controller,
      decoration: InputDecoration(
        labelText: label
      ),
    );
  }

  Widget getButton(String label, Function() onPressed){
    return SizedBox (
      width: double.infinity,
      child: FloatingActionButton(
        onPressed: onPressed, 
        child: Text(label),
        )
      );
  }

  void processarDados(){
    String titulo = tituloController.text;
    String autor = autorController.text;
    String ano = anoController.text;

    setState(() {
      resultado = "Titulo: $titulo\nAutor: $autor\nAno: $ano";
    });
  }
}