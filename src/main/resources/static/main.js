//Variable de récupération de l'id de ticket le plus petit
let lastHelpRequestid = 0;


//Url serveur distant
const baseApiUrl = 'http://localhost:8080/';

//Fonction API
async function callApi(url, request, type, displayFn) {
    //Temporisation pour mettre à jour le tableau de ticket
    await new Promise(r => setTimeout(r, 100));
    let urlFull;
    //type = 'GET';
    urlFull = baseApiUrl + request;
    //console.log(urlFull);

    fetch(urlFull).then(function (response) {
        response.json().then(function (result) {
            //Execution de la fonction d'affichage envoyée en paramètre
            //console.log(result);
            displayFn(result);
        });
    }).catch(function (error) {
        console.log('Il y a eu un problème avec la récupération des données' + error.message);
    })
}