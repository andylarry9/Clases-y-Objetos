Tema: Clases y Objetos.
Objetivo: Resolución de ejercicios mediante la implementación de clase de objetos e
invocación a sus métodos de comportamiento.
Actividad: Crea una clase Cuenta (bancaria) con atributos para el número de cuenta
(un entero largo), el CI del cliente (cadena de texto), el saldo actual y el interés
anual que se aplica a la cuenta (porcentaje). Define en la clase los siguientes métodos:
• Constructor por defecto y constructor con parámetros de CI, saldo e interés
• Métodos de acceso y modificadores para cada atributo de la clase Cuenta.
• ActualizarSaldo(): actualizará el saldo de la cuenta aplicándole el interés
diario (interés anual dividido entre 365 aplicado al saldo actual).
• Acreditar(double): permitirá depositar una cantidad de dinero en la cuenta.
• Debitar(double): permitirá sacar una cantidad de dinero de la cuenta (si hay
saldo suficiente).
• Método Impresión que nos permita mostrar todos los datos de la cuenta.
Implemente un programa de consola en el lenguaje Java, mediante la herramienta de
compilación online https://www.onlinegdb.com/ y, que permita ejecutar los siguientes
requerimientos funcionales:
1. Crear un objeto de la clase Cuenta con un saldo inicial, el CI de su cliente titular
y el valor de interés anual para dicha cuenta.
2. Implementar un menú de opciones:
1. Acreditar dinero a la cuenta bancaria conocido el monto a depositar.
2. Debitar dinero de la cuenta bancaria conocido el monto a sacar.
3. Actualizar el saldo de la cuenta aplicando el interés diario programado.
4. Mostrar los datos de la cuenta bancaria.
