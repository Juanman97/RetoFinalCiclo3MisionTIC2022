# Reto final Ciclo 3 MisiónTIC2022: Veterinaria

## Descripción
Este reto requería de la creación de una base de datos para el registro de datos de una veterinaria con propietario, mascotas, citas. Se seleccionan los datos para utilizar en el programa, los cuales fueron la mascota, sus datos, su propietario y los datos de él. Luego, se requería crear una interfaz gráfica para mostrar los datos y realizar operaciónes *CRUD*, utilizando un modelo-vista-controlador.

## Instrucciones
Se debe ejecutar el script de la base de datos en MySQL ubicado en la ruta */Reto Veterinaria/src/Util/*. Luego, se debe abrir el proyecto y verificar que el archivo .jar de conexión con la base de datos esté cargado, de lo contrario cargarlo de la carpeta lib. Finalmente se deben ingresar las credenciales para acceder a la base de datos, modificando los valores de *user*, *password* y *url* en el archivo *Propiedades* en el paquere *Utils*. Ahora sí se puede ejecutar el programa.

## Detalles del programa
Al ejecutarlo, se pueden realizar búsquedas en la base de datos por nombre de mascota o por propietario, además se pueden modificar los datos de una mascota, eliminarla o agregar una nueva. Sin embargo, todo se realiza con la tabla de mascotas, por lo cual se deben usar los propietarios definidos en la base de datos, no se pueden agregar o eliminar desde la interfaz gráfica.
