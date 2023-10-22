function reverseWordsInSentence(sentence) {
    
    let words = sentence.split(' ');
    
    // Reverse each word and store them in a new array
    let reversedWords = words.map(word => {
        return word.split('').reverse().join('');
    });
    
    // Join the reversed words to form the reversed sentence
    let reversedSentence = reversedWords.join(' ');
    
    return reversedSentence;
}

const inputSentence = "This is a Coder"; 
const reversedSentence = reverseWordsInSentence(inputSentence);
console.log(reversedSentence);
