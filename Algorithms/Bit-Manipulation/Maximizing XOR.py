"""
Given two integers, L and R, find the maximal value of A xor B, where A and B satisfy the following condition: L<=A<=B<=R

example using L=5 and R=6
5 xor 5 = 0
5 xor 6 = 3
6 xor 5 = 3
6 xor 6 = 0

so the maximal value is 3
"""

def  maxXor( l,  r):
    maxX=0
    for x in range(l, r+1):
        for y in range(l, r+1):
            if x^y > maxX:
                maxX=x^y
    return maxX

    

_l = int(raw_input());


_r = int(raw_input());

res = maxXor(_l, _r);
print(res)
