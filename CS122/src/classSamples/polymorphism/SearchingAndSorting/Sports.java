package classSamples.polymorphism.SearchingAndSorting;

public class Sports implements Comparable <Sports>{
	private final String name;
	private final int players;
	
	// Create constructor initializing name, players
	
	public Sports(String name, int players){
		this.name = name;
		this.players = players;
	}
	
	// create getter methods for name and players
	
	public String getName() {
		return this.name;
	}

	public int getPlayers() {
		return this.players;
	}
	
	// create toString method 
	public String toString() {
		return "There are " + this.players + " players. Name: " + this.name;
	}

	// override equals method, comparing using name
	
	public boolean equals(Object o) {
		return (this.name.equals(((Sports) o).getName()));
	}
	
	
	//finish overriding compareTo
	
	@Override
	public int compareTo(Sports o) {

	return this.name.compareTo(o.getName());

	
	
	}
}
