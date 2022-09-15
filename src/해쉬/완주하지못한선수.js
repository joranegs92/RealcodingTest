(function main() {
    console.log('Hello World!');

    let participant = ["leo", "kiki", "eden"];
    let completion = 	["eden", "kiki"];
    participant.sort();
    completion.sort();
    let test = [];
    completion.forEach((i,idx) => {
        test.push(participant.filter(z => z != i))

    });
    console.log(test)
})
();
