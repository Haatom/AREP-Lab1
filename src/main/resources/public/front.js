var front = (function(){

    return {

        connection : function(name, numero){
            //var urlHeroku = 'https://conversortemperatura.herokuapp.com/convertidor/' + name + '/' + numero
            // http://localhost:4567/index.html
            var url = 'https://conversortemperatura.herokuapp.com/convertidor/' + name + '/' + numero
                        fetch(url, {
                            method: 'GET',
                            headers: {
                                "Content-type": "application/json"
                            }
                        })
                            .then(response => response.json())
                            .then(json => $('#respuesta').html(json.respuesta))
        },

        convertir : function (numero){
            let tipo = document.getElementById("idTipo").value;
            this.connection(tipo, numero)
        }
    }
})();