# OliasMoralesE01
# Ejercicio 1 de Multimedia con Android Studio ✔📱

Este ejercicio se enfoca en el aprendizaje de la parte frontal de la aplicación de manera que no tiene funcionalidad
Hemos aprendido a utilizar distintos layouts y editar el formato de cada uno de los componentes tanto su diseño como sus tamaños
con la finalidad que cada uno de los componentes de la aplicación seán mobile responsive

### Ejemplo Front Aplicación 

![image](https://github.com/Javi-23/OliasMoralesE01/assets/102307312/ea22234a-6bf7-4b31-b3ed-ff6ee17eeccf)

**Pasos de Desarrollo**
1. Primeramente se ha desarrollado la estructura de la aplicación, utilizando para la estructura de los botone sun LinearLayout
   horizontal con un margen entre bótones.
2. Se ha establecido un diseño de la aplicación sencillo en base a una plantilla y se ha configurado las propiedades adecuadas.
3. Se ha testeado.

### Imagen de Proyecto Final

![image](https://github.com/Javi-23/OliasMoralesE01/assets/102307312/c11f1440-65de-4a7c-953a-11b3017841e6)

# Ejercicio 2 de Multimedia. Hacer un Login y acceder a la ventana del ejercicio 1 ✔📱
## Enunciado del Ejercicio: 

Crea la segunda pantalla en el mismo proyecto(investiga como). Deberás realizar un lógin tal y como se muestra en el figma, en el caso de que el usuario y contraseña sean admin en el TextView de abajo saldrá “Usuario y contraseña correcta” en caso contrario “Usuario o contraseña incorrecta”. Investigar por vuestra cuenta como iniciar la aplicación en la Activity login. Pista → se configura en el AndroidManifest.xml. Una vez que iniciemos el login deberá pasar a la pantalla del contador pasando el dato del nombre del usuario (aparecerá en la parte baja de la pantalla de contador donde ponía “by nombre_alumno”).(ACTUALIZADO)

## Pantalla De Login
![image](https://github.com/Javi-23/OliasMoralesM01/assets/102307312/d61e9b5d-391a-4d66-84ef-36ed4318af7b)

Esta pantalla tiene un propósito la cual actua como logger de manera que si introducimos las credenciales correctas pasará a la siguiente pantalla, pero
si las credenciales son incorrectas saltara un error el cual nos sugiere un error de acceso

## Ejemplo De Error.
![image](https://github.com/Javi-23/OliasMoralesM01/assets/102307312/f061adaf-a2bd-4a00-9040-61d81acb5419)

Una vez nos hayamos logueado correctamente cambiaremos de ventana y capturaremos el nombre de usuario para que en la segunda pantalla
en el TextView de la parte de abajo de la misma aparezca el nombre

## Segunda pantalla 
![image](https://github.com/Javi-23/OliasMoralesM01/assets/102307312/4aa2942e-3515-4772-a08e-9f24b250294a)

## Lógica Ventana De Login 
![image](https://github.com/Javi-23/OliasMoralesM01/assets/102307312/712fe900-30d6-4eec-9190-d43d6c7fcc27)

![image](https://github.com/Javi-23/OliasMoralesM01/assets/102307312/cd7ff25e-0023-44b0-a4a2-471c3b3ca9c3)

## Lógica Segunda Ventana

![image](https://github.com/Javi-23/OliasMoralesM01/assets/102307312/4a26920b-edce-4414-9b87-3fcaa6fdc694)

## Estructura De La Pantalla 

![image](https://github.com/Javi-23/OliasMoralesM01/assets/102307312/88dfd812-2802-478a-b2fa-50b5e09bb6d1)

Se ha optado por una estructura el cual se posicionan todos los elementos con constraint layout de manera que los elementos seran responsive a excepcion de los Plain texts del usuario y contraseña que estos se han introducido en un linearLayout de manera que uno este debajo de otro con un pequeño margen entre ellos. (Podría haberlo metido todo en el linear Layout, para que los elementos esten unos debajos de otros pero se ha optado por esta estructurar para no excederme con margenes entre los elementos), el linear layout también se ha posicionado con ConstratintLayout.















