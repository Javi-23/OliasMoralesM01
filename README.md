# OliasMoralesM01
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

# Ejercicio 3 de Multimedia. Hacer un menú de navegación ✔📱
## Enunciado del Ejercicio: 

Cambia el proyecto para que el segundo activity en vez de ser el contador sea un activity con un FrameLayout en el que se verán los diferentes fragments (mínimo home, contador, salir) y por otra parte una barra de navegación con la que podamos viajar entre los diferentes fragments.

## Creación de FrameLayout

**FragmentContainerView:** 

- Es un contenedor para alojar fragmentos, en este caso, un NavHostFragment que se utiliza para la navegación.
- Se le asigna un ID (fragment_Root).
- Se configura con dimensiones de ancho y alto igual a 0dp, lo que significa que tomará el espacio asignado por - las restricciones.
- Se marca como el "navHost" predeterminado.
- Se conecta mediante restricciones a la parte superior, inferior, izquierda y derecha del ConstraintLayout.
- Se asocia con un gráfico de navegación definido en el archivo de recursos de navegación (@navigation/nav_graph).
- ![image](https://github.com/Javi-23/OliasMoralesM01/assets/102307312/f16f3a8a-a963-4352-b56a-6b7c9920d3aa)

  
**BottomNavigationView:**

- Es un componente de interfaz de usuario de Material Design que generalmente se usa para la navegación entre secciones de la aplicación.
- Se le asigna un ID (bottomNavigation).
- Establece dimensiones de ancho y alto como "wrap_content".
- Configura un color de fondo (#7AFF72).
- Ajusta la visibilidad de las etiquetas a "selected", lo que significa que las etiquetas de los elementos de - - navegación solo serán visibles cuando estén seleccionados.
- Se conecta mediante restricciones a la parte inferior, izquierda, derecha y superior del ConstraintLayout.
- Se asocia con un menú de navegación definido en el archivo de recursos de menú (@menu/bottom_navigation_menu).
- 
**bottom_navigation_menu**
  
Elemento Home:
- ID: navigation_home
- Se puede marcar como seleccionado (checkable) y habilitado (enabled).
- Icono representado por @drawable/ic_home.
- Título "Home".
- Visible (visible) en la interfaz.
- Elemento Contador:

Elemento Contador: 

- ID: navigation_contador
- Se puede marcar como seleccionado (checkable) y habilitado (enabled).
- Icono representado por @drawable/ic_contador.
- Título "Contador".
- Visible (visible) en la interfaz.
- Elemento Salir (Exit):
  
Elemento Exit: 
- ID: navigation_exit
- Título "Salir".
- Icono representado por @drawable/ic_exit.

![image](https://github.com/Javi-23/OliasMoralesM01/assets/102307312/a77a2808-2fb2-4692-8ef2-8bbbbd0b877c)

**nav_graph**
En este elemento definiremos los diferentes fragment por el cual va a navegar nuestra aplicación
Es importante darle un id a cada uno de los fragment, puesto que es el elemento que se va a utilizar
para reconocer el fragment.

![image](https://github.com/Javi-23/OliasMoralesM01/assets/102307312/33cf48e5-07c7-4335-8fb3-9fed4f22deb4)

## Logíca de navegación código Java

```
public class ActivityNav extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);

        // Establece el diseño de la actividad usando el archivo XML activity_nav.xml
        setContentView(R.layout.activity_nav);

        // Obtiene una referencia al componente BottomNavigationView definido en activity_nav.xml
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);

        // Establece el elemento seleccionado por defecto en la barra de navegación inferior
        bottomNavigationView.setSelectedItemId(R.id.navigation_home);

        // Obtiene el fragmento de host de navegación del contenedor definido en activity_nav.xml
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_Root);

        // Asegura que el fragmento de host de navegación no sea nulo
        assert navHostFragment != null;

        // Obtiene el controlador de navegación asociado al fragmento de host de navegación
        NavController navController = navHostFragment.getNavController();

        // Configura el listener para manejar los eventos de selección de elementos en la barra de navegación inferior
        bottomNavigationView.setOnItemSelectedListener(item -> {
            // Verifica el ID del elemento seleccionado y navega a la pantalla correspondiente utilizando el NavController
            if (item.getItemId() == R.id.navigation_home) {
                navController.navigate(R.id.homeFragment);
            } else if (item.getItemId() == R.id.navigation_contador) {
                navController.navigate(R.id.contadorFragment);
            } else {
                // En este caso, navega a un fragmento llamado exitFragment (puedes ajustar este nombre según tu configuración)
                navController.navigate(R.id.exitFragment);
            }

            // Devuelve true para indicar que el evento de selección ha sido manejado correctamente
            return true;
        });
    }
}
```

# Resultado Final

![image](https://github.com/Javi-23/OliasMoralesM01/assets/102307312/2f23986f-5d84-45e3-bd90-022a635b3502)

![Running Devices - OliasMoralesM01 2024-01-14 18-26-51](https://github.com/Javi-23/OliasMoralesM01/assets/102307312/76b7e921-3b5f-4e79-a6a6-82a5746e0acc)















