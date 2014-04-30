Jarvis
=========

## Installer un serveur Jenkins

Dans le répertoire jenkins, lancer :

    vagrant up


## Nettoyage et remise à zéro

Détruire la VM jenkins et lancer :

        vagrant destroy



## Lancement de l'application

Lancer le main de jarvis.AppServer

### Version Node.js

Go into the node folder and run : 
```shell
node server.js
```
If you'd like to be able to have the live reload, it is recommended to install supervisor on node : 
```shell
npm install -g supervisor
# Then just launch the server using supervisor
supervisor server.js
```

## Informations sur l'API Remote de Jenkins

[Remote API](https://wiki.jenkins-ci.org/display/JENKINS/Remote+access+API)