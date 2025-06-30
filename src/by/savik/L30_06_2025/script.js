document.addEventListener('DOMContentLoaded', () => {

const ajaxBtn = document.getElementById('myButton');
const ajaxBtn2 = document.getElementById('mybutton2');
const ajaxBtn3 = document.getElementById('mybutton3');
const ajaxBtn4 = document.getElementById('mybutton4');
const url = 'https://jsonplaceholder.typicode.com/posts/1';
const url2 = 'https://jsonplaceholder.typicode.com/posts';

ajaxBtn.addEventListener('click', () => {
    const xhr = new XMLHttpRequest();
    xhr.open('GET',
        url, true);
        xhr.onreadystatechange = function () {
            if(xhr.readyState === 4 && xhr.status === 200){
                const post = JSON.parse(xhr.responseText);
                console.log(post);
                const p = document.createElement('p');
                p.textContent = post.title;
                document.body.appendChild(p);
            }
        };
        xhr.send();
})

ajaxBtn2.addEventListener('click', () => {
    fetch(url).then(response => {
        if(!response.ok) throw new Error('Ошибка сети');
        return response.json();
    }).then(data => console.log(data))
    .catch(error => console.error(error));
})

ajaxBtn3.addEventListener('click', () => {
    getPost();
})
ajaxBtn4.addEventListener('click', () => {
    postPost();
})

async function getPost(){
    try {
        const response = await fetch(url);
        if(!response.ok) throw new Error('Ошибка сети');
        const data = await response.json();
        console.log(data);
    }
    catch(error){
        console.error(error);
    }
}

async function postPost(){
    try {
        const response = await fetch(url2, {
            method: 'POST',
            headers: {'Content-Type': 'application/json'},
            body: JSON.stringify({
                title:'новый пост', 
                body: 'Содержимое', 
                userId: 1})
        });
        if(!response.ok) throw new Error('Ошибка сети');
        const data = await response.json();
        console.log(data);
    }
    catch(error){
        console.error(error);
    }
}

})
