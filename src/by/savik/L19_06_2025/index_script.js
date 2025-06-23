//Комент
//alert();
let message = 'Текст';
let a = 10;
let b = 2.2;
let c = true;

var g = 'Старый браузер';


const MESS = 'Неизменяемая переменная';
console.log(MESS);

c = String(c);

let y = '23';
y = Number(y);
console.log(Number(true));

let n = Boolean(1);
console.log(n);

console.log(typeof 5);

let h = 5**2;
h++;

let age = 36;
if(age === 35) {
    alert('Мне' + age);
} else if (age === 36){
    console.log('Угадал');
}
else {
    console.log('Не угадал');
}

age > 30 ? console.log("больше") : console.log('меньше');

let i = 5;
while(i < 10) {
    console.log('Итерация ' + i);
    i++;
}

for (let i = 0; i < 3; i++) {
    console.log('For ' + i);
    if (i === 1) {
        continue;
    }
    if (i === 2) {
        break;
    }
}

switch (i) {
    case 1:
        console.log('Один');
        break;
        case 2:
        console.log('Два');
        break;
        default:
        console.log('Другое');
}

function showMyaAge(k = 12) {
    console.log(k);
}
showMyaAge();

for (let i = 0; i < 10; i++){
showMyaAge();
}

function sum (a, b) {
    return a+b;
}
let mySum = sum(2, 5);

let sum2 = (a, b) => a + b;

let sayHi = () => alert('Привет');
sayHi();

let user = new Object();
let user2 = {};
let user3 ={
    name: "Дима",
    age: 35,
    email: "dima@gmail.com",
    "likes play pc games": true
}
console.log(user3);
 let userName = user3.name;
 user3.lastName = 'Попов';

 console.log(user3);

 user3["likes play pc games"];
let play = user3["likes play pc games"];
user3["name"];

user3["like sleep"] = true;
console.log(user3);

if (user3.adress === undefined) {

}

if ("adress" in user3) {

}

for (key in user3){
    console.log(key);
    console.log(user3[key]);
}

let user4 = user3;
user3.age = 50;
console.log(user4);
console.log(user3);

user3 === user4 // true


let user5 = {};
let user6 = {};
user5 === user6 //false

let user7 = {};
for(key in user3) {
    user7[key] = user3[key];
}

let user8 = {};
Object.assign(user8, user3);
let user9 = Object.assign({}, user3);

delete user3["likes play pc games"];

user3.adress = {
    city: "Витебск",
    street: {
        house: 12,
        label: "Fun street"
    }
}

for (key in user3){
    console.log(key);
    let u = user3[key];
    if (typeof user3[key] === 'object'){
        for (key2 in u) {
            console.log(key2);
            let u2 = u[key2];
            if (typeof u2 === 'object'){
                for(key3 in u2) {
                    console.log(key3);
                }
            }
        }
    }
}


let user10 = {
    name: 'Лука',
    age: 38,
    sayHi() {
        alert('Привет. Меня зовут ' + this.name)
    }
}

user10.sayHi();

function User10(name, age){
    this.name = name;
    this.age = age;
    this.sayHi = function() {
        alert("Меня зовут " + this.name);
    }
}
let user11 = new User10("Борис", 55);


let str = "Привет";
console.log(str.toUpperCase());
let num = 1.234567
console.log(num.toFixed(2));

//Массивы (работают как List в Java)
let arr = new Array();
let arr2 = [];
let arr3 = ['Яблоко', 'Банан'];
arr3[2] = 'Груша';
arr3.length; //Длина массива

arr3[3] = () => alert('Привет');
arr3.push('Валера'); //Добавить эл-т в конец списка
arr3.pop(); //Удаляет последний элемент
arr3.shift(); //Удаляет первый эл-т из массива
arr3.unshift("Слива"); //Добавляет первый эл-т в массив

for(let fruit of arr3) {
    console.log(fruit);
}