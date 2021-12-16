<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Страница автомобиля</title>
    <style>
        input {
            border: 3px solid #555;
        }
    </style>
</head>
<body>
<h1>Страница автомобиля</h1>
<hr size=3px width=500px align="left">
<h1>${product.description}</h1>
<br>
<form method="post" action="/products/${product.id}/update">
    <label>
        Id: <input name = "product-id" placeholder="${product.id}">
    </label>
    <label>
        Название: <input name = "description" placeholder="${product.description}">
    </label>
    <label>
        Цена: <input name = "price" placeholder="${product.price}">
    </label>
    <label>
        Количество: <input name = "quantity" placeholder="${product.quantity}">
    </label>
    <input type="submit" value="Обновить">
</form>
<a href="/index.html">
    На главную
</a>

</body>
</html>