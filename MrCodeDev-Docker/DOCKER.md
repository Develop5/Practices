# DOCKER: INSTALLATION AND USE
<p align="center">
<img src="https://gist.github.com/mrcodedev/8f9c3cc5698f98adecfaebd797b5714e/raw/5574cd201ebf8b1b128fc20043cc9ade37cf4baa/image-docker.png">
</p>

Vamos a empezar viendo primero que diferencias hay entre las máquinas virtuales y los contenedores de Docker, para ver porque son mejores los contenedores.

## Virtual Machines Vs Containers
### Virtual Machines
Es un sistema operativo completo, funcionando de manera aislada sobre otro sistema operativo completo. La tecnología de VMs permite compartir el hardware de modo que lo puedan utilizar varios sistemas operativos al mismo tiempo.

Obviamente, por debajo siempre tiene que haber algún tipo de hardware que lo sustente todo. Lo que se suele llamar coloquialmente como "hierro" y de forma ms marketiniana se suele llamar "infraestructura". Todo ese poder no vale mucho si no le añadimos el "cerebro" en forma de sistema operativo. 

Para que las máquinas virtuales puedan ejecutarse es necesario instalar otro componente por encima del Sistema Operativo: el hipervisor. Un hipervisor es un software especializado en exponer los recursos de hardware que están debajo del sistema operativo, de modo que puedan ser utilizados por otros sistemas operativos. Esto incluye las CPUs (o cores), la memoria y el espacio de almacenamiento adems del resto del hardware. Estas VMs "engañan" a un sistema operativo convencional para que crea que se está ejecutando sobre una máquina física. Los hipervisores vienen con productos como Hyper-V (incluido gratuitamente con Windows), VirtualBox o VMWare entre otros.

**NOTA Adicional:** existen hipervisores de tipo 1 que se instalan directamente sobre el hardware y evitan la necesidad de instalar a mayores un sistema operativo convencional en el medio. De hecho, estos son los que se suelen utilizar en los Data Center para aumentar todavía más el rendimiento.

<p align="center">
<img src="https://gist.github.com/mrcodedev/8f9c3cc5698f98adecfaebd797b5714e/raw/f39e17c07e3764b5a13f9ac75a442c153cd759b9/image-containervsvm.jpg">
</p>

Gracias a esto podemos tener distintos sistemas operativos ejectutándose en paralelo sobre la misma máquina física, cada uno con su memoria y espacio en discos reservados (los "cores" se pueden compartir), y completamente aislados unos de otros. Gracias al avance de los hipervisores en los últimos años, y a las tecnologías orientadas a la virtualización que ofrecen los procesadores modernos, la pérdida de rendimiento es mínima y es una manera muy eficiente de compartir el hardware para sacarle más partido.

### Containers
La filosofa de contenedores es totalmente diferente a la de las VMs. Si bien tratan también de aislar a las aplicaciones y de generar un entorno replicable y estable para que funcionen, en lugar de albergar un sistema operativo completo lo que hacen es compartir los recursos del propio ssitema operativo "host" sobre el que se ejecutan.

Docker Engine (hay otros tipos de soluciones para contenedores como Virtuozzo, LXC/LXD, OpenVZ, DC/OS...) se encarga de lanzar y gestionar los contenedores con nuestras aplicaciones, pero en lugar de exponer los diferentes recursos de hardware de la máquina de manera discreta (es decir, 1 procesador y "x" GB de RAM... para cada aplicación), lo que hace es compartirlos entre todos los contenedores optimizando su uso y eliminando la necesidad de tener sistemas operativos separados para conseguir el aislamiento.

<p align="center">
<img src="https://gist.githubusercontent.com/mrcodedev/8f9c3cc5698f98adecfaebd797b5714e/raw/586960204f71e01bbb11deaa8806a9885753c531/image-hierrodocker.png">
</p>

Docker funciona a partir de imágenes que se pueden reutilizar entre varias aplicaciones (fíjate en el esquema anterior, en que las aplicaciones 2 y 3 comparten el runtime). Cada una de esas imágenes se puede asimilar a una "capa" que se puede superponer a otras para formar un sistema de archivos que es la combinación de todas ellas. Por ejemplo, una capa puede llevar las bibliotecas o runtime que necesitamos utilizar (como Node.js o PHP), otra con unas bibliotecas determinadas de las que hace uso neustra aplicación, y otra capa final con el cdigo de nuestra aplicación. La combinación resultante (una nueva imagen, única para nuestra app), es lo que forma la base de nuestro contenedor.

Cuando se lanzan uno o varios contenedores a partir de una imagen, a efectos de nuestra aplicación es como si estuviese ejecutándose en su propio sistema operativo, aislado de cualquier otra aplicación que hubiese en la máquina en ese momento. Pero la realidad es que están compartiendo el sistema operativo "host" que hay por debajo. Un contenedor ve su propio sisteama de archivos, el resultante de "superponer" las capas de las que se mencionaba antes, y los recursos hardware se van asignando dinámicamente en función de las necesidades, de lo cual se ocupa Docker Engine (o el equivalente si usamos otro tipo de contenedores). Es decir, Docker asla aplicaciones, no sistemas operativos completos.

**NOTA:** también es posible que acceda al sistema de archivos de la máquina local para persistir de forma permanente información propia de la aplicación, ya que si un contenedor se cierra, todos los cambios hechos en sus sistema de archivos virtual se pierden. Aunque existen opciones para conseguirlo sin tener que hacer esto. Pero eso es lo máximo que se puede romper, ese aislamiento entre el contenedor y el sistema operativo huésped.

## Docker vs Máquinas Virtuales
En primer lugar debemos tener en cuenta que, en el caso de los contenedores, el hecho de que no necesiten un sistema operativo completo sino que reutilicen el subyacente reduce mucho la carga que debe soportar la máquina física, el espacio de almacenamiento utilizado y el tiempo necesario para lanzar las aplicaciones. Un sistema operativo puede ocupar desde poco menos de 1GB para algunas distribuciones de Linux con lo mínimo necesario, hasta más de 10GB en el caso de un sistema Windows completo. Además, estos sistemas operativos, para funcionar requieren un mínimo de memoria RAM reservada, que puede ir desde 1 hasta varios GB, dependiendo de nuestras necesidades. Por lo tanto los contenedores son mucho más ligeros que las máquinas virtuales.

Cuando definimos una máquina virtual debemos indicar de antemano cuántos recursos físicos le debemos dedicar. Por ejemplo, podemos decir que nuestra VM va a necesitar 2 vCores (procesadores virtuales), 4GB de RAM y un espacio en disco de 100 GB. En el caso de los procesadores, es posible compartirlos entre varias máquinas virtuales (pero no conviene pasarse o irán fatal de rendimiento), y el espacio en disco se puede hacer que solo ocupe lo que de verdad se esté utilizando, de modo que crezca en función de las necesidades y no ocupe siempre tanto como habíamos reservado. Pero en el caso de la memoria y otros elementos (acceso a unidades externas o dispositivos USB) la reserva es total. Por eso, aunque nuestra aplicación no haga uso en realidad de los 4GB de RAM reservados da igual: no podrán ser utilizados por otras máquinas virtuales ni por nadie más. En el caso de los contenedores esto no es así. De hecho no indicamos qué recursos vamos a necesitar, sino que es Docker Engine, en función de las necesidades de cada momento, el encargado de asignar lo que sea necesario para que los contenedores funcionen adecuadamente.

Esto hace que los entornos de ejecución de Docker sean mucho más ligeros, y que se aproveche mucho mejor el hardware, además de permitir levantar muchos más contenedores que VMs en la misma máquina física. Mientras que una VM puede tardar un minuto o más en arrancar y tener disponible nuestra aplicación, un contenedor Docker se levanta y responde en unos pocos segundos (o menos, según la imagen). El espacio ocupado en disco es muy inferior con Docker al no necesitar que instalemos el sistema operativo completo.

Por otro lado, Docker no permite utilizar en un sistema operativo "host" contenedores/aplicaciones que no sean para ese mismo sistema operativo. Es decir, no podemos ejecutar un contenedor con una aplicación para Linux en Windows ni al revés. Lo cual puede suponer un impedimento en algunas ocasiones.

**NOTA:** Docker para Windows, paradójicamente, utiliza una máquina virtual Linux en segund plano para poder ejecutar aplicaciones Linux. Los contenedores Windows se ejecutan nativamente en Windows, claro.

Además para poder hacer despliegues avanzados de aplicaciones en contenedores hay que ir más allá de Docker y utilizar tecnologías como Kubernetes, que nos permiten orquestar y controlar los despliegues con mucha partes en movimiento. Estas tecnologías pueden llegar a ser complejas de aprender y dominar.

## RESUMIENDO
Los contenedores permiten desplegar aplicaciones más rápido, arrancarlas y pararlas más rápido y aprovechar mejor los recursos de hardware. Las máquinas virtuales nos permiten crear sistemas completos totalmente aislados, con mayor control sobre el entorno y mezclando sistemas operativos host y huésped.

Cada tecnología tiene sus aplicaciones y sus ventajas según las necesidades y circunstancias de cada desarrollo. En la actualidad los contenedores en general y Docker en particular se están convirtiendo en una tecnología indispensable y cada vez se utilizan para más cosas, no solo para desplegar aplicaciones en producción, sino también para crear entornos de desarrollo replicables entre todos los miembros de un equipo, asegurar que las aplicaciones se van a ejecutar igual en todos los entornos (desarrollo, pruebas y producción), etc. Hay quien asegura que, a medio plazo, la mayoría de los desarrolladores usaremos Docker para desarrollar y desplegar aplicaciones. 

**FUENTE:** https://www.campusmvp.es/recursos/post/que-diferencia-hay-entre-docker-contenedores-y-maquinas-virtuales.aspx

## INSTALANDO DOCKER
Voy a realizar toda la instalación sobre Ubuntu ya que, esoy un usuario de este sistema operativo basado en Linux. ACtualmente en la redacción de este Gist utilizo Ubuntu 18.04.

Para instalaro he utilizado el siguiente método:

```https://get.docker.com/```

He utilizado esa URL ya que revisa cual es la última versión de Docker y te lo instala, ya que Ubuntu a veces te instala versiones anteriores. Debes de utilizar este script de la siguiente manera en consola (usa sudo).

```
curl -fsSL get.docker.com -o get-docker.sh
sh get-docker.sh
```

Una vez instalado podréis ver la versión del cliente y del server de docker. Para poder utilizarlo para usuarios que no sea root, debemos darle permisos de uso. Debemos de cambiar `your-user` por el usuario que usemos en Ubuntu:

```
sudo usermod -aG docker your-user
```

Si os pide permisos más adelante (cuando usemos `docker info` o `docker verrsion`), intentad utilizar los siguientes comandos:

```
sudo addgroup --system docker
sudo adduser $USER docker
newgrp docker
```

Con esto solucionariamos el tema de permisos :smile:.


Para ver que todo es correcto, podemos usar el comando `docker` para ver que está bien instalado. Ponemos en la consola lo siguiente:

```
docker info
docker version
```

Con `docker info` veremos información sobre la instalación de docker (podemos ver cuantos containers tenemos instalados, corriendo, pausados, imagenes descargadas, versión del servidor, plugins, kernel, etc). Y con `docker version` vamos a saber la versión de cliente y la versión del servidor.

## OTROS SISTEMAS OPERATIVOS
Si queremos utilizar Docker en Windows o en Mac, podemos instalar Docker Toolbox, que es un instalador que te lo instala unas herramientas junto a Docker fácilmente. Lo que hace es instalar un VirtualBox con una maquina virtual Linux y así poder utilizar Docker.

Podemos instalar también Docker sin la herramienta Docker Toolbox. Aquí tendremos que hacer cosas más de forma manual y no correrá por encima de una maquina virtual VirtualBox sino que utiliza Hyper-V (en Windows 10).

## ¿QUÉ SON LOS CONTENEDORES Y QUE SON LAS IMÁGENES?
### Imágenes
- Plantilla de sólo lectura vacía o con una aplicación preinstalada para la creación de contenedores.
- Creadas por nosotros o por la comunidad (Docker Hub) (Docker Search).

### Contenedores
- Contiene lo necesario para ejecutar nuestras aplicaciones.
- Basados en una o más imágenes.

<p align="center">
<img src="https://gist.github.com/mrcodedev/8f9c3cc5698f98adecfaebd797b5714e/raw/6ed313716db5e499c73df553c87795d9c7296fa6/image-containerimages.png">
</p>

## IMAGENES ¿DÓNDE BUSCARLAS?
Para poder ver imagenes tenemos http://hub.docker.com (no hace falta registrarse). Ahí veremos todas las imágenes disponibles para docker. Si queremos buscar en la terminal las imágenes debemos de usar el comando `docker search imagen-a-buscar`. Por ejemplo, si queremos buscar la imagen de Ubuntu usaremos lo siguiente:

```
docker search ubuntu
```

Nos dará el siguiente resultado:

<p align="center">
<img src="https://gist.githubusercontent.com/mrcodedev/8f9c3cc5698f98adecfaebd797b5714e/raw/4559f963218d4e1223a301257084c04608e3c33b/image-dockersearchubuntu.png">
</p>

Podremos ver una columna donde pone **OFFICIAL**, que serían las imágenes oficiales en este caso de Ubuntu (Canonical) y no una imagen oficial de docker

Podemos darnos cuenta que justamente hay las mismas imágenes en http://hub.docker.com que con el comando `docker search imagen-a-buscar`.

## INSTALAR IMÁGENES
Una vez vista la imagen a instalar (podemos verla desde http://hub.docker.com o a través de `docker search nombre-imagen`) podemos instalarlo a través del siguiente comando:

```
docker pull nombre-de-la-imagen
```

Podemos ver también el comando a través del hub de docker, metiendonos dentro del apartado de la propia imagen de la página web.

## ¿QUÉ SON LOS TAGS?
Los tags son versiones de esa imagen. Por ejemplo Ubuntu puede tener la versión 16.04 o 18.04 y podemos descargar la versión que queramos. Si queremos ver los tags, tenemos que irnos a la web http://hub.docker.com, buscar la imagen que deseamos y después irnos a la pestaña de tags. En cambio desde la consola sólo podemos buscar mencionando que tag queremos, no podemos ver un listado de todos (se podría haciendo un script). En consola deberíamos usar el siguiente comando `docker search imagen:tag`. Por ejemplo, si queremos buscar una versión de la 18.04 haríamos lo siguiente:

```
docker search ubuntu:18.04
```

## ¿CÓMO INSTALAR UNA IMAGEN CON UN TAG ESPECÍFICO?
Para instalar por ejemplo (si ya lo hemos visto ya) una ubuntu (nos sale nombre de ubuntu) y con la versión 18.04 (hemos visto que existe), utilizaríamos el siguiente comando:

```
docker pull ubuntu:18.04
```

## VER IMÁGENES INSTALADAS
Para ver las imágenes que hemos instalado utilizamos el comando:

```
docker images
```

## EJECUTAR UN CONTAINER
Para ejecutar un container usaremos el siguiente comando:

```
docker run nombre-imagen
```

Si no existe la imagen en local, la descargará a continuación y cuando acabe la descarga la ejecutará. También lo que hace es asignarle un nombre al container random.


## VER CONTAINERS EN EJECUCIÓN
Para ver los containers debemos de poner el siguiente comando:
```
docker ps
```

## VER CONTAINERS CREADOS Y SU STATUS
Para ver los containers que han sido creados (ya que pueden haber containers que ya se hayan pausado) usamos el siguiente comando:
```
docker ps -a
```

## MI PRIMER CONTAINER "HELLO WORLD"
Como en cualquier idioma de programación, lo primero que se aprende es realizar un "Hello World", en docker vamos a hacer lo mismo.

Hay una imagen llamada `hello-world` (podemos buscarla a través de `docker search hello-world`) que vamos a instalar para poder hacer este ejemplo. Para instalarla tenemos que aplicar el siguiente comando:

```
docker pull hello-world
```

Para ver que se ha instalado correctamente, listamos todas las imágenes instaladas:

```
docker images
```

Y veremos algo parecido a lo que vemos en la imagen de abajo.

<img src="https://gist.githubusercontent.com/mrcodedev/8f9c3cc5698f98adecfaebd797b5714e/raw/ec69353994273b3d8e03d62d67c54270be941e7b/images-hello-world.png">
</p>

Después ejecutaremos la imagen:

```
docker run hello-world
```

<p align="center">
<img src="https://gist.githubusercontent.com/mrcodedev/8f9c3cc5698f98adecfaebd797b5714e/raw/b56c2d3ea5a81f18ef89e0ec13226edd32f98fbb/images-hello-world-text.png">
</p>

Tendremos el resultado que vemos en la imagen anterior. Después si queremos ver si se ha ejecutado (ha sido un proceso que se ejecuta, muestra el texto y se cierra) usaremos el comando `docker ps -a`

<p align="center">
<img src="https://gist.githubusercontent.com/mrcodedev/8f9c3cc5698f98adecfaebd797b5714e/raw/b56c2d3ea5a81f18ef89e0ec13226edd32f98fbb/images-hello-world-ps.png">
</p>

## EJECUTAR COMANDOS EN CONTENEDORES CON DOCKER RUN
Para ejecutar en nuestros contenedores, podemos utilizar el siguiente comando:

```
docker run nombre-imagen comando
```

Ejemplo con una imagen de Ubuntu para listar archivos:

```
docker run ubuntu ls
```

Si queremos que sea interactivo (tenemos que ver si es interactivo, por ejemplo en ubuntu nos irá al bash que es la terminal), deberíamos utilizar el siguiente comando:

```
docker run -ti imagen
```
La el `-i` es para que nos deje ingresar contenido y `-t` para poder tener una pseudo-terminal.

Para poner un ejemplo, si tenemos una imagen con el nombre de ubuntu, lo deberíamos de ejecutar de la siguiente forma:

```
docker run -ti ubuntu
```

## PARA CERRAR UNA CONSOLA INTERACTIVA SIN PARAR CONTENEDOR
Para salir de la consola interactiva (-ti) debemos de presionar **CTRL+P+Q**.

## EJECUTAR CONTENEDOR YA CERRADO ANTERIORMENTE
Para poder ejecutar un contenedor ya cerrado utilizamos el comando:

```
docker ps -a
```

Nos fijamos en su ID y ejecutamos el siguiente comando:

```
docker start ID
```

Si tuvieramos un proceso Ubuntu por ejemplo, con una ID `a76ac184b768`, tendríamos que ejecutarlo de la siguiente manera:

```
docker start a76ac184b768 
```

## CREAR CONTENEDORES CON NOMBRES
Para crear un contenedor con un nombre en especfico debemos usar el siguiente comando:

```
docker run --name nombre-que-queramos imagen
```

Si queremos poner un contenedor con el nombre de `nikola_tesla` a una imagen de `ubuntu`, tendríamos que utilizar el siguiente comando:

```
docker run --name nikola_tesla ubuntu
```

## INICIAR O DETENER CONTENEDORES
### Para iniciar un contenedor
Para iniciar un contenedor debemos listar primero con `docker ps -a` los contenedores que fueron ejecutados anteriormente y después poner el siguiente comando:

```
docker start ID
```

Vamos a poner un ejemplo que tenemos un contenedor que se ejecutó con la ID `5d14b41bc01a`. Así que podemos inicializarlo introduciendo todos los carácteres de la ID o los dos o tres primeros (cuantos más carácteres mejor). Para ejecutar este comando lo usamos así:

```
docker start 5d14b41bc01a

ó 

docker start 5d1 
```
### Para detener un contenedor
Para detener un contenedor tenemos que primero listar que contenedores están ejecutándose (utilizamos el comando `docker ps`) y después utilizamos el siguiente comando:

```
docker stop ID
```

Podemos utilizar los tres primeros carácteres de la ID para detener el proceso. Si tuvieramos un contenedor que está ejecutándose con la ID `5d14b41bc01a` podremos utilizar uno de los siguientes comandos:

```
docker stop 5d1

ó

docker stop 5d14b41bc01a
```

## CONECTARNOS A UN CONTENEDOR QUE ESTÉ YA EJECUTÁNDOSE
Para conectarnos al contenedor haríamos lo siguiente:

```
docker attach ID
```

Si tenemos un contenedor con una ID `a76ac184b768`, lo utilizaríamos de la siguiente forma:

```
docker attach a76ac184b768 
```

## PERSONALIZAR CONTAINERS CON IMAGEN DE UBUNTU EN DOCKER
Vamos a arrancar un contenedor con una imagen que sea de `ubuntu` en la versión `18.04` y que se ejecute el bash `/bin/bash` en una consola interactiva. Para realizar esto utilizaríamos el siguiente comando:

```
docker run -it ubuntu:18.04 /bin/bash
```

### PERSONALIZAR CONTAINER CON IMAGEN DE UBUNTU
Cuando creamos un container con una imagen de Ubuntu, y estamos en una consola interactiva, no nos dejará utilizar `apt install`. Así que antes deberíamos de utilizar `apt update` (actualizamos dependencias) para poder instalar aplicaciones.

## CREAR IMAGEN A PARTIR DE CONTENEDOR CON DOCKER COMMIT
Para crear una imagen de un contenedor usaremos el siguiente comando:

```
docker commit ID nombre-imagen-descripcion
```

Vamos a imaginar que hemos creado una imagen con ubuntu, donde hemos instalado varias cosas para poder trabajar y queremos guardarlo en una imagen. Vemos que ese contenedor tiene la ID `11b339b44f46` y la vamos a llamar `ubuntu_pro`. Deberíamos de usar el siguiente comando:

```
docker commit 11b339b44f46 ubuntu_pro
```

Después de esto veremos que se nos crea un **sha256** y lo podemos listar ya a través del comando `docker images`.

## ¿QUÉ ES DOCKERFILE?
Dockerfile es un documento de texto que contiene todos los comandos que un usuario puede llamar a la línea de comandos para montar una imagen.

### "INGREDIENTES DE UN DOCKEFILE"
Un Dockerfile estaría escrito de la siguiente manera:

```
FROM ubuntu:16.04

MAINTAINER Linus Torvalds version: 66.6

RUN apt update && apt install -y apache2 && apt clean && rm -rf /var/lib/apt/lists/*

ENV APACHE_RUN_USER www-data
ENV APACHE_RUN_GROUP www-data
ENV APACHE_LOG_DIR /var/log/apache2

EXPOSE 80

CMD ["usr/bin/apache2", "-D", "FOREGROUND"]
```

Vamos a ver que hace cada uno. Hay más "ingredientes" que podemos utilizar, pero estos son los más básicos.

#### FROM:
Definir una imagen base para crear nuestra nueva imagen con Dockerfile.

```
FROM Ubuntu:18.04
```

#### MAINTAINER:
Hace referencia al creador de la receta.

```
MAINTAINER MrCodeDev mrcodedev@gmail.com
```

#### RUN:
Nos permite ejecutar comandos en la imagen base antes de ser creada.

```
RUN apt update && apt install apache2
```

#### ADD/COPY:
Nos permite agregar o copiar archivos desde el equipo local a la imagen.

```
ADD index.html /var/www/html
```

#### EXPOSE:
Nos permite exponer por defecto un puerto para el contendor.

```
EXPOSE 8080
```

#### CMD:
Ejecutar acción por defecto al crear el contenedor, es la finalidad.

```
CMD ["/usr/sbin/apache2", "-D", "FOREGROUND"]
```

## CREANDO UNA IMAGEN CON UNA DOCKERFILE
Creamos un archivo llamado `Dockerfile` y le añadimos todos los "ingredientes" que hemos visto anteriormente.

Después de esto ejecutamos el siguiente comando: 

```
docker build -t nombre_de_nuestra_imagen /ruta/donde/esta/el/Dockerfile/
```

Vemos en consola como está haciendo los pasos que le hemos dado. Al acabar podemos ver con `docker images` que tenemos la nueva imagen creada.

## COMANDO PARA ARRANCAR UN CONTENEDOR EN UN PUERTO
```
docker run -d -p puerto_final:puerto_donde_apunta imagen
```

## CREA UNA IMAGEN EN DOCKER (REPO)
```
docker commit -a "creador <correo@correo.com>" -m "Mensaje que se muestra (versión 1.0.)" containerID nombreImagen
```

## CREAR CONTENEDOR SIN EJECUTARLO
```
docker create -it imagen comando
```

## EJECUTAR CONTAINER CON UN COMANDO
```
docker run imagen comando
```

## BORRAR UN CONTENEDOR (NO TIENE QUE ESTAR ACTIVADO)
```
docker rm containerID
```


## BORRAR TODOS LOS CONTENEDORES
```
docker rm $(docker ps -a -q)
```

## BORRAR IMAGEN
```
docker rmi imagenID
```