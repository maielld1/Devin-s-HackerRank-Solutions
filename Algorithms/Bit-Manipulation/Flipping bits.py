"""
You will be given a list of 32 bits unsigned integers. You are required to output the list of the unsigned integers you get by flipping bits in its binary representation (i.e. unset bits must be set, and set bits must be unset).
example:
Take 1 for example, as unsigned 32-bits is 00000000000000000000000000000001 and doing the flipping we get 11111111111111111111111111111110 which in turn is 4294967294.


test = int(raw_input())
for t in range(test):
    num = long(raw_input())
    num = num^0xffffffff
    print num
