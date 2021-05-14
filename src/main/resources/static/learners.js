

//Fonction - Affichage du tableau d'appreunants en cours
let displayFn_learners = function (result) {

    //On vide le tableau s'il existe
    const table = document.getElementById("learner-body");
    table.innerHTML = '';

console.log(result);
    for (let i = 0; i < result.length; i++) {

        // Je m'occupe de créer une nouvelle ligne dans le tableau
        const ligne = document.createElement("tr");
        ligne.id = result[i]["idLearner"];

        const td1 = document.createElement("td");
        td1.textContent = result[i]["idLearner"];
        ligne.appendChild(td1);

        const td2 = document.createElement("td");
        td2.textContent = result[i]["lastname"];
        ligne.appendChild(td2);

        const td3 = document.createElement("td");
        td3.textContent = result[i]["firstname"];
        ligne.appendChild(td3);

        const td4 = document.createElement("td");
        const button = document.createElement("button");
        button.textContent = "Supp";
        button.id = result[i]["idLearner"];

        button.addEventListener("click", function () {
            //Coder la suppression
                var xmlhttp = new XMLHttpRequest();
                xmlhttp.open("PUT","api/learner");
                xmlhttp.setRequestHeader("Content-Type","application/json");
                xmlhttp.send(JSON.stringify(button.id.toString()));

                //On met à jour le tableau des tickets
                const table = document.getElementById("learner-body");
                table.innerHTML = '';
                callApi(baseApiUrl, 'api/learner', 'GET', displayFn_learners);
            });


        td4.appendChild(button);
        ligne.appendChild(td4);

        const table = document.getElementById("learner-body");
        table.appendChild(ligne);
    }

}

//Chargement des Appreunants à l'ouverture de la page
callApi(baseApiUrl, 'api/learner', 'GET', displayFn_learners)



//Gestion de l'appui sur le bouton pour ajouter un Appreunant
document.getElementById("learner-form").addEventListener("submit", function (event) {
    event.preventDefault();



        //On ajoute la demande de ticket (appel api avec l'information idlearner)
        var xmlhttp = new XMLHttpRequest();
        xmlhttp.open("POST","api/learner");
        xmlhttp.setRequestHeader("Content-Type","application/json");
        console.log(new Date().toISOString())
        let firstname = document.getElementById("prenom").value;
        let lastname = document.getElementById("nom").value;
        xmlhttp.send(JSON.stringify({"firstname":firstname,"lastname":lastname}));

        //On met à jour le tableau des tickets
        callApi(baseApiUrl, 'api/learner', 'GET', displayFn_learners);
        document.getElementById("prenom").value = '';
        document.getElementById("nom").value = '';


});


