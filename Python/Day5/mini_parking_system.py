# Define a varible that will carry the index and number of slot which is 20
# Create a function that print the  available parking space and index
# Create another function that will calculate and check if there is space or not
# Create another function that will return number




the_parking_space = 20 * [0] 

def print_the_park():
    print("space available in parking lot :")
    print("the slots: ", the_parking_space)
    print("the index: ", list(range(1, 11)))


def enter_the_space():
    for count in range(len(the_parking_space)):
        if the_parking_space[count] == 0:
            the_parking_space[count] = 1
            print(count + 1)
            return count
    print("sorry no space,try again later!")

def park_out(digit):
    index = digit - 1
    if 0 <= index < len(the_parking_space):
        if the_parking_space[index] == 1:
            the_parking_space[index] = 0
            return digit
       
        
