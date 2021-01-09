create table Orders (
    id int8 generated by default as identity, 
    latitude float8, 
    longitude float8, 
    moment TIMESTAMP WITHOUT TIME ZONE, 
    status int4, 
    address VARCHAR(255)
    primary key (id)
);

create table Orders_Products (
    order_id int8 not null, 
    product_id int8 not null, 
    primary key (order_id, product_id)
);

create table Products (
    id int8 generated by default as identity, 
    description TEXT, 
    image_url varchar(255), 
    name varchar(100), 
    price float8, 
    primary key (id)
);

alter table if exists Orders_Products add constraint fk_orders_products_products
foreign key (product_id) references Products;

alter table if exists Orders_Products add constraint fk_Orders_Products_Orders
foreign key (order_id) references Orders;