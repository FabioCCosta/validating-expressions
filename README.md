# session 6

Problem

Check open-close brackets

Every time that you build your own JSON, it is important to keep brackets in mind to avoid bad format.
Write a function isValidBrackets(String s) to check if it is opened-closed properly.
if it is correct, return true; if is not return BadFormatException

e.g correct = String s = "(){{}   {} {}{} {{}}}";
e.g wrong   = String s = "{{}}}";


// requisito 1
// aceitar () --- dica pode ser feito com contadores , mas é melhor utilizar alguma estrutura de dados

e.g correct = String s = "(){{}   {} {}{} {{}}}";
e.g wrong 1 = String s = "{)}(";
e.g wrong 2 = String s = "{(})";

// requisito 2
// respeitar ordem de precedência {[()]} -- utilizar estrutura de dados

e.g correct = String s = "{[]}{}";
e.g wrong 1 = String s = "({})";
e.g wrong 2 = String s = "{(})";
