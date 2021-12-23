<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Страница заказа</title>
</head>
<body>
<h1>Страница заказа</h1>
<hr size=3px width=500px align="left">
<h1>${order.id}</h1>
<br>

<form method="post" action="/orders/${order.id}/update">
    <label>
        OrderId: <input name = "product-id" placeholder="${order.id}">
    </label>

    <input type="submit" value="Обновить">
</form>
<a href="/index.html">
    На главную
</a>

</body>
</html>