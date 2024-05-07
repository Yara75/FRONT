**SAFRAOUI Dounia - TOURE Mariama - FLEURY CALAIS Camille**

# Projet CV en ligne

## I. Mise en place

Après avoir télécharger les fichier, ouvrez le répertoire **back** comme un projet sur Intellij IDEA Ultimate :
- lancer l'image Docker contenant la base de données avec la commande ```docker-compose up```
- établissez ensuite une connexion avec la base de donnée depuis l'interface d'Intellij
- pour créer les tables dans la base de donnée, exécutez sur celle-ci les fichiers SQL ```initdb/1_TABLES.sql```
- le fichier ```initdb/2_DEFAULT_ENTRIES.sql``` permet de créer des entrées par défaut dans la base de données
- vous pouvez ensuite lancer le projet
- si la ligne ```#### Application working ####``` apparaît en sortie alors le back end fonctionne parfaitement

Vous pouvez ensuite vous placer dans le répertoire **front** et lancer les commande ```npm i``` et ```npm start```.

L'application web sera accessible depuis un navigateur via l'URL <http://localhost:4200/>.

## II. Fonctionnalités

Le propriétaire du CV a accès à l'ensemble des onglets tandis qu'un visiteur ne peut avoir accès que à la page pages d'accueil et à la page d'envoie de message (il n'était pas demandé de réaliser un système d'authentification).

Le propriétaire de l'application peut modifier des lignes sur l'onglet **Update**, supprimer des lignes sur la page **Suppression**, en ajouter sur l'onglet **Saisie** et voir les messages envoyés par les visiteur du site dans la **Boîte de Réception**.

Un visiteur peut visualiser le CV sur la page d'accueil et envoyer des messages au propriétaire du CV sur la page **Envoyer un message**.