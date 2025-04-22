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

# Lancer le TP 2: Compte bancaire distant

1. Compiler les fichiers
javac -d build src/tprmi/*.java

2. Lancer le registre RMI
Ouvrez un terminal dans le dossier build et exécutez : rmiregistry

3. Lancer le serveur
Ouvrez un autre terminal dans le dossier build et exécutez : java tprmi.RmiServeur

4. Lancer le client avec une commande spécifique
Ouvrez un troisième terminal dans le dossier build et exécutez : java tprmi.RmiClient + 50
Cela crédite le compte de 50 unités. Pour débiter, utilisez : java tprmi.RmiClient - 30

Le serveur affiche le solde mis à jour toutes les secondes grâce à une boucle infinie.

# Lancer le TP 3: Inverser une chaîne de caractères

1. Compiler les fichiers
javac -d build src/tprmi/*.java

2. Lancer le registre RMI
Dans le dossier build, exécutez : rmiregistry

3. Lancer le serveur
Ouvrez un autre terminal dans le dossier build et exécutez : java tprmi.ServeurInversion

4. Lancer le client
Modifiez le client pour envoyer une chaîne spécifique à inverser, par exemple :
System.out.println(service.reverseString("Hello"));
le résultat attnedu est "olleH"