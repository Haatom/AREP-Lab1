var front = (function(){

    return {

        connection : function(name, numero){
            var url = 'https://conversortemperatura.herokuapp.com/' + name + '/' + numero
                        fetch(url, {
                            method: 'GET',
                            headers: {
                                "Content-type": "application/json"
                            }
                        })
                            .then(response => response.json())
                            .then(json => $('#respuesta').html(json.respuesta))
        }
    }
})();