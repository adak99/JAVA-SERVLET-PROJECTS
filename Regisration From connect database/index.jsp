<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Registration Form</title>
    <style>
      body {
        font-family: Arial, sans-serif;
        background-color: #f2f2f2;
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
      }
      .container {
        background-color: #fff;
        padding: 20px;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        width: 300px;
      }
      h1 {
        text-align: center;
        color: #333;
      }
      form {
        display: flex;
        flex-direction: column;
      }
      p {
        margin: 10px 0 5px;
        color: #666;
      }
      input[type="text"],
      input[type="submit"] {
        padding: 10px;
        border: 1px solid #ccc;
        border-radius: 5px;
        font-size: 14px;
        margin-bottom: 10px;
      }
      input[type="submit"] {
        background-color: #4caf50;
        color: white;
        cursor: pointer;
        border: none;
      }
      input[type="submit"]:hover {
        background-color: #45a049;
      }
    </style>
  </head>
  <body>
    <div class="container">
      <h1>Registration Form</h1>
      <form action="./userInput" method="Post">
        <p>ID</p>
        <input type="text" name="id" />
        <p>Name</p>
        <input type="text" name="name" />
        <p>Age</p>
        <input type="text" name="age" />
        <p>Email id</p>
        <input type="text" name="email" />
        <p>Mobile Number</p>
        <input type="text" name="number" />
        <br />
        <input type="submit" />
      </form>
    </div>
  </body>
</html>
