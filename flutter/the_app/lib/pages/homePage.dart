import 'package:flutter/material.dart';
import 'package:the_app/pages/profilePage.dart';

class MyHomePage extends StatefulWidget {
  @override
  _MyHomePageState createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(
          'THE APP',
          style: TextStyle(color: Colors.white70, fontWeight: FontWeight.w500),
        ),
        backgroundColor: Colors.transparent,
      ),
      body: PostFeed(),
      backgroundColor: Colors.white10,
      bottomNavigationBar: BottomNavigationBar(
        backgroundColor: Colors.black12,
        onTap: (index) {
          // Handle tap on BottomNavigationBar items
        },
        items: [
          BottomNavigationBarItem(
            icon: Icon(Icons.home),
            label: '',
          ),
          BottomNavigationBarItem(
            icon: Icon(Icons.search),
            label: '',
          ),
          BottomNavigationBarItem(
            icon: Icon(Icons.add),
            label: '',
          ),
        ],
        unselectedItemColor: Colors.white70,
        currentIndex: 1,
        selectedItemColor: Colors.grey[900],
      ),
    );
  }
}

class PostFeed extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    // Implement your post feed logic here
    return ListView.builder(
      itemCount: 10, // Replace with the actual number of posts
      itemBuilder: (context, index) {
        return Card(
          color: Colors.white24,
          margin: EdgeInsets.all(8.0),
          child: ListTile(
            title: Text(
              'Post $index',
              style: TextStyle(
                color: Colors.white70, // Set the text color here
                fontSize: 16, // Optional: Set the font size
                fontWeight: FontWeight.bold, // Optional: Set the font weight
              ),
            ),
            subtitle: Text(
              'This is the content of post $index',
              style: TextStyle(
                color: Colors.white70, // Set the text color here
                fontSize: 16, // Optional: Set the font size
                fontWeight: FontWeight.w200, // Optional: Set the font weight
              ),
            ),
            // Add more details like user profile picture, time, etc.
          ),
        );
      },
    );
  }
}
