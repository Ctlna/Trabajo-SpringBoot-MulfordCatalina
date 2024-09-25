create database ManejoMercancias;
use ManejoMercancias;

create table Empleado(
	id int primary key auto_increment not null,
	nombre VARCHAR(100) not null,
    identificacion int not null,
    rol VARCHAR(35) not null,
    fecha_nacimiento date
);

create table Proveedor(
	id int primary key auto_increment not null,
	nombre VARCHAR(55) not null,
    numero_contacto int not null,
    rol VARCHAR(35) not null,
    direccion int not null
);

create table Cliente(
	id int primary key auto_increment not null,
	nombre VARCHAR(100) not null not null,
    identificacion int not null
);

create table Mercancia(
	id int primary key auto_increment not null,
	nombre VARCHAR(100) not null not null,
    numero_serie int not null,
    precio_compra int not null,
    precio_venta int not null
);

create table Recibo_Unitario(
    id int primary key auto_increment not null,
    id_mercancia int not null,
    foreign key (id_mercancia) references Mercancia(id),
    precio_unidad int not null,
    cantidad int not null,
    fecha_pedido date not null
);

create table Recibo_General_Compra(
    id int primary key auto_increment not null,
    id_empleado int not null,
    foreign key (id_empleado) references Empleado(id),
    id_proveedor int not null,
    foreign key (id_proveedor) references Proveedor(id),
    id_recibo_unitario int not null,
    foreign key (id_recibo_unitario) references Recibo_Unitario(id),
    precio_total int not null,
    forma_pago VARCHAR(25) not null,
    fecha_compra date not null
);

create table Recibo_General_Venta(
    id int primary key auto_increment not null,
    id_empleado int not null,
    foreign key (id_empleado) references Empleado(id),
    id_cliente int not null,
    foreign key (id_cliente) references Cliente(id),
    id_recibo_unitario int not null,
    foreign key (id_recibo_unitario) references Recibo_Unitario(id),
    precio_total int not null,
    forma_pago VARCHAR(25) not null,
    fecha_compra date not null
);