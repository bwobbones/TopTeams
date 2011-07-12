package topteams

class Player {
	
	String name
	String aflTeam
	boolean selected
	
	static hasMany = [scores:Score]
	
    static constraints = {
		name(blank: false)
		aflTeam(blank: false)
    }
	
	String toString()
	{
		return name + ": " + aflTeam
	}
}
