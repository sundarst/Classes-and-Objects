package classAndObject;

class Team
{
	String name;
	String city;
	String division;
	
	public void playGame()
	{
		System.out.println("Let start to play footBall");
	}
	public void hireCoach()
	{
		System.out.println("coach call the team for traing");
	}
	
}
class Player extends Team
{
	 String name;
	String position;
	int jerseyNumber;
	Team team; //hash a relation ship
	//Team team=new Team();
	//public void playGame()
	//{
		//System.out.println("");
//	}
	public void train()
	{
		//team.playGame();
		System.out.println("Is Ramco fc in traing ");
	}
	

}



public class Dtoclasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player=new Player();
		player.train();
	}

}
