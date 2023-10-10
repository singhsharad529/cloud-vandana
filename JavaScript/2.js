// 2. Perform sorting of an array in descending order.
// Performing Selection Sort

function arraySort(arr) {
    const n = arr.length;

    for (let i = 0; i < n - 1; i++) {
        for (let j = 0; j < n - i - 1; j++) {
            if (arr[j] < arr[j + 1]) {
                const temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

const arr = [10, 34, 2, 5, 1, 9, 0];

arraySort(arr);

console.log(arr);
