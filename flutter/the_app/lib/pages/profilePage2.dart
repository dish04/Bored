import 'package:flutter/material.dart';

class UserProfilePage extends StatefulWidget {
  @override
  _UserProfilePageState createState() => _UserProfilePageState();
}

class _UserProfilePageState extends State<UserProfilePage> {
  // Replace with actual user data or logic to fetch data from API
  String username = "John Doe";
  String status = "Available";
  String bio = "Cool bio goes here!";
  String profilePictureUrl =
      "https://placeimg.com/64/64/people"; // Placeholder image

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Profile"),
        // Add leading and trailing icons for back button and settings if needed
      ),
      body: SingleChildScrollView(
        // Handle scrolling for longer profiles
        child: Column(
          children: [
            // Profile picture and status
            Row(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                Container(
                  width: 100.0,
                  height: 100.0,
                  decoration: BoxDecoration(
                    shape: BoxShape.circle,
                    image: DecorationImage(
                      image: NetworkImage(profilePictureUrl),
                      fit: BoxFit.cover,
                    ),
                  ),
                ),
                SizedBox(width: 16.0),
                Text(
                  status,
                  style: TextStyle(
                    fontSize: 14.0,
                    fontWeight: FontWeight.w500,
                    color: status == "Available" ? Colors.green : Colors.red,
                  ),
                ),
              ],
            ),
            SizedBox(height: 20.0),

            // Username and bio
            Text(
              username,
              style: TextStyle(
                fontSize: 20.0,
                fontWeight: FontWeight.bold,
              ),
              textAlign: TextAlign.center,
            ),
            SizedBox(height: 8.0),
            Text(
              bio,
              style: TextStyle(
                fontSize: 16.0,
              ),
              textAlign: TextAlign.center,
            ),
            SizedBox(height: 20.0),

            // Additional sections based on your requirements
            // - Activity list (e.g., recent posts, comments, etc.)
            // - Friend list (if applicable)
            // - Edit profile button
            // - Other actions or information specific to your app
          ],
        ),
      ),
    );
  }
}
