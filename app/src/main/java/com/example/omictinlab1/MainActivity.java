package com.example.omictinlab1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView appNameTextView, nameTextView, emailTextView, phoneTextView,
            addressTextView, skillsTextView, aboutTextView, githubTextView;
    private EditText nameEditText, emailEditText, phoneEditText, addressEditText,
            skillsEditText, aboutEditText;
    private Button saveButton;
    private WebView githubWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        appNameTextView = findViewById(R.id.appNameTextView);
        nameTextView = findViewById(R.id.nameTextView);
        emailTextView = findViewById(R.id.emailTextView);
        phoneTextView = findViewById(R.id.phoneTextView);
        addressTextView = findViewById(R.id.addressTextView);
        skillsTextView = findViewById(R.id.skillsTextView);
        aboutTextView = findViewById(R.id.aboutTextView);
        githubTextView = findViewById(R.id.githubTextView);

        nameEditText = findViewById(R.id.nameEditText);
        emailEditText = findViewById(R.id.emailEditText);
        phoneEditText = findViewById(R.id.phoneEditText);
        addressEditText = findViewById(R.id.addressEditText);
        skillsEditText = findViewById(R.id.skillsEditText);
        aboutEditText = findViewById(R.id.aboutEditText);

        saveButton = findViewById(R.id.saveButton);

        // WebView setup
        githubWebView = findViewById(R.id.githubWebView);
        WebSettings webSettings = githubWebView.getSettings();
        webSettings.setJavaScriptEnabled(true); // Enable JavaScript (if needed)
        githubWebView.setWebViewClient(new WebViewClient()); // Open links in the WebView itself

        // Set onClickListener for saveButton
        saveButton.setOnClickListener(v -> {
            saveData();
        });

        // Set onClickListener for githubTextView to show GitHub profile in WebView
        githubTextView.setOnClickListener(v -> {
            openGitHubProfile();
        });
    }

    private void saveData() {
        // Replace with code to save data from EditText fields
        String name = nameEditText.getText().toString().trim();
        String email = emailEditText.getText().toString().trim();
        String phone = phoneEditText.getText().toString().trim();
        String address = addressEditText.getText().toString().trim();
        String skills = skillsEditText.getText().toString().trim();
        String about = aboutEditText.getText().toString().trim();

        // Example: Display a toast message with the saved data (for demonstration)
        String message = "Name: " + name + "\nEmail: " + email + "\nPhone: " + phone +
                "\nAddress: " + address + "\nSkills: " + skills + "\nAbout: " + about;
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    private void openGitHubProfile() {
        // Replace "your_username" with your actual GitHub username or repository URL
        String githubUrl = "https://github.com/TrishaTyne";

        // Load GitHub profile URL in WebView
        githubWebView.setVisibility(View.VISIBLE); // Make WebView visible
        githubWebView.loadUrl(githubUrl);
    }
}
