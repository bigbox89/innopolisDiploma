<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="style.css">
    <title>Parts list</title>
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

<h1>Список запчастей</h1>
<h1>Добавление запчасти</h1>
<form method="post" action="/parts">
    <label>Марка автомобиля:
    </label>
    <select name = "product_id">
        <#list products as key, value>
            <option value="${key}">${value}</option>
        </#list>
    </select>
    <label>Описание:
        <input type="text" name="description" placeholder="Описание запчасти">
    </label>
    <label>Цена:
        <input type="text" name="price" placeholder="Цена запчасти">
    </label>
    <label>Количество:
        <input type="text" name="quantity" placeholder="Количество запчастей">
    </label>
    <input type="submit" value="Добавить">
</form>
<br>
<table>
    <tr>
        <th>ID запчасти</th>
        <th>Автомобиль</th>
        <th>Описание</th>
        <th>Цена</th>
        <th>Количество</th>

    </tr>
    <#list  parts as part>
        <tr>
            <td>${part.id}</td>
            <td>${part.product.description}</td>
            <td>${part.description}</td>
            <td>${part.price}</td>
            <td>${part.quantity}</td>

            <td>
                <form method="post" action="/parts/${part.id}/delete"}>
                    <input type="submit" value="Удалить">
                </form>
            </td>
            <td>
                <form method="get" action="/part/${part.id}"}>
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