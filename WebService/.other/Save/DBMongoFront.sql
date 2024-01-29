use cars_dealer;

db.conversation.insert({ sender: 1, receiver: 2 , texte: "bonjour aidvyzsdcqbvj", ajout: new Date()})

db.photoVoiture.insert({idVoiture : 1, image : new BinData(0, "base64_encoded_image_data")})

db.photoProfile.insert({idUser : 1, image : new BinData(0, "base64_encoded_image_data")})

db.createUser({
  user: "admin",
  pwd: "admin",
  roles: ["readWrite", "dbAdmin"]
})


db.conversation.find()
db.phototVoiture.find()
db.photoProfil.find()