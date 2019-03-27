package dmacc.beans;

import java.util.Random;

public class Game {
	
	private String playerOne;
	private String computerPlayer;
	private String winner;
	
	public Game() {
		super();
	}
	
	public Game(String playerOne) {
		super();
		this.playerOne = playerOne;
		this.setComputerPlayer();
		this.determineWinner();
	}
	
	public void determineWinner() {
		
		if(playerOne.equals(computerPlayer)) {
			this.winner = "Tie";
		} else if(playerOne.equals("Rock")) {
			if(computerPlayer.equals("Scissors")) {
				this.winner = "Player One";
			} else if(computerPlayer.equals("Paper")) {
				this.winner = "Computer";
			}
		} else if(playerOne.equals("Paper")) {
			if(computerPlayer.equals("Rock")) {
				this.winner = "Player One";
			} else if(computerPlayer.equals("Scissors")) {
				this.winner = "Computer";
			}
		} else if(playerOne.equals("Scissors")) {
			if(computerPlayer.equals("Paper")) {
				this.winner = "Player One";
			} else if(computerPlayer.equals("Rock")) {
				this.winner = "Computer";
			}
		} else {
			this.winner = "Something went wrong...";
		}
	}

	public String getPlayerOne() {
		return playerOne;
	}

	public void setPlayerOne(String playerOne) {
		this.playerOne = playerOne;
	}

	public String getComputerPlayer() {
		return computerPlayer;
	}

	public void setComputerPlayer() {
		Random random = new Random();
		int selectionNumber = random.nextInt((2) + 1);
		
		if(selectionNumber == 0) {
			this.computerPlayer = "Rock";
		} else if(selectionNumber == 1) {
			this.computerPlayer = "Paper";
		} else if(selectionNumber == 2) {
			this.computerPlayer = "Scissors";
		} else {
			this.computerPlayer = "Something went wrong.";
		}
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

}
