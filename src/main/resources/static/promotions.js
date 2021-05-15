

//Fonction - Affichage du tableau des promotions en cours
let displayFn_promotions = function (result) {

    //On vide le tableau s'il existe
    const table = document.getElementById("promotion-body");
    table.innerHTML = '';

    console.log(result);
    for (let i = 0; i < result.length; i++) {

        // Je m'occupe de créer une nouvelle ligne dans le tableau
        const ligne = document.createElement("tr");
        ligne.id = result[i]["id"];

        const td1 = document.createElement("td");
        td1.textContent = result[i]["id"];
        ligne.appendChild(td1);

        const td2 = document.createElement("td");
        td2.textContent = result[i]["promotionName"];
        ligne.appendChild(td2);


        const td4 = document.createElement("td");
        const button = document.createElement("button");
        button.textContent = "Supprimer";
        button.id = result[i]["id"];

        button.addEventListener("click", function () {
            //Coder la suppression
            var xmlhttp = new XMLHttpRequest();
            xmlhttp.open("PUT","api/promotion");
            xmlhttp.setRequestHeader("Content-Type","application/json");
            xmlhttp.send(JSON.stringify(button.id.toString()));

            //On met à jour le tableau des promotions
            callApi(baseApiUrl, 'api/promotion', 'GET', displayFn_promotions());
        });


        td4.appendChild(button);
        ligne.appendChild(td4);

        const table = document.getElementById("promotion-body");
        table.appendChild(ligne);
    }

}

//Chargement des Promotions à l'ouverture de la page
callApi(baseApiUrl, 'api/promotion', 'GET', displayFn_promotions)



//Gestion de l'appui sur le bouton pour ajouter une Promotion
document.getElementById("promotion-form").addEventListener("submit", function (event) {
    event.preventDefault();



    //On ajoute la promotion (appel api avec l'information id_promotion)
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.open("POST","api/promotion");
    xmlhttp.setRequestHeader("Content-Type","application/json");
    console.log(new Date().toISOString())
    let nom = document.getElementById("nom").value;
    xmlhttp.send(JSON.stringify({"promotionName":nom}));

    //On met à jour le tableau des promotion
    callApi(baseApiUrl, 'api/promotion', 'GET', displayFn_promotions);
    document.getElementById("nom").value = '';


});
