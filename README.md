# Gestion de Inventario API

## Descripción
La **API de Gestion de Inventario ** es una API RESTful diseñada para gestionar diferentes entidades relacionadas con la mercadería, incluyendo empleados, proveedores, clientes, mercancías y recibos. Permite realizar operaciones de creación, lectura, actualización y eliminación (CRUD) en cada una de estas entidades.

## Características
- **Gestión de Empleados**: 
  - Crear, ver, actualizar y eliminar empleados ✓
  
- **Gestión de Proveedores**:
  - Crear, ver, actualizar y eliminar proveedores ✓

- **Gestión de Clientes**:
  - Crear, ver, actualizar y eliminar clientes ✓

- **Gestión de Mercancías**:
  - Crear, ver, actualizar y eliminar mercancías ✓

- **Gestión de Recibos Unitarios**:
  - Crear, ver, actualizar y eliminar recibos unitarios ✓

- **Gestión de Recibos Generales de Compra**:
  - Crear, ver, actualizar y eliminar recibos generales de compra ✓

- **Gestión de Recibos Generales de Venta**:
  - Crear, ver, actualizar y eliminar recibos generales de venta ✓

## Tecnologías
- **Spring Boot**: Framework para desarrollar aplicaciones web basadas en Java.
- **MySQL**: Sistema de gestión de bases de datos utilizado para almacenar y gestionar la información.
- **OpenAPI**: Especificación para la documentación y pruebas de la API.
- **Swagger**: Herramienta para la visualización y documentación interactiva de la API.


## Developers
- Juan David Rivero Romero
- Catalina Mulford Monroy

## Swagger
[Documentación Swagger](https://app.swaggerhub.com/apis-docs/JUANDARIVER1/GestionInventario/1.0.0)

## Estructura de las Tablas

### Empleado
```sql
CREATE TABLE Empleado (
    id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    identificacion INT NOT NULL,
    rol VARCHAR(35) NOT NULL,
    fecha_nacimiento DATE
);
```

### Proveedor
```sql
CREATE TABLE Proveedor (
    id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    nombre VARCHAR(55) NOT NULL,
    numero_contacto INT NOT NULL,
    nombre_contacto VARCHAR(35) NOT NULL,
    direccion INT NOT NULL
);
```

### Cliente
```sql
CREATE TABLE Cliente (
    id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    identificacion INT NOT NULL
);
```

### Mercancia
```sql
CREATE TABLE Mercancia (
    id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    numero_serie INT NOT NULL,
    precio_compra DECIMAL(10,2) NOT NULL,
    precio_venta DECIMAL(10,2) NOT NULL
);
```

### Recibo Unitario
```sql
CREATE TABLE Recibo_Unitario (
    id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    id_mercancia INT NOT NULL,
    FOREIGN KEY (id_mercancia) REFERENCES Mercancia(id),
    precio_unidad DECIMAL(10,2) NOT NULL,
    cantidad INT NOT NULL,
    fecha_pedido DATE NOT NULL
);
```

### Recibo General de Compra
```sql
CREATE TABLE Recibo_General_Compra (
    id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    id_empleado INT NOT NULL,
    FOREIGN KEY (id_empleado) REFERENCES Empleado(id),
    id_proveedor INT NOT NULL,
    FOREIGN KEY (id_proveedor) REFERENCES Proveedor(id),
    id_recibo_unitario INT NOT NULL,
    FOREIGN KEY (id_recibo_unitario) REFERENCES Recibo_Unitario(id),
    precio_total DECIMAL(10,2) NOT NULL,
    forma_pago VARCHAR(25) NOT NULL,
    fecha_compra DATE NOT NULL
);
```

### Recibo General de Venta
```sql
CREATE TABLE Recibo_General_Venta (
    id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    id_empleado INT NOT NULL,
    FOREIGN KEY (id_empleado) REFERENCES Empleado(id),
    id_cliente INT NOT NULL,
    FOREIGN KEY (id_cliente) REFERENCES Cliente(id),
    id_recibo_unitario INT NOT NULL,
    FOREIGN KEY (id_recibo_unitario) REFERENCES Recibo_Unitario(id),
    precio_total DECIMAL(10,2) NOT NULL,
    forma_pago VARCHAR(25) NOT NULL,
    fecha_compra DATE NOT NULL
);
```
