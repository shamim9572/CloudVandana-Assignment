function sortArrayDescending(arr) {
    return arr.sort((a, b) => b - a);
}

const inputArray = [5, 2, 9, 1, 5, 6]; // Change this to your input array
const sortedArray = sortArrayDescending(inputArray);
console.log("Sorted Array in Descending Order: " + sortedArray);
