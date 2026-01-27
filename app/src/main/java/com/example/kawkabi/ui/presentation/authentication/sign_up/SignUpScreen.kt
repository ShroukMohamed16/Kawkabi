package com.example.kawkabi.ui.presentation.authentication.sign_up

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kawkabi.R
import com.example.kawkabi.design_system.Theme
import com.example.kawkabi.design_system.components.button.Button
import com.example.kawkabi.design_system.components.button.PrimaryButton
import com.example.kawkabi.design_system.components.text.Text
import com.example.kawkabi.design_system.components.text_field.AppTextField
import com.example.kawkabi.ui.presentation.authentication.components.AuthBackground

@Composable
fun SignUpScreen() {

}


@Composable
fun SignUpContent(
    modifier: Modifier = Modifier
) {
    AuthBackground {
        LazyColumn(
            modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp)
                .padding(top = 60.dp)
        ) {
            item {
                Text(
                    text = "Create Account",
                    color = Theme.color.primary500,
                    style = Theme.textStyle.headerMedium.bold,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center

                )
            }
            item {
                Text(
                    text = "Please fill the details and create account",
                    color = Theme.color.natural700,
                    style = Theme.textStyle.title.regular,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp),
                    textAlign = TextAlign.Center

                )
            }
            item {
                AppTextField(
                    value = "",
                    onValueChanged = {},
                    hint = "Enter your name",
                    title = "Name",
                    modifier = Modifier.padding(top = 24.dp)

                )
            }
            item {
                AppTextField(
                    value = "",
                    onValueChanged = {},
                    hint = "Enter your email",
                    title = "Email",
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Email
                    ),
                    modifier = Modifier.padding(top = 24.dp)

                )
            }
            item {
                AppTextField(
                    value = "",
                    onValueChanged = {},
                    hint = "Enter your password",
                    title = "Password",
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Password
                    ),
                    trailingIcon = painterResource(R.drawable.ic_eye_slash),
                    visualTransformation = PasswordVisualTransformation(),
                    modifier = Modifier.padding(top = 24.dp)

                )
            }
            item {
                AppTextField(
                    value = "",
                    onValueChanged = {},
                    hint = "Enter confirm password",
                    title = "Confirm Password",
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Password
                    ),
                    trailingIcon = painterResource(R.drawable.ic_eye_slash),
                    visualTransformation = PasswordVisualTransformation(),
                    modifier = Modifier.padding(top = 24.dp)
                )
            }
            item {
                PrimaryButton(
                    text = "Sign Up",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 84.dp),
                    onClick = {}
                )

            }
            item {
                Text(
                    text = "Already have an account? Log In",
                    color = Theme.color.natural700,
                    style = Theme.textStyle.title.regular,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 24.dp),
                    textAlign = TextAlign.Center
                )
            }


        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SignUpContent()
}