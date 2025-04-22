# Lancer le TP 1: Hello World en RMI
1. Compiler les fichiers:
javac -d build src/tprmi/*.java

2. Lancer le registre RMI
Ouvrez un terminal dans le dossier build et exécutez : rmiregistry

3. Lancer le serveur
Ouvrez un autre terminal dans le dossier build et exécutez :  java tprmi.HelloServer

4. Lancer le client
Ouvrez un troisième terminal dans le dossier build et exécutez : java tprmi.HelloClient

Le client devrait afficher : Hello World. avec le nombre d'appel

# Explications des principales sections :
## Hello.java
1. Importation des classes :

java.rmi.RemoteException : Exception lancée par les méthodes distantes en cas de problème.
java.rmi.server.UnicastRemoteObject : Classe qui permet à un objet d'être exporté pour recevoir des appels distants.

2. Attributs :

message : Contient le message qui sera retourné par la méthode distante.
counter : Un entier pour compter le nombre de fois où la méthode say est appelée.

3. Constructeurs :

Le constructeur par défaut est nécessaire pour l'exportation de l'objet.
Le constructeur avec argument permet d'initialiser le message avec une valeur personnalisée.

3. nMéthode say :

Cette méthode est appelée par les clients distants. Elle incrémente le compteur et retourne le message suivi du nombre d'appels effectués.