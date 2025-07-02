
let student = {
    name: "Вася",
    age: 18,
    group: "Е-345"
}
console.log(student);

let car = {
  brand: "Toyota",
  model: "Corolla",
  year: 2020
};
car.year = 2022;
car.color ="Синий";
console.log(car);

function countProperties (obj){
let i = 0;
for(key in obj){
    i++;
}
return i;
}
let length = countProperties(car);
console.log(length);


let n = 5;
for(let i = 1; i <= n; i++){
    console.log(i);
}

let array = [10, 20, 30, 40, 50];
let sum = 0;
for(let el of array){
    sum += el;
}
console.log(" сумма " + sum);


let fruits = ["яблоко", "банан", "апельсин", "груша"];
for(let i = 0; i < fruits.length; i++){
    if(fruits[i] === 'апельсин'){
        console.log(" индекс апельсина " + i);
        break;
    }
}


let book = {
  title: "JavaScript для начинающих",
  author: "Иван Петров",
  pages: 200,
  price: 1500
};
for(key in book){
    console.log( key + ": " + book[key]);
}

let students = [
  { name: "Алексей", age: 20, group: "ПИ-101" },
  { name: "Мария", age: 19, group: "ПИ-102" },
  { name: "Иван", age: 21, group: "ПИ-101" }
];
for(let i = 0; i < students.length; i++){
    if(students[i].group === "ПИ-101"){
        console.log(students[i].name);
    }
}
students.forEach (student => {
    if(student.group === "ПИ-101"){
        console.log(student.name);
    }
});

let products = {
  "ноутбук": 50000,
  "телефон": 30000,
  "наушники": 8000,
  "мышь": 2000
};

let maxValue = 0;
let itemProduct;

for(let item in products){
    if(products[item] > maxValue){
        maxValue = products[item];
        itemProduct = item;
    }
}
console.log('самый дорогой товар: '+ itemProduct +'('+ maxValue + ")");



