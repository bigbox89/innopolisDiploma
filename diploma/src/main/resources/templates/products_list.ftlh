<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="style.css">

    <title>Products list</title>
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
<h1>Добавление автомобиля</h1>
<form method="post" action="/products">
    <label>Марка автомобиля:
        <input type="text" name="description" placeholder="Описание">
    </label>
    <label>Цена:
        <input type="text" name="price" placeholder="Цена">
    </label>
    <label>Количество:
        <input type="text" name="quantity" placeholder="Количество">
    </label>
    <input type="submit" value="Добавить">
</form>

<h1>Список автомобилей</h1>

<br>
<table>
    <tr>
        <th>ID</th>
        <th>Описание</th>
        <th>Цена</th>
        <th>Количество</th>
        <th>Действия</th>
    </tr>
    <#list  products as product>
        <tr>
            <td>${product.id}</td>

            <td><a href="/product/${product.id}">
                    ${product.description}
                </a>
            </td>

            <td>${product.price}</td>
            <td>${product.quantity}</td>
            <td>
                <form method="post" action="/products/${product.id}/delete"}>
                    <input type="submit" value="Удалить">
                </form>
            </td>
            <td>
                <form method="get" action="/product/${product.id}"}>
                    <input type="submit" value="Редактировать">
                </form>
            </td>
        </tr>
    </#list>
</table>
<br>
<a href="/index.html">
    На главную
</a>

</body>
</html>