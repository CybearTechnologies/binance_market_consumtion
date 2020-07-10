# Consumo de Api Binance
  API que permite obtener precio de distintas monedas(BTC,ETH,DASH,PTR,BSS,EUR) en $
  
## Herramientas Utilizadas.
* [Maven](https://maven.apache.org/) - Manejo de Dependencias.
* [Spring](https://spring.io//) - Almacenamiento de informacon en la nube

## Ejecucion

* Para generar el WAR en la carpeta target: **mvn clean install -e**
* Por defecto el aplicativo se ejecuta en http://localhost:8080/

| Command | Description | Cuerpo | Accion |
| --- | --- | --- |--- |
| `GET` | **/products** | - | Informacion de todos los productos en $|
| `POST` | **/product-transform** |{"currency": "BTCUSDT" ,"amount": "50"}| Lleva la cantidad y precio de una determinada moneda y lo compara con las demas, ejemplo: 50 BTC cuanto equivale en EUROS O DASH en relación al precio de la pagina.|



## Autor.
  * **Jose Cedeno** - [Jafjdev](https://github.com/jafjdev/)