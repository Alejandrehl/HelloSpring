Ultimate Spring Hello World Project 

# Knowledge

### Spring Framework

- Spring Boot: Permite crear aplicaciones Java de manera muy simple, se puede dividir en `Reactive Stack` & `Servlet Stack`.
- Spring Cloud: Permite crear aplicaciones para la nube.
- Spring Cloud DataFlow: Permite comunicar de mejor manera aplicaciones que utilizan micro servicios.
- `application.properties:` Es el archivo de configuración de nuestro proyecto.
- `Spring Initializer:` Es la herramienta que se utiliza para crear un nuevo proyecto con Spring Boot.

### Dependencies

- Maven: Tecnología que nos permite administrar las dependencias de nuestro proyecto.
- Lombok: Dependencia que nos permite reducir nuestro código por medio de anotaciones, por ejemplo los Getter `@Getter` y los Setter `@Setter`.
- Thymeleaf: Motor de plantillas para MVC.

### Annotations

- @Controller: Anotación que nos permite indicar que nuestra clase es un controlador.
- @RestController: Anotación que nos permite indicar que una clase es un controlador rest.
- @GetMapping: Anotación que nos permite indicar que el método de un controlador se accede por el método HTTP GET.
- @Slf4j: Anotación de Lombok que nos permite utilizan el `logging` es nuestras clases, un ejemplo es `log.info("Ejecutando Controlador")`.

### Custom Configs `application.properties`

- `Change default port:` server.port=9090, por default es `8080`.
- `Change logging level:` logging.level.root=DEBUG, por default es `INFO.
- `Change logging date pattern`: logging.pattern.dateformat=hh:mm, para enviar solo la hora a nuestro log en vez de la fecha completa.


