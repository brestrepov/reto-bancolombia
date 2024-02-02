## Reto técnico de Automatización Bancolombia
- gradle 6.5 <br>
Prueba realizada sobre la pagina: https://tasks.evalartapp.com/automatization/ <br>

### Proyecto trabajado con
- java 11

#### Nota:
 - En caso de quere ejecutar el escenario de prueba es necesario descargar el chrome driver correspondiente a la version que se tenga instalada 
en la maquina y ponerlo en la raiz del proyecto, ya que se quizo la funcionalidad de autodescarga del driver ofrecidad por serenity pero estaba 
ocasionando problemas por lo cual se decidio dejar esta bandera apagada y usar el driver directamente en el proyecto, en caso de querer probar esta funcionalidad
basta con con cambiar la bandera a true en el archivo serenity.conf <br>
<img width="379" alt="image" src="https://github.com/brestrepov/reto-banistmo/assets/96146760/21219793-356a-4fe5-8f21-e7863e53fcfb"> <br>


Para la ejecucion del escenario de prueba basta con haber clonado el proyecto y ejecutar la clase DescargarDocumentosRunner para este caso o 
tambien se puede hacer mediante la ejecuion del comando <br>
 `gradle clean test aggregate `
