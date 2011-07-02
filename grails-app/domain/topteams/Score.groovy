package topteams

class Score {
	
	Integer year
	Integer round
	Integer score
	
    static constraints = {
		year(blank: false)
		round(blank: false)
		score(blank: false)
    }
}
