package topteams

class Player {
	
	String name
	String aflTeam
	boolean selected
	
	static hasMany = [results:Result]
	
    static constraints = {
		name(blank: false)
		aflTeam(blank: false)
    }
	
	String toString()
	{
		return name + ": " + aflTeam
	}
}
