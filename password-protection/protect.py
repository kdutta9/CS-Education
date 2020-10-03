auth = {
	"user1": "pass1",
	"user2": "pass2",
	"barney": "din0saur",
	"elmo": "red123",
	"johnny84": "cobrakai4life!"
}

attempts = 0

while attempts < 3:
	user = input("Please enter your username: ")
	pw = input("Please enter your password: ")
	if user not in auth or auth[user] != pw:
		if accounts < 2:
			print("Account not recognized. Please try again.")
			attempts += 1
		else:
			print("Too many attempts. You have been locked out.")
	else:
		print("Congrats, you're in!")
		