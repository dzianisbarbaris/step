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
