package topteams

class Team {
	
	String name
	
	static belongsTo = [user:User]
	static hasMany = [players:Player]	                    

    static constraints = {
		name(blank: false)		
    }
}
