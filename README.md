# Medilabo

Medilabo est une application à destination des praticiens pour aider à détecter le diabète de type 2. 

L’application permet :
- d’enregistrer les données démographiques (nom, âge) des patients
- d’ajouter des notes de compte rendu de visite
- de classifier le risque qu’un patient développe un diabète en fonction des éléments précédemment saisis.


## Infos
- Java version 17
- Spring Boot 3.0.4
- Spring Cloud 4.0.1
- Mysql 8.0.32 
- MongoDB 7.0.5
- Docker Engine 26.0.0


## Microservices
Application en microservices dockérisés comprenant un service Interface Utilisateur (UI), une Gateway (Spring Cloud Gateway), 3 microservices métiers.
Le microservice Medilabo_Patient communique avec le SGBDR MySQL, MongoDB est utilisé pour les données NoSQL exploitées par le microservice Medilabo_Note

![img.png](img.png)

- Lien Medilabo_Patient : addMedilabo_Patient
- Lien Medilabo_Note : addMedilabo_Note
- Lien Medilabo_Assessment : addMedilabo_Assessment
- Lien Medilabo_UI : addMedilabo_UI

## Execution
- Après lancement de docker, la construction et le démarrage du conteneur s'effectue via la commande `docker-compose up --build`


- Le site est accessible a l'adresse : [http://localhost:8090/login](http://localhost:8090/login)


- La connexion disponible par défaut est :
  - username : user
  - password : medilabo


   L'ajout d'habilitation à d'autres utilisateurs peut s'effectuer via Postman avec le end point [POST] http://localhost:8888/api/auth/signup avec en Body :
   {
   "username": "nom_utilisateur",
   "password": "mot_de_passe_utilisateur"
   }

   La déconnexion utilisateur s'effectue avec le end point [POST] http://localhost:8888/api/auth/signout

## Green Code

Le "green code" fait référence à l'ensemble des pratiques et des principes visant à réduire l'empreinte écologique des logiciels et des systèmes informatiques. Cela implique de concevoir, développer et exploiter des logiciels de manière à minimiser leur consommation d'énergie, leur production de déchets électroniques et leur impact environnemental global.

Les aspects du "green code" peuvent inclure l'optimisation des algorithmes pour réduire la consommation de ressources, la programmation efficace pour minimiser l'utilisation de la mémoire et du processeur, la conception de logiciels éco-énergétiques et la mise en œuvre de bonnes pratiques en matière de gestion des ressources. En résumé, le "green code" vise à promouvoir le développement de logiciels durables et respectueux de l'environnement.

 Les actions complémentaires ci après peuvent être menées pour appliquer le "green code" à ce projet :

- Optimisation du modèle de données :
Adapter la taille des colonnes en fonction des contraintes : taille des champs à spécifier
Supprimer le lien n-n dans le modèle des habilitations entre un utilisateur et un rôle : Si un unique rôle est à définir, sa valeur peut être directement stocker dans la table users.

- Optimisation de l’infrastructure : 
En fonction des contraintes de disponibilité et de charge, il peut ne pas être nécessaire de déployer les différents microservices sur des serveurs distincts

- Maitrise de la volumétrie en base de données (SQL / NoSQL) :
En fonction des contraintes réglementaires et métiers, mettre en place des règles de suppression de données

