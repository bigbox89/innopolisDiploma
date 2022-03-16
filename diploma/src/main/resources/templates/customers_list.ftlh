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
<h1>Добавление водителя</h1>
<form method="post" action="/customers">
    <label>Имя:
        <input type="text" name="name" placeholder="Имя">
    </label>
    <input type="submit" value="Добавить">
</form>
<h1>Список водителей</h1>

<br>
<table>
    <tr>
        <th>ID</th>
        <th>Имя</th>
        <th>Действия</th>
    </tr>
    <#list  customers as customer>
        <tr>
            <td>${customer.id}</td>

            <td><a href="/customer/${customer.id}">
                    ${customer.name}
            </a>

            </td>
            <td>
                <form method="post" action="/customers/${customer.id}/delete"}>
                    <input type="submit" value="Удалить">
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