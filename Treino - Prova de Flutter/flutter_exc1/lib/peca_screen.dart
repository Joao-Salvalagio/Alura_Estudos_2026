import 'package:flutter/material.dart';

class PecaScreen extends StatefulWidget {
  const PecaScreen({super.key});

  @override
  State<PecaScreen> createState() => _PecaScreenState();
}

class _PecaScreenState extends State<PecaScreen> {
  TextEditingController nomePecaController = TextEditingController();
  TextEditingController marcaController = TextEditingController();
  TextEditingController precoController = TextEditingController();
  String resultado = "";

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: getAppBar(),
      body: Column(
        children: [
          getTextField("Nome da Peça", nomePecaController),
          getTextField("Marca", marcaController),
          getTextField("Preço", precoController),
          getButton("Processar Dados", processarDados),
          SizedBox(height: 20),
          Text(resultado)
        ],
      ),
    );
  }
  AppBar getAppBar() {
    return AppBar(
      backgroundColor: Colors.amberAccent,
      foregroundColor: Colors.black,
      title: Center(child: Text("Cadastro de Peças")),
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

Widget getButton(String label, Function() aoPressionar){
  return SizedBox(
    width: double.infinity,
    child: FloatingActionButton(
      onPressed: aoPressionar,
      child: Text(label),
    ),
  );
}

void processarDados() {
  String nome = nomePecaController.text;
  String marca = marcaController.text;
  String preco = precoController.text;

  setState(() {
    resultado = "Peça: $nome\nMarca: $marca\nPreço: R\$ $preco";
  });
}
}

