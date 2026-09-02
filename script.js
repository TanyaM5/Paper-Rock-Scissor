// Constants
const ROCK = 1;
const PAPER = 2;
const SCISSORS = 3;

const COMPUTER = 1;
const PLAYER = 2;
const TIE = 3;

// Score variables
let wins = 0;
let losses = 0;
let ties = 0;


// Play the game
function playGame(player) {

    // Generate computer's choice
    // Similar to:
    // (int) (Math.random() * OPTIONS + 1);
    const computer = Math.floor(Math.random() * 3) + 1;

    let winner = 0;

    // Determine the computer's choice
    let computerChoice = getChoiceName(computer);

    document.getElementById("computer-choice").textContent =
        "Computer's choice: " + computerChoice;


    // Determine the winner
    if (computer === ROCK) {

        if (player === SCISSORS) {
            winner = COMPUTER;
        } else if (player === PAPER) {
            winner = PLAYER;
        } else {
            winner = TIE;
        }

    } else if (computer === PAPER) {

        if (player === ROCK) {
            winner = COMPUTER;
        } else if (player === SCISSORS) {
            winner = PLAYER;
        } else {
            winner = TIE;
        }

    } else if (computer === SCISSORS) {

        if (player === PAPER) {
            winner = COMPUTER;
        } else if (player === ROCK) {
            winner = PLAYER;
        } else {
            winner = TIE;
        }
    }


    // Display the result
    if (winner === COMPUTER) {

        document.getElementById("result").textContent =
            "Computer wins!";

        losses++;

    } else if (winner === PLAYER) {

        document.getElementById("result").textContent =
            "You win!";

        wins++;

    } else {

        document.getElementById("result").textContent =
            "We tied.";

        ties++;
    }


    // Update the score
    updateScore();
}


// Convert number to choice name
function getChoiceName(choice) {

    if (choice === ROCK) {
        return "🪨 Rock";
    }

    if (choice === PAPER) {
        return "📄 Paper";
    }

    if (choice === SCISSORS) {
        return "✂️ Scissors";
    }

    return "Unknown";
}


// Update score on webpage
function updateScore() {

    document.getElementById("wins").textContent = wins;
    document.getElementById("losses").textContent = losses;
    document.getElementById("ties").textContent = ties;
}


// Reset the game
function resetGame() {

    wins = 0;
    losses = 0;
    ties = 0;

    document.getElementById("computer-choice").textContent =
        "Computer's choice: -";

    document.getElementById("result").textContent =
        "Make your choice!";

    updateScore();
}
