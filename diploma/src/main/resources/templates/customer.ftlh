<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Страница водителя</title>
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
<h1>Страница водителя</h1>
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

<br>
<table>
    <tr>
        <th>ID </th>
        <th>Дата добавления</th>
        <th>Количество</th>
        <th>Имя водителя</th>
        <th>Название автомобиля</th>
<#list  customer.orders as order>
    <tr>
        <td>${order.id}</td>
        <td>${order.order_date}</td>
        <td>${order.quantity}</td>
        <td>${order.customer.name}</td>


        <td><a href="/product/${order.product.id}">
                ${order.product.description}
            </a>
        </td>


        <td>

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