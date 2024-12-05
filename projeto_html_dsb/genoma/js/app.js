class Sequencia {
    constructor(dna, classificacao) {
      this.dna = dna;
      this.classificacao = classificacao;
      this.rna = null;
    }
  
    sequenciarDNA() {
      return this.dna.replace(/A/g, "T").replace(/T/g, "A").replace(/C/g, "G").replace(/G/g, "C");
    }
  
    transcreverRNA() {
      this.rna = this.dna.replace(/T/g, "U");
    }
  }
  
  class BancoSequencias {
    constructor() {
      this.sequencias = [];
    }
  
    adicionarSequencia(sequencia) {
      this.sequencias.push(sequencia);
      this.exibirSequencias();
    }
  
    removerSequencia(index) {
      this.sequencias.splice(index, 1);
      this.exibirSequencias();
    }
  
    exibirSequencias() {
      const listaSequencias = document.getElementById('listaSequencias');
      listaSequencias.innerHTML = '';
      this.sequencias.forEach((seq, index) => {
        listaSequencias.innerHTML += `
          <div class="lista-item">
            <span>DNA: ${seq.dna} | Classificação: ${seq.classificacao} | RNA: ${seq.rna || 'N/A'}</span>
            <button onclick="bancoSequencias.removerSequencia(${index})">Remover</button>
          </div>
        `;
      });
    }
  }
  
  const bancoSequencias = new BancoSequencias();
  
  function sequenciar() {
    const dnaInput = document.getElementById('dnaInput').value;
    const sequencia = new Sequencia(dnaInput);
    const dnaComplementar = sequencia.sequenciarDNA();
    document.getElementById('result').innerText = Sequência complementar de DNA: ${dnaComplementar};
    document.getElementById('transcricaoButton').style.display = 'block';
  }
  
  function transcrever() {
    const dnaInput = document.getElementById('dnaInput').value;
    const sequencia = new Sequencia(dnaInput);
    sequencia.transcreverRNA();
    document.getElementById('result').innerText += \nSequência de RNA-m: ${sequencia.rna};
  }
  
  function adicionarSequencia() {
    const dna = document.getElementById('sequencia').value;
    const classificacao = document.getElementById('classificacao').value;
    const novaSequencia = new Sequencia(dna, classificacao);
    bancoSequencias.adicionarSequencia(novaSequencia);
    document.getElementById('sequencia').value = '';
    document.getElementById('classificacao').value = '';
  }