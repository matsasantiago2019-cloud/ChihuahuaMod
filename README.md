# Chihuahua Mod

Minecraft Java Edition 26.3 / Minecraft Forge 66.1.5 / Java 25.

Este repositorio contiene el proyecto fuente y el flujo de compilación. GitHub Actions compila el JAR con cada push y lo publica como artefacto descargable de la ejecución.

## Compilar localmente
Con Java 25 y Gradle instalado:
```sh
gradle build
```
El archivo resultante se genera en `build/libs/ChihuahuaMod-1.0.0.jar`.

## Estado
La configuración de compilación está preparada. La entidad Chihuahua, su modelo, textura, domesticación y huevo generador deben implementarse y probarse en el entorno Forge 26.3 antes de considerar el mod jugable.
