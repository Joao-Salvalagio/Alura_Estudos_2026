import 'dart:ffi';

import 'package:flutter/material.dart';

class RestauranteScreen extends StatefulWidget {
  const RestauranteScreen({super.key});

  @override
  State<RestauranteScreen> createState() => _RestauranteScreenState();
}

class _RestauranteScreenState extends State<RestauranteScreen> {
  TextEditingController pratoController = TextEditingController();
  TextEditingController bebidaController = TextEditingController();
  TextEditingController mesaController = TextEditingController();

  String resultado = "";
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: getAppBar(),
      body: Column(
        children: [
          getTextField("Prato", pratoController),
          getTextField("Bebida", bebidaController),
          getTextField("Mesa", mesaController),
          getButton("Fazer Pedido", processarDados),
          Text(resultado)
        ],
      ),
    );
  }

  AppBar getAppBar(){
    return AppBar(
      backgroundColor: Colors.red,
      foregroundColor: Colors.white,
      title: Center(child: Text("Pedido de Restaurante")),
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
    return SizedBox(
      width: double.infinity,
      child: FloatingActionButton(
        onPressed: onPressed,
        child: Text(label)
        ),
    );
  }

  void processarDados(){
    String prato = pratoController.text;
    String bebida = bebidaController.text;
    String mesa = mesaController.text;

    setState(() {
      resultado = "Prato: $prato\nBebida: $bebida\n Mesa: $mesa";
    });
  }
}