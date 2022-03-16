<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Страница автомобиля</title>
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
<br>
<h1>Доступные запчасти</h1>
<table>
    <tr>
        <th>ID запчасти</th>
        <th>Автомобиль</th>
        <th>Описание</th>
        <th>Цена</th>
        <th>Количество</th>

    </tr>
    <#list  product.parts as part>
        <tr>
            <td>${part.id}</td>
            <td>${part.product.description}</td>
            <td>${part.description}</td>
            <td>${part.price}</td>
            <td>${part.quantity}</td>

        </tr>
    </#list>
</table>
<a href="/index.html">
    На главную
</a>

</body>
</html>