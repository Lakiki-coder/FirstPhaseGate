def average_score(score_one,score_two,score_three):
	average = score_one + score_two + score_three / 3
	if(90 <= average <= 100)return "A"

	if(80 <= average <= 90)return "B"
	
	if(70 <= average <= 80)return "C"

	if(60 <= average <= 70)return "D"

	if(0 <= average <= 60)return "F"

	else:
		"invalid input"

