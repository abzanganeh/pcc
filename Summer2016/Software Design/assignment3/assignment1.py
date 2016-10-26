number = int(input("Please enter an integer number between 1 and 10"))

print()
print("You entered: ",number)
if number < 0 or number > 10:
	print("Your number is not valid.")
elif number == 1:
	print("The Roman Numeral version of your number is: i or in Capital: I ")
elif number == 2:
	print("The Roman Numeral version of your number is: ii or in Capital: II")
elif number == 3:
	print("The Roman Numeral version of your number is: iii or in Capital: III ")
elif number == 4:
	print("The Roman Numeral version of your number is: iv or in Capital: IV ")
elif number == 5:
	print("The Roman Numeral version of your number is: v or in Capital: V ")
elif number == 6:
	print("The Roman Numeral version of your number is: vi or in Capital: VI ")
elif number == 7:
	print("The Roman Numeral version of your number is: vii or in Capital: VII ")
elif number == 8:
	print("The Roman Numeral version of your number is: viii or in Capital: VIII ")
elif number == 9:
	print("The Roman Numeral version of your number is: ix or in Capital: IX ")
else:
	print("The Roman Numeral version of your number is: x or in Capital: X ")