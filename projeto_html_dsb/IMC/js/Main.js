import { CalcIMC } from "../js/CalcIMC.js";

document.getElementById('frmImc').addEventListener('submit',function(event){
     event.preventDefault()
     const nomeForm = document.getElementById('txtNome').value
     const pesoForm = document.getElementById('nmbPeso').value
     const alturaForm = document.getElementById('nmbAltura').value

     let imc = new CalcIMC(nomeForm,pesoForm,alturaForm)

    document.getElementById('print').innerHTML = 
    `Nome é: ${imc.getNome()} com o Peso: ${imc.getPeso()} e a sua Altura: ${imc.getAltura()}`
})