const prompt = require('prompt-sync')();
var regExp = /[^0-1]/;
const b1 = prompt('Enter first number : ');            
if(b1.match(regExp)){
  console.log("Invalid input, non binary");
  process.exit(1);
} else {
  
}
const b2 = prompt('Enter first number : ');            
if(b2.match(regExp)){
  console.log("Invalid input, non binary");
  process.exit(1);
} else {
  
}
let result;
const operator = prompt('Enter operator ( either +, -, * or / ): ');
var number1=parseInt(b1,2);
var number2=parseInt(b2,2);

switch(operator) {
    case '+':
         result = number1 + number2;
        console.log(`result is`, result.toString(2));
        break;

    case '-':
         result = number1 - number2;
         console.log(`result is`, result.toString(2));
        break;

    case '*':
         result = number1 * number2;
         console.log(`result is`, result.toString(2));
        break;

    case '/':
         result = number1 / number2;
         console.log(`result is`, result.toString(2));
        break;

    default:
        console.log('Invalid operator');
        break;
}