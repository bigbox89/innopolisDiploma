<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Страница пользователя</title>
</head>
<body>
<h1>Страница пользователя</h1>
<hr size=3px width=500px align="left">
<h1>${customer.name}</h1>
<br>
<form method="post" action="/customers/${customer.id}/update">
    <label>
        Id: <input name = "customer-id" placeholder="${customer.id}">
    </label>
    <label>
        Имя: <input name = "name" placeholder="${customer.name}">
    </label>
    <input type="submit" value="Обновить">
</form>
<a href="/index.html">
    На главную
</a>

</body>
</html>