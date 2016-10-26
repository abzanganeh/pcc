def feetToInches(feet):
	return feet*12
numOfFeet = int(input("Please enter number of feet you want to convert: "))
numOfInches=feetToInches(numOfFeet)

print("Number of inches is equal to:",numOfInches)