number = float(input("Please enter the number of packages purchased: "))
print()
if number < 10:
	print("Sorry, there is no discount available for this purchase")
elif number >= 10 and number<20:
	discount = 0.2
elif number >= 20 and number<50:
	discount = 0.3
elif number >= 50 and number<100:
	discount = 0.4
else:
	discount = 0.5
discount = discount*number*99
total = (number * 99) - discount
print("you got ${:,.2f} discount and your total amount of purchase after discount is ${:,.2f}".format(discount,total))
