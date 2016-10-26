
def calcAverage(g1,g2,g3,g4,g5):
	avr=(g1+g2+g3+g4+g5)/5
	return avr
	
def determinegrade(grade):
	if grade>100 or grade<0:
		return "not Valid"
	elif grade>=90 and grade<=100:
		return "A"
	elif grade>=80 and grade<90:
		return "B" 
	elif grade>=70 and grade<80:
		return "C"
	elif grade>=60 and grade<70:
		return "D"
	else:
		return "F"

def grading():
	list=[]
	for i in range(1,6):
		g = int(input("Please enter your grade: "))
		list.append(g)
		print("your ",g,"grade in Alphabet is: ",determinegrade(g))
	if calcAverage(list[0],list[1],list[2],list[3],list[4])>100:
		print("There was a problem with your grades")
	else:
		return print("your average grade is: ",determinegrade(calcAverage(list[0],list[1],list[2],list[3],list[4])))
	
grading()