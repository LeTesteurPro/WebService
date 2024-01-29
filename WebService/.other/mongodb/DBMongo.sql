mongo

show dbs

use ma_base_de_donnees

show collections

db.ma_collection.insert({ champ1: "valeur1", champ2: "valeur2" })

db.ma_collection.find()

db.ma_collection.find({ champ: "valeur" })

db.ma_collection.update({ champ: "valeur" }, { $set: { champ_a_mettre_a_jour: "nouvelle_valeur" } })

db.ma_collection.remove({ champ: "valeur" })

db.ma_collection.remove({})

db.ma_collection.aggregate([ { $group: { _id: "$champ", total: { $sum: 1 } } } ])

mongoexport --db ma_base_de_donnees --collection ma_collection --out export.json

mongoimport --db ma_base_de_donnees --collection ma_collection --file export.json

db.ma_collection.findOne({}, { sort: { _id: -1 } })

db.ma_collection.findOne({}, { mes_elements: { $slice: -1 } })


db.createUser({
  user: "nom_utilisateur",
  pwd: "mot_de_passe",
  roles: ["readWrite", "dbAdmin"]
})

db.dropUser("nom_utilisateur")

show users



use ma_base_de_donnees

db.ma_collection.insert({ key: "value" })

db.ma_collection.find()

db.utilisateurs.find({ age: { $gte: 21 } })