
# Introducción al micro-servicio en Java Spring

Este micro-servicio está diseñado para proporcionar una API RESTful para la obtención de datos generales y la autenticación de usuarios. Está configurado utilizando el framework Java Spring en el backend y utiliza los controllers `Data` y `Login` para manejar las solicitudes de los clientes.

## Backend

### Controllers

-   `Data`: Este controller maneja las solicitudes HTTP para obtener datos generales. La solicitud se puede hacer utilizando el método `GET` .
-   `Login`: Este controller maneja la solicitud HTTP `GET` para la autenticación de usuarios.

### Puerto

El servicio se ejecuta en el puerto predeterminado `8080` en `localhost` (`localhost:8080`).

## Frontend

El frontend está diseñado utilizando HTML, Bootstrap, JQuery y JS. Utiliza AJAX para conectarse con el backend y hacer solicitudes a los endpoints correspondientes.

### Endpoints

-   `Data`: `GET /api/data`
-   `Login`: `GET /login/session`
- 
## Nota
El acceso a los endpoints es por via del Home al momeento de cargar, por parte del Login aún no brinda la redirección una vez cargada los datos proporcionados. Sin embargo, la comprobación si se hace mediante el backend.

