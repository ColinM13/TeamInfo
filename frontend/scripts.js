//var teamColors = ["#006847", "#00538C", "#C0111F", "#041E42", "#d11241"];

function getRandomTeam() {
    fetch('http://localhost:8080/teams/random')
    .then(response => response.json())
    .then(data => appendSingleTeam(data))
    .catch(error => console.log(error));
}

function appendData(data) {
    var mainContainer = document.getElementById("list-the-teams");
    mainContainer.innerHTML = null;
    for(var i = 0; i < data.length; i++) {
        var div = document.createElement("div");
        div.innerHTML = '' + data[i].city + ' ' + data[i].name;
        mainContainer.appendChild(div);
    }
}

function appendSingleTeam(data) {
    var mainContainer = document.getElementById("list-the-teams");
    mainContainer.innerHTML = null;

    var div = document.createElement("div");
    div.innerHTML = '' + data.city + ' ' + data.name;
    mainContainer.appendChild(div);

    document.body.style.backgroundColor = data.primaryColor;
}