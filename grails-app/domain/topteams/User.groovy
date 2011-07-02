package topteams

class User {
	
	String username
	String password
	String email	
	Team team
	
    static constraints = {
		username(blank: false)
		password(blank: false)
		email(blank: false)
		team(nullable: true)
    }
}
