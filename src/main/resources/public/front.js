var front = (function(){

    return {

        connection : function(name, numero){
            var url = 'http://localhost:4567/convertidor/' + name + '/' + numero
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