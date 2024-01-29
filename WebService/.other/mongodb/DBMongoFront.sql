use cars_dealer;

db.createUser({
  user: "admin",
  pwd: "admin",
  roles: ["readWrite", "dbAdmin"]
})






db.conversation.insert({ 
  sender: 1, 
  receiver: 2 , 
  texte: "bonjour aidvyzsdcqbvj", 
  ajout: new Date()
})

db.conversation.insert({
  sender: 2,
  receiver: 2,
  texte: "Salut, comment ça va ?",
  ajout: new Date()
})

db.conversation.insert({
  sender: 3,
  receiver: 1,
  texte: "Ça va bien, merci !",
  ajout: new Date()
})

db.conversation.insert({
  sender: 4,
  receiver: 1,
  texte: "Bonjour à tous !",
  ajout: new Date()
})






db.photoVoiture.insert({
  idVoiture : 1, 
  image : new BinData(0, "base64_encoded_image_data")
})

db.photoVoiture.insert({
  idVoiture: 2,
  image: new BinData(0, "base64_encoded_image_data_1")
})

db.photoVoiture.insert({
  idVoiture: 3,
  image: new BinData(0, "base64_encoded_image_data_2")
})

db.photoVoiture.insert({
  idVoiture: 4,
  image: new BinData(0, "base64_encoded_image_data_3")
})










db.photoProfile.insert({
  idUser : 1, 
  image : new BinData(0, "base64_encoded_image_data")
})

db.photoProfile.insert({
  idUser: 2,
  image: new BinData(0, "base64_encoded_image_data_profile_1")
})

db.photoProfile.insert({
  idUser: 3,
  image: new BinData(0, "base64_encoded_image_data_profile_2")
})

db.photoProfile.insert({
  idUser: 4,
  image: new BinData(0, "base64_encoded_image_data_profile_3")
})



db.conversation.find()
db.phototVoiture.find()
db.photoProfil.find()