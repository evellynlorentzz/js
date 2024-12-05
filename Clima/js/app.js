const apiKey = '21edcef46efb1946b5473bb1664fd822'; // Altere para sua cidade desejada
var city = 'Osasco';
var temperatureElement = document.getElementById('temperature');
var weatherImageElement = document.getElementById('weather-image');

// Evento de click para pegar a cidade do input
document.getElementById('searchButton').addEventListener('click', function () {
    var textInput = document.getElementById('textInput').value;
    city = textInput;
    document.getElementById('textInput').value = ''; // Limpa o campo de texto após a pesquisa

    fetchWeatherData();
});

// Função para buscar dados de clima
async function fetchWeatherData() {
    try {
        var response = await fetch (`https://api.openweathermap.org/data/2.5/weather?q=${city}&units=metric&appid=${apiKey}`);
        var data = await response.json();
        var temperature = data.main.temp;
        updateWeatherDisplay(temperature);
    } catch (error) {
        temperatureElement.textContent = "Erro ao obter dados do clima.";
    }
}
function updateWeatherDisplay(temperature) {
    temperatureElement.textContent = `Temperatura: ${temperature}°C`;

        if (temperature > 30) {
        weatherImageElement.innerHTML = `<img src="img/escaldante.jpg" alt="Clima escaldante" id= "foto">`;
    }
    else if (temperature >= 19 && temperature <= 29.99) {
        weatherImageElement.innerHTML = `<img src="img/dia_ensolarado.jpg" alt="Dia ensolarado" id= "foto">`;
    }
    else if (temperature >= 9 && temperature < 19.99) {
        weatherImageElement.innerHTML = `<img src="img/dia_nublado.jpg" alt="Clima nublado" id= "foto">`;
    }
    else if (temperature >= 1 && temperature < 9.99) {
        weatherImageElement.innerHTML = `<img src="img/geada.jpg" alt="Clima frio com geada" id= "foto>`;
    }
    else {
        weatherImageElement.innerHTML = `<img src="img/neve_frio.jpg" alt="Clima com neve" id= "foto">`;
    }
}