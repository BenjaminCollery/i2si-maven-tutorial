# TP sur TRAVIS et GITHUB

## Travis
Ici pas de problème majeur recontré.

1. dans un premier temps ajout du .travis.yml , avec le langage, sans problème
2. puis tentative de push réussi puisque github (grâce à travis) ajoute un :white_check_mark: a côté du commit
3. puis ajout d'une défaillance dans un test unitaire du cycle de maven, ici on obtient un :x: (cela peut être utile
   si quelqu'un fait une PR qui ne valide pas les tests

En revanche faire **attention** à ce qui suit qui **est obligatoire et doit être
conservé **dans le .travis.yml** :
    on:
      branch: gh-pages
Ceci est nécessaire pour dire à travis de push le directory target générer par java directement sur la branche
gh-pages
Ensuite pas de problème pour que travis push le site sur gh-pages


## GITHUB Dernière partie du tp
Procédure pour tracker le projet de quelqu'un :
1. git remote -v : donne la liste de tous les remote qu'on suit
2. git branch anto-master antonin/master : ajoute une branche dans notre local repository (ici la branche 
   master d'antonin)
3. git checkout anto-master : met à jour les fichiers dans le working directory pour matcher avec la version
   stockée sur git
4. git add ....
5. git commit -a -m"added ...."
6. git push origin anto-master : permet de push sur la branche anto-master
7. enfin on peut faire une PR à Antonin à partir de anto-master

