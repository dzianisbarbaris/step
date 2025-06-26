document.addEventListener('DOMContentLoaded', () => {
console.log('DOM полностью загружен');
const userInput = document.getElementById('userInput');
const mainHeader = document.getElementById('mainHeader');
const mainText = document.getElementById('mainText');
const changeTextBtn = document.getElementById('changeTextBtn');
const addListItemBtn = document.getElementById('addListItemBtn');
const highlightHeaderBtn = document.getElementById('highlightHeaderBtn');
const removeLastItemBtn = document.getElementById('removeLastItemBtn');
const itemList = document.getElementById('itemList');

changeTextBtn.addEventListener('click', () => {
    const inputValue = userInput.value;
mainText.textContent = inputValue ? inputValue : "Введите текст в поле!";    
})

addListItemBtn.addEventListener('click', () => {
    const newItem = document.createElement('li');
    newItem.textContent = `Элемент ${itemList.children.length +1}`;
    //dnewItem.textContent = 'Элемент' + (itemList.children.length +1); то же самое что и строка сверху
    itemList.appendChild(newItem);
})

highlightHeaderBtn.addEventListener('click', () => {
    mainHeader.classList.toggle('highlight');
})

removeLastItemBtn.addEventListener('click', () => {
    if (itemList.lastChild){
        itemList.removeChild(itemList.lastChild)
    }
})

mainHeader.addEventListener('mouseover', () => {
    mainHeader.style.color = 'red';
})

mainHeader.addEventListener('mouseout', () => {
    mainHeader.style.color = '';
})

})