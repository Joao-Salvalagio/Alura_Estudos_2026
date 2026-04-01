import 'package:flutter/material.dart';

class VooScreen extends StatefulWidget {
  const VooScreen({super.key});

  @override
  State<VooScreen> createState() => _VooScreenState();
}

class _VooScreenState extends State<VooScreen> {
  TextEditingController destinoController = TextEditingController();
  TextEditingController passageiroController = TextEditingController();
  TextEditingController dataController = TextEditingController();
  String resultado = "";

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: getAppBar(),
      body: Column(
        children: [
          getTextField("Destino", destinoController),
          getTextField("Passageiro", passageiroController),
          getTextField("Data", dataController),
          getButton("Confirmar Reserva", processarDados),
          Text(resultado)
        ],
      ),
    );
  }
  AppBar getAppBar(){
    return AppBar(
      backgroundColor: Colors.white,
      foregroundColor: Colors.black,
      title: Center(child: Text("Reserva de voo")),
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
    return SizedBox(
      width: double.infinity,
      child: FloatingActionButton(
        onPressed: onPressed,
        child: Text(label),
        ),
    );
  }

  void processarDados(){
    String destino = destinoController.text;
    String passageiro = passageiroController.text;
    String data = dataController.text;

    setState(() {
      resultado = "Destino: $destino, Passageiro: $passageiro, Data: $data";
    });
  }
}