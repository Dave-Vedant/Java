package vedant.learningPhase;

import static java.lang.System.out;

public class Main {

	public static void main(String[] args) {
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;

//-------------------------------------------------< calling functions >------------------------------------------------
		calculateScore(true, 800, 5, 100);
		calculateScorecard(true, 10000, 8, 200);

		int highScore = calculateScore(gameOver,score,levelCompleted,bonus);
		out.println("Your final highScore was: " + highScore);

		int highScorePosition = calculateHighScorePosition(1500);
		displayHighScorePosition("Timi",highScorePosition);

		highScorePosition = calculateHighScorePosition(500);
		displayHighScorePosition("BobTheBuilder",highScorePosition);

		highScorePosition = calculateHighScorePosition(99);
		displayHighScorePosition("Gen",highScorePosition);

		highScorePosition = calculateHighScorePosition(300);
		displayHighScorePosition("Tom",highScorePosition);
	}

//-----------<  define method (same as python def function method , so need to write second time) >---------------------
	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus) + 2000;
			out.println("Your final score was " + finalScore);
		}

		return score;
	}

	public static int calculateScorecard(boolean gameOver, int score, int levelCompleted, int bonus) {

		if (gameOver) {
			int finalScorecard = score + (levelCompleted * bonus) + 2000;
			out.println("Your final score was " + finalScorecard);
			return finalScorecard;   // Error : this thing only return when game over is completed,
			                        // not when false but we still want output for that, so add new return statement.
		}
	return -1;	 // Why? (-1)...because, in false case of logic return ,it is not logical related to case but, still ok!


	}
	/*---------------------------------------------< Our understanding... >----------------------------------------------
	 Structure:
	main {
		main string[arg]{
		   logic + (must contain output or calling function of the other code here.
	   }
	   new method {
	      logic
	   }
	   important: we must need to call all the functions in the main string[arg].
	 */

//===================================================< Concept Challenge >==============================================

	//Now, solve Logical challenge for player highScore and  HigherPosition;


	public static void displayHighScorePosition(String playerName, int HighScorePosition) {
		out.println(playerName + " managed to get into position "
		+ HighScorePosition + " on the high score table");
	}

	public static int calculateHighScorePosition(int playerScore){
		if (playerScore >=1000){
			return 1;
		} else if (playerScore >=500 && playerScore <1000){
			return 2;
		} else if (playerScore >=100 && playerScore <500){
			return 3;
		} else{
			return 4;
		}
	} //here, if delete else and put return 4 out of if then its easy to optimize code
	//                           ----OR-----
	// define return 4 and then apply score based logic (if) , then if condition not satisfied then return 4 at least...
}









