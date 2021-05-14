

//Fonction - Affichage du tableau de ticket en cours
let displayFn_tableau = function (result) {

    //On enregistre le premier id de la table Ticket
    lastHelpRequestid = result[0]["id"];

    //On vide le tableau s'il existe
    const table = document.getElementById("table-body");
    table.innerHTML = '';

console.log(result);
    for (let i = 0; i < result.length; i++) {

        // Je m'occupe de créer une nouvelle ligne dans le tableau
        const ligne = document.createElement("tr");
        ligne.id = result[i]["idLearner"];

        const td1 = document.createElement("td");

        td1.textContent = result[i]["date"];
        ligne.appendChild(td1);

        const td2 = document.createElement("td");
        td2.textContent = result[i]["firstname"] + ' ' + result[i]["lastname"];
        ligne.appendChild(td2);

        const td3 = document.createElement("td");
        td3.textContent = result[i]["description"];
        ligne.appendChild(td3);

        const td4 = document.createElement("td");
        const button = document.createElement("button");
        button.textContent = "Je passe mon tour";

        button.addEventListener("click", function () {
            if (button.parentElement.parentElement.className === "line-through") {
                button.parentElement.parentElement.className = "";
                button.textContent = "Je passe mon tour";
            } else {
                button.parentElement.parentElement.className = "line-through";
                button.textContent = "Je veux mon tour";
            }
        });

        td4.appendChild(button);
        ligne.appendChild(td4);

        const table = document.getElementById("table-body");
        table.appendChild(ligne);
    }

}

//Chargement des tickets à l'ouverture de la page
callApi(baseApiUrl, 'api/tickets', 'GET', displayFn_tableau)


//Affichage de la liste déroulante des étudiants
let displayFn_liste = function (result){
    let selectList = document.getElementById("listeDeroulante");
    for (let i = 0; i < result.length; i++) {
        let option = document.createElement("option")
        option.value = result[i]["idLearner"];
        option.text = result[i]["firstname"] + ' ' + result[i]["lastname"];
        selectList.appendChild(option);
    }
}
callApi(baseApiUrl, '/api/learner', 'GET', displayFn_liste)



//Gestion de l'appui sur le bouton pour ajouter un ticket
document.getElementById("help-form").addEventListener("submit", function (event) {
    event.preventDefault();

    // Je récupère le nom de la personne qui veut de l'aide
    const idlearner = document.getElementById("listeDeroulante").value;
console.log(idlearner)
    // On gère le fait que l'étudiant soit déjà dans la liste de ticket
    if (document.getElementById(idlearner) !== null){
        alert("Tu as déjà un ticket d'ouvert");
    }
    else{
    //On ajoute la demande de ticket (appel api avec l'information idlearner)
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.open("POST","api/tickets");
    xmlhttp.setRequestHeader("Content-Type","application/json");
    xmlhttp.send(JSON.stringify({"date":new Date().toISOString(),"description":"test de ticket manuel","idLearner":idlearner,"open":true}));

    //On met à jour le tableau des tickets
    callApi(baseApiUrl, 'api/tickets', 'GET', displayFn_tableau);
    }

});

//Gestion du bouton "Au suivant", suppression du ticket
document.getElementById("button-next").addEventListener("click", function () {
    const nameTable = document.getElementById("table-body");

    if (nameTable.firstElementChild !== null) {
        var xmlhttp = new XMLHttpRequest();
        xmlhttp.open("PUT","api/tickets");
        xmlhttp.setRequestHeader("Content-Type","application/json");
        xmlhttp.send(JSON.stringify(lastHelpRequestid));

        //On met à jour le tableau des tickets
        const table = document.getElementById("table-body");
        table.innerHTML = '';
        callApi(baseApiUrl, 'api/tickets', 'GET', displayFn_tableau);
    }

});
