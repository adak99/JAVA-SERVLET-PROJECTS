<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
        <style>
            body {
                display: flex;
                justify-content: center;
                align-items: center;
                margin: 0;
                height: 100vh;
                font-family: 'Roboto', sans-serif;
                background-color: #f0f4f7;
            }

            .container {
                background-color: #ffffff;
                border-radius: 10px;
                box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
                width: 400px;
                padding: 20px;
                text-align: center;
            }

            .container h1 {
                color: #333333;
                margin-bottom: 20px;
            }

            form {
                display: flex;
                flex-direction: column;
                align-items: center;
            }

            form label {
                font-weight: bold;
                color: #555555;
                align-self: flex-start;
                margin-bottom: 5px;
            }

            form input[type="text"],
            form input[type="email"] {
                width: 100%;
                padding: 10px;
                margin-bottom: 20px;
                border: 1px solid #dddddd;
                border-radius: 5px;
                transition: border-color 0.3s;
            }

            form input[type="text"]:focus,
            form input[type="email"]:focus {
                border-color: #007bff;
                outline: none;
            }

            .submit input[type="submit"] {
                background-color: #007bff;
                color: white;
                border: none;
                padding: 10px 20px;
                border-radius: 5px;
                cursor: pointer;
                transition: background-color 0.3s;
            }

            .submit input[type="submit"]:hover {
                background-color: #0056b3;
            }
        </style>
    </head>

    <body>
        <div class="container">
            <div class="container-form">
                <h1>Log in</h1>
                <form action="./data_input" method="post" onsubmit="return validateForm()">
                    <label class="name">Name</label>
                    <input type="text" id="nameInput" name="nameInput" placeholder="Enter your name" required />
                    <label class="age">Age</label>
                    <input type="text" id="ageInput" name="ageInput" placeholder="Enter your age" required />
                    <label class="email">Email</label>
                    <input type="email" id="emailInput" name="emailInput" placeholder="Enter your email" required />
                    <label class="number">Mobile Number</label>
                    <input type="text" id="mobileInput" name="mobileInput" placeholder="Enter your mobile number"
                        required />
                    <div class="submit">
                        <input type="submit" value="Submit" />
                    </div>
                </form>
            </div>
        </div>

        <script>
            function validateForm() {
                const name = document.getElementById("nameInput").value;
                const age = parseInt(document.getElementById("ageInput").value);
                const email = document.getElementById("emailInput").value;
                const number = document.getElementById("mobileInput").value;

                if (!name || !age || !email || !number) {
                    alert("Please fill in all fields.");
                    return false;
                }

                // Additional validation can be added here, such as checking the format of email or mobile number

                return true;
            }
        </script>
    </body>

    </html>