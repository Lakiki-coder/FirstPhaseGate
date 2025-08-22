import unittest
from mini_parking_system import enter_the_space

class TestPrintThePark(unittest.TestCase):

    def test_if_invalid_input_type(self):
        self.assertRaises(ValueError, enter_the_space, "go", "we", "up")

    def test_if_userInput_out_of_range_negative(self):
        self.assertRaises(ValueError, enter_the_space, -1, -10, 99)

    def test_if_userInput_out_of_range_positive(self):
        self.assertRaises(ValueError, enter_the_space, 101, 0, 0)

    def test_if_userInput_out_of_range_high(self):
        self.assertRaises(ValueError, enter_the_space, 120, 21, 199)

