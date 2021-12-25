<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="style.css">
<title>Drivers list</title>
<style>
table {
    width: 100%;
    margin-bottom: 20px;
    border: 5px solid #fff;
    border-top: 5px solid #fff;
    border-bottom: 3px solid #fff;
    border-collapse: collapse;
    outline: 3px solid #ffd300;
    font-size: 15px;
    background: #fff!important;
}
th {
    font-weight: bold;
    padding: 7px;
    background: #ffd300;
    border: none;
    text-align: left;
    font-size: 15px;
    border-top: 3px solid #fff;
    border-bottom: 3px solid #ffd300;
}
td {
    padding: 7px;
    border: none;
    border-top: 3px solid #fff;
    border-bottom: 3px solid #fff;
    font-size: 15px;
}
tbody tr:nth-child(even){
    background: #f8f8f8!important;
}
input {
    border: 3px solid #555;
}
</style>
</head>
<body>
<h1>Вход в систему</h1>
<form method="post" action="/signin">

<label>Логин:
<input type="text" name="nick" placeholder="Логин">
</label>
<label>Пароль:
<input type="password" name="password" placeholder="Пароль">
</label>
<input type="submit" value="Войти">
</form>
<br>

</body>
</html>