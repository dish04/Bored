import 'package:flutter/material.dart';

class ProfilePage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Profile'),
      ),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.center,
          children: [
            CircleAvatar(
              radius: 80,
              backgroundImage: AssetImage(
                  'assets/profile_image.jpg'), // Replace with the actual image path
            ),
            SizedBox(height: 16),
            Text(
              'Username',
              style: TextStyle(
                fontSize: 24,
                fontWeight: FontWeight.bold,
              ),
            ),
            SizedBox(height: 8),
            Text(
              'user#1234',
              style: TextStyle(
                color: Colors.grey,
              ),
            ),
            SizedBox(height: 24),
            ListTile(
              leading: Icon(Icons.mail),
              title: Text('user@example.com'),
            ),
            ListTile(
              leading: Icon(Icons.location_on),
              title: Text('City, Country'),
            ),
            SizedBox(height: 24),
            ElevatedButton(
              onPressed: () {
                // Add functionality for editing the profile
              },
              child: Text('Edit Profile'),
            ),
          ],
        ),
      ),
    );
  }
}
