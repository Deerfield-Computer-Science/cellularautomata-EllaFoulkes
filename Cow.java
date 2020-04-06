import java.util.ArrayList;

public class Cow extends Animal{
//	Cow sam;
	public Cow (Location l, World w) {
		super (l,w);

//		sam = new Cow (l,w);
	
	}
	
	public void reproduce() {

//myWorld.getCreatureList().get(i).getMyLocation().getY()>=
//Need to figure out how to pass a parameter into reproduce so we can know location to put offspring

//		for (int i=0; i<=sam.getMyLocation().getY()+1; i++) {
//			for (int j=0; j<sam.getMyLocation().getX()+1; j++) {
//				testLoc
//			}
//		}
//		LifeForm testingSpot;
//		ArrayList <Location>surroundingCoordsOrigional = new ArrayList<Location>();
////		surroundingCoordsOrigional=sam.getSurroundings();
//		surroundingCoordsOrigional=getSurroundings();
//		System.out.println("here4");
//		int surroundingCount =0;
//		ArrayList <Location> newSurroundingCoords = new ArrayList<Location>();
//		System.out.println("here5 " + surroundingCoordsOrigional.size());
//		System.out.println("width "+myWorld.getWidth());
//		System.out.println("index i think "+ surroundingCoordsOrigional.get(0).getX()+(myWorld.getWidth()*(surroundingCoordsOrigional.get(0).getY()-1)));
//		for (int j=0; j<surroundingCoordsOrigional.size(); j++) {
//			testingSpot=myWorld.getCreatureList().get(surroundingCoordsOrigional.get(j).getX()+myWorld.getWidth()*surroundingCoordsOrigional.get(j).getY());
//			newSurroundingCoords=testingSpot.getSurroundings();
//			for (int i=0; i<surroundingCoordsOrigional.size(); i++) {
//				if (myWorld.getCreatureList().get(newSurroundingCoords.get(i).getX()*newSurroundingCoords.get(i).getY()).isDead()!=true){
//					surroundingCount++;
//				}
//			}
//			System.out.println("going around spot" + j +" surrounding counter reads :" + surroundingCount);
//			if (surroundingCount>=3) {
//				System.out.println("should hit here");
//				myWorld.getCreatureList().add(new Cow(testingSpot.getMyLocation(), myWorld));
//			}
//		}
//		
//	}
		
		
//not quite working: stacking cows on same spot?? try breaking up more

		ArrayList <Location>surroundingCoordsOrigional = new ArrayList<Location>();
		surroundingCoordsOrigional=getSurroundingArray();
		Location testingSpot=surroundingCoordsOrigional.get(0);
		Boolean cellIsDead=true;
		int surroundingCount;
		ArrayList <Location> newSurroundingCoords = new ArrayList<Location>();
		for (int k=0; k<surroundingCoordsOrigional.size(); k++) {
			surroundingCount=0;
			cellIsDead=true;
			testingSpot=surroundingCoordsOrigional.get(k);
			newSurroundingCoords=testingSpot.getSurroundings();

			for (int i=0; i<newSurroundingCoords.size(); i++) {
				
				for (int j=0; j<myWorld.getCreatureList().size(); j++) {
					if (newSurroundingCoords.get(i).getX()==myWorld.getCreatureList().get(j).getMyLocation().getX() && newSurroundingCoords.get(i).getY()==myWorld.getCreatureList().get(j).getMyLocation().getY() && myWorld.getCreatureList().get(j).getAge()>=1){
						surroundingCount++;
					}
				}
				if (surroundingCount>=3) {
					for (int x=0; x<myWorld.getCreatureList().size(); x++) {
						if (myWorld.getCreatureList().get(x).getMyLocation().equals(testingSpot))
							cellIsDead=false;
					}
					if (cellIsDead) {
						myWorld.getCreatureList().add(new Cow(testingSpot, myWorld));
					}
					cellIsDead=true;
				}
			}
			
		
		
	}
	}
		
}

