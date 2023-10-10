// 1. Take a sentence as an input and reverse every word in that sentence.
// Example - This is a sunny day > shiT si a ynnus yad.

const reverseWord = (str, i, j) => {
    let reverse = "";
    while (i <= j) {
        reverse += str[j];
        j--;
    }
    return reverse;
}

const solve = (str) => {
    let ans = "";
    let j = 0;
    let n = str.length;
    for (let i = 0; i < n; i++) {
        if (str[i] == ' ') {
            ans += reverseWord(str, j, i - 1) + " ";
            j = i + 1;
        }
    }

    ans += reverseWord(str, j, n - 1) + " ";

    return ans;
}

var str = "This is a sunny day";
var ans = solve(str);
console.log(ans);
