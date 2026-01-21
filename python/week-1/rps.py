import random

def get_choices():
    options = ["rock", "paper", "scissorts"]
    user_choice = input("Enter your choice (rock, paper, scissors): ")
    computer_choice = random.choice(options)
    choices = {"comp" : computer_choice, "user" : user_choice}
    return choices

def check_game(player, comp):
    print(f"You choose {player} and Computer choose {comp}")
    if player == comp:
        return "Its a tie"
    rules = {
        "rock": "scissors",
        "paper": "rock",
        "scissors": "paper"
    }
    if rules[player] == comp:
        return "You win! {} beats {}.".format(player.capitalize(), comp)
    else:
        return "You lose! {} beats {}.".format(comp.capitalize(), player)

choices = get_choices()
print(check_game(choices["user"], choices["comp"]))