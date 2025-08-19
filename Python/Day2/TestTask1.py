import unittest

from Task1 import difference_in_age

class TestThatdifferencInAgeIsAccurate(unittest.TestCase):

	def test_that_differenc_in_age_is_input_accordingly(self):
		self.assertRaises(ValueError, Task1.difference_in_age, 5+5, 9)

	def test_if_the-user_input_value_zero(self):
		sellf.assertRaises(ValueError, Task1.difference_in_age, 0,0)

	def test_if_the-user_input_string(self):
		sellf.assertRaises(ValueError, Task1.difference_in_age, "we","up")

	def test_if_the-user_input_string(self):
		sellf.assertRaises(ValueError, Task1.difference_in_age, 0,99)

	def test_if_the-user_input_float(self):
		sellf.assertRaises(ValueError, Task1.difference_in_age, 12.3,99)

	def test_if_the-user_input_is_correct(self):
		difference_in_year =  current_father_age - (current_son_age + current_son_age)
		sellf.assertEquals(difference_in_year, 50,10 )















		

	
	



		




		