
package com.example.loginapplication;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

private EditText eName;
private EditText ePassword;
private Button eLogin;
private TextView eAttemptsInfo;

private String Username = "Admin";
private String Password = "1234";


boolean isValid = false;
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCrate(savedInstanceState);
    setContentView(R.layout.activity_main);

    eName = findViewById(R.id.etName);
    ePassword = findViewById(R.id.etPassword);
    eLogin = findViewById(R.id.btnLogin);
    eAttemptsInfo = findViewById(R.id.tvAttemptsInfo);

    eLogin.setOnClickListener(new.View.OnClickListener() {
        @Override
         public void onClick(View v) {

            String inputName = eName.getText().toString();
            String inputPassword = ePassword.getText().toString();

            if(inputName.isEmpty() || inputPassword.isEmpty())
            {
                Toast.makeText(this, "Incorrect credentials entered!", Toast.LENGTH_SHORT).show();

                if(counter == 0){
                    eLogin.setEnabled(false);
                }

            }else{
            isValid = validate(inputName, inputPassword)

                    if(!isValid){
                        counter--;
                    }
            }else{
                Toast.makeText(this, "Login Successful!", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, HomePage.class);
                startActivity(Intent);
            }
        }

    }
}
    private boolean validate(String name, String password){
    if(name.equals(Username) && password.equals(Password)){
        return true;
    }
    return false;
}
}