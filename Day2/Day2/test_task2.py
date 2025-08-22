import unittest

from Task1 import average_score

class TestThatDifferenceInAgeIsAccurate(unittest.TestCase):

	def test_that_differenc_in_age_is_input_accordingly(self):
		self.assertRaises(ValueError, Task1.average_score, 30,50, 19)

	def test_if_the-user_input_value_zero(self):
		sellf.assertRaises(ValueError, Task1.average_score, 101,0,0)

	def test_if_the-user_input_string(self):
		sellf.assertRaises(ValueError, Task1.average_score, "go","we","up")

	def test_if_the-user_input_string(self):
		sellf.assertRaises(ValueError, Task1.average_score, -1,-10,99)

	def test_if_the-user_input_float(self):
		sellf.assertRaises(ValueError, Task1.average_score, 120,21,199)





