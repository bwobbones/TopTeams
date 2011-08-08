package topteams

class Team {
	
	String name
	
	static belongsTo = [user:User]
	static hasMany = [players:Player, results:Result]	

    static constraints = {
		name(blank: false)		
    }
}
