--запрос для создания таблицы с автомобилями
create table product
(
    id serial primary key,
    description varchar(128),
    price float,
    quantity int
);
--создание таблицы с покупателями
create table customer
(
    id serial primary key ,
    name varchar(128)
);
--создание таблицы со списком заказов
create table orders
(
    product_id integer,
    customer_id integer,
    order_date date,
    quantity integer,
    foreign key (product_id) references product(id),
    foreign key (customer_id) references customer(id)

);
--добавляем записи в таблицу с автомобилями
insert into product (description, price, quantity) values ('Renault Logan', 345000.00, 1);
insert into product (description, price, quantity) values ('Renault Duster', 745000.00, 2);
insert into product (description, price, quantity) values ('Renault Laguan', 945000.00, 4);
--добавляем записи в таблицу с покупателями
insert into customer (name) values ('Алексей');
insert into customer (name) values ('Михаил');
insert into customer (name) values ('Иван');
insert into customer (name) values ('Даниил');
insert into customer (name) values ('Михаил');
--добавляем записи в таблицу с заказами
insert into orders (product_id, customer_id, order_date, quantity) values (1, 1, current_date, 1);
insert into orders (product_id, customer_id, order_date, quantity) values (1, 2, current_date, 1);
insert into orders (product_id, customer_id, order_date, quantity) values (2, 1, current_date, 1);
insert into orders (product_id, customer_id, order_date, quantity) values (2, 3, current_date, 1);
insert into orders (product_id, customer_id, order_date, quantity) values (2, 1, current_date, 1);
insert into orders (product_id, customer_id, order_date, quantity) values (4, 3, current_date, 1);




