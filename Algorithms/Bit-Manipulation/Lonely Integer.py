#!/usr/bin/py
"""

Consider an array of  integers, A, where all but one of the integers occur in pairs. In other words, every element in A
occurs exactly twice except for one unique element.  Find the unique element.

Solution: Using bitwise xor on each integer, each integer pair will cancel each other out to return 0, which will leave the unique integer.

"""

Given , find and print the unique element.
def lonelyinteger(a):
    answer = 0
    for number in a:
        answer = answer ^ number
    return answer
if __name__ == '__main__':
    a = input()
    b = map(int, raw_input().strip().split(" "))
    print lonelyinteger(b)
