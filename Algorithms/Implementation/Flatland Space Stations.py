#!/bin/python

import sys


n,m = raw_input().strip().split(' ')
n,m = [int(n),int(m)]
c = map(int,raw_input().strip().split(' '))
d = []
c.sort()
a=0
b=1
if n==m:
    print '0'
else:
    if len(c)==1:
        leftD = c[0]
        rightD = n - c[0] - 1
        d.append(max(leftD,rightD))
    else:
        for x in range(n):
            leftSS=c[a]
            rightSS=c[b]
            if leftSS > x:
                leftD = leftSS-x
                d.append(leftD)
            elif rightSS < x:
                rightD = x-rightSS
                d.append(rightD)
            else:
                leftD = x-leftSS
                rightD = rightSS-x
                d.append(min(leftD,rightD))
                if(rightD==0 and b!=len(c)-1):
                    a+=1
                    b+=1
        
    print max(d)
        
