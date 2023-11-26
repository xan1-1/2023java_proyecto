# 2023java_proyecto
Proyecto lll cuatri
Descripción del Proyecto:
El proyecto consiste en desarrollar un sistema de gestión para una cadena de supermercados llamada "La Familia". Este sistema permitirá llevar un control detallado de los productos disponibles en las sucursales, su organización en los pasillos, las compras realizadas por los clientes y el retiro de productos caducados, además de generar diversos informes para la toma de decisiones. El proyecto se realiza en Java utilizando una interfaz gráfica basada en JOptionPane para la interacción con el usuario.
Clases del Proyecto:
1.	Producto: Esta clase representa un producto disponible en el supermercado. Almacena información como nombre, categoría, precio, existencias y fecha de caducidad.
2.	Categoria: Un enum que enumera las categorías posibles de productos, como Frescos, Granos, Carnicería, etc.
3.	Pasillo: Representa un pasillo de la tienda que puede contener hasta 10 productos. Se encarga de organizar los productos en su interior y permite retirarlos.
4.	Compra: Esta clase guarda información sobre una compra realizada por un cliente, incluyendo su nombre, cédula, los productos seleccionados y el monto total.
5.	Supermercado: La clase principal que coordina todas las operaciones. Lleva un registro de los productos disponibles, la organización de los pasillos, las compras realizadas y proporciona funcionalidades para los informes.
Funciones y Roles de Cada Parte del Código:
•	Producto: Almacena los detalles de cada producto en el supermercado, incluyendo su nombre, categoría, precio, existencias y fecha de caducidad.
•	Categoria (enum): Enumera las categorías de productos disponibles para ayudar a clasificar los productos.
•	Pasillo: Organiza productos en pasillos. Permite agregar y retirar productos, y verifica si un pasillo está lleno.
•	Compra: Registra las compras realizadas por los clientes, almacenando información como nombre, cédula, productos seleccionados y el monto total gastado.
•	Supermercado: Coordina todas las operaciones del sistema. Mantiene una lista de productos disponibles, pasillos, compras realizadas y proporciona funcionalidades para generar informes.
Roles de las Funcionalidades en el Menú Principal:
-	Registrar productos disponibles: Permite al usuario agregar nuevos productos con detalles como nombre, categoría, precio, existencias y fecha de caducidad.
-	Organizar producto en pasillo: Facilita la organización de un producto en un pasillo específico, especificando la posición deseada.
-	Realizar compra de productos: Permite a los clientes realizar compras, seleccionando productos y registrando sus detalles.
-	Retirar un producto: Permite retirar productos de los pasillos si las existencias son mayores a cero.
-	Módulo de reportes: Ofrece opciones para generar diferentes informes, como productos disponibles, organización de pasillos, productos cercanos a la fecha de caducidad y resumen de compras.
-	Salir: Finaliza la aplicación.
Posibles Desafíos y Soluciones:
•	Validación de Datos: Un desafío importante es garantizar que los datos ingresados por el usuario sean válidos. Las soluciones incluyen la validación de entradas y la manipulación de excepciones para manejar errores.
•	Manejo de Fechas: La gestión de fechas puede ser compleja. Se utilizan clases como SimpleDateFormat para convertir fechas ingresadas por el usuario en objetos Date.
•	Control de Existencias: Es importante garantizar que no se permita comprar más productos de los que están disponibles. Esto se logra mediante comprobaciones y validaciones en la lógica de compra.
•	Generación de Reportes: La generación de informes puede ser un desafío. Se utiliza la lógica de los métodos de la clase Supermercado para recopilar y presentar la información requerida en los informes.
•	Interfaz de Usuario: La interfaz se crea utilizando JOptionPane, que puede ser limitada en términos de personalización. Sin embargo, ofrece una forma sencilla de interactuar con el usuario.
Preguntas que podrían hacer:
¿Cuál es el propósito principal de este sistema de gestión de supermercados?
El propósito principal del sistema es permitir a la cadena de supermercados "La Familia" llevar un control detallado de los productos en sus sucursales, la organización de los pasillos, las compras de los clientes y el retiro de productos caducados. Además, se busca generar informes para la toma de decisiones gerenciales.

¿Cómo se organizan los productos en los pasillos del supermercado y cuántos productos se pueden colocar en cada pasillo?
Los productos se organizan en pasillos específicos, uno por cada categoría de productos. Cada pasillo puede contener hasta 10 productos. Los productos se organizan en posiciones dentro de los pasillos.

¿Cómo se valida la información ingresada por el usuario al registrar productos?
La validación se realiza asegurando que los datos ingresados sean coherentes y válidos. Por ejemplo, se verifica que el precio sea un número válido y que la fecha de caducidad sea una fecha válida.

¿Cómo se manejan las fechas de caducidad de los productos en el sistema?
Se utilizan objetos Date para representar las fechas de caducidad. La clase SimpleDateFormat se utiliza para convertir las fechas ingresadas por el usuario en objetos Date. Esto facilita la comparación de fechas y la identificación de productos cercanos a la fecha de caducidad.
¿Qué sucede cuando un pasillo está lleno y se intenta agregar un producto?
Cuando un pasillo está lleno y se intenta agregar un producto, el sistema alerta al usuario de que el pasillo no tiene espacio. No se permite la superposición de productos en la misma posición.
¿Cómo se realiza la compra de productos por parte de los clientes y cómo se garantiza que no se compren más productos de los disponibles?
Los clientes pueden realizar compras seleccionando productos de los pasillos. El sistema valida que haya suficientes existencias para cada producto seleccionado. Si un cliente intenta comprar más de lo disponible, se le alerta y no se realiza la compra.
¿Cómo se generan los diferentes informes, como el informe de productos disponibles y el informe de resumen de compras?
Los informes se generan a partir de los datos almacenados en el sistema. Se utilizan métodos específicos en la clase Supermercado para recopilar información y presentarla de manera legible en los informes.
¿Qué desafíos enfrentaron al implementar la interfaz gráfica con JOptionPane y cómo se resolvieron?
Aunque JOptionPane ofrece una forma sencilla de interactuar con el usuario, puede tener limitaciones en términos de personalización. Las soluciones se basan en aprovechar las opciones que ofrece JOptionPane para solicitar y mostrar información de manera clara.
¿Cómo se manejan las excepciones en el código, especialmente en relación con la entrada de fechas y la validación de datos?
Se utilizan bloques try-catch para manejar excepciones, especialmente en relación con la entrada de fechas y la validación de datos. Si se produce una excepción, el sistema muestra un mensaje de error y permite al usuario corregir la entrada
¿Cuál es el propósito del enum Categoria y cómo se utiliza en el proyecto?
El enum Categoria enumera las categorías posibles de productos en el supermercado, como Frescos, Granos, Carnicería, etc. Se utiliza para clasificar y organizar los productos en los pasillos y durante la compra.
