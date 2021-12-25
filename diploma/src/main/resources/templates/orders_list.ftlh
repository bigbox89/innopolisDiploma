<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="style.css">
    <title>Orders list</title>
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

<h1>Гараж</h1>

<h1>Добавление автомобилей</h1>
<form method="post" action="/addorders">
    <label>Марка автомобиля:
    </label>
    <select name = "product_id">
        <#list products as key, value>
            <option value="${key}">${value}</option>
        </#list>
    </select>
    <label>Выбор водителя:
    </label>
    <select name = "customer_id">
        <#list customers as key, value>
            <option value="${key}">${value}</option>
        </#list>
    </select>
    <label>Количество:
        <input type="text" name="quantity" placeholder="Количество">
    </label>
    <input type="submit" value="Добавить">
</form>
<br>
<br>
<table>
    <tr>
        <th>ID заказа</th>
        <th>Дата добавления</th>
        <th>Количество</th>
        <th>Имя водителя</th>
        <th>Название автомобиля</th>
    </tr>
    <#list  orders as order>
        <tr>
            <td>${order.id}</td>
            <td>${order.order_date}</td>
            <td>${order.quantity}</td>
            <td><a href="/customer/${order.customer.id}">
                    ${order.customer.name}
                </a>
            </td>
            <td><a href="/product/${order.product.id}">
                    ${order.product.description}
                </a>
            </td>

            <td>
                <form method="post" action="/orders/${order.id}/delete"}>
                    <input type="submit" value="Удалить">
                </form>
            </td>
            <td>
                <form method="get" action="/order/${order.id}"}>
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