import 'package:flutter/material.dart';
import 'package:the_app/pages/homePage.dart';

void main() {
  runApp(MySocialMediaApp());
}

class MySocialMediaApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        title: 'The Social Media App',
        theme: ThemeData(
          primarySwatch: Colors.blue,
        ),
        //home: UserProfilePage());
        debugShowCheckedModeBanner: false,
        home: MyHomePage());
  }
}
