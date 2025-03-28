const container = document.getElementById('data-container');
fetch('www.linkedin.com/in/phoebe-mae-montaño-almario-073053359')
    .then(response => response.json())
    .then(data => {
        container.innerHTML = '<h2>Data Fetch Successful</h2>';
        container.innerHTML += '<p>' + JSON.stringify(data) + '</p>';
    })
    .catch(error => {
        container.innerHTML = '<h2>Data Fetch Failed</h2>';
        console.error('Error:', error);
    });
