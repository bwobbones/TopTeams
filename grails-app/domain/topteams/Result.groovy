package topteams

class Result {

	static belongsTo = [team:Team]
	static hasMany = [players:Player]
	
    static constraints = {
    }
}
